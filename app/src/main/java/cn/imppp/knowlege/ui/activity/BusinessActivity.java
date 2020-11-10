package cn.imppp.knowlege.ui.activity;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import cn.imppp.knowlege.R;
import cn.imppp.knowlege.base.BaseActivity;
import cn.imppp.knowlege.databinding.ActivityBussinessBinding;
import cn.imppp.knowlege.state.NormalViewModel;

import android.os.Bundle;

/**
 * @ClassName: BusinessActivity
 * @Author: qaq
 * @Description: 商务合作界面
 * @Date: 2020/9/28 3:47 PM
 * @Company: 杭州达恒科技
 * @Version: 1.0
 */

public class BusinessActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityBussinessBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_bussiness);
        NormalViewModel normalViewModel = new ViewModelProvider(this).get(NormalViewModel.class);
        titleViewModel.showMenu.set(false);
        titleViewModel.title.set("技术支持");
        normalViewModel.titleView.setValue(titleViewModel);
        binding.setVm(normalViewModel);
    }
}
