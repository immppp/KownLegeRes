package cn.imppp.knowlege.ui.fragment.cure;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import cn.imppp.knowlege.R;
import cn.imppp.knowlege.adapter.BaseListAdapter;
import cn.imppp.knowlege.base.BaseLazyFragment;
import cn.imppp.knowlege.databinding.CureFragmentLayoutBinding;
import cn.imppp.knowlege.databinding.CureThreeLayoutBinding;
import cn.imppp.knowlege.repository.duty.DutyRepository;

public class CureThreeFragment extends BaseLazyFragment {

    private CureThreeLayoutBinding mBinding;

    @Override
    public void loadData() {
        List<String> mList = DutyRepository.getInstance().getMessage();
        mList.addAll(DutyRepository.getInstance().getMessage());
        mList.addAll(DutyRepository.getInstance().getMessage());
        BaseListAdapter baseListAdapter = new BaseListAdapter(getActivity(), mList);
        mBinding.recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mBinding.recyclerView.setAdapter(baseListAdapter);
    }

    @Override
    public void refreshData() {

    }

    @Override
    public View initRootView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.cure_three_layout, container, false);
        return mBinding.getRoot();
    }

    @Override
    public void backClick() {

    }
}
