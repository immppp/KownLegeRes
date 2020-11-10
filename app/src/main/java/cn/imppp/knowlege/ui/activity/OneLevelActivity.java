package cn.imppp.knowlege.ui.activity;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import cn.imppp.knowlege.R;
import cn.imppp.knowlege.adapter.CenturyLevelAdapter;
import cn.imppp.knowlege.adapter.OneLevelAdapter;
import cn.imppp.knowlege.adapter.SecondLevelAdapter;
import cn.imppp.knowlege.base.BaseActivity;
import cn.imppp.knowlege.constant.Constant;
import cn.imppp.knowlege.databinding.ActivityOneLevelBinding;
import cn.imppp.knowlege.entity.CenturyLevelEntity;
import cn.imppp.knowlege.entity.OneLevelEntity;
import cn.imppp.knowlege.entity.SecondLevelEntity;
import cn.imppp.knowlege.factory.RevertCenturyLevelFactory;
import cn.imppp.knowlege.factory.RevertContentFactory;
import cn.imppp.knowlege.factory.RevertHasSortFactory;
import cn.imppp.knowlege.factory.RevertTitleFactory;
import cn.imppp.knowlege.state.OneLevelViewModel;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;

import java.util.List;

/**
 * @ClassName: OneLevelActivity
 * @Author: qaq
 * @Description: 一级页面
 * @Date: 2020/9/29 10:43 AM
 * @Company: 杭州达恒科技
 * @Version: 1.0
 */

public class OneLevelActivity extends BaseActivity {

    private ActivityOneLevelBinding binding;
    private int lineCount = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_one_level);
        OneLevelViewModel normalViewModel = new ViewModelProvider(this).get(OneLevelViewModel.class);
        titleViewModel.showMenu.set(true);
        Log.i("TAG", " " + TAG);
        String title = RevertTitleFactory.getInstant().getTitleMessage(TAG);
        if (title.length() >= 15) {
            title = title.substring(0, title.length()/2) + "\n" + title.substring(title.length()/2, title.length());
        }
        titleViewModel.title.set(title);
        normalViewModel.titleView.setValue(titleViewModel);
        binding.setVm(normalViewModel);
        loadData();
    }

    @Override
    public void menu() {
        super.menu();
    }

    private void loadData() {
        // 获取是第几级
        Intent intent = getIntent();
        if (intent != null) {
            lineCount = intent.getIntExtra(Constant.LINE_COUNT, 2);
        }

        List<CenturyLevelEntity> mList = RevertCenturyLevelFactory.getInstance().getData(TAG);
        if(mList != null && mList.size() > 0) {
            CenturyLevelAdapter oneLevelAdapter = new CenturyLevelAdapter(this, mList);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
            binding.recyclerView.setLayoutManager(linearLayoutManager);
            LayoutAnimationController controller = new LayoutAnimationController(AnimationUtils.loadAnimation(this,R.anim.animate));
            binding.recyclerView.setLayoutAnimation(controller);
            binding.recyclerView.setAdapter(oneLevelAdapter);
            return;
        }
        boolean flag = RevertHasSortFactory.getInstance().hasSort(TAG);
        List<OneLevelEntity> mList2 = RevertContentFactory.getInstance().getOneLevelList(TAG);
        if (mList2 != null && mList2.size() > 0) {
            OneLevelAdapter oneLevelAdapter = new OneLevelAdapter(this, mList2, flag, lineCount);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
            binding.recyclerView.setLayoutManager(linearLayoutManager);
            LayoutAnimationController controller = new LayoutAnimationController(AnimationUtils.loadAnimation(this,R.anim.animate));
            binding.recyclerView.setLayoutAnimation(controller);
            binding.recyclerView.setAdapter(oneLevelAdapter);
            return;
        }

        List<SecondLevelEntity> mList3 = RevertContentFactory.getInstance().getSecondLevelList(TAG);
        if (mList3 != null && mList3.size() > 0) {
            SecondLevelAdapter secondLevelAdapter = new SecondLevelAdapter(this, mList3, flag, lineCount);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
            binding.recyclerView.setLayoutManager(linearLayoutManager);
            LayoutAnimationController controller = new LayoutAnimationController(AnimationUtils.loadAnimation(this,R.anim.animate));
            binding.recyclerView.setLayoutAnimation(controller);
            binding.recyclerView.setAdapter(secondLevelAdapter);
        }
    }
}
