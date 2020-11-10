package cn.imppp.knowlege.factory;

import java.util.List;

import cn.imppp.knowlege.entity.CenturyLevelEntity;
import cn.imppp.knowlege.entity.OneLevelEntity;
import cn.imppp.knowlege.entity.SecondLevelEntity;

public class CheckPageFactory {

    public static boolean haveNextPage(int TAG) {
        boolean flag = false;

        List<CenturyLevelEntity> mList = RevertCenturyLevelFactory.getInstance().getData(TAG);
        if(mList != null && mList.size() > 0) {
            flag = true;
        }
        List<OneLevelEntity> mList2 = RevertContentFactory.getInstance().getOneLevelList(TAG);
        if (mList2 != null && mList2.size() > 0) {
            flag = true;
        }

        List<SecondLevelEntity> mList3 = RevertContentFactory.getInstance().getSecondLevelList(TAG);
        if (mList3 != null && mList3.size() > 0) {
            flag = true;
        }
        return flag;
    }

    public static boolean isDesPage(int tag) {
        if (tag == 408)
            return true;
        if (tag >= 379 && tag <= 387) {
            return true;
        }
        return false;
    }

}
