package cn.imppp.knowlege.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;
import cn.imppp.knowlege.R;
import cn.imppp.knowlege.base.BaseViewHolder;
import cn.imppp.knowlege.databinding.BottomItemLayoutBinding;
import cn.imppp.knowlege.entity.BottomPageEntity;
import cn.imppp.knowlege.entity.QueryBean;
import cn.imppp.knowlege.listener.OnRecyclerViewClickListener2;

public class ListAdapter extends RecyclerView.Adapter<BaseViewHolder> {

    private List<BottomPageEntity> mList;
    private Context mContext;

    public ListAdapter(Context context, List<BottomPageEntity> list) {
        mContext = context;
        mList = list;
    }

    @NonNull
    @Override
    public BaseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        BottomItemLayoutBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                R.layout.bottom_item_layout, parent, false);
        return new BaseViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull BaseViewHolder holder, int position) {
        BottomItemLayoutBinding binding = (BottomItemLayoutBinding) holder.binding;
        BottomPageEntity pageEntity = mList.get(mList.size()-1-position);
        binding.tvDes.setText(pageEntity.getDescribe());
        if (position == mList.size()-1) {
            binding.tvDes.setTextColor(mContext.getResources().getColor(R.color.theme));
            binding.tvDes.setBackground(mContext.getResources().getDrawable(R.drawable.shape_bottom_choose_card));
        } else {
            binding.tvDes.setTextColor(mContext.getResources().getColor(R.color.white));
            binding.tvDes.setBackground(mContext.getResources().getDrawable(R.drawable.shape_bottom_un_choose_card));
        }

        binding.tvDes.setOnClickListener(click->{
            if (clicks != null) {
                clicks.onItemClick2(pageEntity.getTag(), position, position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mList == null ? 0 : mList.size();
    }

    public void setList(List<BottomPageEntity> list) {
        mList.clear();
        append(list);
    }

    private void append(List<BottomPageEntity> list) {
        if (list != null) {
            int previousSize = this.mList.size();
            mList.clear();
            notifyItemRangeRemoved(0, previousSize);
            mList.addAll(list);
            notifyItemRangeInserted(0, list.size());
        }
    }

    private OnRecyclerViewClickListener2<Integer> clicks;

    public void setOnClick(OnRecyclerViewClickListener2<Integer> click) {
        this.clicks = click;
    }
}
