package cn.imppp.knowlege.repository.openVirus;

import java.util.ArrayList;
import java.util.List;

import cn.imppp.knowlege.constant.FileTagEnum;
import cn.imppp.knowlege.entity.OneLevelEntity;
import cn.imppp.knowlege.entity.SecondLevelEntity;

public class OpenVirusRepository {

    private String str272 = "适应症：\n" +
            "       急性氰化物中毒解毒剂。本品在血中能使血红蛋白氧化为高铁血红蛋白。\n\n" +
            "用法用量：\n" +
            "       将安瓿包于手帕内，压碎，由鼻腔吸入。氰化物中毒：0.2ml/次，每3-5分钟一次。极量0.5ml/次，2-4次/日。";
    private String str273 = "适应症：\n" +
            "       氰氢酸及氰化物中毒解毒剂。\n\n" +
            "用法用量：\n" +
            "       静注：3%溶液10-15ml/次，缓慢静注，2-3ml/分钟，随后静注硫代硫酸钠溶液。";
    private String str274 = "适应症：\n" +
            "       氰化物解毒剂。在酶的参与下与体内游离的氰离子结合，使其变为无毒的硫氰酸盐排出体外而解毒。\n\n" +
            "用法用量：\n" +
            "       静注：须先用作用迅速的亚硝酸钠或亚甲蓝，然后缓慢静注12.5-25g (25%-50%溶液50ml)。口服中毒者，用5%溶液洗胃，洗后留本品适量于胃内。";
    private String str275 = "适应症：\n" +
            "       严重氰化物中毒深昏迷病人，或作为氰化物中毒的预防性药物，还可用于硫化氢中毒。\n\n" +
            "用法用量：\n" +
            "       轻症者口服4-DMAP及PAPP各1片。重症者给10% 4-DMAP 2ml肌注后再给50% 硫代硫酸钠20ml静注。可酌情于1小时后重复半量。";
    private String str276 = "适应症：\n" +
            "       可用于预防氰化物中毒。\n\n" +
            "用法用量：\n" +
            "       于接触氰化物前半小时，口服1片，并同时口服4-DMAP1片。";
    private String str277 = "适应症：\n" +
            "       它能与多种二价、三价金属螯合，形成稳定的可性金属络合物，经肾脏随尿排出。\n\n" +
            "用法用量：\n" +
            "       静注：每天1g。肌注：0.25~0.5g/次，2次/日，3~4日为一疗程，间隔3~4日可重复应用。对于严重铅中毒脑病，与二巯丙醇联合使用。";
    private String str278 = "适应症：\n" +
            "       本药药理作用和二巯基丙醇相似。但其解毒作用较强,毒性较小。\n\n" +
            "用法用量：\n" +
            "       临床用5% 二巯基丙磺酸钠溶液作肌肉注射。";
    private String str279 = "适应症：\n" +
            "       用于锑、汞、铅、砷等中毒的治疗。对铅中毒的疗效和依地酸钙钠相仿；对砷、汞中毒疗效同二巯丙磺酸钠。\n\n" +
            "用法用量：\n" +
            "       肝豆状核变性 静注：每日1-2g/次，配成5%-10%溶液缓慢静注，5日/疗程。急性锑、汞、铅中毒 静注：每日 1-2g/次，每日总量不超过3g。";
    private String str280 = "适应症：\n" +
            "       对砷、汞及金的中毒有解救功能，但治疗慢性汞中毒效果较差。\n\n" +
            "用法用量：\n" +
            "       肌注：2.5-5mg/kg。常用制剂为10% 油剂，宜作深部肌肉注射。剂量每次2.5～3mg/ kg，间隔时间不少于4小时。";
    private String str281 = "适应症：\n" +
            "       主要用于治疗铅中毒，对铁、锌、铬、钴等有效，对钇、铈、钚、铀、锶、钍、钪、镅等放射核素也有效。\n\n" +
            "用法用量：\n" +
            "       用药原则与依地酸钙同。";
    private String str282 = "适应症：\n" +
            "       治疗和预防放射病综合征。能对抗金属铊、四乙基铅等毒作用，用于急性四乙基铅中毒，效果较好。 \n\n" +
            "用法用量：\n" +
            "       治疗铅中毒 静注：0.1-0.2g/次，1-2次/日。 静滴：0.2-0.4g/日。";
    private String str283 = "适应症：\n" +
            "       治疗汞中毒。对有机汞中毒排汞有一定的疗效，但排汞效果不及二巯基丙磺酸钠。\n\n" +
            "用法用量：\n" +
            "       口服,150mg/次，3次/日。针剂为100～200mg，静脉或肌肉注射，一日1～2次，连续3日为一疗程。";
    private String str284 = "适应症：\n" +
            "       青霉胺是铜、汞、锌、铅的有效络合剂。\n\n" +
            "用法用量：\n" +
            "       空腹服药。肝豆状核变性病 口服：每日20-25mg/kg，3次/日。慢性铅、汞中毒 口服：0.25g/次，4次/日，5-7日/疗程。";
    private String str285 = "适应症：\n" +
            "       用于促排放射性铯及金属铊及其化合物中毒\n\n" +
            "用法用量：\n" +
            "       放射性铯体内污染，每次1g（3粒），6天为一疗程，间隔6天后可进行第2、3疗程。铊中毒250mg/kg溶于15%的甘露醇200ml中分4次口服，同时导泻。";
    private String str286 = "适应症：\n" +
            "       用于钡盐中毒。\n\n" +
            "用法用量：\n" +
            "       钡盐中毒，可用5%的硫酸钠洗胃，然后再服硫酸钠20-30g。";
    private String str287 = "适应症：\n" +
            "       用于铅、铁、锌、钴、铬中毒及治疗钚、铀、锶、钇等放射性元素对机体的损伤。\n\n" +
            "用法用量：\n" +
            "       静滴：0.5-1g/日, 溶于生理盐水或葡萄糖液中, 2-3次/周, 间歇应用效果较佳。肌注：0.5g/次, 2次/日, 3日/疗程。口服：1g/次，2-3次/日。";
    private String str288 = "适应症：\n" +
            "       用于1059、1605、3911、甲拌磷、敌敌畏急性中毒，其疗效较好；对慢性有机磷中毒疗效欠佳。\n\n" +
            "用法用量：\n" +
            "       肌内注射或静脉注射按中毒程度不同，肌注0.125~0.5g，2~3小时可重复注射，重度中毒静脉注射，0.5~0.75g，半小时后可注射0.5g。";
    private String str289 = "适应症：\n" +
            "       用于多种有机磷酸酯类杀虫剂中毒，对马拉硫磷、敌百虫、敌敌畏、乐果、甲氟磷、丙胺氟磷和八甲磷的中毒效果较差。\n\n" +
            "用法用量：\n" +
            "       肌内注射或静脉注射按中毒程度不同，肌注0.25~0.75g，必要时2小时后重复1次，重度中毒静脉注射，0.75~1.0g，半小时后可重复。";
    private String str290 = "适应症：\n" +
            "       中毒早期用药疗效较好，对慢性有机磷酯类中毒无效。对内吸磷、对硫磷、甲拌磷、硫特普、乙硫磷、伊皮恩等解毒疗效较好；对乐果、马拉硫磷、敌百虫、敌敌畏等解毒疗效稍差；对八甲磷、二嗪农（地亚农）、甲氟磷、丙胺氟磷、磷君等则无解毒疗效。\n\n" +
            "用法用量：\n" +
            "       轻度中毒：0.4g以葡萄糖液或生理盐水10~20ml稀释后缓慢静注，必要时2小时后重复1次。中度中毒：0.8~1.2g稀释后缓慢静注，1~2小时后，重复0.4~0.8g。重度中毒：1.2~1.6g稀释后缓慢静脉注射，30分钟后，若效果不佳，可再注射0.8~1.2g，以后，每小时0.4g，静滴或静注。";
    private String str291 = "适应症：\n" +
            "       对亚硝酸盐、硝酸盐、苯胺、硝基苯、三硝基甲苯、苯醌、苯肼等和含有或产生芳香胺的药物（乙酰苯胺、对乙酰氨基酚、非那西丁、苯佐卡因等）引起的高铁血红蛋白血症有效。\n\n" +
            "用法用量：\n" +
            "       静注：亚硝酸盐中毒，一次按体重1～2mg/kg，氰化物中毒，一次按体重5～10mg/kg，最大剂量为20mg/kg。";
    private String str292 = "适应症：\n" +
            "       为氟乙酰胺（有机氟农药）、氟乙酸钠（杀鼠剂）、甘氟（鼠甘伏）中毒的特效解毒剂。需早期用药。\n\n" +
            "用法用量：\n" +
            "       肌肉注射2.5～5.0g/次，2～4次/d。重症者可给5～10g/次。一般应用5～7天。";
    private String str293 = "适应症：\n" +
            "       用于长期或大量服用豆香素类、水杨酸类或杀鼠剂敌鼠钠中毒。\n\n" +
            "用法用量：\n" +
            "       肌注：10mg/次，1-2次/日。静注：10mg/次，每分钟不超过5mg，1-2次/日。";
    private String str294 = "适应症：\n" +
            "       临床用于解救吗啡类镇痛药过量或中毒。\n\n" +
            "用法用量：\n" +
            "       肌注或静注：0.4-0.8mg/次。";

    private final static OpenVirusRepository open = new OpenVirusRepository();
    public static OpenVirusRepository getInstance() {
        return open;
    }

    // 获取子类分组
    public List<OneLevelEntity> getOneLevelData() {
        List<OneLevelEntity> mList = new ArrayList<>();
        OneLevelEntity oneLevelEntity = new OneLevelEntity(
                FileTagEnum.OPEN_VIRUS,
                FileTagEnum.QING_VIRUS);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.OPEN_VIRUS,
                FileTagEnum.JIN_SHU_VITUS);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.OPEN_VIRUS,
                FileTagEnum.LIN_VIRUS);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.OPEN_VIRUS,
                FileTagEnum.BEN_VIRUS);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.OPEN_VIRUS,
                FileTagEnum.MOUSE_VIRUS);
        mList.add(oneLevelEntity);
        return mList;
    }

    // 获取二级子类分组
    public List<SecondLevelEntity> getSecondLevelData(int tag) {
        List<SecondLevelEntity> mList = new ArrayList<>();
        if (tag == 267) {
            SecondLevelEntity secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.QING_VIRUS,
                    FileTagEnum.QING_VIRUS1);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.QING_VIRUS,
                    FileTagEnum.QING_VIRUS2);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.QING_VIRUS,
                    FileTagEnum.QING_VIRUS3);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.QING_VIRUS,
                    FileTagEnum.QING_VIRUS4);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.QING_VIRUS,
                    FileTagEnum.QING_VIRUS5);
            mList.add(secondLevelEntity);
        } else if (tag == 268) {
            SecondLevelEntity secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.JIN_SHU_VITUS,
                    FileTagEnum.JIN_SHU_VITUS1);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.JIN_SHU_VITUS,
                    FileTagEnum.JIN_SHU_VITUS2);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.JIN_SHU_VITUS,
                    FileTagEnum.JIN_SHU_VITUS3);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.JIN_SHU_VITUS,
                    FileTagEnum.JIN_SHU_VITUS4);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.JIN_SHU_VITUS,
                    FileTagEnum.JIN_SHU_VITUS5);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.JIN_SHU_VITUS,
                    FileTagEnum.JIN_SHU_VITUS6);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.JIN_SHU_VITUS,
                    FileTagEnum.JIN_SHU_VITUS7);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.JIN_SHU_VITUS,
                    FileTagEnum.JIN_SHU_VITUS8);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.JIN_SHU_VITUS,
                    FileTagEnum.JIN_SHU_VITUS9);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.JIN_SHU_VITUS,
                    FileTagEnum.JIN_SHU_VITUS10);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.JIN_SHU_VITUS,
                    FileTagEnum.JIN_SHU_VITUS11);
            mList.add(secondLevelEntity);
        } else if (tag == 269) {
            SecondLevelEntity secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.LIN_VIRUS,
                    FileTagEnum.LIN_VIRUS1);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.LIN_VIRUS,
                    FileTagEnum.LIN_VIRUS2);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.LIN_VIRUS,
                    FileTagEnum.LIN_VIRUS3);
            mList.add(secondLevelEntity);
        } else if (tag == 270) {
            SecondLevelEntity secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.BEN_VIRUS,
                    FileTagEnum.BEN_VIRUS1);
            mList.add(secondLevelEntity);
        } else if (tag == 271) {
            SecondLevelEntity secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.MOUSE_VIRUS,
                    FileTagEnum.MOUSE_VIRUS1);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.MOUSE_VIRUS,
                    FileTagEnum.MOUSE_VIRUS2);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.MOUSE_VIRUS,
                    FileTagEnum.MOUSE_VIRUS3);
            mList.add(secondLevelEntity);
        }
        return mList;
    }

    // 获取三级子页面的数据
    public String getThreeLevelData(int tag) {
        String str = "敬请期待";
        switch (tag) {
            case 272:
                str = str272;
                break;
            case 273:
                str = str273;
                break;
            case 274:
                str = str274;
                break;
            case 275:
                str = str275;
                break;
            case 276:
                str = str276;
                break;
            case 277:
                str = str277;
                break;
            case 278:
                str = str278;
                break;
            case 279:
                str = str279;
                break;
            case 280:
                str = str280;
                break;
            case 281:
                str = str281;
                break;
            case 282:
                str = str282;
                break;
            case 283:
                str = str283;
                break;
            case 284:
                str = str284;
                break;
            case 285:
                str = str285;
                break;
            case 286:
                str = str286;
                break;
            case 287:
                str = str287;
                break;
            case 288:
                str = str288;
                break;
            case 289:
                str = str289;
                break;
            case 290:
                str = str290;
                break;
            case 291:
                str = str291;
                break;
            case 292:
                str = str292;
                break;
            case 293:
                str = str293;
                break;
            case 294:
                str = str294;
                break;
        }
        return str;
    }
}
