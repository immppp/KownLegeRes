package cn.imppp.knowlege.repository.disease;

import java.util.ArrayList;
import java.util.List;

import cn.imppp.knowlege.constant.FileTagEnum;
import cn.imppp.knowlege.entity.OneLevelEntity;

public class DiseaseRepository {

    private String str9 =
            "       1、组成现场调查组。成员一般包括流行病学、实验室、临床等专业人员，" +
            "必要时还应增加其他专业和管理人员。现场调查组要有负责人，组织协调整个现场调查工作。\n" +
            "       2、赴现场前，应准备必需的资料和物品。";
    private String str10 =
            "       核实诊断的目的在于排除医务人员的误诊和实验室检验的差错。可根据病史、" +
            "临床表现、实验室检查结果，结合流行病学资料进行综合分析作出判断。";
    private String str11 =
            "       如发现的病例数超过既往平均水平时，应注意分析导致病例数目增加的可能原因，如疾病" +
            "报告制度是否改变、监测系统是否调整、诊断方法及标准是否改变等，以最终确定是否确实存在疾病暴发或流行。";
    private String str12 =
            "       建立病例定义是为了尽可地搜索和发现所有的病人，确定发病规模、波及范围，以评估疾病危害程度" +
            "，并为查清发病原因提供线索。现场调查中的病例定义应包括以下四项因素：即发病的时间、地点、人间分布特征以及病人" +
            "的临床表现和／或实验室检测结果。病例的定义应简单、明了、灵敏、特异、客观、适用。现场调查早期建议使用“较为宽松" +
            "”的病例定义，以发现更多可能的病例及线索。";
    private String str13 =
            "       根据病例定义尽可能发现所有可能的病例，并排除非病例。可以通过加强已有的被动监测系统或建立主" +
            "动监测系统，提高搜索和发现病例的能力。 ";
    private String str14 =
            "       描述分析时间分布、地点分布、人群分布。";
    private String str15 =
            "       利用上述步骤所获得的信息来说明或推测暴发或流行的来源，建立假设。一个暴发和流行调查的假设应包括以下几方面：\n" +
            "       ①危险因素来源；\n" +
            "       ②传播方式和载体；\n" +
            "       ③与疾病有关的特殊暴露因素；\n" +
            "       ④高危人群。采用病例对照研究、队列研究等方法来验证假设。\n";
    private String str16 =
            "       根据疾病的传染源或危害源、传播或危害途径以及疾病特征，确定应采取的预防控制措施，包括消除传染源或危害源、减少与" +
            "暴露因素的接触、防止进一步暴露、保护易感或高危人群，最终达到控制、终止暴发或流行的目的。";
    private String str17 =
            "       使现场调查更完善，最重要的是提高病例鉴别的敏感性和特异性，以及得到更准确和真实的受累及的人数，" +
            "即提高有关分子和分母的质量。";
    private String str18 =
            "       现场调查工作的书面报告一般包括初步报告、进程报告和总结报告。\n" +
            "       现场调查通常包括上述十个步骤，但这并不意味着在每一次现场调查中这些步骤都是必不可少的。" +
            "开展现场调查的步骤也可以不完全按照上述顺序进行，有些步骤可以同时进行，也可以根据现场实际情况进行适当调整。";

    private static final DiseaseRepository instant = new DiseaseRepository();

    public static DiseaseRepository getInstance() {
        return instant;
    }

    // 获取子类分组
    public List<OneLevelEntity> getOneLevelData() {
        List<OneLevelEntity> mList = new ArrayList<>();
        OneLevelEntity oneLevelEntity = new OneLevelEntity(
                FileTagEnum.DISEASE_QUERY,
                FileTagEnum.DISEASE_PREPARE);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.DISEASE_QUERY,
                FileTagEnum.DISEASE_CONFIRM);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.DISEASE_QUERY,
                FileTagEnum.DISEASE_EXSIT);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.DISEASE_QUERY,
                FileTagEnum.DISEASE_BUILD);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.DISEASE_QUERY,
                FileTagEnum.DISEASE_COUNT);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.DISEASE_QUERY,
                FileTagEnum.DISEASE_ANY);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.DISEASE_QUERY,
                FileTagEnum.DISEASE_IDEA);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.DISEASE_QUERY,
                FileTagEnum.DISEASE_ADVICE);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.DISEASE_QUERY,
                FileTagEnum.DISEASE_FINISH);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.DISEASE_QUERY,
                FileTagEnum.DISEASE_REPORT);
        mList.add(oneLevelEntity);
        return mList;
    }

    // 获取三级子页面的数据
    public String getThreeLevelData(int tag) {
        String str = "敬请期待";
        switch (tag) {
            case 9:
                str = str9;
                break;
            case 10:
                str = str10;
                break;
            case 11:
                str = str11;
                break;
            case 12:
                str = str12;
                break;
            case 13:
                str = str13;
                break;
            case 14:
                str = str14;
                break;
            case 15:
                str = str15;
                break;
            case 16:
                str = str16;
                break;
            case 17:
                str = str17;
                break;
            case 18:
                str = str18;
                break;
        }
        return str;
    }
}
