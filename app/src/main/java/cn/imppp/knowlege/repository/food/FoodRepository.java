package cn.imppp.knowlege.repository.food;

import java.util.ArrayList;
import java.util.List;

import cn.imppp.knowlege.constant.FileTagEnum;
import cn.imppp.knowlege.entity.OneLevelEntity;

public class FoodRepository {

    private String str222 = "常见类型：\n" +
            "       农药中毒（有机磷、氨基甲酸酯类、鼠药等），金属与类金属化合物中毒（砷、锌、汞等），环境污染物中毒（二噁英、氯丙醇、多氯联苯中毒等），亚硝酸盐中毒等。 \n\n" +
            "流行病学特点及临床概要：\n" +
            "       发病无季节、地域特征；潜伏期极短，多在数分钟至数小时；发病率和病死率较高；不同化学毒物有不同的靶器官损害，表现特异。\n\n" +
            "处理要点：\n" +
            "       病人：清除毒物、对症治疗。\n" +
            "       鉴别：毒物测定、动物试验。\n" +
            "       控制：销毁中毒食品。\n\n" +
            "预防要点：\n" +
            "       加强农药和有毒化学品的管理和使用，严禁与食品混放；新鲜蔬果食用前需清洗；食物保鲜存储，不食用中毒的畜禽肉和变质食物；接触有毒化学品后需洗净手、脸才可进食；食品工业原料及添加剂的种类和用量严格遵照国家相关法律法规执行。";
    private String str223 = "常见类型：\n" +
            "       沙门菌食物中毒、副溶血性弧菌食物中毒、李斯特菌食物中毒、大肠埃希菌食物中毒、空肠弯曲菌食物中毒、变形杆菌食物中毒、志贺菌食物中毒、金黄色葡萄球菌食物中毒等。\n\n" +
            "流行病学特点及临床概要：\n" +
            "       最为常见，每年5~10月份多发，夏秋季高发；潜伏期一般在48小时以内；呈爆发性；一般病程较短、病死率低；可表现为胃肠道症状型或神经症状型食物中毒。\n\n" +
            "处理要点：\n" +
            "       病人：清除毒物、对症治疗、特殊治疗。\n" +
            "       鉴别：微生物培养、抗体测定、动物试验。\n" +
            "       控制：消毒灭菌、销毁中毒食品。\n\n" +
            "预防要点：\n" +
            "       加强食品卫生质量检查和监督管理，严格遵守相关卫生要求，防治污染；食品食用前充分加热以杀灭病原体和破坏毒素，在低温或通风阴凉处存放食品以控制细菌繁殖和毒素的形成；食品从业人员应认真执行体检制度，接受食品卫生教育，养成良好的个人卫生习惯。";
    private String str224 = "常见类型：\n" +
            "       霉菌毒素中毒（赤霉病变麦中毒、霉变甘蔗中毒）等。\n\n" +
            "流行病学特点及临床概要：\n" +
            "       有明确的季节和地区性，雨季多见，与食物的霉变有关；潜伏期短，多在数小时内发病；临床表现为胃肠炎型、神经损害型和肝脏损害型。\n\n" +
            "处理要点：\n" +
            "       病人：清除毒物、对症治疗。\n" +
            "       鉴别：毒素测定、动物试验。\n" +
            "       控制：销毁中毒食品。\n\n" +
            "预防要点：\n" +
            "       高发地区应加强黄曲霉毒素等毒素的监测；对收获后的粮食及时晒干；去除霉变的食物；不食用已发霉、变色、变味的食物。";
    private String str225 = "常见类型：\n" +
            "       河豚鱼中毒、鱼类组胺中毒、贝类中毒等。\n\n" +
            "流行病学特点及临床概要：\n" +
            "       有明确的季节和地区性，与有毒动物的分布有关；多为家庭散发；潜伏期短，数分钟至数小时；发病率和病死率高；临床表现多为神经损害型、过敏型、皮炎型等。\n\n" +
            "处理要点：\n" +
            "       病人：清除毒物、对症治疗。\n" +
            "       鉴别：毒素测定、动物试验。\n" +
            "       控制：销毁中毒食品。\n\n" +
            "预防要点：\n" +
            "       加强有毒动物的监管，不食用河豚鱼、猪的甲状腺及鱼胆等；对易产生组胺的鱼种应冷藏运输和加工。";
    private String str226 = "常见类型：\n" +
            "       蕈毒素中毒、含氰果仁中毒、豆类中毒、木薯中毒等。\n\n" +
            "流行病学特点及临床概要：\n" +
            "       发病与季节、有毒植物分布一致；多为农村常见散发；潜伏期数分钟至数天；临床表现多样，主要有胃肠炎型、神经精神型、肝脏损害型等。\n\n" +
            "处理要点：\n" +
            "       病人：清除毒物、对症治疗。\n" +
            "       鉴别：形态学鉴别、毒素测定、动物试验。\n" +
            "       控制：销毁中毒食品。\n\n" +
            "预防要点：\n" +
            "       不食用可疑有毒植物，如毒蘑菇。加强集体食堂、餐饮单位食品加工安全培训，正确加工处理易发生中毒的植物，如发芽土豆、菜豆和新鲜黄花菜等。";

    private final static FoodRepository food = new FoodRepository();

    public static FoodRepository getInstance() {
        return food;
    }

    // 获取子类分组
    public List<OneLevelEntity> getOneLevelData() {
        List<OneLevelEntity> mList = new ArrayList<>();
        OneLevelEntity oneLevelEntity = new OneLevelEntity(
                FileTagEnum.FOOD_DRUGS_DEAL,
                FileTagEnum.FOOD_DRUGS_DEAL1);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.FOOD_DRUGS_DEAL,
                FileTagEnum.FOOD_DRUGS_DEAL2);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.FOOD_DRUGS_DEAL,
                FileTagEnum.FOOD_DRUGS_DEAL3);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.FOOD_DRUGS_DEAL,
                FileTagEnum.FOOD_DRUGS_DEAL4);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.FOOD_DRUGS_DEAL,
                FileTagEnum.FOOD_DRUGS_DEAL5);
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
            case 222:
                str = str222;
                break;
            case 223:
                str = str223;
                break;
            case 224:
                str = str224;
                break;
            case 225:
                str = str225;
                break;
            case 226:
                str = str226;
                break;
        }
        return str;
    }

}
