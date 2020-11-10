package cn.imppp.knowlege.state;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ThreeLevelViewModel extends ViewModel {
    public final MutableLiveData<TitleViewModel> titleView = new MutableLiveData<>();
}
