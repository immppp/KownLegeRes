package cn.imppp.knowlege.repository.time;

import java.util.ArrayList;
import java.util.List;

import cn.imppp.knowlege.constant.FileTagEnum;
import cn.imppp.knowlege.entity.OneLevelEntity;
import cn.imppp.knowlege.entity.SecondLevelEntity;

public class TimeRepository {

    private String str137 = "潜伏期:\n" +
            "       常见：30日\n" +
            "       最短-最长：15-45日\n\n" +
            "隔离期：\n     自病发日起隔离3轴\n\n" +
            "接触者观察：\n" +
            "       密切接触者检疫45日，每周检查一次ALT,以便早期发现。";
    private String str138 = "潜伏期:\n" +
            "       常见：60-90日\n" +
            "       最短-最长：45-160日\n\n" +
            "隔离期：\n     急性期应隔离至HBsAg阴转，恢复期仍不阴转者，按HBsAg携带者处理，慢性肝炎病人应调离接触食品、自来水或幼托工作。HBsAg携带者可作HBeAg、抗—HBcIgM及HBV—DNA检查，以确定是否有HBV复制，如属阳性应按慢性肝炎处理，不能献血。\n\n" +
            "接触者观察：\n" +
            "       急性肝炎的密切接触者应医学观察45日。幼托机构发现病人后观察期间，不办理入托、转托手续。疑诊肝炎的幼托和饮食业人员应暂停原工作";
    private String str139 = "潜伏期:\n" +
            "       常见：50日\n" +
            "       最短-最长：15-160日\n\n" +
            "隔离期：\n     急性期隔离至病情稳定\n\n" +
            "接触者观察：\n" +
            "       急性肝炎的密切接触者应医学观察45日。幼托机构发现病人后观察期间，不办理入托、转托手续。疑诊肝炎的幼托和饮食业人员应暂停原工作";
    private String str140 = "潜伏期:\n" +
            "       常见：60-90日\n" +
            "       最短-最长：10-60日\n\n" +
            "隔离期：\n     急性期应隔离至HBsAg阴转，恢复期仍不阴转者，按HBsAg携带者处理，慢性肝炎病人应调离接触食品、自来水或幼托工作。HBsAg携带者可作HBeAg、抗—HBcIgM及HBV—DNA检查，以确定是否有HBV复制，如属阳性应按慢性肝炎处理，不能献血。\n\n" +
            "接触者观察：\n" +
            "       急性肝炎的密切接触者应医学观察45日。幼托机构发现病人后观察期间，不办理入托、转托手续。疑诊肝炎的幼托和饮食业人员应暂停原工作";
    private String str141 = "潜伏期:\n" +
            "       常见：40日\n" +
            "       最短-最长：4-21日\n\n" +
            "隔离期：\n     自发病日起隔离3周\n\n" +
            "接触者观察：\n" +
            "       密切接触者检疫45日，每周检查一次ALT，以便早期发现。";
    private String str113 = "潜伏期:\n" +
            "       常见：10-14日\n" +
            "       最短-最长：4-21日\n" +
            "隔离期：\n     隔离到体温正常位置\n\n" +
            "接触者观察：\n" +
            "       接触不检疫";
    private String str114 = "潜伏期:\n" +
            "       常见：7-14日\n" +
            "       最短-最长：3-35日\n\n" +
            "隔离期：\n     隔离40日，第一周为呼吸道及消化道隔离，第二周以后为消化道隔离。\n\n" +
            "接触者观察：\n" +
            "       密切接触者医学观察20日，观察期间可应用灭活疫苗进行快速免疫。";
    private String str115 = "潜伏期:\n" +
            "       常见：20-90日\n" +
            "       最短-最长：10日-1年以上\n\n" +
            "隔离期：\n     病程中隔离治疗\n\n" +
            "接触者观察：\n" +
            "       接触病人者不检疫，被狂犬或狼咬伤者应进行医学观察，观察期间应注射免疫血清及狂犬病疫苗";
    private String str116 = "潜伏期:\n" +
            "       常见：1-3日\n" +
            "       最短-最长：数小时-4日\n\n" +
            "隔离期：\n     退热后2日\n\n" +
            "接触者观察：\n" +
            "       大流行时，集体单位进行检疫，出现发热等症状者，应早期隔离";
    private String str117 = "潜伏期:\n" +
            "       常见：7-4日\n" +
            "       最短-最长：6-21日\n" +
            "隔离期：\n     出诊前2日至出诊后5日\n\n" +
            "接触者观察：\n" +
            "       密切接触的儿童应检疫21日，无免疫史者可应急接种麻疹类疫苗";
    private String str118 = "潜伏期:\n" +
            "       常见：14-16日\n" +
            "       最短-最长：10-21日\n\n" +
            "隔离期：\n     隔离至脱痂为止或出诊后7日\n\n" +
            "接触者观察：\n" +
            "       密切接触的儿童应医学观察21日，无免疫史者可应急接种水痘疫苗";
    private String str119 = "潜伏期:\n" +
            "       常见：18日\n" +
            "       最短-最长：14-25日\n\n" +
            "隔离期：\n     从发病日起至腮腺肿大完全消退（约3周）\n\n" +
            "接触者观察：\n" +
            "       成人一般不检疫，但幼儿园、托儿所及部队密切接触者应医学观察3周，无免疫史者可应急接种含麻腮疫苗或麻腮风疫苗";
    private String str120 = "潜伏期:\n" +
            "       常见：6日\n" +
            "       最短-最长：5-8日\n\n" +
            "隔离期：\n     起病后7日\n\n" +
            "接触者观察：\n" +
            "       不检疫";
    private String str121 = "潜伏期:\n" +
            "       常见：10日\n" +
            "       最短-最长：5-15日\n\n" +
            "隔离期：\n     隔离至症状消失\n\n" +
            "接触者观察：\n" +
            "       一般不检疫";
    private String str122 = "潜伏期:\n" +
            "       常见：15-16日\n" +
            "       最短-最长：9-660日\n\n" +
            "隔离期：\n     病人及病毒感染者均应隔离至病愈，其分泌物应严密消毒，不能献血、性接触和接吻。\n\n" +
            "接触者观察：\n" +
            "       接触者应医学观察22个月。";
    private String str123 = "潜伏期:\n" +
            "       常见：3-6日\n" +
            "       最短-最长：3-13日\n\n" +
            "隔离期：\n     发病之日起1周\n\n" +
            "接触者观察：\n" +
            "       医学观察2周";
    private String str124 = "潜伏期:\n" +
            "       常见：10-12日\n" +
            "       最短-最长：5-23日\n\n" +
            "隔离期：\n     彻底灭虱后，隔离至体温正常后12日\n\n" +
            "接触者观察：\n" +
            "       密切接触者应进行灭虱，并检疫观察15日";
    private String str142 = "潜伏期:\n" +
            "       常见：10-14日\n" +
            "       最短-最长：7-23日\n\n" +
            "隔离期：\n     体温正常后15日解除隔离，或症状消失后第5日起间歇送粪培养2次，阴性后解除隔离\n\n" +
            "接触者观察：\n" +
            "       伤寒医学观察23日，副伤寒为15日，从事饮食业人员观察期间应送粪便培养1次，阴性者方可工作";
    private String str143 = "潜伏期:\n" +
            "       常见：8-10日\n" +
            "       最短-最长：4-2-15日\n\n" +
            "隔离期：\n     体温正常后15日解除隔离，或症状消失后第5日起间歇送粪培养2次，阴性后解除隔离\n\n" +
            "接触者观察：\n" +
            "       伤寒医学观察23日，副伤寒为15日，从事饮食业人员观察期间应送粪便培养1次，阴性者方可工作";
    private String str126 = "潜伏期:\n" +
            "       常见：1-3日\n" +
            "       最短-最长：数小时-7日\n\n" +
            "隔离期：\n     临床症状消失后1周或2次粪培养阴性解除隔离\n\n" +
            "接触者观察：\n" +
            "       医学观察7日，饮食业人员观察期间应送粪便培养1次，阴性者方可工作。";
    private String str127 = "潜伏期:\n" +
            "       常见：1-3日\n" +
            "       最短-最长：数小时-7日\n\n" +
            "隔离期：\n     临床症状消失后停药24小时，隔日大便培养2次阴性，解除隔离\n\n" +
            "接触者观察：\n" +
            "       密切接触者或疑似患者应留验7日，或连续送粪便培养2次，若阴性可以解除隔离观察。";
    private String str128 = "潜伏期:\n" +
            "       常见：14日\n" +
            "       最短-最长：7日-1年以上\n\n" +
            "隔离期：\n     临床症状消失后解除隔离\n\n" +
            "接触者观察：\n" +
            "       不检疫";
    private String str144 = "潜伏期:\n" +
            "       常见：2-5日\n" +
            "       最短-最长：1-8日\n\n" +
            "隔离期：\n     腺鼠疫隔离至淋巴肿完全痊愈，肺鼠疫在临床症状消失后，痰连续培养6次阴性才能解除隔离。\n\n" +
            "接触者观察：\n" +
            "       检疫9日";
    private String str145 = "潜伏期:\n" +
            "       常见：1-3日\n" +
            "       最短-最长：数小时-3日\n\n" +
            "隔离期：\n     腺鼠疫隔离至淋巴肿完全痊愈，肺鼠疫在临床症状消失后，痰连续培养6次阴性才能解除隔离。\n\n" +
            "接触者观察：\n" +
            "       检疫9日";
    private String str130 = "潜伏期:\n" +
            "       常见：1-5小时\n" +
            "       最短-最长：12小时-12日\n\n" +
            "隔离期：\n     皮肤炭疽隔离至创口痊愈，痂皮脱落为止。其他类型患者在症状消失后，分泌物或排泄物连续培养2次阴性后取消隔离。\n\n" +
            "接触者观察：\n" +
            "       密切接触者医学观察8日";
    private String str131 = "潜伏期:\n" +
            "       常见：2-4日\n" +
            "       最短-最长：1-7日\n\n" +
            "隔离期：\n     症状消失后，连续2次咽拭培养阴性。\n\n" +
            "接触者观察：\n" +
            "       医学观察7日";
    private String str132 = "潜伏期:\n" +
            "       常见：7-10日\n" +
            "       最短-最长：2-21日\n\n" +
            "隔离期：\n     发病后40日或出现痉咳后30日\n\n" +
            "接触者观察：\n" +
            "       医学观察21日";
    private String str133 = "潜伏期:\n" +
            "       常见：3-4日\n" +
            "       最短-最长：1-7日\n\n" +
            "隔离期：\n     症状消失后咽拭培养3次阴性，可以解除隔离。一般不少于病后1周\n\n" +
            "接触者观察：\n" +
            "       医学观察7日";
    private String str134 = "潜伏期:\n" +
            "       常见：2-3日\n" +
            "       最短-最长：数小时-10日\n\n" +
            "隔离期：\n     症状消失后3日，但不少于病后7日\n\n" +
            "接触者观察：\n" +
            "       医学观察7日";
    private String str135 = "潜伏期:\n" +
            "       常见：10日\n" +
            "       最短-最长：2-8日\n\n" +
            "隔离期：\n     隔离至症状消失\n\n" +
            "接触者观察：\n" +
            "       不检疫";
    private String str136 = "潜伏期:\n" +
            "       常见：7-8日\n" +
            "       最短-最长：2-14日\n\n" +
            "隔离期：\n     彻底灭虱后或体温正常后15日解除隔离。\n\n" +
            "接触者观察：\n" +
            "       不检疫，彻底灭虱后接受医学观察14日";


    private final static TimeRepository time = new TimeRepository();

    public static TimeRepository getInstance() {
        return time;
    }

    // 获取子类分组
    public List<OneLevelEntity> getOneLevelData() {
        List<OneLevelEntity> mList = new ArrayList<>();
        OneLevelEntity oneLevelEntity = new OneLevelEntity(
                FileTagEnum.STATE_TIME,
                FileTagEnum.CANCER_DISEASE);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.STATE_TIME,
                FileTagEnum.HEAD_DISEASE);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.STATE_TIME,
                FileTagEnum.GREY_DISEASE);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.STATE_TIME,
                FileTagEnum.DOG_DISEASE);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.STATE_TIME,
                FileTagEnum.POP_HEAD_DISEASE);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.STATE_TIME,
                FileTagEnum.MA_ZHEN);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.STATE_TIME,
                FileTagEnum.SHUI_DOU);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.STATE_TIME,
                FileTagEnum.SAI_XIAN);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.STATE_TIME,
                FileTagEnum.DENG_GE_RE);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.STATE_TIME,
                FileTagEnum.ZENG_DUO_ZHENG);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.STATE_TIME,
                FileTagEnum.AIDS);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.STATE_TIME,
                FileTagEnum.HUANG_RE_BING);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.STATE_TIME,
                FileTagEnum.SHANG_HAN);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.STATE_TIME,
                FileTagEnum.FU_SHANG);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.STATE_TIME,
                FileTagEnum.NUE_JI);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.STATE_TIME,
                FileTagEnum.HUO_LUAN);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.STATE_TIME,
                FileTagEnum.GAN_JUN);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.STATE_TIME,
                FileTagEnum.SHU_YI);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.STATE_TIME,
                FileTagEnum.TAN_JU);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.STATE_TIME,
                FileTagEnum.BAI_HOU);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.STATE_TIME,
                FileTagEnum.BAI_RI_KE);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.STATE_TIME,
                FileTagEnum.XING_HONG_RE);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.STATE_TIME,
                FileTagEnum.NAO_JI_SUI);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.STATE_TIME,
                FileTagEnum.LUO_XUAN_BING);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.STATE_TIME,
                FileTagEnum.HUI_GUI_RE);
        mList.add(oneLevelEntity);
        return mList;
    }

    // 获取二级子类分组
    public List<SecondLevelEntity> getSecondLevelData(int tag) {
        List<SecondLevelEntity> mList = new ArrayList<>();
        if (tag == 112) {
            SecondLevelEntity secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.CANCER_DISEASE,
                    FileTagEnum.CANCER_DISEASE1);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.CANCER_DISEASE,
                    FileTagEnum.CANCER_DISEASE2);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.CANCER_DISEASE,
                    FileTagEnum.CANCER_DISEASE3);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.CANCER_DISEASE,
                    FileTagEnum.CANCER_DISEASE4);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.CANCER_DISEASE,
                    FileTagEnum.CANCER_DISEASE5);
            mList.add(secondLevelEntity);
        } else if (tag == 125) {
            SecondLevelEntity secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.FU_SHANG,
                    FileTagEnum.FU_SHANG1);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.FU_SHANG,
                    FileTagEnum.FU_SHANG2);
            mList.add(secondLevelEntity);
        } else if (tag == 129) {
            SecondLevelEntity secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.SHU_YI,
                    FileTagEnum.SHU_YI1);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.SHU_YI,
                    FileTagEnum.SHU_YI2);
            mList.add(secondLevelEntity);
        }
        return mList;
    }

    // 获取三级子页面的数据
    public String getThreeLevelData(int tag) {
        String str = "敬请期待";
        switch (tag) {
            case 113:
                str = str113;
                break;
            case 114:
                str = str114;
                break;
            case 115:
                str = str115;
                break;
            case 116:
                str = str116;
                break;
            case 117:
                str = str117;
                break;
            case 118:
                str = str118;
                break;
            case 119:
                str = str119;
                break;
            case 120:
                str = str120;
                break;
            case 121:
                str = str121;
                break;
            case 122:
                str = str122;
                break;
            case 123:
                str = str123;
                break;
            case 124:
                str = str124;
                break;
            case 126:
                str = str126;
                break;
            case 127:
                str = str127;
                break;
            case 128:
                str = str128;
                break;
            case 130:
                str = str130;
                break;
            case 131:
                str = str131;
                break;
            case 132:
                str = str132;
                break;
            case 133:
                str = str133;
                break;
            case 134:
                str = str134;
                break;
            case 135:
                str = str135;
                break;
            case 136:
                str = str136;
                break;
            case 137:
                str = str137;
                break;
            case 138:
                str = str138;
                break;
            case 139:
                str = str139;
                break;
            case 140:
                str = str140;
                break;
            case 141:
                str = str141;
                break;
            case 142:
                str = str142;
                break;
            case 143:
                str = str143;
                break;
            case 144:
                str = str144;
                break;
            case 145:
                str = str145;
                break;
        }
        return str;
    }
}
