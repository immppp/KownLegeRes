package com.senthink.module_base.http;


import com.senthink.module_base.base.AppManager;
import com.senthink.module_base.utils.SLog;
import com.senthink.module_base.utils.ToastUtils;
import com.senthink.module_base.utils.Utils;

import io.reactivex.observers.DisposableObserver;

/**
 * Created by goldze on 2017/5/10.
 * 统一的Code封装处理。该类仅供参考，实际业务逻辑, 根据需求来定义，
 */

public abstract class ApiDisposableObserver<T> extends DisposableObserver<T> {
    public abstract void onResult(T t);

    @Override
    public void onComplete() {

    }

    @Override
    public void onError(Throwable e) {
        e.printStackTrace();
        if (e instanceof ResponseThrowable) {
            ResponseThrowable rError = (ResponseThrowable) e;
            ToastUtils.showShort(rError.message);
            return;
        }
        //其他全部甩锅网络异常
        ToastUtils.showShort("网络异常");
    }

    @Override
    public void onStart() {
        super.onStart();
        ToastUtils.showShort("http is start");
        // if  NetworkAvailable no !   must to call onCompleted
        if (!NetworkUtil.isNetworkAvailable(Utils.getContext())) {
            SLog.d("无网络，读取缓存数据");
            onComplete();
        }
    }

    @Override
    public void onNext(Object o) {
        BaseResponse baseResponse = (BaseResponse) o;
        switch (baseResponse.getSuccess()) {
            case CodeRule.CODE_200:
                //请求成功, 正确的操作方式
                onResult((T) baseResponse.getData());
                break;
            case CodeRule.CODE_220:
                // 请求成功, 正确的操作方式, 并消息提示
                onResult((T) baseResponse.getData());
                break;
            case CodeRule.CODE_300:
                //请求失败，不打印Message
                SLog.e("请求失败");
                ToastUtils.showShort("错误代码:", baseResponse.getSuccess());
                break;
            case CodeRule.CODE_330:
                //请求失败，打印Message
                ToastUtils.showShort(baseResponse.getMsg());
                break;
            case CodeRule.CODE_500:
                //服务器内部异常
                ToastUtils.showShort("错误代码:", baseResponse.getSuccess());
                break;
            case CodeRule.CODE_503:
                //参数为空
                SLog.e("参数为空");
                break;
            case CodeRule.CODE_502:
                //没有数据
                SLog.e("没有数据");
                break;
            case CodeRule.CODE_510:
                //无效的Token，提示跳入登录页
                ToastUtils.showShort("token已过期，请重新登录");
                //关闭所有页面
                AppManager.getAppManager().finishAllActivity();
                //跳入登录界面
                //*****该类仅供参考，实际业务Code, 根据需求来定义，******//
                break;
            case CodeRule.CODE_530:
                ToastUtils.showShort("请先登录");
                break;
            case CodeRule.CODE_551:
                ToastUtils.showShort("错误代码:", baseResponse.getSuccess());
                break;
            default:
                ToastUtils.showShort("错误代码:", baseResponse.getSuccess());
                break;
        }
    }

    public static final class CodeRule {
        //请求成功, 正确的操作方式
        static final String CODE_200 = "200";
        //请求成功, 消息提示
        static final String CODE_220 = "220";
        //请求失败，不打印Message
        static final String CODE_300 = "300";
        //请求失败，打印Message
        static final String CODE_330 = "330";
        //服务器内部异常
        static final String CODE_500 = "500";
        //参数为空
        static final String CODE_503 = "503";
        //没有数据
        static final String CODE_502 = "502";
        //无效的Token
        static final String CODE_510 = "510";
        //未登录
        static final String CODE_530 = "530";
        //请求的操作异常终止：未知的页面类型
        static final String CODE_551 = "551";
    }
}