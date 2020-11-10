package cn.imppp.knowlege.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;
import cn.imppp.knowlege.R;
import cn.imppp.knowlege.base.BaseViewHolder;
import cn.imppp.knowlege.databinding.BaseItemLayoutBinding;

// 音乐列表适配器

public class BaseListAdapter extends RecyclerView.Adapter<BaseViewHolder> {

    private List<String> mList;
    private Context mContext;
    private BaseItemLayoutBinding binding;

    public BaseListAdapter(Context context, List<String> list) {
        mContext = context;
        mList = list;
    }

    @NonNull
    @Override
    public BaseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                R.layout.base_item_layout, parent, false);
        return new BaseViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull BaseViewHolder holder, int position) {
        BaseItemLayoutBinding binding = (BaseItemLayoutBinding) holder.binding;
        String music = mList.get(position);
        binding.tvMessage.setText(music);
    }

    @Override
    public int getItemCount() {
        return mList == null ? 0 : mList.size();
    }

    public void setList(List<String> list) {
        mList.clear();
        append(list);
    }

    private void append(List<String> list) {
        if (list != null) {
            int previousSize = this.mList.size();
            mList.clear();
            notifyItemRangeRemoved(0, previousSize);
            mList.addAll(list);
            notifyItemRangeInserted(0, list.size());
        }
    }

}
