package cn.imppp.knowlege.ui.activity;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import cn.imppp.knowlege.BR;
import cn.imppp.knowlege.R;
import cn.imppp.knowlege.base.BaseActivity;
import cn.imppp.knowlege.databinding.ActivityHomeBinding;
import cn.imppp.knowlege.pageAdapter.PageAdapter;
import cn.imppp.knowlege.repository.db.DBManager;
import cn.imppp.knowlege.repository.db.DBOperate;
import cn.imppp.knowlege.ui.fragment.CureFragment;
import cn.imppp.knowlege.ui.fragment.MineFragment;
import cn.imppp.knowlege.utils.DateUtils;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends BaseActivity {

    private List<Fragment> fragments;
    private ActivityHomeBinding binding;
    private int CURRENT_PAGE = 0;

    {
        fragments = new ArrayList<>();
        fragments.add(new CureFragment());
        fragments.add(new MineFragment());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_home);
        binding.setVariable(BR.click, new ClickProxy());

        PageAdapter pageAdapter = new PageAdapter(this, fragments);
        binding.viewPage2.setAdapter(pageAdapter);
        binding.viewPage2.setUserInputEnabled(false);
        binding.ivMine.setEnabled(true);
        binding.tvMine.setEnabled(true);
        setPage(CURRENT_PAGE);

        binding.viewPage2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                setPage(position);
            }
        });
        DBOperate dbManager = new DBOperate();
        if ("显示即将到期".equals(DateUtils.dateDiff("2020-11-30 16:39:00"))) {
            finish();
        } else {
            Log.i("距离到期时间：", DateUtils.dateDiff("2020-11-21 16:39:00"));
        }
    }

    private void setPage(int switchPage) {
        switch (CURRENT_PAGE) {
            case 0:
                binding.ivCure.setEnabled(true);
                binding.tvCure.setEnabled(true);
                break;
            case 1:
                binding.ivMine.setEnabled(true);
                binding.tvMine.setEnabled(true);
                break;
        }

        switch (switchPage) {
            case 0:
                binding.ivCure.setEnabled(false);
                binding.tvCure.setEnabled(false);
                break;
            case 1:
                binding.ivMine.setEnabled(false);
                binding.tvMine.setEnabled(false);
                break;
        }
        CURRENT_PAGE = switchPage;
    }

    public class ClickProxy{

        public void cure() {
            binding.viewPage2.setCurrentItem(0);
        }

        public void mine() {
            binding.viewPage2.setCurrentItem(1);
        }
    }
}
