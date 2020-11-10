package cn.imppp.knowlege.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;
import cn.imppp.knowlege.R;
import cn.imppp.knowlege.app.App;
import cn.imppp.knowlege.base.BaseViewHolder;
import cn.imppp.knowlege.constant.Constant;
import cn.imppp.knowlege.databinding.HistoryItemLayoutBinding;
import cn.imppp.knowlege.entity.HistoryRecordEntity;
import cn.imppp.knowlege.entity.OneLevelEntity;
import cn.imppp.knowlege.listener.OnRecyclerViewClickListener;
import cn.imppp.knowlege.ui.activity.SecondLevelActivity;
import cn.imppp.knowlege.ui.activity.ThreeLevelActivity;

// 历史数据
public class HistoryAdapter extends RecyclerView.Adapter<BaseViewHolder> {

    private List<HistoryRecordEntity> mList;
    private Context mContext;
    private boolean flag;

    public HistoryAdapter(Context context, List<HistoryRecordEntity> list) {
        mContext = context;
        mList = list;
    }

    @NonNull
    @Override
    public BaseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        HistoryItemLayoutBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                R.layout.history_item_layout, parent, false);
        return new BaseViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull BaseViewHolder holder, int position) {
        HistoryItemLayoutBinding binding = (HistoryItemLayoutBinding) holder.binding;
        HistoryRecordEntity oneLevelEntity = mList.get(position);
        binding.tvMessage.setText(oneLevelEntity.getQueryContent());
        binding.tvNum.setText(String.valueOf(position+1) + "、");
        binding.ivIcon.setOnClickListener(click->{
            if (clicks != null) {
                clicks.onItemClick(oneLevelEntity, position, 0);
            }
        });
        binding.llClick.setOnClickListener(click->{
            if (clicks != null) {
                clicks.onItemClick(oneLevelEntity, position, 1);
            }
        });

        if (position%2==0) {
            binding.llClick.setBackgroundColor(App.getContext().getResources().getColor(R.color.aa_shadow_color));
        } else {
            binding.llClick.setBackgroundColor(App.getContext().getResources().getColor(R.color.transparent));
        }
    }

    @Override
    public int getItemCount() {
        return mList == null ? 0 : mList.size();
    }

    public void setList(List<HistoryRecordEntity> list) {
        mList.clear();
        append(list);
    }

    private void append(List<HistoryRecordEntity> list) {
        if (list != null) {
            int previousSize = this.mList.size();
            mList.clear();
            notifyItemRangeRemoved(0, previousSize);
            mList.addAll(list);
            notifyItemRangeInserted(0, list.size());
        }
    }

    private OnRecyclerViewClickListener<HistoryRecordEntity> clicks;

    public void setOnClick(OnRecyclerViewClickListener<HistoryRecordEntity> click) {
        this.clicks = click;
    }

}
