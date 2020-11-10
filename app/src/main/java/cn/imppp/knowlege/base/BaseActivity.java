package cn.imppp.knowlege.base;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.qmuiteam.qmui.skin.QMUISkinManager;
import com.qmuiteam.qmui.util.QMUIStatusBarHelper;
import com.qmuiteam.qmui.widget.dialog.QMUITipDialog;
import com.senthink.module_base.utils.ToastUtils;

import org.greenrobot.eventbus.EventBus;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import cn.imppp.knowlege.R;
import cn.imppp.knowlege.app.App;
import cn.imppp.knowlege.constant.Constant;
import cn.imppp.knowlege.entity.RecordCenturyEntity;
import cn.imppp.knowlege.factory.RevertTitleFactory;
import cn.imppp.knowlege.listener.ClickProxy;
import cn.imppp.knowlege.repository.dao.RecordCenturyDao;
import cn.imppp.knowlege.state.TitleViewModel;

public abstract class BaseActivity extends AppCompatActivity implements ClickProxy {

    protected QMUISkinManager mSkinManager;
    public TitleViewModel titleViewModel;
    private QMUITipDialog tipDialog;
    public int TAG;
    private RecordCenturyDao recordCenturyDao;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        App.getApp().addActivity(this);
        QMUIStatusBarHelper.translucent(this, Color.TRANSPARENT);
        QMUIStatusBarHelper.setStatusBarLightMode(this);
        recordCenturyDao = new RecordCenturyDao();
        //取消状态栏
        mSkinManager = QMUISkinManager.defaultInstance(this);
        if (titleViewModel == null) {
            // 统一处理标题栏绑定返回操作
            titleViewModel = new ViewModelProvider(this).get(TitleViewModel.class);
            titleViewModel.setClickProxy(this);
        }
        initVariable();
        boolean flag = recordCenturyDao.exesit(TAG);
        titleViewModel.shouCang.set(flag);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    public void onStart() {
        super.onStart();
        mSkinManager.register(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (mSkinManager != null) {
            mSkinManager.unRegister(this);
        }
    }

    @Override
    public void backClick() {
        Log.e("titleClick", "返回按钮被点击" + mSkinManager.getName());
        finish();
    }

    @Override
    public void menu() {
        boolean value = titleViewModel.shouCang.get();
        RecordCenturyEntity recordCenturyEntity = new RecordCenturyEntity();
        recordCenturyEntity.setRecordTag(TAG);
        recordCenturyEntity.setRecordTitle(RevertTitleFactory.getInstant().getTitleMessage(TAG));
        if (value) {
            titleViewModel.shouCang.set(false);
            ToastUtils.showShort(getString(R.string.un_shou_cang));
            recordCenturyDao.deleteData(recordCenturyEntity);
        } else {
            titleViewModel.shouCang.set(true);
            ToastUtils.showShort(getString(R.string.shou_cang));
            recordCenturyDao.insertData(recordCenturyEntity);
        }
    }

    public void showDialog() {
        if (tipDialog == null) {
            tipDialog = new QMUITipDialog.Builder(this)
                    .setIconType(QMUITipDialog.Builder.ICON_TYPE_LOADING)
                    .setTipWord(getResources().getString(R.string.loading))
                    .create();
        }
        tipDialog.show();
    }

    public void hideDialog() {
        if (tipDialog != null)
            tipDialog.dismiss();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        App.getApp().removeActivity(this);
    }

    // 网络加载动画观察者
    public void loadAnimation(BaseRequestViewModel requestViewModel) {
        requestViewModel.getIsLoading().observe(this, aBoolean -> {
            if (aBoolean) {
                showDialog();
            } else {
                hideDialog();
            }
        });
    }

    public void initVariable() {
        Intent intent = getIntent();
        if (intent != null) {
            TAG = intent.getIntExtra(Constant.TAG, 0);
            if (TAG != 0)
                Log.i("BaseActivity", TAG + "  success");
        }
    }

}
