package cn.imppp.knowlege.repository.socal;

import java.util.ArrayList;
import java.util.List;

import cn.imppp.knowlege.constant.FileTagEnum;
import cn.imppp.knowlege.entity.OneLevelEntity;
import cn.imppp.knowlege.entity.SecondLevelEntity;

public class SocalDealRepository {
    private String str20 =
            "       （一）核实：接到群体性不明原因疾病报告后，立即派出专业人员（包括流行病学或卫生学、临床、" +
            "检验等专业人员）对不明原因疾病进行初步核实。\n" +
            "       （二）判断：根据核实结果进行综合分析，初步判断群体性不明原因疾病是否存在。若确认事件存在，" +
            "应对群体性不明原因疾病的性质、规模、种类、严重程度、高危人群、发展阶段和趋势进行初步判断，并制定初步的调查方案和控制措施。";

    private String str24 =
            "       根据病例定义的内容，在一定的时间、范围内搜索类似病例并开展个案调查、" +
            "入户调查和社区调查。设计调查表，培训调查人员，统一调查内容和方法。";
    private String str25 =
            "       统计病例的发病数、死亡数、病死率、病程等指标，描述病例的三间分布及特征，进行关联性分析。";
    private String str26 =
            "       1、 从临床、流行病学资料入手，寻找病因线索：首先考虑常见病、多发病，再考虑少见病、罕见病，最后考虑新出现的疾病。如果初步判定是化学中毒，首先考虑常见的毒物，再考虑少见毒物。初步判定是感染性疾病还是非感染性疾病。如果为感染性疾病，需考虑是否具有传染性。若判定为感染性疾病可能性大，可根据患者的症状、体征、实验室检测结果，以及试验性治疗效果，判定是细菌性、病毒性，还是其它病原微生物的感染。如考虑为非感染性疾病，需先判定是否中毒，再考虑是否心因性、过敏性、放射性（辐射）或其它原因引起的疾病。\n" +
            "       2、 从流行病学特征入手，建立病因假设：掌握背景资料，归纳疾病分布特征，形成病因假设。";
    private String str27 =
            "       1、 流行病学病因验证：根据病因假设，通过病例-对照研究、队列研究等分析性流行病学方法进行假设验证。\n" +
            "       2、实验室证据：收集样本（血、咽拭子、痰、大便、尿、脑脊液、尸解组织等），通过实验室检测验证假设。 \n" +
            "       3、干预（控制）措施效果评价。\n" +
            "       4、如果通过验证假设无法成立，则必须重新考虑或修订假设，根据新的线索" +
            "制定新的方案。有的群体性不明原因疾病可能需要反复多次的验证，方能找到明确原因。";
    private String str28 =
            "       综合分析调查结果，对群体性不明原因疾病的病因、目前所处阶段、影响范围、病人救治和干预（控制）措施的效果等方面进行描述和分析，得出初步结论。同" +
            "时对病人的预后、群体性不明原因疾病发展趋势及其影响因素进行分析和预测，并对下一步工作提出建议。";
    private String str29 =
            "标本采集：\n" +
            "       应依据疾病的不同进程，进行多部位、多频次采集标本。包括血标本（血清、抗凝血、其它血标本）、呼吸道标本（包括咽拭子、鼻拭子、鼻咽抽取物、咽漱液、痰液、呼吸道抽取物、支气管灌洗液、胸水、肺组织活检标本）、消化道标本（包括患者的呕吐物、粪便和肛拭子）、尿液、其它人体标本（包括脑脊液、疱疹液、淋巴结穿刺液、溃破组织、皮肤焦痂等），对病死患者要求进行尸体解" +
            "剖。所有的标本采集工作应遵循无菌操作的原则。标本采集及运输时应严格按照相关生物安全规定进行。\n\n" +
            "实验室检测：\n" +
            "       一般进行抗体检测、抗原检测、核酸检测、病原分离、形态学检测等检测项目。根据病原体的特殊性可以开展一些特殊的检测项目。\n";
    private String str30 = "标本采集：\n" +
            "       1、 食物中毒：在用药前采集病人的血液、尿液、呕吐物、粪便，剩余食物、食物原料、餐具、容器、工具以及死者的胃、肠内容物等。尸体解剖：重点采集肝、胃、肠、肾、心等。\n" +
            "       2、 职业中毒：采集中毒者的血液、尿液，以及空气、水、土壤等环境标本。尸体解剖：采集标本应根据毒物入侵途径和主要受损部位等，如采集血液、肝、肾、骨等。\n\n" +
            "实验室检测：\n" +
            "       非感染性疾病：根据病因分析的要求开展相应的检测项目。";
    private String str32 =
            "       积极救治病人，减少死亡；对共同暴露者进行医学观察，一旦发现符合本次事件病例定义的病人，立即开展临床救治；移除可疑致病源；尽快疏散可能继续受致病源" +
            "威胁的群众；在对易感者采取有针对性保护措施时，应优先考虑高危人群；开展健康教育，提高居民自我保护意识。";
    private String str33 =
            "       现场处置人员进入疫区时，应采取保护性预防措施；隔离治疗患者；如果有暴发或者扩散的可能，符合封锁标准的，要向当地政府提出封锁建议；对病人家属和密切接触者进行医学观察；严格实施消毒；疫区内家禽、家畜应实行圈养，如有必要，报经当地政府同意后，对可能染疫的野生动物、家禽家畜进行控制或捕杀；开展健康教育；现场处置结束时要对疫源地进行终末消毒，妥善处理医疗废物和临时隔离点的物品。\n" +
            "       根据对控制措施效果评价，以及疾病原因的进一步调查结果，及时改进、补充和完善各项控制措施。一旦明确病因，即按照相关疾病的处置规范开展工作，暂时无规范的，应尽快组织人员制定。";

    private final static SocalDealRepository object = new SocalDealRepository();

    public static SocalDealRepository getInstance() {
        return object;
    }

    // 获取子类分组
    public List<OneLevelEntity> getOneLevelData() {
        List<OneLevelEntity> mList = new ArrayList<>();
        OneLevelEntity oneLevelEntity = new OneLevelEntity(
                FileTagEnum.SOCIAL_DEAL,
                FileTagEnum.SOCIAL_CONFIRM);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.SOCIAL_DEAL,
                FileTagEnum.SOCIAL_ANY);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.SOCIAL_DEAL,
                FileTagEnum.SOCIAL_CHECK);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.SOCIAL_DEAL,
                FileTagEnum.SOCIAL_CONTROL);
        mList.add(oneLevelEntity);
        return mList;
    }

    // 获取二级子类分组
    public List<SecondLevelEntity> getSecondLevelData(int tag) {
        List<SecondLevelEntity> mList = new ArrayList<>();
        if (tag == 21) {
            SecondLevelEntity secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.SOCIAL_ANY,
                    FileTagEnum.SOCIAL_ANY1);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.SOCIAL_ANY,
                    FileTagEnum.SOCIAL_ANY2);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.SOCIAL_ANY,
                    FileTagEnum.SOCIAL_ANY3);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.SOCIAL_ANY,
                    FileTagEnum.SOCIAL_ANY4);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.SOCIAL_ANY,
                    FileTagEnum.SOCIAL_ANY5);
            mList.add(secondLevelEntity);
        } else if (tag == 22) {
            SecondLevelEntity secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.SOCIAL_CHECK,
                    FileTagEnum.SOCIAL_CHECK1);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.SOCIAL_CHECK,
                    FileTagEnum.SOCIAL_CHECK2);
            mList.add(secondLevelEntity);
//            secondLevelEntity = new SecondLevelEntity(FileTagEnum.SOCIAL_CHECK3.getTitleMessage(),
//                    FileTagEnum.SOCIAL_CHECK.getTag(),
//                    FileTagEnum.SOCIAL_CHECK3.getTag());
//            mList.add(secondLevelEntity);
        } else if (tag == 23) {
            SecondLevelEntity secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.SOCIAL_CONTROL,
                    FileTagEnum.SOCIAL_CONTROL1);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.SOCIAL_CONTROL,
                    FileTagEnum.SOCIAL_CONTROL2);
            mList.add(secondLevelEntity);
        }
        return mList;
    }

    // 获取三级子页面的数据
    public String getThreeLevelData(int tag) {
        String str = "敬请期待";
        switch (tag) {
            case 20:
                str = str20;
                break;
            case 24:
                str = str24;
                break;
            case 25:
                str = str25;
                break;
            case 26:
                str = str26;
                break;
            case 27:
                str = str27;
                break;
            case 28:
                str = str28;
                break;
            case 29:
                str = str29;
                break;
            case 30:
                str = str30;
                break;
            case 32:
                str = str32;
                break;
            case 33:
                str = str33;
                break;
        }
        return str;
    }
}
