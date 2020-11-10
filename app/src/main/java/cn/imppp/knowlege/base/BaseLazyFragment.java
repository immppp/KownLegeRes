package cn.imppp.knowlege.base;


import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.qmuiteam.qmui.widget.dialog.QMUITipDialog;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import cn.imppp.knowlege.R;
import cn.imppp.knowlege.listener.ClickProxy;
import cn.imppp.knowlege.state.TitleViewModel;

import static androidx.constraintlayout.widget.Constraints.TAG;


/**
 * A simple {@link Fragment} subclass.
 */
public abstract class BaseLazyFragment extends Fragment implements ClickProxy {

    private boolean isLoadedData;               // 是否加载数据
    private View mRootView;                     // 布局
    private boolean mViewInflateFinished;     // 表示找控件完成, 给控件们设置数据不会报空指针了
    private Lifecycle lifecycle;                // 生命周期
    private DefaultLifecycleObserver observer;  // 观察者
    private TitleViewModel titleViewModel;
    private QMUITipDialog tipDialog;

    public BaseLazyFragment() {
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView");
        if (mRootView != null) {
            return mRootView;
        }
        mRootView = initRootView(inflater, container, savedInstanceState);
        mViewInflateFinished = true;
        if (titleViewModel == null) {
            // 统一处理标题栏绑定返回操作
            titleViewModel = new ViewModelProvider(this).get(TitleViewModel.class);
            titleViewModel.setClickProxy(this);
        }
        lifecycle = requireActivity().getLifecycle();
        return mRootView;
    }

    @Override
    public void onResume() {
        super.onResume();
        if (observer != null) {
            lifecycle.removeObserver(observer);
        }
        observer = new DefaultLifecycleObserver() {
            @Override
            public void onResume(@NonNull LifecycleOwner owner) {
                if (!isLoadedData) {
                    loadData();
                    isLoadedData = true;
                } else {
                    refreshData();
                }
            }

            @Override
            public void onPause(@NonNull LifecycleOwner owner) {
            }

            @Override
            public void onStop(@NonNull LifecycleOwner owner) {
            }
        };
        lifecycle.addObserver(observer);
    }

    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
    }

    @Override
    public void menu() {

    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        lifecycle.removeObserver(observer);
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    private void showDialog() {
        if (tipDialog == null) {
            tipDialog = new QMUITipDialog.Builder(getActivity())
                    .setIconType(QMUITipDialog.Builder.ICON_TYPE_LOADING)
                    .setTipWord(getResources().getString(R.string.loading))
                    .create();
        }
        tipDialog.show();
    }

    private void hideDialog() {
        if (tipDialog != null)
            tipDialog.dismiss();
    }

    // 网络加载动画观察者
    public void loadAnimation(BaseRequestViewModel requestViewModel) {
        requestViewModel.getIsLoading().observe(this, aBoolean -> {
            if (aBoolean) {
                showDialog();
            } else {
                hideDialog();
            }
        });
    }

    // 加载数据
    public abstract void loadData();

    // 刷新数据
    public abstract void refreshData();

    // 加载布局
    public abstract View initRootView(LayoutInflater inflater, ViewGroup container,
                               Bundle savedInstanceState);
}
