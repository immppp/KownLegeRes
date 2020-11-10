package cn.imppp.knowlege.repository.rule;

import java.util.ArrayList;
import java.util.List;

import cn.imppp.knowlege.constant.FileTagEnum;
import cn.imppp.knowlege.entity.OneLevelEntity;
import cn.imppp.knowlege.entity.SecondLevelEntity;

public class RuleRepository {
    public String str76 =
            "       1、一次食物中毒人数30人及以上或死亡1人及以上；\n" +
            "       2、学校、幼儿园、建筑工地等集体单位发生食物中毒，一次中毒人数5人及以上或死亡1人及以上。\n" +
            "       3、地区性或全国性重要活动期间发生食物中毒，一次中毒人数5人及以上或死亡1人及以上。";
    private String str77 =
            "       发生急性职业中毒10人及以上或者死亡1人及以上的。";
    private String str78 =
            "       出现食物中毒、职业中毒以外的急性中毒病例3例及以上的事件。";
    private String str79 =
            "       发生环境因素改变所致的急性病例3例及以上。";
    private String str80 =
            "       出现意外辐射照射人员1例及以上。";
    private String str81 =
            "       发生鼠疫、炭疽、非典、艾滋病、霍乱、脊灰等菌毒种丢失事件。";
    private String str82 =
            "       1、群体性预防接种反应：一个预防接种单位一次预防接种活动中出现群体性疑似异常反应；或发生死亡。\n" +
            "       2、群体预防性服药反应：一个预防服药点一次预防服药活动中出现不良反应（或心因性反应）10例及以上；或死亡1例及以上。";
    private String str83 =
            "       医源性、实验室和医院感染暴发。";
    private String str84 =
            "       2周内，一个医疗机构或同一自然村寨、社区、建筑工地、学校等集体单位发生有相同临床症状的不明原因疾病3例及以上。";
    private String str85 =
            "       各级人民政府卫生行政部门认定的其它突发公共卫生事件。";
    private String str86 =
            "       发现1例及以上鼠疫病例。";
    private String str87 =
            "       发现1例及以上霍乱病例。";
    private String str88 =
            "       发现1例及以上传染性非典型肺炎病例病人或疑似病人。";
    private String str89 =
            "       发现1例及以上人感染高致病性禽流感病例。";
    private String str90 =
            "       发生1例及以上肺炭疽病例；或1周内，同一学校、幼儿园、自然村寨、社区、建筑工地等集体单位发生3例及以上皮肤炭疽或肠炭疽病例;或1例及以上职业性炭疽病例。";
    private String str91 =
            "       1周内，同一学校、幼儿园、自然村寨、社区、建筑工地等集体单位发生5例及以上甲肝/戊肝病例。";
    private String str92 =
            "       1周内，同一学校、幼儿园、自然村寨、社区、建筑工地等集体单位发生5例及以上伤寒（副伤寒）病例，或出现2例及以上死亡。";
    private String str93 =
            "       3天内，同一学校、幼儿园、自然村寨、社区、建筑工地等集体单位发生10例及以上细菌性和阿米巴性痢疾病例，或出现2例及以上死亡。";
    private String str94 =
            "       1周内，同一学校、幼儿园、自然村寨、社区、建筑工地等集体单位发生10例及以上麻疹病例。";
    private String str95 =
            "       1周内，同一学校、幼儿园、自然村寨、社区等集体单位发生10例及以上风疹病例。";
    private String str96 =
            "       3天内，同一学校、幼儿园、自然村寨、社区、建筑工地等集体单位发生3例及以上流脑病例，或者有2例及以上死亡。";
    private String str97 =
            "       1周内，一个县（市、区）发生5例及以上登革热病例；或首次发现病例。";
    private String str98 =
            "       1周内，同一自然村寨、社区、建筑工地、学校等集体单位发生5例（高发地区10例）及以上流行性出血热病例，或者死亡1例及以上。";
    private String str99 =
            "       1周内，同一自然村寨、建筑工地等集体单位发生5例及以上钩端螺旋体病病例，或者死亡1例及以上。";
    private String str100 =
            "       1周内，同一乡镇、街道等发生5例及以上乙脑病例，或者死亡1例及以上。";
    private String str101 =
            "       以行政村为单位，1个月内发现5例及以上当地感染的病例，或出现输入性恶性疟死亡病例。";
    private String str102 =
            "       在未控制地区，以行政村为单位，2周内发生急性血吸虫病病例10例及以上，或在同一感染地点1周内连续发生急性血吸虫病病例5例及以上；在传播控制地区，以行政村为单位，2周内发生急性血吸虫病5例及以上，或在同一感染地点1周内连续发生急性血吸虫病病例3例及以上；在传播阻断地区或非流行区，发现当地感染的病人、病牛或感染性钉螺。";
    private String str103 =
            "       1周内，在同一学校、幼儿园或其他集体单位发生30例及以上流感样病例，或5例及以上因流感样症状住院病例，或发生1例及以上流感样病例死亡。";
    private String str104 =
            "       1周内，同一学校、幼儿园等集体单位中发生10例及以上流行性腮腺炎病例。";
    private String str105 =
            "       1周内，同一学校、幼儿园、自然村寨、社区、建筑工地等集体单位中发生20例及以上感染性腹泻病例，或死亡1例及以上。";
    private String str106 =
            "       1周内，同一学校、幼儿园等集体单位中，发生10例及以上猩红热病例。";
    private String str107 =
            "       1周内，同一学校、幼儿园等集体单位中，发生10例及以上水痘病例。";
    private String str108 =
            "       医疗机构、采供血机构发生3例及以上输血性乙肝、丙肝病例或疑似病例或HIV感染。";
    private String str109 =
            "       发现本县（区）从未发生过的传染病或发生本县近5年从未报告的或国家宣布已消灭的传染病。";
    private String str110 =
            "       发现不明原因肺炎病例。";


    private final static RuleRepository rule = new RuleRepository();

    public static RuleRepository getInstance() {
        return rule;
    }

    // 获取子类分组
    public List<OneLevelEntity> getOneLevelData() {
        List<OneLevelEntity> mList = new ArrayList<>();
        OneLevelEntity oneLevelEntity = new OneLevelEntity(
                FileTagEnum.EVENT_RULE,
                FileTagEnum.RECURSION_EVENT);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.EVENT_RULE,
                FileTagEnum.FOOD_EVENT);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.EVENT_RULE,
                FileTagEnum.JOB_EVENT);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.EVENT_RULE,
                FileTagEnum.OTHER_EVENT);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.EVENT_RULE,
                FileTagEnum.NATURE_EVENT);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.EVENT_RULE,
                FileTagEnum.X_EVENT);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.EVENT_RULE,
                FileTagEnum.LOSS_EVENT);
        mList.add(oneLevelEntity);

        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.EVENT_RULE,
                FileTagEnum.BAD_EVENT);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.EVENT_RULE,
                FileTagEnum.HOSPITAL_EVENT);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.EVENT_RULE,
                FileTagEnum.NO_REASON_EVENT);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.EVENT_RULE,
                FileTagEnum.THINK_EVENT);
        mList.add(oneLevelEntity);
        return mList;
    }

    // 获取二级子类分组
    public List<SecondLevelEntity> getSecondLevelData(int tag) {
        List<SecondLevelEntity> mList = new ArrayList<>();
        if (tag == 75) {
            SecondLevelEntity secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.RECURSION_EVENT,
                    FileTagEnum.RECURSION_EVENT1);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.RECURSION_EVENT,
                    FileTagEnum.RECURSION_EVENT2);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.RECURSION_EVENT,
                    FileTagEnum.RECURSION_EVENT3);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.RECURSION_EVENT,
                    FileTagEnum.RECURSION_EVENT4);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.RECURSION_EVENT,
                    FileTagEnum.RECURSION_EVENT5);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.RECURSION_EVENT,
                    FileTagEnum.RECURSION_EVENT6);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.RECURSION_EVENT,
                    FileTagEnum.RECURSION_EVENT7);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.THINGS_PREPARE,
                    FileTagEnum.RECURSION_EVENT8);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.THINGS_PREPARE,
                    FileTagEnum.RECURSION_EVENT9);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.THINGS_PREPARE,
                    FileTagEnum.RECURSION_EVENT10);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.THINGS_PREPARE,
                    FileTagEnum.RECURSION_EVENT11);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.THINGS_PREPARE,
                    FileTagEnum.RECURSION_EVENT12);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.THINGS_PREPARE,
                    FileTagEnum.RECURSION_EVENT13);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.THINGS_PREPARE,
                    FileTagEnum.RECURSION_EVENT14);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.THINGS_PREPARE,
                    FileTagEnum.RECURSION_EVENT15);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.THINGS_PREPARE,
                    FileTagEnum.RECURSION_EVENT16);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.THINGS_PREPARE,
                    FileTagEnum.RECURSION_EVENT17);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.THINGS_PREPARE,
                    FileTagEnum.RECURSION_EVENT18);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.THINGS_PREPARE,
                    FileTagEnum.RECURSION_EVENT19);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.THINGS_PREPARE,
                    FileTagEnum.RECURSION_EVENT20);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.THINGS_PREPARE,
                    FileTagEnum.RECURSION_EVENT21);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.THINGS_PREPARE,
                    FileTagEnum.RECURSION_EVENT22);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.THINGS_PREPARE,
                    FileTagEnum.RECURSION_EVENT23);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.THINGS_PREPARE,
                    FileTagEnum.RECURSION_EVENT24);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.THINGS_PREPARE,
                    FileTagEnum.RECURSION_EVENT25);
            mList.add(secondLevelEntity);
        }
        return mList;
    }

    // 获取三级子页面的数据
    public String getThreeLevelData(int tag) {
        String str = "敬请期待";
        switch (tag) {
            case 76:
                str = str76;
                break;
            case 77:
                str = str77;
                break;
            case 78:
                str = str78;
                break;
            case 79:
                str = str79;
                break;
            case 80:
                str = str80;
                break;
            case 81:
                str = str81;
                break;
            case 82:
                str = str82;
                break;
            case 83:
                str = str83;
                break;
            case 84:
                str = str84;
                break;
            case 85:
                str = str85;
                break;
            case 86:
                str = str86;
                break;
            case 87:
                str = str87;
                break;
            case 88:
                str = str88;
                break;
            case 89:
                str = str89;
                break;
            case 90:
                str = str90;
                break;
            case 91:
                str = str91;
                break;
            case 92:
                str = str92;
                break;
            case 93:
                str = str93;
                break;
            case 94:
                str = str94;
                break;
            case 95:
                str = str95;
                break;
            case 96:
                str = str96;
                break;
            case 97:
                str = str97;
                break;
            case 98:
                str = str98;
                break;
            case 99:
                str = str99;
                break;
            case 100:
                str = str100;
                break;
            case 101:
                str = str101;
                break;
            case 102:
                str = str102;
                break;
            case 103:
                str = str103;
                break;
            case 104:
                str = str104;
                break;
            case 105:
                str = str105;
                break;
            case 106:
                str = str106;
                break;
            case 107:
                str = str107;
                break;
            case 108:
                str = str108;
                break;
            case 109:
                str = str109;
                break;
            case 110:
                str = str110;
                break;
        }
        return str;
    }

}
