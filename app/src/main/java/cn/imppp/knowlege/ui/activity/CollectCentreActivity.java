package cn.imppp.knowlege.ui.activity;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import cn.imppp.knowlege.R;
import cn.imppp.knowlege.adapter.CollectAdapter;
import cn.imppp.knowlege.app.App;
import cn.imppp.knowlege.base.BaseActivity;
import cn.imppp.knowlege.constant.Constant;
import cn.imppp.knowlege.databinding.ActivityCollectCentreBinding;
import cn.imppp.knowlege.entity.RecordCenturyEntity;
import cn.imppp.knowlege.factory.RevertHasSortFactory;
import cn.imppp.knowlege.listener.ICallback;
import cn.imppp.knowlege.listener.OnRecyclerViewClickListener;
import cn.imppp.knowlege.repository.dao.RecordCenturyDao;
import cn.imppp.knowlege.state.NormalViewModel;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.List;

/**
 * @ClassName: CollectCentreActivity
 * @Author: qaq
 * @Description: 收藏中心
 * @Date: 2020/9/28 2:08 PM
 * @Company: 杭州达恒科技
 * @Version: 1.0
 */

public class CollectCentreActivity extends BaseActivity implements OnRecyclerViewClickListener<RecordCenturyEntity> {

    private RecordCenturyDao recordCenturyDao;
    private ActivityCollectCentreBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_collect_centre);
        NormalViewModel normalViewModel = new ViewModelProvider(this).get(NormalViewModel.class);
        titleViewModel.showMenu.set(false);
        titleViewModel.title.set(getString(R.string.save_centry));
        normalViewModel.titleView.setValue(titleViewModel);
        binding.setVm(normalViewModel);
        recordCenturyDao = new RecordCenturyDao();
    }

    private void loadData() {
        List<RecordCenturyEntity> list = recordCenturyDao.queryDataList();
        if (list == null || list.size() == 0) {
            binding.noData.setVisibility(View.VISIBLE);
            binding.recyclerView.setVisibility(View.GONE);
            return;
        }
        binding.noData.setVisibility(View.GONE);
        binding.recyclerView.setVisibility(View.VISIBLE);
        CollectAdapter collectAdapter = new CollectAdapter(this, list);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        binding.recyclerView.setAdapter(collectAdapter);
        collectAdapter.setOnClick(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        loadData();
    }

    @Override
    public void onItemClick(RecordCenturyEntity recordCenturyEntity, int position, int Action) {
        if (Action == 0) {
            Log.e("被点击", "success" + recordCenturyEntity.getRecordTag());
            recordCenturyDao.deleteData(recordCenturyEntity);
            loadData();
        } else if (Action == 1) {
            int level = RevertHasSortFactory.getInstance().getLevel(recordCenturyEntity.getRecordTag());
            Intent intent = null;
            switch (level) {
                case 1:
                case 2:
                    intent = new Intent(App.getContext(), SecondLevelActivity.class);
                    break;
                case 3:
                    intent = new Intent(App.getContext(), ThreeLevelActivity.class);
                    break;
            }
            if (intent != null) {
                intent.putExtra(Constant.TAG, recordCenturyEntity.getRecordTag());
                App.getContext().startActivity(intent);
            }

        }
    }

    @Override
    public void onGroupItemClick(RecordCenturyEntity recordCenturyEntity, int position, int action, ICallback callback) {

    }
}
