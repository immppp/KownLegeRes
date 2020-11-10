package cn.imppp.knowlege.repository.control;

// 病媒控制

import java.util.ArrayList;
import java.util.List;

import cn.imppp.knowlege.constant.FileTagEnum;
import cn.imppp.knowlege.entity.OneLevelEntity;
import cn.imppp.knowlege.entity.SecondLevelEntity;

public class ControlRepository2 {
    private String str375 =
            "       *敌百虫0.1%～0.2％水溶液，按500～1000ml/m2喷洒。\n" +
                    "       *杀螟松0.3％乳剂或水溶液，按500～1000 ml/m2喷洒。\n" +
                    "       *马拉硫磷0.2％乳剂，按500～1000 ml/m2喷洒。\n" +
                    "       *倍硫磷0.1％乳剂，按500～1000 ml/m2喷洒，24小时杀死100%，持效7～10天。\n" +
                    "       *地亚农0.05％乳剂，按500～1000 ml/m2喷洒，24小时杀死100%，是最好的杀蛆剂。\n" +
                    "       *敌敌畏0.05％乳剂或水溶液，按500～1000 ml/m2喷洒。喷洒粪坑，对稀粪坑可用0.3%～0.5%，按500 ml/m2喷洒。\n" +
                    "       *诺毕速灭松乳剂，为杀螟松和胺菊酯的混合剂—诺毕速灭松（含量：杀螟松５％，胺菊酯0.5%），将诺毕速灭松乳剂稀释100～200倍。在垃圾处理场防治蝇蛆，按1000～2000 ml/m2喷洒，持效7～10天。\n" +
                    "       *灭幼脲Ⅰ号TH6040[1-(4-氯苯基)-3(2.6-二苯甲酰基)脲]、灭幼脲Ⅱ号TH6038[1-(4-氯苯基)-3(2.6-二氯苯甲酰基)脲]，浓度均为10mg/L。\n" +
                    "       *灭幼宝0.5%颗粒剂，每平方米10～20g，有效抑制蝇类羽化，持效达1个月。\n" +
                    "       如果垃圾有苍蝇孳生，取80%敌敌畏2两（100g）加水100斤，按100～200 ml/m2均匀喷洒。\n";
    private String str376 =
            "       将具有滞效、触杀作用的杀虫剂制剂，采用常量喷洒、或涂抹、或粉刷，使杀虫剂的有效成分按一定剂量、均匀地附着在停留面上。";
    private String str377 = "        空间喷雾是快速降低室内外蝇密度最有效的方法，它使用较少剂量的杀虫剂直接快速的杀灭成蝇，特点是快速、安全、有效。缺点是没有持效，对幼虫及蛹基本无效。主要直接处理室内外苍蝇活动、栖息的场所。家庭室内空间喷雾一般使用家用杀虫气雾剂和手提式喷雾器；小规模室内喷雾一般使用手动喷雾器、手提式超低容量喷雾器或热烟雾机；室外大规模喷雾可用背负式机动喷雾器、车载式喷雾器和热烟雾机。室内空间喷雾一般喷雾药量为0.2～1.0ml/m3,超低容量喷雾一般为0.05～0.2ml/m2,热烟雾机为1～5ml/m2。在重点场所及应急控制疫情时，一般要求每天喷雾一次，持续1～2周，以后根据成蝇密度，每周1～2次。";
    private String str378 = "        毒饵是简便、速效、经济、易操作的蝇类防治方法。它具有使用方便、灭效好、苍蝇对其不易产生耐药性、不污染环境、能充分发挥药剂的杀虫活性等特点，主要用于成蝇聚集取食的场所。也可应用毒绳、毒饵、毒水杀蝇。";

    private final static ControlRepository2 control = new ControlRepository2();

    public static ControlRepository2 getInstance() {
        return control;
    }

    // 获取子类分组
    public List<OneLevelEntity> getOneLevelData() {
        List<OneLevelEntity> mList = new ArrayList<>();
        OneLevelEntity oneLevelEntity = new OneLevelEntity(
                FileTagEnum.CRITICAL_YING_DEAL2,
                FileTagEnum.SHA_CHILD_CONG);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.CRITICAL_YING_DEAL2,
                FileTagEnum.CHENG_YING_KONG_ZHI);
        mList.add(oneLevelEntity);
        return mList;
    }

    // 获取二级子类分组
    public List<SecondLevelEntity> getSecondLevelData(int tag) {
        List<SecondLevelEntity> mList = new ArrayList<>();
        if (tag == 373) {
            SecondLevelEntity secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.SHA_CHILD_CONG,
                    FileTagEnum.SHA_CHILD_CONG1);
            mList.add(secondLevelEntity);
        } else if (tag == 374) {
            SecondLevelEntity secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.CHENG_YING_KONG_ZHI,
                    FileTagEnum.CHENG_YING_KONG_ZHI1);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.CHENG_YING_KONG_ZHI,
                    FileTagEnum.CHENG_YING_KONG_ZHI2);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.CHENG_YING_KONG_ZHI,
                    FileTagEnum.CHENG_YING_KONG_ZHI3);
            mList.add(secondLevelEntity);
        }
        return mList;
    }

    // 获取三级子页面的数据
    public String getThreeLevelData(int tag) {
        String str = "敬请期待";
        switch (tag) {
            case 375:
                str = str375;
                break;
            case 376:
                str = str376;
                break;
            case 377:
                str = str377;
                break;
            case 378:
                str = str378;
                break;
        }
        return str;
    }
}
