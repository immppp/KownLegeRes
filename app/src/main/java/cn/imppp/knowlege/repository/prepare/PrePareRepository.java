package cn.imppp.knowlege.repository.prepare;

import java.util.ArrayList;
import java.util.List;

import cn.imppp.knowlege.constant.FileTagEnum;
import cn.imppp.knowlege.entity.OneLevelEntity;
import cn.imppp.knowlege.entity.SecondLevelEntity;

public class PrePareRepository {
    private static PrePareRepository prePareRepository = new PrePareRepository();

    private String str3 ="";
    private String str4 =
            "       （一）车辆管理部门做好应急用车准备。接到小分队出发或运输应急物资等命令后迅速调度应急车辆，确保应急工作需要。\n" +
            "       （二）应急物资管理部门根据防控工作需要，制定应急物资储备和装备的采购计划，报请专家组讨论" +
            "，经领导小组批准同意后，由中心应急物资采购部门负责采购。\n";
    private String str5 =
            "       1、个人准备：换洗衣服、袜子、茶杯等生活用品。\n" +
            "       2、应急物资管理部门准备：卫生应急背包1只。应急背包内有：沐浴露、洗发水、" +
            "牙刷、牙膏、毛巾、雨伞、手电筒、卫生应急背心、帽子、体温表、手消毒剂、酒精棉球、常规药品、应急标识等。";
    private String str6 =
            "       个人准备：手机及充电设备等。";
    private String str7 = "";

    public static PrePareRepository getInstance() {
        return prePareRepository;
    }

    // 获取子类分组
    public List<OneLevelEntity> getOneLevelData() {
        List<OneLevelEntity> mList = new ArrayList<>();
        OneLevelEntity oneLevelEntity = new OneLevelEntity(
                FileTagEnum.PREPARE_TAG,
                FileTagEnum.THINGS_PREPARE);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.PREPARE_TAG,
                FileTagEnum.PRO_PREPARE);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.PREPARE_TAG,
                FileTagEnum.TRAN_PREPARE);
        mList.add(oneLevelEntity);
        return mList;
    }

    // 获取二级子类分组
    public List<SecondLevelEntity> getSecondLevelData(int tag) {
        List<SecondLevelEntity> mList = new ArrayList<>();
        if (tag == 2) {
            SecondLevelEntity secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.THINGS_PREPARE,
                    FileTagEnum.THINGS_PREPARE_FLAG1);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.THINGS_PREPARE,
                    FileTagEnum.THINGS_PREPARE_FLAG2);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.THINGS_PREPARE,
                    FileTagEnum.THINGS_PREPARE_FLAG3);
            mList.add(secondLevelEntity);
        } else if (tag == 7) {
            SecondLevelEntity secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.THINGS_PREPARE_FLAG3,
                    FileTagEnum.THINGS_PREPARE_FLAG31);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.THINGS_PREPARE_FLAG3,
                    FileTagEnum.THINGS_PREPARE_FLAG32);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.THINGS_PREPARE_FLAG3,
                    FileTagEnum.THINGS_PREPARE_FLAG33);
            mList.add(secondLevelEntity);
        }
        return mList;
    }

    // 获取三级子页面的数据
    public String getThreeLevelData(int tag) {
        String str = "敬请期待";
        switch (tag) {
            case 3:
                str = str3;
                break;
            case 4:
                str = str4;
                break;
            case 5:
                str = str5;
                break;
            case 6:
                str = str6;
                break;
            case 7:
                str = str7;
                break;
        }
        return str;
    }
}
