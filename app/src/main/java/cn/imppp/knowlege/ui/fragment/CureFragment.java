package cn.imppp.knowlege.ui.fragment;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.qmuiteam.qmui.util.QMUIStatusBarHelper;

import java.util.ArrayList;
import java.util.List;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import cn.imppp.knowlege.BR;
import cn.imppp.knowlege.R;
import cn.imppp.knowlege.app.App;
import cn.imppp.knowlege.base.BaseLazyFragment;
import cn.imppp.knowlege.constant.Constant;
import cn.imppp.knowlege.databinding.CureFragmentLayoutBinding;
import cn.imppp.knowlege.listener.AppBarStateChangeListener;
import cn.imppp.knowlege.pageAdapter.CurePageAdapter;
import cn.imppp.knowlege.ui.activity.CenturyActivity;
import cn.imppp.knowlege.ui.activity.OneLevelActivity;
import cn.imppp.knowlege.ui.activity.QueryActivity;
import cn.imppp.knowlege.ui.activity.SecondLevelActivity;
import cn.imppp.knowlege.ui.activity.ThreeLevelActivity;
import cn.imppp.knowlege.ui.fragment.cure.CureOneFragment;
import cn.imppp.knowlege.ui.fragment.cure.CureThreeFragment;
import cn.imppp.knowlege.ui.fragment.cure.CureTwoFragment;

public class CureFragment extends BaseLazyFragment {
    private List<Fragment> fragments;
    private CureFragmentLayoutBinding mBinding;
    private List<String> titles;

    {
        fragments = new ArrayList<>();
        fragments.add(new CureOneFragment());
        fragments.add(new CureTwoFragment());
//        fragments.add(new CureThreeFragment());

        titles = new ArrayList<>();
        titles.add("应急队员职责");
        titles.add("消毒方法");
//        titles.add("标题3");
    }

    @Override
    public void loadData() {
        // 加载viewPager
        CurePageAdapter curePageAdapter = new CurePageAdapter(getActivity(), fragments);
        mBinding.viewPage2.setAdapter(curePageAdapter);
        // 关联viewpager
        new TabLayoutMediator(mBinding.tabLayout,
                mBinding.viewPage2, (tab, position) -> tab.setText(titles.get(position)))
                .attach();

        // 监听布局的折叠
        mBinding.appBarLayout.addOnOffsetChangedListener(new AppBarStateChangeListener() {
            @Override
            public void onStateChanged(AppBarLayout appBarLayout, State state) {
                if (state == State.EXPANDED) {
                    //展开状态
                    mBinding.toolbar.setVisibility(View.GONE);
                } else if (state == State.COLLAPSED) {
                    //折叠状态
                    mBinding.toolbar.setPadding(0,
                            QMUIStatusBarHelper.getStatusbarHeight(getActivity()),
                            0,
                            0);
                    mBinding.toolbar.setVisibility(View.VISIBLE);
                } else {
                    //中间状态
                    mBinding.toolbar.setVisibility(View.GONE);
                }
            }
        });
        String font = "fonts/diandian.ttf";
        Typeface typeface = Typeface.createFromAsset(getActivity().getAssets(), font);
        mBinding.tvAppName.setTypeface(typeface);
    }

    @Override
    public void refreshData() {

    }

    @Override
    public View initRootView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.cure_fragment_layout, container, false);
        mBinding.setVariable(BR.click, new ClickProxy());
        return mBinding.getRoot();
    }

    @Override
    public void backClick() {

    }

    public class ClickProxy{
        public void prepare() {
            Intent intent = new Intent(App.getContext(), OneLevelActivity.class);
            intent.putExtra(Constant.TAG, 1);
            App.getContext().startActivity(intent);
        }

        public void disease() {
            Intent intent = new Intent(App.getContext(), OneLevelActivity.class);
            intent.putExtra(Constant.TAG, 8);
            App.getContext().startActivity(intent);
        }

        public void socail() {
            Intent intent = new Intent(App.getContext(), OneLevelActivity.class);
            intent.putExtra(Constant.TAG, 19);
            App.getContext().startActivity(intent);
        }

        public void report() {
            Intent intent = new Intent(App.getContext(), OneLevelActivity.class);
            intent.putExtra(Constant.TAG, 53);
            App.getContext().startActivity(intent);
        }

        public void rule() {
            Intent intent = new Intent(App.getContext(), OneLevelActivity.class);
            intent.putExtra(Constant.TAG, 74);
            App.getContext().startActivity(intent);
        }

        public void time() {
            Intent intent = new Intent(App.getContext(), OneLevelActivity.class);
            intent.putExtra(Constant.TAG, 111);
            App.getContext().startActivity(intent);
        }

        public void study() {
            Intent intent = new Intent(App.getContext(), OneLevelActivity.class);
            intent.putExtra(Constant.TAG, -1);
            App.getContext().startActivity(intent);
        }

        public void check() {
            Intent intent = new Intent(App.getContext(), ThreeLevelActivity.class);
            intent.putExtra(Constant.TAG, 12306);
            App.getContext().startActivity(intent);
        }

        public void collect() {
            Intent intent = new Intent(App.getContext(), OneLevelActivity.class);
            intent.putExtra(Constant.TAG, 211);
            App.getContext().startActivity(intent);
        }

        public void control() {
            Intent intent = new Intent(App.getContext(), OneLevelActivity.class);
            intent.putExtra(Constant.TAG, 34);
            App.getContext().startActivity(intent);
        }

        public void water() {
            Intent intent = new Intent(App.getContext(), OneLevelActivity.class);
            intent.putExtra(Constant.TAG, 227);
            App.getContext().startActivity(intent);
        }

        public void killVirus() {
            Intent intent = new Intent(App.getContext(), OneLevelActivity.class);
            intent.putExtra(Constant.TAG, 241);
            App.getContext().startActivity(intent);
        }

        public void natureMonitor() {
            Intent intent = new Intent(App.getContext(), OneLevelActivity.class);
            intent.putExtra(Constant.TAG, 0);
            App.getContext().startActivity(intent);
        }

        public void openVirus() {
            Intent intent = new Intent(App.getContext(), OneLevelActivity.class);
            intent.putExtra(Constant.TAG, 266);
            App.getContext().startActivity(intent);
        }

        public void keep() {
            Intent intent = new Intent(App.getContext(), OneLevelActivity.class);
            intent.putExtra(Constant.TAG, 295);
            App.getContext().startActivity(intent);
        }

        public void event() {
            Intent intent = new Intent(App.getContext(), OneLevelActivity.class);
            intent.putExtra(Constant.TAG, 312);
            App.getContext().startActivity(intent);
        }

        public void query() {
            Intent intent = new Intent(App.getContext(), QueryActivity.class);
            intent.putExtra(Constant.TAG, 312);
            App.getContext().startActivity(intent);
        }
    }
}
