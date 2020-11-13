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
import cn.imppp.knowlege.databinding.SencondLevelItemLayoutBinding;
import cn.imppp.knowlege.entity.OneLevelEntity;
import cn.imppp.knowlege.entity.SecondLevelEntity;
import cn.imppp.knowlege.factory.CheckPageFactory;
import cn.imppp.knowlege.factory.RevertContentFactory;
import cn.imppp.knowlege.factory.RevertDetailFactory;
import cn.imppp.knowlege.ui.activity.OneLevelActivity;
import cn.imppp.knowlege.ui.activity.SecondLevelActivity;
import cn.imppp.knowlege.ui.activity.ThreeLevelActivity;

// 第二级

public class SecondLevelAdapter extends RecyclerView.Adapter<BaseViewHolder> {

    private List<SecondLevelEntity> mList;
    private Context mContext;
    private boolean flag;
    private int lineCount;
    private boolean isSecond;

    public SecondLevelAdapter(Context context, List<SecondLevelEntity> list, boolean flag, int lineCount, boolean isSecond) {
        mContext = context;
        mList = list;
        this.flag = flag;
        this.lineCount = lineCount;
        this.isSecond = isSecond;
    }

    @NonNull
    @Override
    public BaseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        SencondLevelItemLayoutBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                R.layout.sencond_level_item_layout, parent, false);
        return new BaseViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull BaseViewHolder holder, int position) {
        SencondLevelItemLayoutBinding binding = (SencondLevelItemLayoutBinding) holder.binding;
        SecondLevelEntity oneLevelEntity = mList.get(position);
        binding.tvMessage.setText(oneLevelEntity.getNextFile().getMessage());
        binding.llClick.setOnClickListener(click -> {
            if (CheckPageFactory.isDesPage(oneLevelEntity.getNextFile().getTag())) {
                return;
            }
            Intent intent;
            if (oneLevelEntity.getNextFile().getTag() == 154 && mList.get(position-1).getNextFile().getTag() == 386) {
                intent = new Intent(App.getContext(), ThreeLevelActivity.class);
            } else if (CheckPageFactory.haveNextPage(oneLevelEntity.getNextFile().getTag())) {
                if (isSecond) {
                    App.getApp().exitOne();
                    intent = new Intent(App.getContext(), SecondLevelActivity.class);
                } else {
                    intent = new Intent(App.getContext(), OneLevelActivity.class);
                }
            } else {
                intent = new Intent(App.getContext(), ThreeLevelActivity.class);
            }
            intent.putExtra(Constant.TAG, oneLevelEntity.getNextFile().getTag());
            App.getContext().startActivity(intent);
        });

        if (oneLevelEntity.getNextFile().getTag() == 154 && mList.get(position-1).getNextFile().getTag() == 386) {
            binding.tvNext.setText("");
        } else {
            String message = RevertDetailFactory.getInstant().getTitleMessage(oneLevelEntity.getNextFile().getTag());
            binding.tvNext.setText(message);
        }

        if (flag) {
            binding.lineView.setVisibility(View.GONE);
            binding.ivPosition.setText(String.valueOf(position + 1));
            if (position == mList.size()-1) {
//                binding.itemTop.setVisibility(View.VISIBLE);
                binding.itemBottom.setVisibility(View.INVISIBLE);
            } else {
//                binding.itemTop.setVisibility(View.INVISIBLE);
                binding.itemBottom.setVisibility(View.VISIBLE);
            }
        } else {
            binding.lineView.setLineCount(lineCount);
        }
        if (position % 2 == 0) {
            binding.llClick.setBackgroundColor(App.getContext().getResources().getColor(R.color.aa_shadow_color));
        } else {
            binding.llClick.setBackgroundColor(App.getContext().getResources().getColor(R.color.transparent));
        }

        if (CheckPageFactory.isDesPage(oneLevelEntity.getNextFile().getTag())) {
            binding.tvZhengZhuag.setVisibility(View.VISIBLE);
            binding.llItem.setVisibility(View.GONE);
            binding.tvZhengZhuag.setText(RevertContentFactory.getInstance().getThreeLevelList(oneLevelEntity.getNextFile().getTag()));
        } else {
            binding.llItem.setVisibility(View.VISIBLE);
            binding.tvZhengZhuag.setVisibility(View.GONE);
        }
    }

    @Override
    public int getItemCount() {
        return mList == null ? 0 : mList.size();
    }

    public void setList(List<SecondLevelEntity> list) {
        mList.clear();
        append(list);
    }

    private void append(List<SecondLevelEntity> list) {
        if (list != null) {
            int previousSize = this.mList.size();
            mList.clear();
            notifyItemRangeRemoved(0, previousSize);
            mList.addAll(list);
            notifyItemRangeInserted(0, list.size());
        }
    }

}
