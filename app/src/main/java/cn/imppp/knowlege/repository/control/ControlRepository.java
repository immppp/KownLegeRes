package cn.imppp.knowlege.repository.control;

// 病媒控制

import java.util.ArrayList;
import java.util.List;

import cn.imppp.knowlege.constant.FileTagEnum;
import cn.imppp.knowlege.entity.OneLevelEntity;
import cn.imppp.knowlege.entity.SecondLevelEntity;

public class ControlRepository {
    private String str39 =
            "       到达疫区（灾区）后要主动取得当地政府、爱卫部门合作和相关人员的配合。每天出发前，应检查所需消杀器械、用具、消毒剂、杀虫灭鼠剂是否带足、好用。防护用品：穿防护服(或隔离服)、胶鞋，戴口罩、帽子、防护眼镜。应尽量选择对媒介生物杀灭作用快的卫生杀虫剂。采用毒饵灭鼠必须对人、畜安全。同时必须正确掌握使用浓度，尽量减少环境污染。";
    private String str40 =
            "       进入工作现场时，如果是进行媒介控制杀虫，应先室内后室外。杀虫灭鼠作业前，必要时要先对不同场所媒介种群及密度进行调查，以便进行灭蚊、灭蝇、灭鼠、灭蚤效果评价，及时采取更加有效的杀灭措施。 \n" +
            "       如发生呼吸道传染病，应对室内空气进行消毒，再对媒介进行杀灭处理。如系肠道传染病，应先于室内灭蝇，再进行消毒。对室内地面、墙壁、家具和陈设物品消毒时，应按照先上后下，先左后右的方法，依次进行消毒；室内灭飞虫时应先下后上法进行，\n" +
            "       灭爬虫或跳虫时应先打包围圈，再进行全面杀灭。在进行消杀过程中，不得吸烟、饮食。要注意自我保护，既要防止或减少受到消杀因子的伤害又要避免受到微生物感染。消杀工作应有条不紊，突出重点。\n" +
            "       凡需消杀的物品和需要杀灭的区域，不得遗漏和留有死角。";
    private String str41 = "        每天要及时清点所消耗药品器材，加以整修、补充。现场工作完毕，每天要对消杀器械做好清洗、维修保养工作。离开工作现场时，要对作业现场的群众交代有关注意事项，避免造成人畜危害。穿着的工作服、胶靴等要进行清洗、消毒和更换，防止药物污染损害皮肤。填写杀灭工作记录，做好控制效果评价，并及时上报。";
    private String str42 = "        因地制宜、综合治理、确保安全。";
    private String str43 =
            "       （1）防鼠措施\n" +
            "       防鼠工作应从规划和整治环境入手。居住地应统一规划，道路管理得当，临时住处整齐，禽畜圈养有序，杂物堆放成行并尽可能离地，食品妥善保存，搞好环境卫生，铲除杂草。发现鼠情应翻动可能藏鼠的物品，及时消灭窜出的老鼠。发现鼠洞立即堵塞。\n" +
            "       要彻底搞好室内和环境卫生。尽量用防鼠容器存粮。检查有无新鲜鼠洞，一旦发现应及时灭鼠并严密堵洞。大型粮库和集中居住场所，必要时可挖防鼠沟，沟深1m，宽0.6m，沟底每隔20～30m或每个拐角处，埋直径0.6m的水缸，沟底平缸口。随时检查处理掉入缸内的老鼠。在修理旧房或重建新居时，应全面规划，改善卫生条件。减小门、窗与框的空隙，一般不超过0.5cm；用水泥或三合土硬化室内地面。尽量增设30cm高的墙裙。管道和电线等的穿墙孔，设置铁皮挡鼠板，管道和电线从板中央小孔通过。禽舍畜圈离开住宅，厕所考虑防蝇防鼠。\n" +
            "       （2）物理灭鼠\n" +
            "       灭鼠器械主要是鼠笼、鼠夹、粘鼠板等，此外还可用水或泥浆灌洞等民间方法灭鼠。 \n" +
            "       （3）毒饵灭鼠\n" +
            "       当鼠密度很高，或人群受到鼠源疾病严重威胁时，应在严密组织、充分宣传的基础上，选用安全合法的灭鼠毒饵，开展全面的灭鼠工作。";
    private String str44 =
            "       灭鼠药物必须选用国家准用的鼠药，绝对不能用未获国家登记的其它毒药和集贸市场上私卖的毒饵。尽可能使用高效、安全的抗凝血灭鼠剂。该类灭鼠剂的药物一是干扰血凝过程，二是损伤毛细血管壁，增加血管的渗透性，进食后的鼠类因内出血而死亡，三是有特效解毒剂。 \n" +
            "*敌鼠钠盐\n" +
            "       本药为黄色粉末，纯品无臭无味，稍溶于热水（100℃时溶解度为5％），溶于乙醇和丙酮，性质稳定。敌鼠钠盐类毒饵在0.05％～0.2％浓度范围内，鼠类接受性较好。一般以新鲜稻谷制成毒饵。\n" +
            "*溴敌隆\n" +
            "       溴敌隆是第二代抗凝血灭鼠剂，不溶于水，溶于丙酮和乙醇。国内商品主要是0.5％溴敌隆母液，使用较方便。常用浓度为0.005％，宜现配现用，现场以大米均匀搅拌制成毒饵。家禽对溴敌隆敏感，所以使用时要做到晚放晨收。\n" +
            "*大隆\n" +
            "       大隆是目前抗凝血灭鼠剂中毒力最大的一种，是一种较为理想的慢性灭鼠剂，兼有急性和慢性灭鼠剂的优点，消灭家、野鼠的效果最好。浓度常用0.005％，多为市售混合性毒饵，可采用间隔投药法，使用时要注意防潮。";
    private String str45 =
            "       毒饵投药，室内沿墙根每10～15平方米投放两堆，每堆约10克，室外沿墙根或鼠道每5～10米投放一堆，每堆20克，每天检查。按吃多少补多少，吃光加倍的原则补药一周。";
    private String str46 =
            "       （1）毒饵的投放要做全面防治，不要遗漏任何地带，造成防治上的盲区。\n" +
            "       （2）投放的毒饵量要充足，让鼠群内各个体都有机会取食到致死量的毒饵。\n" +
            "       （3）在布药防治时要做到投放的毒饵量不见消耗为止。\n" +
            "       （4）投放毒饵的位置要适当，要投放在有效位置上，让鼠容易遇到毒饵。如投放在鼠洞、鼠路、出入口、转角位等。同时投放位置要尽量选择干净干爽隐蔽的地方。\n" +
            "       （5）15天后测定鼠密度，进行评价，如达不到预期效果，则要继续处理，特殊场所可以更换毒饵处理。";
    private String str47 =
            "\u3000\u3000（1）投饵工作由受过培训的灭鼠员承担，确保人畜安全。\n" +
            "\u3000\u3000（2）灭鼠时要加强宣传，管好禽畜，保藏好食品，照看好小孩。\n" +
            "\u3000\u3000（3）毒饵必须有警告色，投饵点应有醒目标记，投饵结束应收集剩饵。\n" +
            "\u3000\u3000（4）投毒后及时搜寻死鼠，焚烧或在适当地点深埋；为避免鼠死后，离开鼠体的虫类叮咬，最好在灭鼠同时，在居住区喷洒杀虫剂。\n" +
            "\u3000\u3000（5）要做好中毒急救的准备。";
    private String str48 =
            "       残存鼠具有较强的生命力和繁殖力，大面积上的低密度为它们提供了更宽裕的生存条件，而鼠类从临时栖息地的扩散，再次增加了鼠间接触和病原的交换。所以，应该要做好鼠情、疫情监测，注视鼠类携带病原的动态变化，发现异常立即采取灭鼠防鼠措施。常使用鼠夹、鼠笼法调查鼠密度，捕获率超过10％时，应该组织全面灭鼠。";
    private String str49 = "（1）尽快填塞积水坑、沟等\n" +
            "       用泥土、石头、橡胶等物填塞或填充水坑、洼地、废弃的池塘和沟渠，防止积水生蚊。\n" +
            "（2）疏通\n" +
            "       疏通积水坑、池塘、沼泽, 倒净或打碎坛坛罐罐,贮水器加盖,清除各类环境中的各类型小积水，控制大中型水体。\n" +
            "（3）清除和破坏孳生点\n" +
            "       对容易孳生蚊虫的小型容器，如罐头盒、瓶子、轮胎、各类无用的缸和罐等予以清除和破坏。\n" +
            "（4）排水\n" +
            "       在开挖水渠和修建堤防时应注意同时建设排水系统，农业上的排水系统和城市中的污水排放系统是蚊虫的重要孳生场所。\n" +
            "（5）隔离和封闭孳生场所\n" +
            "       在储水容器、水井等可能的蚊虫孳生场所，可制作各类合适的盖子，防止蚊虫孳生。";
    private String str50 = "（1）使用纱门和纱窗。\n" +
            "（2）药物浸泡过的蚊帐。\n" +
            "（3）点燃蚊香（或电热蚊香）。\n" +
            "（4）用驱蚊剂涂暴露部位。";
    private String str52 = "（1）杀灭幼虫\n" +
            "       1）常用灭蝇幼虫的杀虫剂\n" +
            "       *敌百虫0.1%～0.2％水溶液，按500～1000ml/m2喷洒。\n" +
            "       *杀螟松0.3％乳剂或水溶液，按500～1000 ml/m2喷洒。\n" +
            "       *马拉硫磷0.2％乳剂，按500～1000 ml/m2喷洒。\n" +
            "       *倍硫磷0.1％乳剂，按500～1000 ml/m2喷洒，24小时杀死100%，持效7～10天。\n" +
            "       *地亚农0.05％乳剂，按500～1000 ml/m2喷洒，24小时杀死100%，是最好的杀蛆剂。\n" +
            "       *敌敌畏0.05％乳剂或水溶液，按500～1000 ml/m2喷洒。喷洒粪坑，对稀粪坑可用0.3%～0.5%，按500 ml/m2喷洒。\n" +
            "       *诺毕速灭松乳剂，为杀螟松和胺菊酯的混合剂—诺毕速灭松（含量：杀螟松５％，胺菊酯0.5%），将诺毕速灭松乳剂稀释100～200倍。在垃圾处理场防治蝇蛆，按1000～2000 ml/m2喷洒，持效7～10天。\n" +
            "       *灭幼脲Ⅰ号TH6040[1-(4-氯苯基)-3(2.6-二苯甲酰基)脲]、灭幼脲Ⅱ号TH6038[1-(4-氯苯基)-3(2.6-二氯苯甲酰基)脲]，浓度均为10mg/L。\n" +
            "       *灭幼宝0.5%颗粒剂，每平方米10～20g，有效抑制蝇类羽化，持效达1个月。\n" +
            "       如果垃圾有苍蝇孳生，取80%敌敌畏2两（100g）加水100斤，按100～200 ml/m2均匀喷洒。\n" +
            "2)成蝇控制\n" +
            "       针对成蝇的化学防治施药方法有滞留喷洒和空间喷雾两种。\n" +
            "       ----滞留喷洒  \n" +
            "       将具有滞效、触杀作用的杀虫剂制剂，采用常量喷洒、或涂抹、或粉刷，使杀虫剂的有效成分按一定剂量、均匀地附着在停留面上。 \n" +
            "       ----空间喷雾\n" +
            "       空间喷雾是快速降低室内外蝇密度最有效的方法，它使用较少剂量的杀虫剂直接快速的杀灭成蝇，特点是快速、安全、有效。缺点是没有持效，对幼虫及蛹基本无效。主要直接处理室内外苍蝇活动、栖息的场所。家庭室内空间喷雾一般使用家用杀虫气雾剂和手提式喷雾器；小规模室内喷雾一般使用手动喷雾器、手提式超低容量喷雾器或热烟雾机；室外大规模喷雾可用背负式机动喷雾器、车载式喷雾器和热烟雾机。室内空间喷雾一般喷雾药量为0.2～1.0ml/m3,超低容量喷雾一般为0.05～0.2ml/m2,热烟雾机为1～5ml/m2。在重点场所及应急控制疫情时，一般要求每天喷雾一次，持续1～2周，以后根据成蝇密度，每周1～2次。 \n" +
            "       ----毒饵灭蝇\n" +
            "       毒饵是简便、速效、经济、易操作的蝇类防治方法。它具有使用方便、灭效好、苍蝇对其不易产生耐药性、不污染环境、能充分发挥药剂的杀虫活性等特点，主要用于成蝇聚集取食的场所。也可应用毒绳、毒饵、毒水杀蝇。\n";
    private String str51 =
            "       （1）加强环境治理，清理垃圾，建集中式厕所，减少滋生场所；\n" +
            "       （2）加强防蝇措施，保护食品安全。\n" +
            "       （3）重点控制、处理孳生地，用化学杀虫剂控制粪便、垃圾等孳生物场所。\n" +
            "       （4）加强防护，减少蝇类与人等接触。";

    private final static ControlRepository control = new ControlRepository();
    public static ControlRepository getInstance() {
        return control;
    }
    // 获取子类分组
    public List<OneLevelEntity> getOneLevelData() {
        List<OneLevelEntity> mList = new ArrayList<>();
        OneLevelEntity oneLevelEntity = new OneLevelEntity(
                FileTagEnum.CRITICAL_CONTROL,
                FileTagEnum.CRITICAL_BASE_REQUIRE);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.CRITICAL_CONTROL,
                FileTagEnum.CRITICAL_MOUSE_DEAL);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.CRITICAL_CONTROL,
                FileTagEnum.CRITICAL_WEN_DEAL);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.CRITICAL_CONTROL,
                FileTagEnum.CRITICAL_YING_DEAL);
        mList.add(oneLevelEntity);
        return mList;
    }

    // 获取二级子类分组
    public List<SecondLevelEntity> getSecondLevelData(int tag) {
        List<SecondLevelEntity> mList = new ArrayList<>();
        if (tag == 35) {
            SecondLevelEntity secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.CRITICAL_BASE_REQUIRE,
                    FileTagEnum.CRITICAL_BASE_REQUIRE1);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.CRITICAL_BASE_REQUIRE,
                    FileTagEnum.CRITICAL_BASE_REQUIRE2);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.CRITICAL_BASE_REQUIRE,
                    FileTagEnum.CRITICAL_BASE_REQUIRE3);
            mList.add(secondLevelEntity);
        } else if (tag == 36) {
            SecondLevelEntity secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.CRITICAL_MOUSE_DEAL,
                    FileTagEnum.CRITICAL_MOUSE_DEAL1);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.CRITICAL_MOUSE_DEAL,
                    FileTagEnum.CRITICAL_MOUSE_DEAL2);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.CRITICAL_MOUSE_DEAL,
                    FileTagEnum.CRITICAL_MOUSE_DEAL3);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.CRITICAL_MOUSE_DEAL,
                    FileTagEnum.CRITICAL_MOUSE_DEAL4);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.CRITICAL_MOUSE_DEAL,
                    FileTagEnum.CRITICAL_MOUSE_DEAL5);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.CRITICAL_MOUSE_DEAL,
                    FileTagEnum.CRITICAL_MOUSE_DEAL6);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.CRITICAL_MOUSE_DEAL,
                    FileTagEnum.CRITICAL_MOUSE_DEAL7);
            mList.add(secondLevelEntity);
        } else if (tag == 37) {
            SecondLevelEntity secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.CRITICAL_WEN_DEAL,
                    FileTagEnum.CRITICAL_WEN_DEAL1);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.CRITICAL_WEN_DEAL,
                    FileTagEnum.CRITICAL_WEN_DEAL2);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.CRITICAL_WEN_DEAL,
                    FileTagEnum.CRITICAL_WEN_DEAL3);
            mList.add(secondLevelEntity);
        } else if (tag == 38) {
            SecondLevelEntity secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.CRITICAL_YING_DEAL,
                    FileTagEnum.CRITICAL_YING_DEAL1);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.CRITICAL_YING_DEAL,
                    FileTagEnum.CRITICAL_YING_DEAL2);
            mList.add(secondLevelEntity);
        }
        return mList;
    }

    // 获取三级子页面的数据
    public String getThreeLevelData(int tag) {
        String str = "敬请期待";
        switch (tag) {
            case 39:
                str = str39;
                break;
            case 40:
                str = str40;
                break;
            case 41:
                str = str41;
                break;
            case 42:
                str = str42;
                break;
            case 43:
                str = str43;
                break;
            case 44:
                str = str44;
                break;
            case 45:
                str = str45;
                break;
            case 46:
                str = str46;
                break;
            case 47:
                str = str47;
                break;
            case 48:
                str = str48;
                break;
            case 49:
                str = str49;
                break;
            case 50:
                str = str50;
                break;
            case 51:
                str = str51;
                break;
            case 52:
                str = str52;
                break;
        }
        return str;
    }
}
