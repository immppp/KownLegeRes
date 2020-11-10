package cn.imppp.knowlege.repository.reasonStep;

import java.util.ArrayList;
import java.util.List;

import cn.imppp.knowlege.constant.FileTagEnum;
import cn.imppp.knowlege.entity.OneLevelEntity;
import cn.imppp.knowlege.entity.SecondLevelEntity;

public class ReasonStepRepository {

    private String str408 =
            "       1、发热（热度、热诚、热型）\n" +
            "       2、发热特点，病情进展\n" +
            "       3、血常规：血象表现\n" +
            "       4、影像资料";
    private String str412 =
            "       1.多以发热起病（但也有不发热的感染性疾病，如霍乱等）\n" +
            "       2.起病急，多以天计，短的以小时计；\n" +
            "       3.病情发展有一个过程，少有急性昏迷；\n" +
            "       4.血常规检查血象多有变化。";
    private String str413 =
            "       一中性多核增高：多为细菌（结核杆菌、伤寒杆菌、布病杆菌等除外），病毒（支原体、衣原体、立克次体）可能性小（乙脑除外）\n" +
            "       一嗜酸增多：寄生虫可能性大\n" +
            "抗菌药治疗\n" +
            "       一无效：病毒可能性大；\n" +
            "       一有效：细菌、支原体、衣原体、立克次体可能性大。";
    private String str414 =
            "可能感染途径:\n" +
            "       从主要症状和靶器官受损情况可能的传播途径（呼吸道、消化道、接触、虫媒）、可能的感染因子。\n" +
            "症候群鉴别：\n" +
            "       见《按临床综合症划分的疾病特征》";

    private String str409 =
            "       1、多无发热（但某些毒物可以引起高热如五氯酚钠);\n" +
            "       2、起病急，以数分钟、数小时计；\n" +
            "       3、血常规检查血象多无改变";
    private String str415 =
            "       1.临床表现一致，严重程度与接触量正相关；\n" +
            "       2.有靶器官受损的表现；\n" +
            "       3.病情进展快，严重者昏迷、死亡";
    private String str416 =
            "       进食史、职业史、暴露史；\n" +
            "       共同暴露因素；\n" +
            "体征甄别：\n" +
            "       见《急性不明原因中毒相关体征的甄别》";
    private String str417 =
            "       1.可有多样表现，患者的具体表现为与患者获得的信息相一致；\n" +
            "       2.无器质性病变；\n" +
            "       3.主观症状与客观体征不符合；\n" +
            "       4.阵发性发作，间歇性良好";

    private String str418 =
            "群体性心因反应时间的确认：\n" +
            "       1.排除其他致病的病因；\n" +
            "       2.心理干预效果好。注意：由中毒事件引发心因性反应病例并存。";

    private final static ReasonStepRepository reason = new ReasonStepRepository();

    public static ReasonStepRepository getInstance() {
        return reason;
    }

    // 获取子类分组
    public List<OneLevelEntity> getOneLevelData() {
        List<OneLevelEntity> mList = new ArrayList<>();
        OneLevelEntity oneLevelEntity = new OneLevelEntity(
                FileTagEnum.REASON_STEP,
                FileTagEnum.LIN_CHUANG_TE_ZHENG);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.REASON_STEP,
                FileTagEnum.QUICK_DISEASE);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.REASON_STEP,
                FileTagEnum.QUICK_NO_DISEASE);
        mList.add(oneLevelEntity);
        return mList;
    }

    // 获取二级子类分组
    public List<SecondLevelEntity> getSecondLevelData(int tag) {
        List<SecondLevelEntity> mList = new ArrayList<>();
        if (tag == 406) {
            SecondLevelEntity secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.QUICK_DISEASE,
                    FileTagEnum.QUICK_DISEASE1);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.QUICK_DISEASE,
                    FileTagEnum.QUICK_DISEASE2);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.QUICK_DISEASE,
                    FileTagEnum.QUICK_DISEASE3);
            mList.add(secondLevelEntity);
        } else if (tag == 407) {
            SecondLevelEntity secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.QUICK_NO_DISEASE,
                    FileTagEnum.QUICK_NO_DISEASE1);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.QUICK_NO_DISEASE,
                    FileTagEnum.QUICK_NO_DISEASE2);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.QUICK_NO_DISEASE,
                    FileTagEnum.QUICK_NO_DISEASE3);
            mList.add(secondLevelEntity);
        } else if (tag == 410) {
            SecondLevelEntity secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.QUICK_NO_DISEASE2,
                    FileTagEnum.QUICK_NO_DISEASE21);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.QUICK_NO_DISEASE2,
                    FileTagEnum.QUICK_NO_DISEASE22);
            mList.add(secondLevelEntity);
        } else if (tag == 411) {
            SecondLevelEntity secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.QUICK_NO_DISEASE3,
                    FileTagEnum.QUICK_NO_DISEASE31);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.QUICK_NO_DISEASE3,
                    FileTagEnum.QUICK_NO_DISEASE32);
            mList.add(secondLevelEntity);
        }
        return mList;
    }

    // 获取三级子页面的数据
    public String getThreeLevelData(int tag) {
        String str = "敬请期待";
        switch (tag) {
            case 408:
                str = str408;
                break;
            case 412:
                str = str412;
                break;
            case 413:
                str = str413;
                break;
            case 414:
                str = str414;
                break;
            case 409:
                str = str409;
                break;
            case 415:
                str = str415;
                break;
            case 416:
                str = str416;
                break;
            case 417:
                str = str417;
                break;
            case 418:
                str = str418;
                break;
        }
        return str;
    }

}
