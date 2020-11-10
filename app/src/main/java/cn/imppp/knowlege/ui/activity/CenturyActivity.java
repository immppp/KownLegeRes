package cn.imppp.knowlege.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import cn.imppp.knowlege.R;
import cn.imppp.knowlege.adapter.CenturyLevelAdapter;
import cn.imppp.knowlege.adapter.OneLevelAdapter;
import cn.imppp.knowlege.base.BaseActivity;
import cn.imppp.knowlege.databinding.ActivityCentureBinding;
import cn.imppp.knowlege.entity.CenturyLevelEntity;
import cn.imppp.knowlege.entity.OneLevelEntity;
import cn.imppp.knowlege.factory.RevertCenturyLevelFactory;
import cn.imppp.knowlege.factory.RevertContentFactory;
import cn.imppp.knowlege.factory.RevertHasSortFactory;
import cn.imppp.knowlege.factory.RevertTitleFactory;
import cn.imppp.knowlege.state.OneLevelViewModel;

import android.os.Bundle;
import android.util.Log;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;

import java.util.List;

/**
 * @ClassName: CenturyActivity
 * @Author: qaq
 * @Description: 模拟中间层级，用户自定义的分组层级
 * @Date: 2020/10/9 9:59 AM
 * @Company: 杭州达恒科技
 * @Version: 1.0
 */

public class CenturyActivity extends BaseActivity {

    private ActivityCentureBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_centure);
        OneLevelViewModel normalViewModel = new ViewModelProvider(this).get(OneLevelViewModel.class);
        titleViewModel.showMenu.set(true);
        Log.i("TAG", " " + TAG);
        titleViewModel.title.set(RevertTitleFactory.getInstant().getTitleMessage(TAG));
        normalViewModel.titleView.setValue(titleViewModel);
        binding.setVm(normalViewModel);
        loadData();
    }

    private void loadData() {
        List<CenturyLevelEntity> mList = RevertCenturyLevelFactory.getInstance().getData(TAG);
        CenturyLevelAdapter oneLevelAdapter = new CenturyLevelAdapter(this, mList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        binding.recyclerView.setLayoutManager(linearLayoutManager);
        LayoutAnimationController controller = new LayoutAnimationController(AnimationUtils.loadAnimation(this,R.anim.animate));
        binding.recyclerView.setLayoutAnimation(controller);
        binding.recyclerView.setAdapter(oneLevelAdapter);
    }
}
