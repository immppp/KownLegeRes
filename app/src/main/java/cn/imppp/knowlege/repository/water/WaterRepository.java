package cn.imppp.knowlege.repository.water;

import java.util.ArrayList;
import java.util.List;

import cn.imppp.knowlege.constant.FileTagEnum;
import cn.imppp.knowlege.entity.OneLevelEntity;
import cn.imppp.knowlege.entity.SecondLevelEntity;

public class WaterRepository {

    private String str228 =
            "       1、自然灾害发生后应迅速对原有水源卫生状况进行评估，集中式供水的水源地受到破坏或污染严重时，应立即选择新的水源地，建立新的取水点。对于被淹没了的水井或供水构筑物应停止供水，待水退后经彻底清洗消毒后方可继续供水。\n" +
            "       2、水源的选择原则是水量充足、水质良好、便于防护、经济技术合理。选择顺序是应选择深井水、浅井水、泉水，其次才考虑河水、湖水、塘水等。\n" +
            "       3、如条件许可最好的办法是就地打机井或手压井，水源周围要保持清洁，附近没有厕所、畜圈、垃圾及废水排出口，应避免在低洼地或过去是污染源的地方取水。\n" +
            "       4、在内涝地区，应划出水质污染较少的水域作为饮用水取水点，禁止在此区域内排放粪便、污水与垃圾。\n" +
            "       5、在流动的洪水地区，应在上游水域选择饮用水水源取水点，并划出一定范围，严禁在此区域内排放粪便、污水与垃圾。\n" +
            "       6、只有河、塘、湖水可作水源时，要选择位置适当的上游河段或水塘，取水点要向河中心伸延一些，有条件的地方宜在取水点设水码头，也可在岸边挖砂滤井取水。水塘选定后，只能专供饮用水，不得做它用。";
    private String str235 =
            "       （1）对于有毒有害的化学物品，应在自然灾害形成前，迅速将其转移到安全地带，一时无法转移的应加强保护，防止扩散或外溢。\n" +
            "       （2）对于露天堆放的含有有毒有害物质的废渣或废水池，也应及时清运到安全地带，或加高加固围堤。\n" +
            "       （3）对于放射性物质，应妥善使用和管理放射源，采取有效措施，防止含放射性的固体废弃物和废液流失到水体。\n" +
            "       （4）应突击迁移水源防护带沿岸的粪坑，清除垃圾堆和无害化处理厕所内的粪便。";
    private String str236 =
            "       （1）集中式供水的的饮用水水源应按照《生活饮用水集中式供水单位卫生规范》的要求划定水源保护区，禁止在此区域排放粪便、污水与垃圾。深井的井室、河水取水点及防护带内有专人值班防护，无关人员不得进入。\n" +
            "       （2）泉水要注意露头的卫生防护，清除水露头杂草、污物，在露头处建水池，进行消毒，加盖加锁。\n" +
            "       （3）河水要分段使用，上段作为饮水水源，应设有明显标志及禁止事项的告示牌，即不得停靠船只，不能有游泳、捕鱼和打捞等可能污染水源的活动。\n" +
            "       （4）大口井要建井台、井栏、井盖，备有专用的公用水桶。井的周围30米内禁止设有厕所、猪圈以及其他可能污染地下水的设施。\n" +
            "       （5）机井或手压井周围要保持清洁，防止污水沿井壁下渗，污染浅层地下水，周围30米内不得有厕所、畜圈、垃圾及废水排出口，应避免在低洼地或过去是污染源的地方取水。";
    private String str237 =
            "        自然灾害发生后，若取回的水较清澈，可直接消毒处理后使用。若混浊，可经自然澄清后再进行消毒。常用的经典消毒剂为漂精片。使用方法为每担水（50公斤）加漂精片1片。先将漂精片压碎放入碗中，加水搅拌至糊状，再加水溶解后倒入水中，不断搅动使之与水混合均匀，盖上缸（桶）盖，30分钟后测余氯不低于0.3mg/L即可使用。若余氯达不到，则应增加消毒剂量。缸（桶）要经常清洗。同时应注意：漂精片易吸水潮解，应保存于密封塑料袋或玻璃瓶中。紧急情况下可采用泡腾消毒片进行饮水消毒，按100公斤水量直接投加1片泡腾消毒片（含有效氯500mg），搅拌后自行溶解。消毒后的水体氯味很重。";
    private String str238 =
            "        在自然灾害期间，供应饮用水的应急措施之一是打手压井。特点一是打井成本低廉；二是成井快，方便易行；三是出水量可基本满足要求；四是水质比大口井好，一般只经过消毒处理，水质即可达到生活饮用水卫生标准的基本要求，消毒方法同缸（桶）水消毒处理。";
    private String str239 =
            "       （1）直接投加法  投消毒剂前先测量井水量及计算投药剂量，水井一般为圆筒状即\n" +
            "       井水量（吨）=井水深（米）×0.8×[水面直径（米）]2\n" +
            "       漂白粉的投加量（克）= \n" +
            "       加氯量应是井水需氯量与余氯之和，最好能通过检测找出数据，但实际工作中不易做到，可根据井水水质按一般清洁井水的加氯量为2mg/L～4mg/L，水质较混浊时增加到4mg/L～6mg/L，以保证井水余氯在加氯30分钟后在0.5mg/L左右，有条件的地区可进行水质细菌学检验。\n" +
            "       投加的方法是根据所需投药量，放入容器中，加水调成浓溶液，澄清后将上清液倒入水桶中，加水稀释后倒入水井，用水桶将井水震荡数次，使之与水混匀，待30分钟后即可使用。井水的投药消毒至少每天2次，即在早晨和傍晚集中取水前进行。\n" +
            "       （2）持续消毒法  将一定量（约500克）的漂白粉或漂精片（有效氯50%～60%、0.4克/片），装入开有若干个小孔的消毒浮筒中，加水搅拌后放入井中，利用取水时的震荡作用使药液流出，达到持续消毒的目的。该法操作简便节省人力和药量，水中余氯较稳定，一次投药可维持数天，但每隔3～5天捞出消毒浮筒检查是否阻塞，随时添加消毒剂，消毒浮筒上的小孔数应根据余氯量在0.5mg/L左右而定，若水井较大，可同时放数个持续消毒瓶。\n" +
            "       （3）过量氯消毒法  适用于水井被洪水淹没；新井开始使用前、旧井修理或掏井后；井水大肠菌群值显著变化；在肠道传染病疫点并疑与水有关和水井落入脏物等情况下。\n" +
            "       方法是：先将井水掏干（若井水中查出致病菌，应先消毒后再掏干），清除井壁和井底的污物，用3～5%漂白粉溶液（漂粉精减半）清洗后，再按加氯量10～15mg/L投加漂白粉（或漂粉精）即每吨水加40克干漂白粉计，等待10～12小时后把井水打完，待再来水即可消毒取用，必要时经细菌学检验合格方可使用。\n" +
            "       蓄水池（箱）的清洗消毒可参照此法。";
    private String str240 =
            "       被淹期间不能制水，在水退后先清出构筑物内的淤泥后清洗并排空污水，用3%~5%的漂白粉溶液对管道进行彻底的消毒和清洗，向管道中按10~15 mg/L的量投加消毒剂，保证水中游离性余氯含量不低于1mg/L，浸泡24小时以后排出。清水冲洗后可使用。对于覆盖范围较大的配水系统，可以采用逐段消毒、冲洗的方式。";
    private String str231 =
            "       自然灾害发生后，可使用一体化净水设备对原水进行处理和消毒。对于使用的一体化净水设备要求每小时可产水2～5吨，对水源水质要求不高，可直接以沟塘水、河水等地表水和地下水为水源。可有效去除胶体、悬浮物颗粒、溶解盐类、有机物以及微生物，效果可靠。";
    private String str232 =
            "       用于送水的设备，无论是水车、消防车、洒水车、水箱（可用卡车、拖拉机载运）或聚乙烯塑料水桶，在运水前，都必须进行彻底的清洗和消毒，待运水的余氯含量至少要达到0.5mg/L，运水人员要专职且身体健康，分水时要有专用的清洁用具，待运水储存不得超过2天，中间加一次漂粉精片，加量按20片/吨水或等效的其它消毒剂，并进行水质检测，防止运送的水受到二次污染，以确保运送水的卫生质量。供水量可参考如下：临时救援而设的门诊和医院每人每天40～60升，后勤供应处每人每天20～30升，集中居住的庵棚、帐蓬等每人每天15～30升，最低不应低于3～5升。";
    private String str233 =
            "       1、被水淹没过的水源或供水设施重新启用前必须清理消毒，检查细菌学指标合格后方能启用。\n" +
            "       2、经水淹的井必须进行清淘、冲洗与消毒。先将水井掏干，清除淤泥，用清水冲洗井壁、井底，再掏尽污水。\n" +
            "       3、待水井自然渗水到正常水位后，进行超氯消毒。漂白粉投加量按井水量以25～50mg/l有效氯计算。浸泡12～24小时后，抽出井水，在待自然渗水到正常水位后，按正常消毒方法消毒，即可投入正常使用。";
    private String str234 =
            "       在有条件处应按国家标准方法《生活饮用水标准检验方法》(GB5750一2006)进行检验。";

    private final static WaterRepository water = new WaterRepository();

    public static WaterRepository getInstance() {
        return water;
    }

    // 获取子类分组
    public List<OneLevelEntity> getOneLevelData() {
        List<OneLevelEntity> mList = new ArrayList<>();
        OneLevelEntity oneLevelEntity = new OneLevelEntity(
                FileTagEnum.WATER_USE_FUNCTION,
                FileTagEnum.WATER_CHOOSE);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.WATER_USE_FUNCTION,
                FileTagEnum.KEEP_WATER);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.WATER_USE_FUNCTION,
                FileTagEnum.DEAL_WATER);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.WATER_USE_FUNCTION,
                FileTagEnum.CLEAR_WATER);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.WATER_USE_FUNCTION,
                FileTagEnum.TRAN_WATER);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.WATER_USE_FUNCTION,
                FileTagEnum.RECOVER_WATER);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.WATER_USE_FUNCTION,
                FileTagEnum.CHECK_WATER);
        mList.add(oneLevelEntity);
        return mList;
    }

    // 获取二级子类分组
    public List<SecondLevelEntity> getSecondLevelData(int tag) {
        List<SecondLevelEntity> mList = new ArrayList<>();
        if (tag == 230) {
            SecondLevelEntity secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.DEAL_WATER,
                    FileTagEnum.DEAL_WATER1);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.DEAL_WATER,
                    FileTagEnum.DEAL_WATER2);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.DEAL_WATER,
                    FileTagEnum.DEAL_WATER3);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.DEAL_WATER,
                    FileTagEnum.DEAL_WATER4);
            mList.add(secondLevelEntity);
        } else if (tag == 229) {
            SecondLevelEntity secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.KEEP_WATER,
                    FileTagEnum.KEEP_WATER1);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.KEEP_WATER,
                    FileTagEnum.KEEP_WATER2);
            mList.add(secondLevelEntity);
        }
        return mList;
    }

    // 获取三级子页面的数据
    public String getThreeLevelData(int tag) {
        String str = "敬请期待";
        switch (tag) {
            case 236:
                str = str236;
                break;
            case 237:
                str = str237;
                break;
            case 238:
                str = str238;
                break;
            case 239:
                str = str239;
                break;
            case 240:
                str = str240;
                break;
            case 228:
                str = str228;
                break;
            case 231:
                str = str231;
                break;
            case 232:
                str = str232;
                break;
            case 233:
                str = str233;
                break;
            case 234:
                str = str234;
                break;
            case 235:
                str = str235;
                break;
        }
        return str;
    }

}
