package cn.imppp.knowlege.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.senthink.module_base.utils.ToastUtils;

import org.greenrobot.eventbus.EventBus;

import androidx.databinding.DataBindingUtil;
import cn.imppp.knowlege.BR;
import cn.imppp.knowlege.R;
import cn.imppp.knowlege.app.App;
import cn.imppp.knowlege.base.BaseLazyFragment;
import cn.imppp.knowlege.databinding.MineFragmentLayoutBinding;
import cn.imppp.knowlege.ui.activity.AboutActivity;
import cn.imppp.knowlege.ui.activity.BusinessActivity;
import cn.imppp.knowlege.ui.activity.CollectCentreActivity;

public class MineFragment extends BaseLazyFragment {
    @Override
    public void loadData() {
    }

    @Override
    public void refreshData() {

    }

    @Override
    public View initRootView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        MineFragmentLayoutBinding mBinding = DataBindingUtil.inflate(inflater, R.layout.mine_fragment_layout, container, false);
        mBinding.setVariable(BR.click, new ClickProxy());
        return mBinding.getRoot();
    }

    @Override
    public void backClick() {

    }

    public class ClickProxy{
        public void collect() {
            App.getContext().startActivity(new Intent(App.getContext(), CollectCentreActivity.class));
        }

        public void business() {
            App.getContext().startActivity(new Intent(App.getContext(), BusinessActivity.class));
        }

        public void clear() {
            ToastUtils.showShort("清除缓存成功");
        }

        public void about() {
            App.getContext().startActivity(new Intent(App.getContext(), AboutActivity.class));
        }
    }
}
