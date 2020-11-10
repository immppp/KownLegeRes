package cn.imppp.knowlege.repository.wen;

import java.util.ArrayList;
import java.util.List;

import cn.imppp.knowlege.constant.FileTagEnum;
import cn.imppp.knowlege.entity.OneLevelEntity;
import cn.imppp.knowlege.entity.SecondLevelEntity;

public class WenRepository {

    private String str325 =
            "       对无法清除的容器或小型积水和有蚊虫孳生的较大型水体，通常可采用化学防治方法杀灭蚊幼作为环境治理的补充。化学杀幼剂施用方法一般采用喷洒法，即根据各种药剂的用量，适当加水稀释，然后对孳生地水面进行喷洒。 ";
    private String str327 =
            "       针对室内局部蚊虫栖息的表面，或有蚊虫活动的小空间进行喷洒。喷洒工具常用一般手动喷雾器。喷后宜将门窗关20～30分钟。喷洒用量因药剂而异，一般为0.2～0.5ml/米3,雾化性能差的喷雾器和药剂毒效不高的，用量为1ml/米3。";
    private String str328 =
            "       适宜于进行大面积的室内空间喷洒。多采用轻便手提式电动超低容量喷雾机，由专业人员进行喷洒。喷洒用量随药剂性能而别。一般只需向空间喷洒数秒钟，用量为0.1ml/米3，即可见效。";
    private String str329 =
            "       采用手提式、背负式或车载式的机动超低容量喷雾机或热雾发生器，针对各种蚊虫室外栖息场所如竹林、灌木林、园林、花圃、废旧轮胎贮存地、暗渠、污水排放口、桥底、防空洞、建筑工地，以及住宅周围盆、罐大量堆放的场所，进行大面积喷洒。";
    private String str330 =
            "       滞留处理包括室内滞留喷洒和蚊账浸泡或喷洒两部分。\n" +
            "       室内滞留喷洒是将具有持效的杀虫剂喷洒在蚊虫停息的场所，待蚊虫接触后发生中毒致死，其持效应有数月以上，以达到持续降低蚊媒密度、缩短蚊媒寿命并减少以至阻断疾病传播的目的。 \n" +
            "       喷洒方法：喷洒时喷头与墙面距离0.5米左右，保持一定速度，按喷幅上下左右相连顺序进行。务求药液喷洒均匀，达到单位面积受药量的要求。";
    private String str332 =
            "       拟除虫菊酯处理蚊帐具有效可行、经济、简便等优点，已得到世界卫生组织确认。";


    private final static WenRepository wen = new WenRepository();

    public static WenRepository getInstance() {
        return wen;
    }

    // 获取子类分组
    public List<OneLevelEntity> getOneLevelData() {
        List<OneLevelEntity> mList = new ArrayList<>();
        OneLevelEntity oneLevelEntity = new OneLevelEntity(
                FileTagEnum.WEN_CONTROL,
                FileTagEnum.WEN_CONTROL1);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.WEN_CONTROL,
                FileTagEnum.WEN_CONTROL2);
        mList.add(oneLevelEntity);
        return mList;
    }

    // 获取二级子类分组
    public List<SecondLevelEntity> getSecondLevelData(int tag) {
        List<SecondLevelEntity> mList = new ArrayList<>();
        if (tag == 323) {
            SecondLevelEntity secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.WEN_CONTROL1,
                    FileTagEnum.WEN_CONTROL1_1);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.WEN_CONTROL1,
                    FileTagEnum.WEN_CONTROL1_2);
            mList.add(secondLevelEntity);
        } else if (tag == 324) {
            SecondLevelEntity secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.WEN_CONTROL2,
                    FileTagEnum.WEN_CONTROL2_1);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.WEN_CONTROL2,
                    FileTagEnum.WEN_CONTROL2_2);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.WEN_CONTROL2,
                    FileTagEnum.WEN_CONTROL2_3);
            mList.add(secondLevelEntity);
             secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.WEN_CONTROL2,
                    FileTagEnum.WEN_CONTROL2_4);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.WEN_CONTROL2,
                    FileTagEnum.WEN_CONTROL2_5);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.WEN_CONTROL2,
                    FileTagEnum.WEN_CONTROL2_6);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.WEN_CONTROL2,
                    FileTagEnum.WEN_CONTROL2_7);
            mList.add(secondLevelEntity);
        }
        return mList;
    }

    // 获取三级子页面的数据
    public String getThreeLevelData(int tag) {
        String str = "敬请期待";
        switch (tag) {
            case 325:
                str = str325;
                break;
            case 327:
                str = str327;
                break;
            case 328:
                str = str328;
                break;
            case 329:
                str = str329;
                break;
            case 330:
                str = str330;
                break;
            case 332:
                str = str332;
                break;
        }
        return str;
    }

}
