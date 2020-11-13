package cn.imppp.knowlege.ui.activity;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import cn.imppp.knowlege.R;
import cn.imppp.knowlege.adapter.TextAndListAdapter;
import cn.imppp.knowlege.base.BaseActivity;
import cn.imppp.knowlege.databinding.ActivityThreeLevelBinding;
import cn.imppp.knowlege.entity.BottomPageEntity;
import cn.imppp.knowlege.factory.RevertBeforeFactory;
import cn.imppp.knowlege.factory.RevertContentFactory;
import cn.imppp.knowlege.factory.RevertListAndTextContentFactory;
import cn.imppp.knowlege.factory.RevertTitleFactory;
import cn.imppp.knowlege.state.ThreeLevelViewModel;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.List;

public class ThreeLevelActivity extends BaseActivity {

    private ActivityThreeLevelBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_level);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_three_level);
        ThreeLevelViewModel normalViewModel = new ViewModelProvider(this).get(ThreeLevelViewModel.class);
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

        // 遍历子串集合
        int beforeTag = TAG;
        while (beforeTag > -10) {
            BottomPageEntity bottomPageEntity = new BottomPageEntity(beforeTag,
                    RevertTitleFactory.getInstant().getTitleMessage(beforeTag));
            beforeTag = RevertBeforeFactory.getInstance().getBeforeTag(beforeTag);
            Log.i("ThreeLevelActivity", bottomPageEntity.toString());
        }
    }

    private void loadData() {
        List<String> list = RevertListAndTextContentFactory.getInstance().getOneLevelList(TAG);
        if (list != null && list.size() > 0) {
            binding.scroll.setVisibility(View.GONE);
            binding.recyclerView.setVisibility(View.VISIBLE);
            TextAndListAdapter secondLevelAdapter = new TextAndListAdapter(this, list);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
            binding.recyclerView.setLayoutManager(linearLayoutManager);
            binding.recyclerView.setAdapter(secondLevelAdapter);
            return;
        }
        binding.scroll.setVisibility(View.VISIBLE);
        binding.recyclerView.setVisibility(View.GONE);

        String data = RevertContentFactory.getInstance().getThreeLevelList(TAG);
        binding.tvContent.setText(data);

    }
}
