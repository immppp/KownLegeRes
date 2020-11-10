package cn.imppp.knowlege.repository.study;

import java.util.ArrayList;
import java.util.List;

import cn.imppp.knowlege.constant.FileTagEnum;
import cn.imppp.knowlege.entity.OneLevelEntity;
import cn.imppp.knowlege.entity.SecondLevelEntity;

public class StudyRepository {

    private String str156 = "病原体：\n" +
            "       病毒\n" +
            "参考疾病：\n" +
            "       节肢动物传播的病毒热、流行性肌痛\n\n" +
            "病原体：\n" +
            "       细菌\n" +
            "参考疾病：\n" +
            "       布鲁氏病、钩端螺旋体病、非肺炎性军团病\n\n" +
            "病原体：\n" +
            "       立克次氏体\n" +
            "参考疾病：\n" +
            "       战壕热\n\n" +
            "病原体：\n" +
            "       寄生虫\n" +
            "参考疾病：\n" +
            "       旋毛虫病\n\n";

    private String str157 = "病原体：\n" +
            "       病毒\n" +
            "参考疾病：\n" +
            "       登革热、裂谷热、白蛉热\n\n" +
            "病原体：\n" +
            "       细菌\n" +
            "参考疾病：\n" +
            "       回归热\n\n" +
            "病原体：\n" +
            "       寄生虫\n" +
            "参考疾病：\n" +
            "       急性血吸虫病、疟疾\n\n" +
            "病原体：\n" +
            "       无\n" +
            "参考疾病：\n" +
            "       中 暑\n\n";

    private String str158 = "病原体：\n" +
            "       病毒\n" +
            "参考疾病：\n" +
            "       肠道病毒发热疹、传染性红斑，麻疹，幼儿急疹，风疹\n\n" +
            "病原体：\n" +
            "       细菌\n" +
            "参考疾病：\n" +
            "       脑膜炎菌血症，鼠咬伤，猩红热，中毒性休克综合征（由金黄色葡萄球菌引起），伤寒、副伤寒\n\n" +
            "病原体：\n" +
            "       立克次氏体\n" +
            "参考疾病：\n" +
            "       斑疹热群（南欧斑疹热，落矶山斑疹热）；斑疹伤寒（地方性、流行性），恙虫病\n\n";

    private String str159 = "病原体：\n" +
            "       病毒\n" +
            "参考疾病：\n" +
            "       猴痘，天花，水痘\n\n" +
            "病原体：\n" +
            "       立克次氏体\n" +
            "参考疾病：\n" +
            "       立克次体痘\n\n";

    private String str160 = "病原体：\n" +
            "       病毒\n" +
            "参考疾病：\n" +
            "       肠道病毒泡状胃炎伴有皮疹，疱疹病毒齿齦炎，痘病毒局部皮肤感染\n\n" +
            "病原体：\n" +
            "       细菌\n" +
            "参考疾病：\n" +
            "       皮肤炭疽，慢性游走性红斑（由burgdorferi螺旋体引起）\n\n" +
            "病原体：\n" +
            "       寄生虫\n" +
            "参考疾病：\n" +
            "      麦地那虫病\n\n";

    private String str161 = "病原体：\n" +
            "       病毒\n" +
            "参考疾病：\n" +
            "       登革热，黄热病，西尼罗河病毒，基孔肯亚出血热\n\n" +
            "病原体：\n" +
            "       寄生虫\n" +
            "参考疾病：\n" +
            "      恶性疟疾\n\n";

    private String str162 = "病原体：\n" +
            "       病毒\n" +
            "参考疾病：\n" +
            "      克里米亚-刚果出血热，基萨那森林热，鄂木斯克出血热\n\n";

    private String str163 = "病原体：\n" +
            "       病毒\n" +
            "参考疾病：\n" +
            "      肾综合征出血热，阿根廷玻利维亚出血热，拉沙热\n\n";

    private String str164 = "病原体：\n" +
            "       病毒\n" +
            "参考疾病：\n" +
            "      埃博拉及马尔堡病毒病\n\n";

    private String str165 = "病原体：\n" +
            "       病毒\n" +
            "参考疾病：\n" +
            "       获得性免疫缺陷综合征\n\n" +
            "病原体：\n" +
            "       寄生虫\n" +
            "参考疾病：\n" +
            "       丝虫病，内脏利什曼病，弓形虫病\n\n" +
            "病原体：\n" +
            "       立克次体\n" +
            "参考疾病：\n" +
            "      巴尔通体病\n\n";

    private String str166 = "病原体：\n" +
            "       病毒\n" +
            "参考疾病：\n" +
            "       r-疱疹病毒性单核细胞增多症\n\n" +
            "病原体：\n" +
            "       细菌\n" +
            "参考疾病：\n" +
            "       腺鼠疫，土拉伦斯菌病\n\n" +
            "病原体：\n" +
            "       寄生虫\n" +
            "参考疾病：\n" +
            "      非洲虫病，美洲虫病\n\n";

    private String str167 = "病原体：\n" +
            "       病毒\n" +
            "参考疾病：\n" +
            "       r-肠道病毒性脑脊髓炎，脊髓灰质炎\n\n";

    private String str168 = "病原体：\n" +
            "       病毒\n" +
            "参考疾病：\n" +
            "       淋巴细胞性脉络丛脑膜炎，病毒性脑膜炎，腮腺炎\n\n" +
            "病原体：\n" +
            "       细菌\n" +
            "参考疾病：\n" +
            "       流行性脑脊髓膜炎，嗜血杆菌脑膜炎\n\n" +
            "病原体：\n" +
            "       寄生虫\n" +
            "参考疾病：\n" +
            "      广州管圆线虫病\n\n";

    private String str169 = "病原体：\n" +
            "       病毒\n" +
            "参考疾病：\n" +
            "       节肢动物传播的病毒性脑炎，其它脑炎，狂犬病\n\n" +
            "病原体：\n" +
            "       细菌\n" +
            "参考疾病：\n" +
            "       李斯特菌病\n\n" +
            "病原体：\n" +
            "       真菌\n" +
            "参考疾病：\n" +
            "      新型隐球菌病\n\n";

    private String str170 = "       有各种致病因子引起的脑膜脑炎";

    private String str171 = "病原体：\n" +
            "       病毒\n" +
            "参考疾病：\n" +
            "       急性病毒性咽炎，急性病毒性鼻炎，肠道病毒性淋巴结咽炎，肠道病毒性水泡状咽炎，喉气管支气管炎\n\n" +
            "病原体：\n" +
            "       细菌\n" +
            "参考疾病：\n" +
            "       白喉、百日咳，链球菌性咽炎\n\n" +
            "病原体：\n" +
            "       病毒或细菌\n" +
            "参考疾病：\n" +
            "      支气管炎\n\n";

    private String str172 = "病原体：\n" +
            "       病毒\n" +
            "参考疾病：\n" +
            "       流感，病毒性肺炎，Q热（立克次体）， SARS，人禽流感\n\n" +
            "病原体：\n" +
            "       细菌\n" +
            "参考疾病：\n" +
            "       肺炭疽，细支气管炎，军团菌病，类鼻疽，饲鸟病，肺鼠疫，细菌性肺炎，霉浆菌属引起的肺炎，肺结核病\n\n" +
            "病原体：\n" +
            "       病毒或细菌\n" +
            "参考疾病：\n" +
            "      球孢子菌病，组织胞浆病\n\n" +
            "       支原体、衣原体、真菌或寄生虫等引起的肺炎";

    private String str173 = "病原体：\n" +
            "       病毒\n" +
            "参考疾病：\n" +
            "       急性病毒性胃肠炎（轮状病毒、Norwalk病毒、星状病毒、杯状病毒等）\n\n" +
            "病原体：\n" +
            "       细菌\n" +
            "参考疾病：\n" +
            "       霍乱弧菌性肠炎、沙门氏菌病，小肠弯曲菌肠炎，耶尔森氏菌小肠结肠炎，致泻性大肠杆菌肠炎\n\n" +
            "病原体：\n" +
            "       寄生虫\n" +
            "参考疾病：\n" +
            "      寄生虫引起的腹泻\n\n";

    private String str174 = "病原体：\n" +
            "       细菌\n" +
            "参考疾病：\n" +
            "       肠炭疽（罕见），志贺氏菌痢疾\n\n" +
            "病原体：\n" +
            "       寄生虫\n" +
            "参考疾病：\n" +
            "      阿米巴痢疾\n\n";

    private String str175 = "病原体：\n" +
            "       寄生虫\n" +
            "参考疾病：\n" +
            "      异尖线虫病\n\n";

    private String str154 = "病原体：\n" +
            "       病毒\n" +
            "参考疾病：\n" +
            "      甲型病毒性肝炎，乙型病毒性肝炎，丙、戊型病毒性肝炎，未分型病毒性肝炎\n\n";

    private String str176 = "参考疾病：\n" +
            "      皮肤性利曼病，孢子丝菌病，游泳者皮炎，游泳池相关皮炎，雅司病\n\n";

    private String str177 = "参考疾病：\n" +
            "      格林-巴利综合症，Reye's综合征，破伤风\n\n";

    private String str178 = "参考疾病：\n" +
            "      肺吸虫病\n\n";

    private String str179 = "参考疾病：\n" +
            "      结肠袋纤毛虫病，毛细血管炎，霍乱（流行性霍乱弧菌O群），华支睾吸虫病，姜片虫病，贾第鞭毛虫病，肠道血吸虫病\n\n";

    private String str180 = "参考疾病：\n" +
            "      腊样芽孢杆菌，肉毒杆菌，产气荚膜杆菌，毒物、副溶血性弧菌等\n\n";

    private String str181 = "参考疾病：\n" +
            "      肝吸虫病\n\n";

    private String str182 = "参考疾病：\n" +
            "      急性细菌性结合膜炎，腺病毒结合膜炎，衣原体结合膜炎，肠道病毒出血性结合膜炎\n\n";

    private String str183 = "参考疾病：\n" +
            "      埃及血吸虫病\n\n";

    private String str379 = "       突然或逐渐发病，伴有发热、头痛、肌肉和关节痛；偶尔有胃肠道症状；无确切定位，偶尔有多淋巴结肿大；可能再发和复发。";
    private String str380 = "       起病伴有发热和全身症状；全身性皮疹（斑疹、丘疹、疱疹、脓疱疹）或皮疹定位在皮肤和黏膜的某些部位；假如是出血性的，见综合征3。";
    private String str381 = "       起病伴有发热和全身症状；3-5d后的第二阶段伴有皮肤出血（瘀斑、瘀点、穿刺有分泌物），内出血（阴道出血、呕血，柏油样便，血尿），偶尔有黄疸，有或无末梢休克综合征。";
    private String str382 = "       起病伴有发热和全身症状；化脓性或非化脓性，局部或全身性腺体肿大。";
    private String str383 = "       偶尔发病，伴有发热和全身症状，脑膜炎体征，脑炎，麻痹。";
    private String str384 = "       疲劳、咳嗽、胸痛、呼吸困难；脓痰或血痰。";
    private String str385 = "       伴有神经系统的体征和症状（见综合征5）或伴有皮疹（见综合征2）（注：食物中毒可能无发热）。";
    private String str386 = "       初期伴有全身性症状（见综合征1），但也可能没有黄疸；若是出血性的，见综合征3。";
    private String str387 = "       有以上综合征的一些体征和症状，但不发热。";


    private final static StudyRepository study = new StudyRepository();

    public static StudyRepository getInstance() {
        return study;
    }

    // 获取子类分组
    public List<OneLevelEntity> getOneLevelData() {
        List<OneLevelEntity> mList = new ArrayList<>();
        OneLevelEntity oneLevelEntity = new OneLevelEntity(
                FileTagEnum.STUDY_DISEASE,
                FileTagEnum.STUDY_DISEASE1);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.STUDY_DISEASE,
                FileTagEnum.STUDY_DISEASE2);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.STUDY_DISEASE,
                FileTagEnum.STUDY_DISEASE3);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.STUDY_DISEASE,
                FileTagEnum.STUDY_DISEASE4);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.STUDY_DISEASE,
                FileTagEnum.STUDY_DISEASE5);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.STUDY_DISEASE,
                FileTagEnum.STUDY_DISEASE6);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.STUDY_DISEASE,
                FileTagEnum.STUDY_DISEASE7);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.STUDY_DISEASE,
                FileTagEnum.STUDY_DISEASE8);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.STUDY_DISEASE,
                FileTagEnum.STUDY_DISEASE9);
        mList.add(oneLevelEntity);
        return mList;
    }

    // 获取二级子类分组
    public List<SecondLevelEntity> getSecondLevelData(int tag) {
        List<SecondLevelEntity> mList = new ArrayList<>();
        if (tag == 147) {
            SecondLevelEntity secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.STUDY_DISEASE1,
                    FileTagEnum.LINC_CHUANG_ZHENG_ZHUANG1);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.STUDY_DISEASE1,
                    FileTagEnum.STUDY_DISEASE1_1);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.STUDY_DISEASE1,
                    FileTagEnum.STUDY_DISEASE1_2);
            mList.add(secondLevelEntity);
        } else if (tag == 148) {
            SecondLevelEntity secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.STUDY_DISEASE2,
                    FileTagEnum.LINC_CHUANG_ZHENG_ZHUANG2);
            mList.add(secondLevelEntity);
                    secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.STUDY_DISEASE2,
                    FileTagEnum.STUDY_DISEASE2_1);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.STUDY_DISEASE2,
                    FileTagEnum.STUDY_DISEASE2_2);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.STUDY_DISEASE2,
                    FileTagEnum.STUDY_DISEASE2_3);
            mList.add(secondLevelEntity);
        } else if (tag == 149) {
            SecondLevelEntity secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.STUDY_DISEASE3,
                    FileTagEnum.LINC_CHUANG_ZHENG_ZHUANG3);
            mList.add(secondLevelEntity);
                    secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.STUDY_DISEASE3,
                    FileTagEnum.STUDY_DISEASE3_1);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.STUDY_DISEASE3,
                    FileTagEnum.STUDY_DISEASE3_2);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.STUDY_DISEASE3,
                    FileTagEnum.STUDY_DISEASE3_3);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.STUDY_DISEASE3,
                    FileTagEnum.STUDY_DISEASE3_4);
            mList.add(secondLevelEntity);
        } else if (tag == 150) {
            SecondLevelEntity secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.STUDY_DISEASE4,
                    FileTagEnum.LINC_CHUANG_ZHENG_ZHUANG4);
            mList.add(secondLevelEntity);

                    secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.STUDY_DISEASE4,
                    FileTagEnum.STUDY_DISEASE4_1);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.STUDY_DISEASE4,
                    FileTagEnum.STUDY_DISEASE4_2);
            mList.add(secondLevelEntity);
        } else if (tag == 151) {
            SecondLevelEntity secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.STUDY_DISEASE5,
                    FileTagEnum.LINC_CHUANG_ZHENG_ZHUANG5);
            mList.add(secondLevelEntity);
                    secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.STUDY_DISEASE5,
                    FileTagEnum.STUDY_DISEASE5_1);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.STUDY_DISEASE5,
                    FileTagEnum.STUDY_DISEASE5_2);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.STUDY_DISEASE5,
                    FileTagEnum.STUDY_DISEASE5_3);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.STUDY_DISEASE5,
                    FileTagEnum.STUDY_DISEASE5_4);
            mList.add(secondLevelEntity);
        } else if (tag == 152) {
            SecondLevelEntity secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.STUDY_DISEASE6,
                    FileTagEnum.LINC_CHUANG_ZHENG_ZHUANG6);
            mList.add(secondLevelEntity);
                    secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.STUDY_DISEASE6,
                    FileTagEnum.STUDY_DISEASE6_1);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.STUDY_DISEASE6,
                    FileTagEnum.STUDY_DISEASE6_2);
            mList.add(secondLevelEntity);
        } else if (tag == 153) {
            SecondLevelEntity secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.STUDY_DISEASE7,
                    FileTagEnum.LINC_CHUANG_ZHENG_ZHUANG7);
            mList.add(secondLevelEntity);
                    secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.STUDY_DISEASE7,
                    FileTagEnum.STUDY_DISEASE7_1);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.STUDY_DISEASE7,
                    FileTagEnum.STUDY_DISEASE7_2);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.STUDY_DISEASE7,
                    FileTagEnum.STUDY_DISEASE7_3);
            mList.add(secondLevelEntity);
        } else if (tag == 154) {
            SecondLevelEntity secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.STUDY_DISEASE8,
                    FileTagEnum.LINC_CHUANG_ZHENG_ZHUANG8);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.STUDY_DISEASE8,
                    FileTagEnum.STUDY_DISEASE8);
            mList.add(secondLevelEntity);

        } else if (tag == 155) {
            SecondLevelEntity secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.STUDY_DISEASE9,
                    FileTagEnum.LINC_CHUANG_ZHENG_ZHUANG9);
            mList.add(secondLevelEntity);
                    secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.STUDY_DISEASE9,
                    FileTagEnum.STUDY_DISEASE9_1);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.STUDY_DISEASE9,
                    FileTagEnum.STUDY_DISEASE9_2);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.STUDY_DISEASE9,
                    FileTagEnum.STUDY_DISEASE9_3);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.STUDY_DISEASE9,
                    FileTagEnum.STUDY_DISEASE9_4);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.STUDY_DISEASE9,
                    FileTagEnum.STUDY_DISEASE9_5);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.STUDY_DISEASE9,
                    FileTagEnum.STUDY_DISEASE9_6);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.STUDY_DISEASE9,
                    FileTagEnum.STUDY_DISEASE9_7);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.STUDY_DISEASE9,
                    FileTagEnum.STUDY_DISEASE9_8);
            mList.add(secondLevelEntity);
        }
        return mList;
    }

    // 获取三级子页面的数据
    public String getThreeLevelData(int tag) {
        String str = "敬请期待";
        switch (tag) {
            case 154:
                str = str154;
                break;
            case 156:
                str = str156;
                break;
            case 157:
                str = str157;
                break;
            case 158:
                str = str158;
                break;
            case 159:
                str = str159;
                break;
            case 160:
                str = str160;
                break;
            case 161:
                str = str161;
                break;
            case 162:
                str = str162;
                break;
            case 163:
                str = str163;
                break;
            case 164:
                str = str164;
                break;
            case 165:
                str = str165;
                break;
            case 166:
                str = str166;
                break;
            case 167:
                str = str167;
                break;
            case 168:
                str = str168;
                break;
            case 169:
                str = str169;
                break;
            case 170:
                str = str170;
                break;
            case 171:
                str = str171;
                break;
            case 172:
                str = str172;
                break;
            case 173:
                str = str173;
                break;
            case 174:
                str = str174;
                break;
            case 175:
                str = str175;
                break;
            case 176:
                str = str176;
                break;
            case 177:
                str = str177;
                break;
            case 178:
                str = str178;
                break;
            case 179:
                str = str179;
                break;
            case 180:
                str = str180;
                break;
            case 181:
                str = str181;
                break;
            case 182:
                str = str182;
                break;
            case 183:
                str = str183;
                break;
            case 379:
                str = str379;
                break;
            case 380:
                str = str380;
                break;
            case 381:
                str = str381;
                break;
            case 382:
                str = str382;
                break;
            case 383:
                str = str383;
                break;
            case 384:
                str = str384;
                break;
            case 385:
                str = str385;
                break;
            case 386:
                str = str386;
                break;
            case 387:
                str = str387;
                break;
        }
        return str;
    }
}
