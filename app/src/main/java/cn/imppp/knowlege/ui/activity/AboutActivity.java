package cn.imppp.knowlege.ui.activity;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import cn.imppp.knowlege.R;
import cn.imppp.knowlege.base.BaseActivity;
import cn.imppp.knowlege.databinding.ActivityAboutBinding;
import cn.imppp.knowlege.state.NormalViewModel;

import android.os.Bundle;

/**
 * @ClassName: AboutActivity
 * @Author: qaq
 * @Description: 关于界面
 * @Date: 2020/9/28 4:19 PM
 * @Company: 杭州达恒科技
 * @Version: 1.0
 */

public class AboutActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityAboutBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_about);
        NormalViewModel normalViewModel = new ViewModelProvider(this).get(NormalViewModel.class);
        titleViewModel.showMenu.set(false);
        titleViewModel.title.set(getString(R.string.about));
        normalViewModel.titleView.setValue(titleViewModel);
        binding.setVm(normalViewModel);
    }
}
