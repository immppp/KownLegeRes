package cn.imppp.knowlege.repository.collect;

// 不明原因疾病样本采集表

import java.util.ArrayList;
import java.util.List;

import cn.imppp.knowlege.constant.FileTagEnum;
import cn.imppp.knowlege.entity.OneLevelEntity;

public class CollectRepository {

    private String str212 = "标本种类：\n" +
            "       双份血清、全血、痰液、鼻咽拭子、口咽拭子、粪便、下呼吸道样品，死亡病例的气管、支气管、肺、淋巴结等。\n\n" +
            "实验检测：\n" +
            "       抗体、病原、病原核酸";
    private String str213 = "标本种类：\n" +
            "       双份血清、全血、口咽拭子、呕吐物、粪便或肛拭子，死亡病例的肝、胃、肠、脾、胰、淋巴结等。\n\n" +
            "实验检测：\n" +
            "       抗体、病原、病原核酸";
    private String str214 = "标本种类：\n" +
            "       双份血清、全血、出血标本、口咽拭子、疱疹液、尿液，死亡病例的肺、肾、肝、脾、胰、脑、皮肤、淋巴结等。\n\n" +
            "实验检测：\n" +
            "       抗体、病原、病原核酸";
    private String str215 = "标本种类：\n" +
            "       双份血清、全血、口咽拭子、脑脊液、粪便或肛拭子，死亡病例的脑、淋巴结等。\n\n" +
            "实验检测：\n" +
            "       抗体、病原、病原核酸";

    private String str216 = "标本种类：\n" +
            "       双份血清、全血、口咽拭子、呕吐物、尿液、粪便或肛拭子，死亡病例的肝、胃、肠、肾、脾、胰、淋巴结等。\n\n" +
            "实验检测：\n" +
            "       抗体、病原、病原核酸";
    private String str217 = "标本种类：\n" +
            "       双份血清、全血、咽拭子、粪便或肛拭子，死亡病例的心、肝、胃、肠、肾、脾、胰、肌肉、淋巴结等。\n\n" +
            "实验检测：\n" +
            "       抗体、病原、病原核酸";
    private String str218 = "标本种类：\n" +
            "       双份血清、全血、咽拭子、粪便或肛拭子、淋巴结穿刺液，死亡病例的心、肝、胃、肠、肾、脾、胰、肌肉、淋巴结等。\n\n" +
            "实验检测：\n" +
            "       抗体、病原、病原核酸";
    private String str219 = "标本种类：\n" +
            "       血液、尿液、呕吐物、粪便，以及剩余食物、食物原料、餐具，死者的胃、肠内容物等。尸体解剖：重点采集肝、胃、肠、肾、心等。\n\n" +
            "实验检测：\n" +
            "       病原、毒素、毒物";
    private String str220 = "标本种类：\n" +
            "       血液、尿液、呕吐物，以及水、空气、土壤等环境标本\n\n" +
            "实验检测：\n" +
            "       毒物";

    private final static CollectRepository collect = new CollectRepository();

    public static CollectRepository getInstance() {
        return collect;
    }

    // 获取子类分组
    public List<OneLevelEntity> getOneLevelData() {
        List<OneLevelEntity> mList = new ArrayList<>();
        OneLevelEntity oneLevelEntity = new OneLevelEntity(
                FileTagEnum.COLLECT_TABLE,
                FileTagEnum.DISEASE_COLLECT1);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.COLLECT_TABLE,
                FileTagEnum.DISEASE_COLLECT2);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.COLLECT_TABLE,
                FileTagEnum.DISEASE_COLLECT3);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.COLLECT_TABLE,
                FileTagEnum.DISEASE_COLLECT4);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.COLLECT_TABLE,
                FileTagEnum.DISEASE_COLLECT5);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.COLLECT_TABLE,
                FileTagEnum.DISEASE_COLLECT6);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.COLLECT_TABLE,
                FileTagEnum.DISEASE_COLLECT7);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.COLLECT_TABLE,
                FileTagEnum.DISEASE_COLLECT8);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.COLLECT_TABLE,
                FileTagEnum.DISEASE_COLLECT9);
        mList.add(oneLevelEntity);
        return mList;
    }

    // 获取二级子类分组
//    public List<SecondLevelEntity> getSecondLevelData(int tag) {
//        List<SecondLevelEntity> mList = new ArrayList<>();
//        if (tag == 2) {
//            SecondLevelEntity secondLevelEntity = new SecondLevelEntity(FileTagEnum.THINGS_PREPARE_FLAG1.getTitleMessage(),
//                    FileTagEnum.THINGS_PREPARE.getTag(),
//                    FileTagEnum.THINGS_PREPARE_FLAG1.getTag());
//            mList.add(secondLevelEntity);
//            secondLevelEntity = new SecondLevelEntity(FileTagEnum.THINGS_PREPARE_FLAG2.getTitleMessage(),
//                    FileTagEnum.THINGS_PREPARE.getTag(),
//                    FileTagEnum.THINGS_PREPARE_FLAG2.getTag());
//            mList.add(secondLevelEntity);
//            secondLevelEntity = new SecondLevelEntity(FileTagEnum.THINGS_PREPARE_FLAG3.getTitleMessage(),
//                    FileTagEnum.THINGS_PREPARE.getTag(),
//                    FileTagEnum.THINGS_PREPARE_FLAG3.getTag());
//            mList.add(secondLevelEntity);
//        }
//        return mList;
//    }

    // 获取三级子页面的数据
    public String getThreeLevelData(int tag) {
        String str = "敬请期待";
        switch (tag) {
            case 212:
                str = str212;
                break;
            case 213:
                str = str213;
                break;
            case 214:
                str = str214;
                break;
            case 215:
                str = str215;
                break;
            case 216:
                str = str216;
                break;
            case 217:
                str = str217;
                break;
            case 218:
                str = str218;
                break;
            case 219:
                str = str219;
                break;
            case 220:
                str = str220;
                break;
        }
        return str;
    }
}
