package cn.imppp.knowlege.state;

import androidx.databinding.ObservableField;
import androidx.lifecycle.ViewModel;
import cn.imppp.knowlege.listener.ClickProxy;

// 标题栏属性

public class TitleViewModel extends ViewModel {
    private ClickProxy clickProxy;      // 点击

    public void setClickProxy(ClickProxy clickProxy) {
        this.clickProxy = clickProxy;
    }

    // 标题
    public ObservableField<String> title = new ObservableField<>("");

    // 菜单
    public ObservableField<Boolean> showMenu = new ObservableField<>(false);

    // 收藏按钮
    public ObservableField<Boolean> shouCang = new ObservableField<>(false);

    // 返回操作
    public void backClick() {
        clickProxy.backClick();
    }

    public void menu() {
        clickProxy.menu();
    }
}
