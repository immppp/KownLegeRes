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
import cn.imppp.knowlege.base.BaseViewHolder;
import cn.imppp.knowlege.constant.Constant;
import cn.imppp.knowlege.databinding.TextAndListItemLayoutBinding;

// 内容层级包含文本和list集合

public class TextAndListAdapter extends RecyclerView.Adapter<BaseViewHolder> {

    private List<String> mList;
    private Context mContext;

    public TextAndListAdapter(Context context, List<String> list) {
        mContext = context;
        mList = list;
    }

    @NonNull
    @Override
    public BaseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        TextAndListItemLayoutBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                R.layout.text_and_list_item_layout, parent, false);
        return new BaseViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull BaseViewHolder holder, int position) {
        TextAndListItemLayoutBinding binding = (TextAndListItemLayoutBinding) holder.binding;
        String text = mList.get(position);
        if (text.contains(Constant.SPLITE_TAG)) {
            // 表示需要分割
            binding.llList.setVisibility(View.VISIBLE);
            binding.tvContent.setVisibility(View.GONE);
            if (binding.tvLeft.getCurrentTextColor() == mContext.getResources().getColor(R.color.white)) {
                binding.tvLeft.setBackgroundColor(mContext.getResources().getColor(R.color.theme));
            } else {
                if (position % 2 == 0) {
                    binding.tvLeft.setBackgroundColor(mContext.getResources().getColor(R.color.transparent));
                } else {
                    binding.tvLeft.setBackgroundColor(mContext.getResources().getColor(R.color.aa_shadow_color));
                }
            }
            if (binding.tvRight.getCurrentTextColor() == mContext.getResources().getColor(R.color.white)) {
                binding.tvRight.setBackgroundColor(mContext.getResources().getColor(R.color.theme));
            } else {
                if (position % 2 == 0) {
                    binding.tvRight.setBackgroundColor(mContext.getResources().getColor(R.color.aa_shadow_color));
                } else {
                    binding.tvRight.setBackgroundColor(mContext.getResources().getColor(R.color.transparent));
                }
            }
            String[] array = text.split(Constant.SPLITE_TAG);
            binding.tvLeft.setText(array[0]);
            binding.tvRight.setText(array[1]);
        } else {
            binding.llList.setVisibility(View.GONE);
            binding.tvContent.setVisibility(View.VISIBLE);
            binding.tvContent.setText(text);
        }

        binding.tvLeft.setOnClickListener(click -> {
            if (binding.tvLeft.getCurrentTextColor() == mContext.getResources().getColor(R.color.white)) {
                binding.tvLeft.setTextColor(mContext.getResources().getColor(R.color.black));
                if (position % 2 == 0) {
                    binding.tvLeft.setBackgroundColor(mContext.getResources().getColor(R.color.transparent));
                } else {
                    binding.tvLeft.setBackgroundColor(mContext.getResources().getColor(R.color.aa_shadow_color));
                }
            } else {
                binding.tvLeft.setTextColor(mContext.getResources().getColor(R.color.white));
                binding.tvLeft.setBackgroundColor(mContext.getResources().getColor(R.color.theme));
            }
        });

        binding.tvRight.setOnClickListener(click -> {
            if (binding.tvRight.getText().toString().trim().equals("")) {
                return;
            }
            if (binding.tvRight.getCurrentTextColor() == mContext.getResources().getColor(R.color.white)) {
                binding.tvRight.setTextColor(mContext.getResources().getColor(R.color.black));
                if (position % 2 == 0) {
                    binding.tvRight.setBackgroundColor(mContext.getResources().getColor(R.color.aa_shadow_color));
                } else {
                    binding.tvRight.setBackgroundColor(mContext.getResources().getColor(R.color.transparent));
                }
            } else {
                binding.tvRight.setTextColor(mContext.getResources().getColor(R.color.white));
                binding.tvRight.setBackgroundColor(mContext.getResources().getColor(R.color.theme));
            }
        });
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
