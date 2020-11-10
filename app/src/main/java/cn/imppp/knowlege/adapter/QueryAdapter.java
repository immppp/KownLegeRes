package cn.imppp.knowlege.adapter;

import android.content.Context;
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
import cn.imppp.knowlege.databinding.HistoryItemLayoutBinding;
import cn.imppp.knowlege.databinding.QueryItemLayoutBinding;
import cn.imppp.knowlege.entity.HistoryRecordEntity;
import cn.imppp.knowlege.entity.QueryBean;
import cn.imppp.knowlege.listener.OnRecyclerViewClickListener;
import cn.imppp.knowlege.listener.OnRecyclerViewClickListener2;

// 历史数据
public class QueryAdapter extends RecyclerView.Adapter<BaseViewHolder> {

    private List<QueryBean> mList;
    private Context mContext;

    public QueryAdapter(Context context, List<QueryBean> list) {
        mContext = context;
        mList = list;
    }

    @NonNull
    @Override
    public BaseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        QueryItemLayoutBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                R.layout.query_item_layout, parent, false);
        return new BaseViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull BaseViewHolder holder, int position) {
        QueryItemLayoutBinding binding = (QueryItemLayoutBinding) holder.binding;
        QueryBean oneLevelEntity = mList.get(position);
        binding.tvMessage.setText(oneLevelEntity.getTitle());
        binding.tvNum.setText(String.valueOf(position+1) + "、");
        binding.llClick.setOnClickListener(click->{
            if (clicks != null) {
                clicks.onItemClick2(oneLevelEntity, position, 0);
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

    public void setList(List<QueryBean> list) {
        mList.clear();
        append(list);
    }

    private void append(List<QueryBean> list) {
        if (list != null) {
            int previousSize = this.mList.size();
            mList.clear();
            notifyItemRangeRemoved(0, previousSize);
            mList.addAll(list);
            notifyItemRangeInserted(0, list.size());
        }
    }

    private OnRecyclerViewClickListener2<QueryBean> clicks;

    public void setOnClick(OnRecyclerViewClickListener2<QueryBean> click) {
        this.clicks = click;
    }

}
