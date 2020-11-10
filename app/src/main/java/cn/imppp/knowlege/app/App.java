package cn.imppp.knowlege.app;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

import com.senthink.module_base.crash.CaocConfig;
import com.senthink.module_base.utils.Utils;

import java.util.LinkedList;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.multidex.MultiDex;
import cn.imppp.knowlege.MainActivity;

public class App extends Application {
    private static App APP;
    private static LinkedList<Activity> mActivities = new LinkedList<>();
    private static Context mWindowsContext;
    private boolean isOpenWifiConnect = true;
    public boolean isNetConnection;
    public boolean WIFI_SET = false;

    @Override
    public void onCreate() {
        super.onCreate();
        APP = this;
        //初始化工具类
        Utils.init(APP);
        //初始化全局异常崩溃
        initCrash();
        // 注册上下文
        registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {
            @Override
            public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle savedInstanceState) {
                if(activity.getParent()!=null){
                    mWindowsContext = activity.getParent();
                }else {
                    mWindowsContext = activity;
                }
            }

            @Override
            public void onActivityStarted(@NonNull Activity activity) {
                if(activity.getParent()!=null){
                    mWindowsContext = activity.getParent();
                }else {
                    mWindowsContext = activity;
                }
            }

            @Override
            public void onActivityResumed(@NonNull Activity activity) {

            }

            @Override
            public void onActivityPaused(@NonNull Activity activity) {

            }

            @Override
            public void onActivityStopped(@NonNull Activity activity) {

            }

            @Override
            public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle outState) {

            }

            @Override
            public void onActivityDestroyed(@NonNull Activity activity) {

            }
        });

    }

    public static App getApp() {
        return APP;
    }

    public static Context getContext(){
        return mWindowsContext;
    }

    public void exit() {
        for (Activity activity : mActivities) {
            if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
                activity.finish();
            }
        }
        mActivities.clear();
    }
    public void addActivity(Activity activity) {
        mActivities.add(activity);
    }

    public void removeActivity(Activity activity) {
        mActivities.remove(activity);
    }

    public void closeTopActivity() {
        if (mActivities != null && mActivities.size() > 0) {
            Activity activity = mActivities.get(mActivities.size()-1);
            activity.finish();
        }
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

    private void initCrash() {
        CaocConfig.Builder.create()
//                .backgroundMode(CaocConfig.BACKGROUND_MODE_SILENT) //背景模式,开启沉浸式
                .enabled(true) //是否启动全局异常捕获
                .showErrorDetails(true) //是否显示错误详细信息
                .showRestartButton(true) //是否显示重启按钮
                .trackActivities(true) //是否跟踪Activity
                .minTimeBetweenCrashesMs(2000) //崩溃的间隔时间(毫秒)
//                .errorDrawable(R.mipmap.ic_launcher) //错误图标
                .restartActivity(MainActivity.class) //重新启动后的activity
                .apply();
    }

}
