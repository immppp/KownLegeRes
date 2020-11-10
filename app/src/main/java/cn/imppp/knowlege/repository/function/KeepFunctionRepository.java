package cn.imppp.knowlege.repository.function;

import java.util.ArrayList;
import java.util.List;

import cn.imppp.knowlege.constant.FileTagEnum;
import cn.imppp.knowlege.entity.OneLevelEntity;

public class KeepFunctionRepository {

    private String str296 = "接种对象：\n" +
            "       0、1、6月龄\n\n" +
            "接种剂次：\n" +
            "       3\n\n" +
            "接种部位：\n" +
            "       上臂三角肌\n\n" +
            "接种途径：\n" +
            "       肌内注射\n\n" +
            "接种剂量/剂次：\n" +
            "       酵母苗5μg/0.5ml\n\n" +
            "备注:\n" +
            "       出生后24小时内接种第1剂次，第1、2剂次间隔≥28天\n\n";
    private String str297 = "接种对象：\n" +
            "       出生时\n\n" +
            "接种剂次：\n" +
            "       1\n\n" +
            "接种部位：\n" +
            "       上臂三角肌中部略下处\n\n" +
            "接种途径：\n" +
            "       皮内注射\n\n" +
            "接种剂量/剂次：\n" +
            "       0.1ml\n\n" +
            "备注:\n" +
            "       无\n\n";
    private String str298 = "接种对象：\n" +
            "       2、3、4月龄，4周岁\n\n" +
            "接种剂次：\n" +
            "       4\n\n" +
            "接种部位：\n" +
            "       无\n\n" +
            "接种途径：\n" +
            "       口服\n\n" +
            "接种剂量/剂次：\n" +
            "       1粒\n\n" +
            "备注:\n" +
            "       第1、2剂次，第2、3剂次间隔均≥28天\n\n";
    private String str299 = "接种对象：\n" +
            "       3、4、5月龄，18－24月龄\n\n" +
            "接种剂次：\n" +
            "       4\n\n" +
            "接种部位：\n" +
            "       上臂外侧三角肌\n\n" +
            "接种途径：\n" +
            "       肌内注射\n\n" +
            "接种剂量/剂次：\n" +
            "       0.5ml\n\n" +
            "备注:\n" +
            "       第1、2剂次，第2、3剂次间隔均≥28天\n\n";
    private String str300 = "接种对象：\n" +
            "       6周岁\n\n" +
            "接种剂次：\n" +
            "       1\n\n" +
            "接种部位：\n" +
            "       上臂三角肌\n\n" +
            "接种途径：\n" +
            "       肌内注射\n\n" +
            "接种剂量/剂次：\n" +
            "       0.5ml\n\n" +
            "备注:\n" +
            "       无\n\n";
    private String str301 = "接种对象：\n" +
            "       8月龄\n\n" +
            "接种剂次：\n" +
            "       1\n\n" +
            "接种部位：\n" +
            "       上臂外侧三角肌下缘附着处\n\n" +
            "接种途径：\n" +
            "       皮下注射\n\n" +
            "接种剂量/剂次：\n" +
            "       0.5ml\n\n" +
            "备注:\n" +
            "       无\n\n";
    private String str302 = "接种对象：\n" +
            "       18－24月龄\n\n" +
            "接种剂次：\n" +
            "       1\n\n" +
            "接种部位：\n" +
            "       上臂外侧三角肌下缘附着处\n\n" +
            "接种途径：\n" +
            "       皮下注射\n\n" +
            "接种剂量/剂次：\n" +
            "       0.5ml\n\n" +
            "备注:\n" +
            "       无\n\n";
    private String str303 = "接种对象：\n" +
            "       8月龄,2周岁\n\n" +
            "接种剂次：\n" +
            "       2\n\n" +
            "接种部位：\n" +
            "       上臂外侧三角肌下缘附着处\n\n" +
            "接种途径：\n" +
            "       皮下注射\n\n" +
            "接种剂量/剂次：\n" +
            "       0.5ml\n\n" +
            "备注:\n" +
            "       \n\n";
    private String str304 = "接种对象：\n" +
            "       6－18月龄\n\n" +
            "接种剂次：\n" +
            "       2\n\n" +
            "接种部位：\n" +
            "       上臂外侧三角肌附着处\n\n" +
            "接种途径：\n" +
            "       皮下注射\n\n" +
            "接种剂量/剂次：\n" +
            "       30μg/0.5ml\n\n" +
            "备注:\n" +
            "       第1、2剂次间隔3个月\n\n";
    private String str305 = "接种对象：\n" +
            "       3周岁,6周岁\n\n" +
            "接种剂次：\n" +
            "       2\n\n" +
            "接种部位：\n" +
            "       上臂外侧三角肌附着处\n\n" +
            "接种途径：\n" +
            "       皮下注射\n\n" +
            "接种剂量/剂次：\n" +
            "       100μg/0.5ml\n\n" +
            "备注:\n" +
            "       2剂次间隔≥3年；第1剂次与A群流脑疫苗第2剂次间隔≥12个月\n\n";
    private String str306 = "接种对象：\n" +
            "       18月龄\n\n" +
            "接种剂次：\n" +
            "       1\n\n" +
            "接种部位：\n" +
            "       上臂外侧三角肌附着处\n\n" +
            "接种途径：\n" +
            "       皮下注射\n\n" +
            "接种剂量/剂次：\n" +
            "       1ml\n\n" +
            "备注:\n" +
            "       无\n\n";
    private String str307 = "接种对象：\n" +
            "       16－60周岁\n\n" +
            "接种剂次：\n" +
            "       3\n\n" +
            "接种部位：\n" +
            "       上臂外侧三角肌\n\n" +
            "接种途径：\n" +
            "       肌内注射\n\n" +
            "接种剂量/剂次：\n" +
            "       1ml\n\n" +
            "备注:\n" +
            "       接种第1剂次后14天接种第2剂次，第3剂次在第1剂次接种后6个月接种\n\n";
    private String str308 = "接种对象：\n" +
            "       炭疽疫情发生时，病例或病畜间接接触者及疫点周围高危人群\n\n" +
            "接种剂次：\n" +
            "       1\n\n" +
            "接种部位：\n" +
            "       上臂外侧三角肌附着处\n\n" +
            "接种途径：\n" +
            "       皮上划痕\n\n" +
            "接种剂量/剂次：\n" +
            "       0.05ml(2滴)\n\n" +
            "备注:\n" +
            "       病例或病畜的直接接触者不能接种\n\n";
    private String str309 = "接种对象：\n" +
            "       流行地区可能接触疫水的7－60岁高危人群\n\n" +
            "接种剂次：\n" +
            "       2\n\n" +
            "接种部位：\n" +
            "       上臂外侧三角肌附着处\n\n" +
            "接种途径：\n" +
            "       皮下注射\n\n" +
            "接种剂量/剂次：\n" +
            "       成人第1剂0.5ml， 第2剂1.0ml\n" +
            "7－13岁剂量减半，必要时7岁以下儿童依据年龄、体重酌量注射，不超过成人剂量1/4\n\n" +
            "备注:\n" +
            "       接种第1剂次后7－10天接种第2剂次\n\n";
    private String str310 = "接种对象：\n" +
            "       8月龄(2剂次),2周岁,6周岁\n\n" +
            "接种剂次：\n" +
            "       4\n\n" +
            "接种部位：\n" +
            "       上臂外侧三角肌下缘附着处\n\n" +
            "接种途径：\n" +
            "       皮下注射\n\n" +
            "接种剂量/剂次：\n" +
            "       0.5ml\n\n" +
            "备注:\n" +
            "       第1、2剂次间隔7－10天\n\n";
    private String str311 = "接种对象：\n" +
            "       18月龄,24－30月龄\n\n" +
            "接种剂次：\n" +
            "       2\n\n" +
            "接种部位：\n" +
            "       上臂三角肌附着处\n\n" +
            "接种途径：\n" +
            "       肌内注射\n\n" +
            "接种剂量/剂次：\n" +
            "       0.5ml\n\n" +
            "备注:\n" +
            "       2剂次间隔≥6个月\n\n";

    private final static KeepFunctionRepository keep = new KeepFunctionRepository();

    public static KeepFunctionRepository getInstance() {
        return keep;
    }

    // 获取子类分组
    public List<OneLevelEntity> getOneLevelData() {
        List<OneLevelEntity> mList = new ArrayList<>();
        OneLevelEntity oneLevelEntity = new OneLevelEntity(
                FileTagEnum.KEEP_FUNCTION,
                FileTagEnum.KEEP_FUNCTION1);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.KEEP_FUNCTION,
                FileTagEnum.KEEP_FUNCTION2);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.KEEP_FUNCTION,
                FileTagEnum.KEEP_FUNCTION3);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.KEEP_FUNCTION,
                FileTagEnum.KEEP_FUNCTION4);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.KEEP_FUNCTION,
                FileTagEnum.KEEP_FUNCTION5);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.KEEP_FUNCTION,
                FileTagEnum.KEEP_FUNCTION6);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.KEEP_FUNCTION,
                FileTagEnum.KEEP_FUNCTION7);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.KEEP_FUNCTION,
                FileTagEnum.KEEP_FUNCTION8);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.KEEP_FUNCTION,
                FileTagEnum.KEEP_FUNCTION9);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.KEEP_FUNCTION,
                FileTagEnum.KEEP_FUNCTION10);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.KEEP_FUNCTION,
                FileTagEnum.KEEP_FUNCTION11);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.KEEP_FUNCTION,
                FileTagEnum.KEEP_FUNCTION12);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.KEEP_FUNCTION,
                FileTagEnum.KEEP_FUNCTION13);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.KEEP_FUNCTION,
                FileTagEnum.KEEP_FUNCTION14);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.KEEP_FUNCTION,
                FileTagEnum.KEEP_FUNCTION15);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.KEEP_FUNCTION,
                FileTagEnum.KEEP_FUNCTION16);
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
            case 296:
                str = str296;
                break;
            case 297:
                str = str297;
                break;
            case 298:
                str = str298;
                break;
            case 299:
                str = str299;
                break;
            case 300:
                str = str300;
                break;
            case 301:
                str = str301;
                break;
            case 302:
                str = str302;
                break;
            case 303:
                str = str303;
                break;
            case 304:
                str = str304;
                break;
            case 305:
                str = str305;
                break;
            case 306:
                str = str306;
                break;
            case 307:
                str = str307;
                break;
            case 308:
                str = str308;
                break;
            case 309:
                str = str309;
                break;
            case 310:
                str = str310;
                break;
            case 311:
                str = str311;
                break;
        }
        return str;
    }
}
