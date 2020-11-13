package cn.imppp.knowlege.ui.activity;

import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import cn.imppp.knowlege.BR;
import cn.imppp.knowlege.R;
import cn.imppp.knowlege.adapter.HistoryAdapter;
import cn.imppp.knowlege.adapter.QueryAdapter;
import cn.imppp.knowlege.app.App;
import cn.imppp.knowlege.base.BaseActivity;
import cn.imppp.knowlege.constant.Constant;
import cn.imppp.knowlege.databinding.ActivityQueryBindingImpl;
import cn.imppp.knowlege.entity.HistoryRecordEntity;
import cn.imppp.knowlege.entity.QueryBean;
import cn.imppp.knowlege.factory.QueryFactory;
import cn.imppp.knowlege.factory.RevertHasSortFactory;
import cn.imppp.knowlege.listener.ICallback;
import cn.imppp.knowlege.listener.OnRecyclerViewClickListener;
import cn.imppp.knowlege.listener.OnRecyclerViewClickListener2;
import cn.imppp.knowlege.repository.dao.HistoryRecordDao;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.senthink.module_base.utils.ToastUtils;

import java.util.List;

/**
 * @ClassName: QueryActivity
 * @Author: qaq
 * @Description: 查询页面
 * @Date: 2020/10/8 1:17 PM
 * @Company: 杭州达恒科技
 * @Version: 1.0
 */

public class QueryActivity extends BaseActivity implements OnRecyclerViewClickListener<HistoryRecordEntity>,
        OnRecyclerViewClickListener2<QueryBean> {

    private ActivityQueryBindingImpl binding;
    private HistoryRecordDao historyRecordDao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_query);
        binding.setVariable(BR.click, new ClickProxy());
        historyRecordDao = new HistoryRecordDao();
        loadHistory();

        binding.etQuery.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String text = charSequence.toString().trim();
                Log.i("onTextChanged", text + "  ");
                if (TextUtils.isEmpty(text)) {
                    loadHistory();
                    return;
                }
                if (text.length() > 1) {
                    // 存储查询语句
                    loadQueryData(text);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }

    // 加载历史数据
    private void loadHistory() {
        List<HistoryRecordEntity> list = historyRecordDao.queryDataList();
        if (list == null || list.size() == 0) {
            binding.noData.setVisibility(View.VISIBLE);
            binding.historyRecyclerView.setVisibility(View.GONE);
            binding.queryRecyclerView.setVisibility(View.GONE);
            return;
        }
        binding.noData.setVisibility(View.GONE);
        binding.historyRecyclerView.setVisibility(View.VISIBLE);
        binding.queryRecyclerView.setVisibility(View.GONE);
        HistoryAdapter historyAdapter = new HistoryAdapter(this, list);
        binding.historyRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        binding.historyRecyclerView.setAdapter(historyAdapter);
        historyAdapter.setOnClick(this);
    }

    // 加载查询结果
    private void loadQueryData(String queryStr) {
        List<QueryBean> list = QueryFactory.getInstance().getResultData(queryStr);
        if (list == null || list.size() == 0) {
            binding.noData.setVisibility(View.VISIBLE);
            binding.historyRecyclerView.setVisibility(View.GONE);
            binding.queryRecyclerView.setVisibility(View.GONE);
            return;
        }
        binding.noData.setVisibility(View.GONE);
        binding.historyRecyclerView.setVisibility(View.GONE);
        binding.queryRecyclerView.setVisibility(View.VISIBLE);

        QueryAdapter historyAdapter = new QueryAdapter(this, list);
        binding.queryRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        binding.queryRecyclerView.setAdapter(historyAdapter);
        historyAdapter.setOnClick(this);
    }

    @Override
    public void onItemClick(HistoryRecordEntity historyRecordEntity, int position, int Action) {
        if (Action == 0) {
            historyRecordDao.deleteData(historyRecordEntity);
            loadHistory();
        } else {
            loadQueryData(historyRecordEntity.getQueryContent());
        }
    }

    @Override
    public void onGroupItemClick(HistoryRecordEntity historyRecordEntity, int position, int action, ICallback callback) {

    }

    @Override
    public void onItemClick2(QueryBean queryBean, int position, int Action) {
        int level = RevertHasSortFactory.getInstance().getLevel(queryBean.getTag());
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
            intent.putExtra(Constant.TAG, queryBean.getTag());
            App.getContext().startActivity(intent);

            String queryText = binding.etQuery.getText().toString().trim();
            if (TextUtils.isEmpty(queryText)) {
                return;
            }
            HistoryRecordEntity historyRecordEntity = new HistoryRecordEntity();
            historyRecordEntity.setQueryContent(queryText);
            historyRecordDao.insertData(historyRecordEntity);
        }
    }

    public class ClickProxy{

        public void back() {
            finish();
        }

        public void query() {
            String queryStr = binding.etQuery.getText().toString().trim();
            if (TextUtils.isEmpty(queryStr)) {
                ToastUtils.showShort("查询条件不能为空");
                return;
            }
            // 存储查询语句
            HistoryRecordEntity historyRecordEntity = new HistoryRecordEntity();
            historyRecordEntity.setQueryContent(queryStr);
            historyRecordDao.insertData(historyRecordEntity);
            loadQueryData(queryStr);
        }
    }
}
