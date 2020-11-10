package cn.imppp.knowlege.listener;

import java.util.List;

/**
  *
  *  ==================================================
  *     贤芯科技
  *  ==================================================
  * @Package:        cn.lierda.mxpad.callback
  * @ClassName:      ICallback
  * @Description:    回调方法
  * @Author:         gaoQl
  * @CreateDate:     2020/5/29 14:14
  * @UpdateRemark:   2020/5/29 14:14
  * @Version:        1.0
 */

public abstract class ICallback<T> {

    public void success() {
    }

    public void success(String str) {
    }

    public void success(boolean str) {
    }

    public void success(T t) {
    }

    public void success(String s, T t) {
    }

    public void success(int i, T t) {
    }

    public void success(List<T> list) {
    }

    public void failed() {
    }

    public void failed(String str) {
    }

    public void failed(T t) {
    }

    protected void onComplete() {
    }
}
