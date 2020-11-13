package cn.imppp.knowlege.ui.activity;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import cn.imppp.knowlege.R;
import cn.imppp.knowlege.adapter.CenturyLevelAdapter;
import cn.imppp.knowlege.adapter.ListAdapter;
import cn.imppp.knowlege.adapter.OneLevelAdapter;
import cn.imppp.knowlege.adapter.SecondLevelAdapter;
import cn.imppp.knowlege.app.App;
import cn.imppp.knowlege.base.BaseActivity;
import cn.imppp.knowlege.constant.Constant;
import cn.imppp.knowlege.databinding.ActivitySecondLevelBinding;
import cn.imppp.knowlege.entity.BottomPageEntity;
import cn.imppp.knowlege.entity.CenturyLevelEntity;
import cn.imppp.knowlege.entity.OneLevelEntity;
import cn.imppp.knowlege.entity.SecondLevelEntity;
import cn.imppp.knowlege.factory.RevertBeforeFactory;
import cn.imppp.knowlege.factory.RevertCenturyLevelFactory;
import cn.imppp.knowlege.factory.RevertContentFactory;
import cn.imppp.knowlege.factory.RevertHasSortFactory;
import cn.imppp.knowlege.factory.RevertTitleFactory;
import cn.imppp.knowlege.listener.OnRecyclerViewClickListener2;
import cn.imppp.knowlege.repository.prepare.PrePareRepository;
import cn.imppp.knowlege.state.SecondLevelViewModel;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;

import java.util.ArrayList;
import java.util.List;

public class SecondLevelActivity extends BaseActivity {

    private ActivitySecondLevelBinding binding;
    private int lineCount = 2;
    private ListAdapter oneLevelAdapter1;
    private SecondLevelAdapter secondLevelAdapter;
    private OneLevelAdapter oneLevelAdapter3;
    private CenturyLevelAdapter oneLevelAdapter2;

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

        // 遍历子串集合
        List<BottomPageEntity> list = new ArrayList<>();
        int beforeTag = TAG;
        while (beforeTag > -10) {
            BottomPageEntity bottomPageEntity = new BottomPageEntity(beforeTag,
                    RevertTitleFactory.getInstant().getTitleMessage(beforeTag));
            beforeTag = RevertBeforeFactory.getInstance().getBeforeTag(beforeTag);
            Log.i("OneLevelActivity", bottomPageEntity.toString());
            list.add(bottomPageEntity);
        }

        if (list.size() > 0) {
            oneLevelAdapter1 = new ListAdapter(this, list);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
            linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
            binding.listView.setLayoutManager(linearLayoutManager);
            LayoutAnimationController controller = new LayoutAnimationController(AnimationUtils.loadAnimation(this, R.anim.animate));
            binding.listView.setLayoutAnimation(controller);
            binding.listView.setAdapter(oneLevelAdapter1);
            binding.listView.scrollToPosition(oneLevelAdapter1.getItemCount() - 1);
            oneLevelAdapter1.setOnClick((integer, position, Action) -> {
                finish();
                Intent intent = new Intent(App.getContext(), SecondLevelActivity.class);
                intent.putExtra(Constant.TAG, integer);
                App.getContext().startActivity(intent);
            });
            lineCount = list.size() + 1;
        } else {
            // 获取是第几级
            Intent intent = getIntent();
            if (intent != null) {
                lineCount = intent.getIntExtra(Constant.LINE_COUNT, 2);
            }
        }

        List<CenturyLevelEntity> mList = RevertCenturyLevelFactory.getInstance().getData(TAG);
        if (mList != null && mList.size() > 0) {
            oneLevelAdapter2 = new CenturyLevelAdapter(this, mList, true);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
            binding.recyclerView.setLayoutManager(linearLayoutManager);
            LayoutAnimationController controller = new LayoutAnimationController(AnimationUtils.loadAnimation(this, R.anim.animate));
            binding.recyclerView.setLayoutAnimation(controller);
            binding.recyclerView.setAdapter(oneLevelAdapter2);
            return;
        }
        boolean flag = RevertHasSortFactory.getInstance().hasSort(TAG);
        List<OneLevelEntity> mList2 = RevertContentFactory.getInstance().getOneLevelList(TAG);
        if (mList2 != null && mList2.size() > 0) {
            oneLevelAdapter3 = new OneLevelAdapter(this, mList2, flag, lineCount, true);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
            binding.recyclerView.setLayoutManager(linearLayoutManager);
            LayoutAnimationController controller = new LayoutAnimationController(AnimationUtils.loadAnimation(this, R.anim.animate));
            binding.recyclerView.setLayoutAnimation(controller);
            binding.recyclerView.setAdapter(oneLevelAdapter3);
            return;
        }

        List<SecondLevelEntity> mList3 = RevertContentFactory.getInstance().getSecondLevelList(TAG);
        if (mList3 != null && mList3.size() > 0) {
            secondLevelAdapter = new SecondLevelAdapter(this, mList3, flag, lineCount, true);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
            binding.recyclerView.setLayoutManager(linearLayoutManager);
            LayoutAnimationController controller = new LayoutAnimationController(AnimationUtils.loadAnimation(this, R.anim.animate));
            binding.recyclerView.setLayoutAnimation(controller);
            binding.recyclerView.setAdapter(secondLevelAdapter);
        }
    }
}
