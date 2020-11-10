package cn.imppp.knowlege.repository.medicine;

// 试剂配方界面

import java.util.ArrayList;
import java.util.List;

import cn.imppp.knowlege.constant.FileTagEnum;
import cn.imppp.knowlege.entity.OneLevelEntity;
import cn.imppp.knowlege.entity.SecondLevelEntity;

public class MedicineRepository {

    private String str334 = "有效剂型:\n" +
            "       S\n\n" +
            "剂量（g/ha):\n" +
            "       140-190(1)\n\n" +
            "持效（周）:\n" +
            "       1-2\n\n" +
            "有效成分的安全等级：\n" +
            "       在正常使用中无毒\n";
    private String str335 = "有效剂型:\n" +
            "       S\n\n" +
            "剂量（g/ha):\n" +
            "       140-190(1)\n\n" +
            "持效（周）:\n" +
            "       1-2\n\n" +
            "有效成分的安全等级：\n" +
            "       在正常使用中无毒\n";
    private String str336 = "有效剂型:\n" +
            "       S\n\n" +
            "剂量（g/ha):\n" +
            "       19-47(1)\n\n" +
            "持效（周）:\n" +
            "       1-2\n\n" +
            "有效成分的安全等级：\n" +
            "       在正常使用中无毒\n";
    private String str337 = "有效剂型:\n" +
            "       GR\n\n" +
            "剂量（g/ha):\n" +
            "       840-1000\n\n" +
            "持效（周）:\n" +
            "       2\n\n" +
            "有效成分的安全等级：\n" +
            "       高毒\n";
    private String str340 = "有效剂型:\n" +
            "       EC，GR，S，WP\n\n" +
            "剂量（g/ha):\n" +
            "       11-25\n\n" +
            "持效（周）:\n" +
            "       3-17\n\n" +
            "有效成分的安全等级：\n" +
            "       中毒\n";
    private String str341 = "有效剂型:\n" +
            "       EC，GR\n\n" +
            "剂量（g/ha):\n" +
            "       100-1000\n\n" +
            "持效（周）:\n" +
            "       1-3\n\n" +
            "有效成分的安全等级：\n" +
            "       中毒\n";
    private String str342 = "有效剂型:\n" +
            "       EC，GR\n\n" +
            "剂量（g/ha):\n" +
            "       22-112\n\n" +
            "持效（周）:\n" +
            "       2-11\n\n" +
            "有效成分的安全等级：\n" +
            "       高毒\n";
    private String str343 = "有效剂型:\n" +
            "       EC，GR，S\n\n" +
            "剂量（g/ha):\n" +
            "       50-100\n\n" +
            "持效（周）:\n" +
            "       7-16\n\n" +
            "有效成分的安全等级：\n" +
            "       在正常使用中无毒\n";
    private String str344 = "有效剂型:\n" +
            "       EC，GR，S\n\n" +
            "剂量（g/ha):\n" +
            "       224-1000\n\n" +
            "持效（周）:\n" +
            "       1-2\n\n" +
            "有效成分的安全等级：\n" +
            "       轻毒\n";
    private String str345 = "有效剂型:\n" +
            "       EC，GR，S\n\n" +
            "剂量（g/ha):\n" +
            "       50-100\n\n" +
            "持效（周）:\n" +
            "       1-11\n\n" +
            "有效成分的安全等级：\n" +
            "       轻毒\n";
    private String str346 = "有效剂型:\n" +
            "       EC，GR，S\n\n" +
            "剂量（g/ha):\n" +
            "       56-112\n\n" +
            "持效（周）:\n" +
            "       2-4\n\n" +
            "有效成分的安全等级：\n" +
            "       在正常使用中无毒\n";
    private String str347 = "有效剂型:\n" +
            "       GR，WP\n\n" +
            "剂量（g/ha):\n" +
            "       25-100\n\n" +
            "持效（周）:\n" +
            "       1-4\n\n" +
            "有效成分的安全等级：\n" +
            "       在正常使用中无毒\n";
    private String str348 = "有效剂型:\n" +
            "       BR，S，SRS\n\n" +
            "剂量（g/ha):\n" +
            "       100-1000\n\n" +
            "持效（周）:\n" +
            "       4-8\n\n" +
            "有效成分的安全等级：\n" +
            "       在正常使用中无毒\n";
    private String str349 = "有效剂型:\n" +
            "       GR\n\n" +
            "剂量（g/ha):\n" +
            "       10-100\n\n" +
            "持效（周）:\n" +
            "       4-8\n\n" +
            "有效成分的安全等级：\n" +
            "       在正常使用中无毒\n";
    private String str353 = "剂量(g/m2):\n" +
            "       1-2\n\n" +
            "持效(月):\n" +
            "       1-3\n\n" +
            "杀虫作用:\n" +
            "       触杀\n\n" +
            "有效成分的安全等级:\n" +
            "       轻毒\n";
    private String str354 = "剂量(g/m2):\n" +
            "       1-2\n\n" +
            "持效(月):\n" +
            "       1-3或更多\n\n" +
            "杀虫作用:\n" +
            "       触杀、吸入\n\n" +
            "有效成分的安全等级:\n" +
            "       中毒\n";
    private String str355 = "剂量(g/m2):\n" +
            "       1-2\n\n" +
            "持效(月):\n" +
            "       2-3或更多\n\n" +
            "杀虫作用:\n" +
            "       触杀、吸入\n\n" +
            "有效成分的安全等级:\n" +
            "       轻毒\n";
    private String str356 = "剂量(g/m2):\n" +
            "       0.2-0.4\n\n" +
            "持效(月):\n" +
            "       2-3\n\n" +
            "杀虫作用:\n" +
            "       触杀、吸入\n\n" +
            "有效成分的安全等级:\n" +
            "       中毒\n";
    private String str357 = "剂量(g/m2):\n" +
            "       0.2-0.4\n\n" +
            "持效(月):\n" +
            "       2-3\n\n" +
            "杀虫作用:\n" +
            "       触杀、吸入\n\n" +
            "有效成分的安全等级:\n" +
            "       中毒\n";
    private String str358 = "剂量(g/m2):\n" +
            "       0.03\n\n" +
            "持效(月):\n" +
            "       2-3\n\n" +
            "杀虫作用:\n" +
            "       触杀\n\n" +
            "有效成分的安全等级:\n" +
            "       中毒\n";
    private String str359 = "剂量(g/m2):\n" +
            "       0.025\n\n" +
            "持效(月):\n" +
            "       3-5\n\n" +
            "杀虫作用:\n" +
            "       触杀\n\n" +
            "有效成分的安全等级:\n" +
            "       中毒\n";
    private String str360 = "剂量(g/m2):\n" +
            "       0.5\n\n" +
            "持效(月):\n" +
            "       4或更多\n\n" +
            "杀虫作用:\n" +
            "       触杀\n\n" +
            "有效成分的安全等级:\n" +
            "       中毒\n";
    private String str361 = "剂量(g/m2):\n" +
            "       0.025-0.05\n\n" +
            "持效(月):\n" +
            "       2-3\n\n" +
            "杀虫作用:\n" +
            "       触杀\n\n" +
            "有效成分的安全等级:\n" +
            "       中毒\n";
    private String str362 = "剂量(g/m2):\n" +
            "       0.05\n\n" +
            "持效(月):\n" +
            "       2-3或更多\n\n" +
            "杀虫作用:\n" +
            "       触杀\n\n" +
            "有效成分的安全等级:\n" +
            "       中毒\n";
    private String str363 = "剂量(g/m2):\n" +
            "       0.5\n\n" +
            "持效(月):\n" +
            "       2-3\n\n" +
            "杀虫作用:\n" +
            "       触杀\n\n" +
            "有效成分的安全等级:\n" +
            "       中毒\n";
    private String str364 = "二氯苯醚菊酯:\n\n" +
            "       0.10-0.25\n\n" +
            "氟氯氰菊酯:\n\n" +
            "       0.05\n\n" +
            "溴氰菊酯:\n\n" +
            "       0.008-0.012\n\n" +
            "三氟氯氰菊酯:\n\n" +
            "       0.005-0.008\n\n" ;
    private String str365 = "二氯苯醚菊酯:\n\n" +
            "       0.20-0.50\n\n" +
            "氟氯氰菊酯:\n\n" +
            "       0.03\n\n" +
            "溴氰菊酯:\n\n" +
            "       0.01-0.025\n\n" +
            "三氟氯氰菊酯:\n\n" +
            "       0.01-0.015\n\n" ;


    private static final MedicineRepository medicine = new MedicineRepository();

    public static MedicineRepository getInstance() {
        return medicine;
    }

    // 获取子类分组
    public List<OneLevelEntity> getOneLevelData1() {
        List<OneLevelEntity> mList = new ArrayList<>();
        OneLevelEntity oneLevelEntity = new OneLevelEntity(
                FileTagEnum.WEN_CONTROL1_2,
                FileTagEnum.WEN_CONTROL1_2_1);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.WEN_CONTROL1_2,
                FileTagEnum.WEN_CONTROL1_2_2);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.WEN_CONTROL1_2,
                FileTagEnum.WEN_CONTROL1_2_3);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.WEN_CONTROL1_2,
                FileTagEnum.WEN_CONTROL1_2_4);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.WEN_CONTROL1_2,
                FileTagEnum.WEN_CONTROL1_2_5);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.WEN_CONTROL1_2,
                FileTagEnum.WEN_CONTROL1_2_6);
        mList.add(oneLevelEntity);
        return mList;
    }

    public List<OneLevelEntity> getOneLevelData2() {
        List<OneLevelEntity> mList = new ArrayList<>();
        OneLevelEntity oneLevelEntity = new OneLevelEntity(
                FileTagEnum.WEN_CONTROL2_5,
                FileTagEnum.WEN_CONTROL2_5_1);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.WEN_CONTROL2_5,
                FileTagEnum.WEN_CONTROL2_5_2);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.WEN_CONTROL2_5,
                FileTagEnum.WEN_CONTROL2_5_3);
        mList.add(oneLevelEntity);
        return mList;
    }

    public List<OneLevelEntity> getOneLevelData3() {
        List<OneLevelEntity> mList = new ArrayList<>();
        OneLevelEntity oneLevelEntity = new OneLevelEntity(
                FileTagEnum.WEN_CONTROL2_7,
                FileTagEnum.WEN_CONTROL2_7_1);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.WEN_CONTROL2_7,
                FileTagEnum.WEN_CONTROL2_7_2);
        mList.add(oneLevelEntity);
        return mList;
    }

    // 获取二级子类分组
    public List<SecondLevelEntity> getSecondLevelData(int tag) {
        List<SecondLevelEntity> mList = new ArrayList<>();
        if (tag == 338) {
            SecondLevelEntity secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.WEN_CONTROL1_2_5,
                    FileTagEnum.WEN_CONTROL1_2_5_1);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.WEN_CONTROL1_2_5,
                    FileTagEnum.WEN_CONTROL1_2_5_2);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.WEN_CONTROL1_2_5,
                    FileTagEnum.WEN_CONTROL1_2_5_3);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.WEN_CONTROL1_2_5,
                    FileTagEnum.WEN_CONTROL1_2_5_4);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.WEN_CONTROL1_2_5,
                    FileTagEnum.WEN_CONTROL1_2_5_5);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.WEN_CONTROL1_2_5,
                    FileTagEnum.WEN_CONTROL1_2_5_6);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.WEN_CONTROL1_2_5,
                    FileTagEnum.WEN_CONTROL1_2_5_7);
            mList.add(secondLevelEntity);
        } else if (tag == 339) {
            SecondLevelEntity secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.WEN_CONTROL1_2_6,
                    FileTagEnum.WEN_CONTROL1_2_6_1);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.WEN_CONTROL1_2_6,
                    FileTagEnum.WEN_CONTROL1_2_6_2);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.WEN_CONTROL1_2_6,
                    FileTagEnum.WEN_CONTROL1_2_6_3);
            mList.add(secondLevelEntity);
        } else if (tag == 350) {
            SecondLevelEntity secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.WEN_CONTROL2_5_1,
                    FileTagEnum.WEN_CONTROL2_5_1_1);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.WEN_CONTROL2_5_1,
                    FileTagEnum.WEN_CONTROL2_5_1_2);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.WEN_CONTROL2_5_1,
                    FileTagEnum.WEN_CONTROL2_5_1_3);
            mList.add(secondLevelEntity);
        } else if (tag == 351) {
            SecondLevelEntity secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.WEN_CONTROL2_5_2,
                    FileTagEnum.WEN_CONTROL2_5_2_1);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.WEN_CONTROL2_5_2,
                    FileTagEnum.WEN_CONTROL2_5_2_2);
            mList.add(secondLevelEntity);
        } else if (tag == 352) {
            SecondLevelEntity secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.WEN_CONTROL2_5_3,
                    FileTagEnum.WEN_CONTROL2_5_3_1);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.WEN_CONTROL2_5_3,
                    FileTagEnum.WEN_CONTROL2_5_3_2);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.WEN_CONTROL2_5_3,
                    FileTagEnum.WEN_CONTROL2_5_3_3);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.WEN_CONTROL2_5_3,
                    FileTagEnum.WEN_CONTROL2_5_3_4);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.WEN_CONTROL2_5_3,
                    FileTagEnum.WEN_CONTROL2_5_3_5);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.WEN_CONTROL2_5_3,
                    FileTagEnum.WEN_CONTROL2_5_3_6);
            mList.add(secondLevelEntity);
        }
        return mList;
    }

    // 获取三级子页面的数据
    public String getThreeLevelData(int tag) {
        String str = "敬请期待";
        switch (tag) {
            case 334:
                str = str334;
                break;
            case 335:
                str = str335;
                break;
            case 336:
                str = str336;
                break;
            case 337:
                str = str337;
                break;
            case 340:
                str = str340;
                break;
            case 341:
                str = str341;
                break;
            case 342:
                str = str342;
                break;
            case 343:
                str = str343;
                break;
            case 344:
                str = str344;
                break;
            case 345:
                str = str345;
                break;
            case 346:
                str = str346;
                break;
            case 347:
                str = str347;
                break;
            case 348:
                str = str348;
                break;
            case 349:
                str = str349;
                break;
            case 353:
                str = str353;
                break;
            case 354:
                str = str354;
                break;
            case 355:
                str = str355;
                break;
            case 356:
                str = str356;
                break;
            case 357:
                str = str357;
                break;
            case 358:
                str = str358;
                break;
            case 359:
                str = str359;
                break;
            case 360:
                str = str360;
                break;
            case 361:
                str = str361;
                break;
            case 362:
                str = str362;
                break;
            case 363:
                str = str363;
                break;
            case 364:
                str = str364;
                break;
            case 365:
                str = str365;
                break;
        }
        return str;
    }

}
