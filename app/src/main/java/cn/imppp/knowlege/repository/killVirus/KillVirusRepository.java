package cn.imppp.knowlege.repository.killVirus;

import java.util.ArrayList;
import java.util.List;

import cn.imppp.knowlege.constant.FileTagEnum;
import cn.imppp.knowlege.entity.OneLevelEntity;

public class KillVirusRepository {

    private String str242 =
            "       呼吸道传染病污染的室内场所一般采用电动超低容量喷雾器，采用1000mg/L～2000mg/L双链季铵盐消毒液、500mg/L～1000mg/L的含氯消毒液、200mg/L的二氧化氯消毒液进行喷雾（20ml/m3），以表面湿润为度。肠道传染病污染的场所采用含有效氯1000mg/L～2000mg/L的含氯消毒液喷洒，泥土墙吸液量为150ml/m2～300ml/m2，水泥墙、木板墙、石灰墙为100ml/m2；地面消毒先由外向内喷雾一次，喷药量为200ml/m2～300ml/m2，待室内消毒完毕后，再由内向外重复喷雾一次。消毒作用时间应不少于60min。有芽胞污染时选用含有效氯10000mg/L含氯消毒液进行喷洒，作用时间不少于120min。";
    private String str243 =
            "       医院有污水消毒设施的，可直接倒入污水处理系统处理；污染地面和容器采用含有效氯1000mg/L～2000mg/L的含氯消毒液喷洒或浸泡，作用60min。没有污水消毒设施的医疗机构，可倒入化粪池，按化粪池的容积，每天投加有效氯100g/m3～500g/m3（漂白粉400 g/m3～2000g/m3）。病家排泄物和呕吐物可加入1/5漂白粉或等量20% 漂白粉乳剂（含有效氯5%）；尿液每1000ml加入漂白粉5g，混匀作用60min～120min，倒入抽水马桶。";
    private String str244 =
            "       可用2% 漂白粉澄清液（含有效氯5000 mg/L）、或含有效氯5000mg/L的含氯消毒液浸泡30min，浸泡时，消毒液要漫过容器。浸泡后清水冲净，注意腐蚀性。";
    private String str245 =
            "       厕所的四壁和地面的消毒采用含有效氯1000mg/L～2000mg/L的含氯消毒液喷洒，湿润为度。粪坑内的粪便可按粪便量的1/5加漂白粉，搅匀作用2h。";
    private String str246 =
            "       家庭、学校和幼儿园教室可采用电动超低容量喷雾器，采用1000mg/L～2000mg/L双链季铵盐消毒液、3%过氧化氢、500mg/L的含氯消毒液、200mg/L的二氧化氯消毒液进行喷雾（20ml/m3），密闭作用60min以上后通风换气。医院诊疗场所尽量选用紫外线循环风空气消毒器进行消毒；集中空调通风系统建议在送风口安装动态空气消毒装置进行消毒；单个病房可考虑熏蒸或超低容量喷雾进行消毒。烈性传染病时考虑使用15%过氧乙酸7ml/m3或福尔马林溶液50ml/m3加熏蒸2h，注意对场所内物品和设施的腐蚀性。";
    private String str247 =
            "       （1）疫点内的生活污水，应尽量集中在污水池进行消毒，按有效氯50mg/L～100mg/L投加（漂白粉200g/m3～400g/m3），混匀作用2h，余氯为4mg/L以上即可排放。\n" +
            "       （2）疫区内污染的生活污水，可使用含氯消毒剂进行消毒。静止的污水水体先测定污水容积，按有效氯50mg/L～100mg/L投加消毒剂（漂白粉200g/m3～400g/m3）；搅匀作用2h，余氯在4mg/L以上即可排放。流动污水水体应分段截流；在截流后，测每段的污水容量，再按前法进行消毒。";
    private String str248 =
            "       能焚烧的统一送医疗废物处置点焚烧。不能焚烧的可采用含有效氯10000 mg/L含氯消毒液喷洒，密封包装后送垃圾场填埋。";
    private String str249 =
            "       呼吸道传染病污染的衣物一般阳光下暴晒就可以。肠道传染病污染的衣物，可用含有效氯250mg/L～500mg/L含氯消毒液浸泡30min后清洗。贵重衣物可打包后送环氧乙烷消毒站消毒。医院污染衣物按加氯漂洗程序清洗可达到消毒。";
    private String str250 =
            "       首选煮沸消毒20 min，或流通蒸汽消毒30 min。也可用含有效氯250mg/L～500 mg/L的含氯消毒液浸泡30min后，再用清水洗净。";
    private String str251 =
            "       病家污染食物一般可采用煮沸消毒后倒弃。污染的瓜果、蔬菜原则上不再食用，可用含有效氯2000mg/L的含氯消毒液浸泡30min～60 min后做动物饲料。芽孢污染的食物需在含有效氯50000mg/L含氯消毒液浸泡消毒2 h后处理。";
    private String str252 =
            "       家庭、学校和幼儿园的室内选择电动超低容量喷雾器，使用1000mg/L～2000mg/L双链季铵盐消毒液、3%过氧化氢、500mg/L的含氯消毒液、200mg/L的二氧化氯消毒液进行喷雾（20ml/m3），密闭作用60min以上，然后用清水对室内物体表面进行擦拭，可使家具表面、物品表面和物体表面达到消毒。玩具可使用可用1000mg/L～2000mg/L双链季铵盐消毒液浸泡或75%乙醇擦拭消毒。";
    private String str253 =
            "       一般焚烧处理。\n" +
            "       有保存价值的可打包后送环氧乙烷消毒站消毒。 ";
    private String str254 =
            "       对鼠疫、霍乱和炭疽病人的尸体用0.5% 过氧乙酸溶液浸湿的布单严密包裹，口、鼻、耳、肛门、阴道要用浸过0.5%过氧乙酸的棉球堵塞后尽快火化。土葬时，应远离水源50m以上，棺木应在距地面2m以下深埋，棺内尸体两侧及底部铺垫厚达3cm～5 cm漂白粉，棺外底部铺垫厚3cm～5cm漂白粉。";
    private String str255 =
            "       因鼠疫、炭疽、狂犬病等死亡的动物尸体，一经发现立即深埋或焚烧。并应向死亡动物周围(鼠为30cm～50cm，大动物为2m)喷撒漂白粉。";
    private String str256 =
            "       车、船内外表面可用1000mg/L～2000mg/L双链季铵盐消毒液、3%过氧化氢、有效氯500mg/L含氯消毒液喷洒至表面湿润，作用30min后清水擦净。密闭空间，选择电动超低容量喷雾器，使用1000mg/L～2000mg/L双链季铵盐消毒液、3%过氧化氢、500mg/L的含氯消毒液、200mg/L的二氧化氯消毒液进行喷雾（20ml/m3），密闭作用60min以上，然后用清水对内部物体表面进行擦拭。";
    private String str257 =
            "       污染的手应采用流动水、皂液洗手；脱掉手套后应用流动水洗手或乙醇类快速手消毒剂消毒；脱防护服的每个步骤间应使用乙醇类快速手消毒剂消毒。洗手方法和乙醇类快速手消毒剂的涂擦方法按六步洗手法进行，快速手消毒剂揉搓至干即可达到消毒效果，一般需半分钟以上。皮肤消毒一般使用碘伏原液擦拭，也可用75%乙醇棉球擦拭，作用3min～5min。对醇、碘过敏者，可考虑使用0.1%过氧乙酸溶液擦拭，不主张使用含氯消毒液进行手、皮肤消毒。";

    private final static KillVirusRepository killVirus = new KillVirusRepository();

    public static KillVirusRepository getInstance() {
        return killVirus;
    }

    public List<String> getMessage() {
        List<String> list = new ArrayList<>();
        list.add(str242);
        list.add(str243);
        list.add(str244);
        list.add(str245);
        list.add(str246);
        list.add(str247);
        list.add(str248);
        list.add(str249);
        list.add(str250);
        list.add(str251);
        list.add(str252);
        list.add(str253);
        list.add(str254);
        list.add(str255);
        list.add(str256);
        list.add(str257);
        return list;
    }

    // 获取子类分组
    public List<OneLevelEntity> getOneLevelData() {
        List<OneLevelEntity> mList = new ArrayList<>();
        OneLevelEntity oneLevelEntity = new OneLevelEntity(
                FileTagEnum.KILL_VIRUS,
                FileTagEnum.DI_MIAN);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.KILL_VIRUS,
                FileTagEnum.PAI_XIE);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.KILL_VIRUS,
                FileTagEnum.RONG_QI);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.KILL_VIRUS,
                FileTagEnum.CE_SUO);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.KILL_VIRUS,
                FileTagEnum.ROOM_AIR);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.KILL_VIRUS,
                FileTagEnum.WU_SHUI);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.KILL_VIRUS,
                FileTagEnum.LA_JI);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.KILL_VIRUS,
                FileTagEnum.CLOTH);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.KILL_VIRUS,
                FileTagEnum.CAN_JU);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.KILL_VIRUS,
                FileTagEnum.FOOD);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.KILL_VIRUS,
                FileTagEnum.THING);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.KILL_VIRUS,
                FileTagEnum.BOOK);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.KILL_VIRUS,
                FileTagEnum.BING_REN);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.KILL_VIRUS,
                FileTagEnum.ANIMAL_SHI_TI);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.KILL_VIRUS,
                FileTagEnum.YUN_SHU_TOOL);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.KILL_VIRUS,
                FileTagEnum.HAND_SKIN);
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
            case 242:
                str = str242;
                break;
            case 243:
                str = str243;
                break;
            case 244:
                str = str244;
                break;
            case 245:
                str = str245;
                break;
            case 246:
                str = str246;
                break;
            case 247:
                str = str247;
                break;
            case 248:
                str = str248;
                break;
            case 249:
                str = str249;
                break;
            case 250:
                str = str250;
                break;
            case 251:
                str = str251;
                break;
            case 252:
                str = str252;
                break;
            case 253:
                str = str253;
                break;
            case 254:
                str = str254;
                break;
            case 255:
                str = str255;
                break;
            case 256:
                str = str256;
                break;
            case 257:
                str = str257;
                break;
        }
        return str;
    }
}
