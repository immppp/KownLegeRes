package cn.imppp.knowlege.ui.activity;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import cn.imppp.knowlege.R;
import cn.imppp.knowlege.adapter.SecondLevelAdapter;
import cn.imppp.knowlege.base.BaseActivity;
import cn.imppp.knowlege.databinding.ActivitySecondLevelBinding;
import cn.imppp.knowlege.entity.SecondLevelEntity;
import cn.imppp.knowlege.factory.RevertContentFactory;
import cn.imppp.knowlege.factory.RevertHasSortFactory;
import cn.imppp.knowlege.factory.RevertTitleFactory;
import cn.imppp.knowlege.repository.prepare.PrePareRepository;
import cn.imppp.knowlege.state.SecondLevelViewModel;

import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;

import java.util.List;

public class SecondLevelActivity extends BaseActivity {

    private ActivitySecondLevelBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_second_level);
        SecondLevelViewModel normalViewModel = new ViewModelProvider(this).get(SecondLevelViewModel.class);
        titleViewModel.showMenu.set(true);
        titleViewModel.title.set(RevertTitleFactory.getInstant().getTitleMessage(TAG));
        normalViewModel.titleView.setValue(titleViewModel);
        binding.setVm(normalViewModel);
        loadData();
    }

    private void loadData() {
        boolean flag = RevertHasSortFactory.getInstance().hasSort(TAG);
        List<SecondLevelEntity> mList = RevertContentFactory.getInstance().getSecondLevelList(TAG);
        SecondLevelAdapter secondLevelAdapter = new SecondLevelAdapter(this, mList, flag, 2);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        binding.recyclerView.setLayoutManager(linearLayoutManager);
        LayoutAnimationController controller = new LayoutAnimationController(AnimationUtils.loadAnimation(this,R.anim.animate));
        binding.recyclerView.setLayoutAnimation(controller);
        binding.recyclerView.setAdapter(secondLevelAdapter);

    }
}
