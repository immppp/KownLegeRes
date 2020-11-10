package cn.imppp.knowlege.repository.natureMonitor;

import java.util.ArrayList;
import java.util.List;

import cn.imppp.knowlege.constant.FileTagEnum;
import cn.imppp.knowlege.entity.OneLevelEntity;
import cn.imppp.knowlege.entity.SecondLevelEntity;

public class NatureMonitorRepository {

    private String str264 =
            "       采用简易、实用的方法，对蚊、蝇、鼠等开展定期、连续监测，当群众反应蚊、蝇、鼠较多，或当灾民安置点的蚊类监测灯诱法蚊密度超过15只/灯·夜或人工小时法蚊密度5只/人工·小时，蝇类监测的粘蝇条法蝇密度超过10只/条·天或目测法蝇密度超过1只/平方米时，鼠类监测的鼠盗食率超过10%或鼠迹法鼠密度超过5处/2000米、鼠夹法鼠密度超过1％，建议对整个安置点进行相应的杀虫、灭鼠处理。";
    private String str265 =
            "       在杀虫、灭鼠工作中，要开展对蚊、蝇、鼠等病媒生物杀灭前后的密度进行监测，并进行防制效果评价。\n" +
            "       灭效=[（处理前密度–处理后密度）÷ 处理前密度]×100%\n";
    private String str388 =
            "       将诱蚊灯悬挂于帐篷、临时住所等室外，悬挂高度离地面约1.5米，挂灯位置要远离二氧化碳源(厨房、火堆等)环境，避开强光源，周边5米内没有大的遮挡物，两个诱蚊灯之间相隔至少200米。于日落时开灯，次日日出时，收集蚊虫，计算密度指数。\n"
    +       "       蚊虫密度指数＝诱蚊灯捕获蚊虫总数/灯数 （单位：只 / 灯·夜）\n";
    private String str389 =
            "       每个灾民安置点选4个帐篷（活动房、临时住所等），日落1小时或晚上亮灯以后，用电动捕蚊器，室内分别捕蚊15分钟，收集蚊虫，计算密度指数。可以用电蚊拍代替电动吸蚊器。\n" +
            "       蚊虫密度指数=捕蚊数目总和 (单位：只/人工·小时)";
    private String str390 =
            "       每个监测点（灾民安置点）选10个帐篷（活动房、临时住所等）（以12平方米左右为一个房间计算），分别悬挂3个粘蝇条，总计30个粘蝇条，24小时后查看粘蝇条上的蝇类数量，记录粘住蝇类总数。\n" +
            "       蝇类密度指数＝粘住蝇类的总数/粘蝇条总数  （单位：只 / 条·天）\n";
    private String str391 =
            "       每个监测点（灾民安置点）选①厕所和垃圾堆（桶）、②帐篷（活动房、临时住所等）内、③帐篷（活动房、临时住所等）外（以12平方米左右为一个房间计算）三类环境各5处，目测苍蝇数目。每处选一点站立，观察半径两米之内的蝇类数目，3分钟之内计数两遍，以数目较高者数字为准，除以12即为密度指数。观测时间为10:00～16:00。要注意，当蝇类数量超过50只，计数时间不以三分钟为限。三类环境的蝇类密度指数分别取平均数，作为相应环境类型的密度指数，以总均数作为监测点蝇类密度指数。\n" +
            "       蝇类密度=观察到的苍蝇数/12（单位：只/平方米）";
    private String str392 =
            "       在灾民安置点室内外放置至少30堆灭鼠毒饵，毒饵放置范围为灾民安置点及其周围环境。每堆毒饵之间相距至少5米，24小时后观察毒饵是否被鼠类取食，记录被取食的毒饵堆数。\n" +
            "       注意：毒饵要放在毒饵盒内，作醒目标志，做好宣传，勿让儿童触及。\n" +
            "       鼠密度=（被鼠类取食的毒饵堆数÷毒饵总堆数）× 100% （单位：盗食率%）\n";
    private String str393 =
            "       检查灾民聚居区帐篷内、周边环境、垃圾站点、厕所等累计2000延长米的鼠迹（包括鼠洞、鼠粪、鼠咬痕迹及鼠道），记录鼠迹数目。\n";
    private String str394 =
            "       在现场每晚放鼠夹100只以上，翌晨收齐所投鼠夹，计数捕获鼠数，折算成每100只夹的鼠数即为鼠密度。";


    private final static NatureMonitorRepository nature = new NatureMonitorRepository();
    public static NatureMonitorRepository getInstance() {
        return nature;
    }

    // 获取子类分组
    public List<OneLevelEntity> getOneLevelData() {
        List<OneLevelEntity> mList = new ArrayList<>();
        OneLevelEntity oneLevelEntity = new OneLevelEntity(
                FileTagEnum.NATURE_MONITOR,
                FileTagEnum.MIE_MONITOR);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.NATURE_MONITOR,
                FileTagEnum.WORK_USE);
        mList.add(oneLevelEntity);
        // 新增饮用水
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.NATURE_MONITOR,
                FileTagEnum.WATER_USE_FUNCTION);
        mList.add(oneLevelEntity);
//        oneLevelEntity = new OneLevelEntity(FileTagEnum.WORK_USE.getTitleMessage(),
//                FileTagEnum.NATURE_MONITOR.getTag(),
//                FileTagEnum.WORK_USE.getTag(),
//                FileTagEnum.WORK_USE.getTag());
//        mList.add(oneLevelEntity);
        return mList;
    }

    // 获取二级子类分组
    public List<SecondLevelEntity> getSecondLevelData(int tag) {
        List<SecondLevelEntity> mList = new ArrayList<>();
        if (tag == 259) {
            SecondLevelEntity secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.MIE_MONITOR,
                    FileTagEnum.MIE_MONITOR1);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.MIE_MONITOR,
                    FileTagEnum.MIE_MONITOR2);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.MIE_MONITOR,
                    FileTagEnum.MIE_MONITOR3);
            mList.add(secondLevelEntity);
        } else if (tag == 260) {
            SecondLevelEntity secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.WORK_USE,
                    FileTagEnum.WORK_USE1);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.WORK_USE,
                    FileTagEnum.WORK_USE2);
            mList.add(secondLevelEntity);
        } else if (tag == 261) {
            SecondLevelEntity secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.MIE_MONITOR1,
                    FileTagEnum.FUNCTION1);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.MIE_MONITOR1,
                    FileTagEnum.FUNCTION2);
            mList.add(secondLevelEntity);
        } else if (tag == 262) {
            SecondLevelEntity secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.MIE_MONITOR2,
                    FileTagEnum.FUNCTION3);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.MIE_MONITOR2,
                    FileTagEnum.FUNCTION4);
            mList.add(secondLevelEntity);
        } else if (tag == 263) {
            SecondLevelEntity secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.MIE_MONITOR3,
                    FileTagEnum.FUNCTION5);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.MIE_MONITOR3,
                    FileTagEnum.FUNCTION6);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.MIE_MONITOR3,
                    FileTagEnum.FUNCTION7);
            mList.add(secondLevelEntity);
        }
        return mList;
    }

    // 获取三级子页面的数据
    public String getThreeLevelData(int tag) {
        String str = "敬请期待";
        switch (tag) {
            case 264:
                str = str264;
                break;
            case 265:
                str = str265;
                break;
            case 388:
                str = str388;
                break;
            case 389:
                str = str389;
                break;
            case 390:
                str = str390;
                break;
            case 391:
                str = str391;
                break;
            case 392:
                str = str392;
                break;
            case 393:
                str = str393;
                break;
            case 394:
                str = str394;
                break;

        }
        return str;
    }
}
