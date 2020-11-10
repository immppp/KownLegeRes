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
import cn.imppp.knowlege.databinding.CenturyLevelItemLayoutBinding;
import cn.imppp.knowlege.entity.CenturyLevelEntity;
import cn.imppp.knowlege.entity.OneLevelEntity;
import cn.imppp.knowlege.entity.SecondLevelEntity;
import cn.imppp.knowlege.factory.CheckPageFactory;
import cn.imppp.knowlege.factory.RevertContentFactory;
import cn.imppp.knowlege.factory.RevertDetailFactory;
import cn.imppp.knowlege.ui.activity.OneLevelActivity;
import cn.imppp.knowlege.ui.activity.SecondLevelActivity;
import cn.imppp.knowlege.ui.activity.ThreeLevelActivity;

// 中间层级

public class CenturyLevelAdapter extends RecyclerView.Adapter<BaseViewHolder> {

    private List<CenturyLevelEntity> mList;
    private Context mContext;

    public CenturyLevelAdapter(Context context, List<CenturyLevelEntity> list) {
        mContext = context;
        mList = list;
    }

    @NonNull
    @Override
    public BaseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CenturyLevelItemLayoutBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                R.layout.century_level_item_layout, parent, false);
        return new BaseViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull BaseViewHolder holder, int position) {
        CenturyLevelItemLayoutBinding binding = (CenturyLevelItemLayoutBinding) holder.binding;
        CenturyLevelEntity oneLevelEntity = mList.get(position);
        binding.tvMessage.setText(oneLevelEntity.getNextFile().getMessage());
        binding.llClick.setOnClickListener(click -> {
            Intent intent;
            if (CheckPageFactory.haveNextPage(oneLevelEntity.getNextFile().getTag())) {
                intent = new Intent(App.getContext(), OneLevelActivity.class);
                intent.putExtra(Constant.LINE_COUNT, 3);
            } else {
                intent = new Intent(App.getContext(), ThreeLevelActivity.class);
            }
            intent.putExtra(Constant.TAG, oneLevelEntity.getNextFile().getTag());
            App.getContext().startActivity(intent);
//            int tag = oneLevelEntity.getOneLevel();
//            Intent intent;
//            if (tag != 0) {
//                // 表示没有二级页面，直接跳转3级
//                intent = new Intent(App.getContext(), OneLevelActivity.class);
//                intent.putExtra(Constant.TAG, oneLevelEntity.getOneLevel());
//            } else {
//                // 跳转二级页面
//                intent = new Intent(App.getContext(), OneLevelActivity.class);
//                intent.putExtra(Constant.TAG, oneLevelEntity.getSecondLevel());
//            }
//            App.getContext().startActivity(intent);
        });

        // 表示存在二级目录
        int tag = oneLevelEntity.getNextFile().getTag();
        String message;
        message = RevertDetailFactory.getInstant().getTitleMessage(tag);
        binding.tvNext.setText(message);
        binding.lineView.setLineCount(2);

        if (position % 2 == 0) {
            binding.llClick.setBackgroundColor(App.getContext().getResources().getColor(R.color.aa_shadow_color));
        } else {
            binding.llClick.setBackgroundColor(App.getContext().getResources().getColor(R.color.transparent));
        }
    }

    @Override
    public int getItemCount() {
        return mList == null ? 0 : mList.size();
    }

    public void setList(List<CenturyLevelEntity> list) {
        mList.clear();
        append(list);
    }

    private void append(List<CenturyLevelEntity> list) {
        if (list != null) {
            int previousSize = this.mList.size();
            mList.clear();
            notifyItemRangeRemoved(0, previousSize);
            mList.addAll(list);
            notifyItemRangeInserted(0, list.size());
        }
    }

}
