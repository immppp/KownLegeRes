package cn.imppp.knowlege.repository.check;

import java.util.ArrayList;
import java.util.List;

import cn.imppp.knowlege.constant.FileTagEnum;
import cn.imppp.knowlege.entity.OneLevelEntity;
import cn.imppp.knowlege.entity.SecondLevelEntity;

// 急性不明原因中毒相关体征的甄别
public class CheckRepository {

    private String str188 = "可能毒物：\n"
            + "     乙醇、甲醇等\n" +
            "备注：\n" +
            "       无\n\n";
    private String str189 = "可能毒物：\n"
            + "     苯、甲苯、丁二烯等\n" +
            "备注：\n" +
            "       在工作衣、皮肤可散发芳香味；如口服这类有机溶剂，呼气中有此异味\n\n";
    private String str190 = "可能毒物：\n"
            + "     硫化氢、硫醇等\n" +
            "备注：\n" +
            "       呼出气及皮肤皆可散发臭蛋味\n\n";
    private String str191 = "可能毒物：\n"
            + "     苯酚、强酸、强碱类\n" +
            "备注：\n" +
            "       无\n\n";
    private String str192 = "可能毒物：\n"
            + "     氰的无机或有机化合物\n" +
            "备注：\n" +
            "       无\n\n";
    private String str193 = "可能毒物：\n"
            + "     有机磷农药、工业用乙炔等\n" +
            "备注：\n" +
            "       无\n\n";
    private String str194 = "可能毒物：\n"
            + "     磷化氢\n" +
            "备注：\n" +
            "       无\n\n";
    private String str195 = "可能毒物：\n"
            + "     醋酸戊酯、亚硝酸异物酯，亚硝酸丁酯、异丙醇，丙酮\n" +
            "备注：\n" +
            "       无\n\n";
    private String str196 = "可能毒物：\n"
            + "     光气\n" +
            "备注：\n" +
            "       无\n\n";
    private String str197 = "可能毒物：\n"
            + "     各种酸类\n" +
            "备注：\n" +
            "       无\n\n";
    private String str198 = "可能毒物：\n"
            + "     苯胺、硝基苯等\n" +
            "备注：\n" +
            "       \n\n";
    private String str199 = "可能毒物：\n"
            + "     水合氯醛\n" +
            "备注：\n" +
            "       无\n\n";
    private String str200 = "       很多化学物可能散发类同气味，因此不能以此作为鉴别品种的单一指标。\n" +
            "       两种以上化学品混合后气味可能有所改变，或一种化学物气味强将另一种气味掩盖。";
    private String str201 = "可能毒物：\n"
            + "     ①急性有机磷农药、氨基甲酸酯类农药等中毒；\n" +
            "       ②急性五氯酚钠中毒；\n" +
            "       ③药物如毛果芸香碱，水杨酸盐、阿斯匹林等中毒；\n" +
            "       ④急性中毒为危重也可有多汗情况\n" +
            "备注：\n" +
            "       多汗是多种疾病的一个非特异的体征，因此要观察多汗的部位、程度及持续时间，并结合生活或职业暴露史、其他临床表现，才能正确判断其临床意义\n\n";
    private String str202 = "可能毒物：\n"
            + "     常见于急性有机磷农药中毒，尤其是其经皮肤吸收时，中毒症状不典型，但周身大汗则常是早期突出体征。急性五氯酚钠、二硝基酚中毒时大汗，全身如水淋\n" +
            "备注：\n" +
            "       无\n\n";
    private String str203 = "可能毒物：\n"
            + "     常见于急性有机溶剂、有机汞、有机锡、四乙基铅等化学物中毒，以掌跖部多汗为主\n" +
            "备注：\n" +
            "       无\n\n";
    private String str204 = "可能毒物：\n"
            + "     要注意病情可能恶化\n" +
            "备注：\n" +
            "       无\n\n";
    private String str205 = "可能毒物：\n"
            + "     明显发绀而缺氧表现相对较轻是高铁血红蛋白血症的特点；主要见于亚硝酸中毒，也可出现在伯氨喹啉、次硝酸铋、磺胺类、苯丙砜、硝基苯、苯胺等中毒时\n" +
            "备注：\n" +
            "       无\n\n";
    private String str206 = "可能毒物：\n"
            + "     见于部分急性一氧化碳中毒，也可见于氰化物中毒病人\n" +
            "备注：\n" +
            "       无\n\n";
    private String str207 = "可能毒物：\n"
            + "     见于中毒性溶血性贫血，中毒性或药物性肝病\n" +
            "备注：\n" +
            "       无\n\n";
    private String str208 = "可能毒物：\n"
            + "     见于急性酒精中毒，以及其他可致血管扩张的毒物、药物中毒\n" +
            "备注：\n" +
            "       无\n\n";
    private String str209 = "可能毒物：\n"
            + "     常见于接触三硝基甲苯、苦味胺或黄色染料工作人员\n" +
            "备注：\n" +
            "       无\n\n";
    private String str210 = "可能毒物：\n"
            + "     有时有些皮损可作为提示接触某类毒物的线索\n" +
            "备注：\n" +
            "       无\n\n";

    private final static CheckRepository check = new CheckRepository();

    public static CheckRepository getInstance() {
        return check;
    }

    // 获取子类分组
    public List<OneLevelEntity> getOneLevelData() {
        List<OneLevelEntity> mList = new ArrayList<>();
        OneLevelEntity oneLevelEntity = new OneLevelEntity(
                FileTagEnum.CHECK_DRUGS,
                FileTagEnum.SMELL_WRONG);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.CHECK_DRUGS,
                FileTagEnum.DUO_HAN);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.CHECK_DRUGS,
                FileTagEnum.SKIN_COLOR);
        mList.add(oneLevelEntity);
        return mList;
    }

    // 获取二级子类分组
    public List<SecondLevelEntity> getSecondLevelData(int tag) {
        List<SecondLevelEntity> mList = new ArrayList<>();
        if (tag == 185) {
            SecondLevelEntity secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.SMELL_WRONG,
                    FileTagEnum.SMELL_WRONG1);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.SMELL_WRONG,
                    FileTagEnum.SMELL_WRONG2);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.SMELL_WRONG,
                    FileTagEnum.SMELL_WRONG3);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.SMELL_WRONG,
                    FileTagEnum.SMELL_WRONG4);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.SMELL_WRONG,
                    FileTagEnum.SMELL_WRONG5);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.SMELL_WRONG,
                    FileTagEnum.SMELL_WRONG6);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.SMELL_WRONG,
                    FileTagEnum.SMELL_WRONG7);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.SMELL_WRONG,
                    FileTagEnum.SMELL_WRONG8);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.SMELL_WRONG,
                    FileTagEnum.SMELL_WRONG9);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.SMELL_WRONG,
                    FileTagEnum.SMELL_WRONG10);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.SMELL_WRONG,
                    FileTagEnum.SMELL_WRONG11);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.SMELL_WRONG,
                    FileTagEnum.SMELL_WRONG12);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.SMELL_WRONG,
                    FileTagEnum.SMELL_WRONG13);
            mList.add(secondLevelEntity);
        } else if (tag == 186) {
            SecondLevelEntity secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.DUO_HAN,
                    FileTagEnum.DUO_HAN1);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.DUO_HAN,
                    FileTagEnum.DUO_HAN2);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.DUO_HAN,
                    FileTagEnum.DUO_HAN3);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.DUO_HAN,
                    FileTagEnum.DUO_HAN4);
            mList.add(secondLevelEntity);
        } else if (tag == 187) {
            SecondLevelEntity secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.SKIN_COLOR,
                    FileTagEnum.SKIN_COLOR1);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.SKIN_COLOR,
                    FileTagEnum.SKIN_COLOR2);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.SKIN_COLOR,
                    FileTagEnum.SKIN_COLOR3);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.SKIN_COLOR,
                    FileTagEnum.SKIN_COLOR4);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.SKIN_COLOR,
                    FileTagEnum.SKIN_COLOR5);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.SKIN_COLOR,
                    FileTagEnum.SKIN_COLOR6);
            mList.add(secondLevelEntity);
        }
        return mList;
    }

    // 获取三级子页面的数据
    public String getThreeLevelData(int tag) {
        String str = "敬请期待";
        switch (tag) {
            case 188:
                str = str188;
                break;
            case 189:
                str = str189;
                break;
            case 190:
                str = str190;
                break;
            case 191:
                str = str191;
                break;
            case 192:
                str = str192;
                break;
            case 193:
                str = str193;
                break;
            case 194:
                str = str194;
                break;
            case 195:
                str = str195;
                break;
            case 196:
                str = str196;
                break;
            case 197:
                str = str197;
                break;
            case 198:
                str = str198;
                break;
            case 199:
                str = str199;
                break;
            case 200:
                str = str200;
                break;
            case 201:
                str = str201;
                break;
            case 202:
                str = str202;
                break;
            case 203:
                str = str203;
                break;
            case 204:
                str = str204;
                break;
            case 205:
                str = str205;
                break;
            case 206:
                str = str206;
                break;
            case 207:
                str = str207;
                break;
            case 208:
                str = str208;
                break;
            case 209:
                str = str209;
                break;
            case 210:
                str = str210;
                break;
        }
        return str;
    }

}
