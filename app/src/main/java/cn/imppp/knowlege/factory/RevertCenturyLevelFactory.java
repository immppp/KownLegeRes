package cn.imppp.knowlege.factory;

import java.util.ArrayList;
import java.util.List;

import cn.imppp.knowlege.constant.FileTagEnum;
import cn.imppp.knowlege.entity.CenturyLevelEntity;

public class RevertCenturyLevelFactory {
    private final static RevertCenturyLevelFactory century = new RevertCenturyLevelFactory();
    public static RevertCenturyLevelFactory getInstance() {
        return century;
    }

    public List<CenturyLevelEntity> getData(int tag) {
        List<CenturyLevelEntity> list = new ArrayList<>();
        if (tag == 0) {
            // 灾区管理
            CenturyLevelEntity centuryLevelEntity = new CenturyLevelEntity(
                    FileTagEnum.MIE_MONITOR,
                    FileTagEnum.MIE_MONITOR
            );
            list.add(centuryLevelEntity);
            centuryLevelEntity = new CenturyLevelEntity(
                    FileTagEnum.WORK_USE,
                    FileTagEnum.WORK_USE
            );
            list.add(centuryLevelEntity);
            centuryLevelEntity = new CenturyLevelEntity(
                    FileTagEnum.WATER_USE_FUNCTION,
                    FileTagEnum.WATER_USE_FUNCTION
            );
            list.add(centuryLevelEntity);
            centuryLevelEntity = new CenturyLevelEntity(
                    FileTagEnum.KILL_VIRUS,
                    FileTagEnum.KILL_VIRUS
            );
            list.add(centuryLevelEntity);

        } else if (tag == -1) {
            CenturyLevelEntity centuryLevelEntity = new CenturyLevelEntity(
                    FileTagEnum.EVENT_RULE,
                    FileTagEnum.EVENT_RULE
            );
            list.add(centuryLevelEntity);
            centuryLevelEntity = new CenturyLevelEntity(
                    FileTagEnum.STATE_TIME,
                    FileTagEnum.STATE_TIME
            );
            list.add(centuryLevelEntity);
            centuryLevelEntity = new CenturyLevelEntity(
                    FileTagEnum.REASON_STEP,
                    FileTagEnum.REASON_STEP
            );
            list.add(centuryLevelEntity);
            centuryLevelEntity = new CenturyLevelEntity(
                    FileTagEnum.STUDY_DISEASE,
                    FileTagEnum.STUDY_DISEASE
            );
            list.add(centuryLevelEntity);
            centuryLevelEntity = new CenturyLevelEntity(
                    FileTagEnum.CHECK_DRUGS,
                    FileTagEnum.CHECK_DRUGS
            );
            list.add(centuryLevelEntity);
            centuryLevelEntity = new CenturyLevelEntity(
                    FileTagEnum.COLLECT_TABLE,
                    FileTagEnum.COLLECT_TABLE
            );
            list.add(centuryLevelEntity);
            centuryLevelEntity = new CenturyLevelEntity(
                    FileTagEnum.FOOD_DRUGS_DEAL,
                    FileTagEnum.FOOD_DRUGS_DEAL
            );
            list.add(centuryLevelEntity);
        }
        return list;
    }

}
