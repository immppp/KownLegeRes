package cn.imppp.knowlege.repository.report;

import java.util.ArrayList;
import java.util.List;

import cn.imppp.knowlege.constant.FileTagEnum;
import cn.imppp.knowlege.entity.OneLevelEntity;
import cn.imppp.knowlege.entity.SecondLevelEntity;

public class ReportRepository {
    private String str56 =
            "       标题是报告的高度概括。标题应具备准确性、简洁性和鲜明性。一般都用“关于”和表达主要内容的词组组成介词结构。例如：关于XXXX的调查报告。";
    private String str57 =
            "       简述事件的信息来源、发生经过和处置情况。一般在200字左右。";
    private String str58 =
            "       简述事件发生地的地理位置、环境、气候条件、人口构成状况、社会经济状况、卫生服务机构、平时疾病流行情况或历史上该疾病在该地区流行状况、该地区有关的预防接种情况等。重点说明与事件性质和原因有关的各种本底情况。 如虫媒传染病应说明媒介虫种的种群、密度与变化情况。";
    private String str59 =
            "       阐述病例定义及检索。将获得的病例资料采用描述性流行病学的方法，描述事件的总发病数、发病率、死亡数和死亡率等，以及事件的波及范围；描述发病的时间分布、地点分布和人群分布，尤其要用相对数来进行描述，尽可能用图表来表示，以求简单明了。时间分布可以按年、月、周、日、时、分来描述，通常用直条图来表示。对于地区分布的描述，可以根据具体情况来确定。可以通过行政区划、地理条件、学校（厂矿）、班级（车间）等病例分布来描述。人群分布常用年龄分布、性别分布、职业分布来描述。";
    private String str60 =
            "       描述病人的临床症状和体征，临床上的分型及其特点，各种临床辅助检查的结果；主要诊断依据；如果疾病无公认的诊断标准（如新发传染病和不明原因疾病），应列出病例定义和分级定义。";
    private String str61 =
            "       用分析流行病学调查方法（病例对照研究和队列研究）对调查结果进行分析，计算关联强度、剂量—反应关系等指标；描述标本的采集和检测结果（包括阳性和阴性结果）；再综合流行病学分布特点、干预效应等进行病因分析和推断以确定病因；对该事件作出可能的结论判断，及排除其它的理由。";
    private String str62 =
            "       描述各种技术措施的落实过程情况，采取措施的时间、范围和对象等。选择过程性指标进行描述，如疫苗接种率、传染源的隔离率等。\n" +
            "       防制措施实施后，应对其效果作出评价，反过来也是验证调查分析是否正确。控制措施评价的重要内容之一是有无续发病例，或有无新的疫区出现。如果发生续发病例，说明其防制措施的效果不佳或贯彻不力，也可能是调查分析不正确，需要继续完善调查内容和修正控制措施，以便尽快控制突发公共卫生事件的扩散。要分开描述已采取的防制措施和即将采取的防制措施。";
    private String str63 =
            "       根据该起突发事件的病因调查和控制实践经验，提出防止类似事件发生的建议。";
    private String str64 =
            "       如果整个调查控制比较复杂，可将主要情况进行摘要小结。";
    private String str65 =
            "       在整个报告的结尾，应写明报告单位的全称，加盖公章，并用汉字写上报告发文的具体时间。";
    private String str66 =
            "       同业务总结调查报告的标题要求。";
    private String str67 =
            "       说明突发公共卫生事件发生的简单经过，包括该起突发公共卫生事件发生的接报与上报情况。\n" +
            "       并说明这是一项什么样的调查工作；\n" +
            "       工作进行的地点和日期；\n" +
            "       主要做了哪些事；工作的主要结果（少数主要的）；\n" +
            "       总的评价（完成任务、基本完成任务、未能完成及其原因）。";
    private String str68 =
            "       简单描述调查处理的经过。包括听取基层汇报，召开会议研究布署调查处理措施，本级负责该事件应急处理人员的组成，调查、采样与检测中获得的各项信息等。";
    private String str69 =
            "       说明针对该起事件目前已采取的控制措施，并评价这些措施对控制事件发展的效果。";
    private String str70 =
            "       根据调查结果、流行因素分析及措施评价后得出的结论，分析预测该突发公共卫生事件的发展趋势。";
    private String str71 =
            "       根据调查结论及措施评价，对已采取的措施进行进一步修正或补充，提出下一步工作建议。包括进一步调查研究的建议和尚需解决的问题的对策与方法等。";
    private String str72 =
            "       在整个报告的结尾，应写明报告单位的全称，加盖公章，并用汉字写上报告发文的具体时间。";

    private final static ReportRepository report = new ReportRepository();
    public static ReportRepository getInstance() {
        return report;
    }

    // 获取子类分组
    public List<OneLevelEntity> getOneLevelData() {
        List<OneLevelEntity> mList = new ArrayList<>();
        OneLevelEntity oneLevelEntity = new OneLevelEntity(
                FileTagEnum.REPORT_WRITING,
                FileTagEnum.WORK_REPORT);
        mList.add(oneLevelEntity);
        oneLevelEntity = new OneLevelEntity(
                FileTagEnum.REPORT_WRITING,
                FileTagEnum.GOVERMENT_REPORT);
        mList.add(oneLevelEntity);
        return mList;
    }

    // 获取二级子类分组
    public List<SecondLevelEntity> getSecondLevelData(int tag) {
        List<SecondLevelEntity> mList = new ArrayList<>();
        if (tag == 54) {
            SecondLevelEntity secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.WORK_REPORT,
                    FileTagEnum.WORK_REPORT1);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.WORK_REPORT,
                    FileTagEnum.WORK_REPORT2);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.WORK_REPORT,
                    FileTagEnum.WORK_REPORT3);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.WORK_REPORT,
                    FileTagEnum.WORK_REPORT4);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.WORK_REPORT,
                    FileTagEnum.WORK_REPORT5);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.WORK_REPORT,
                    FileTagEnum.WORK_REPORT6);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.WORK_REPORT,
                    FileTagEnum.WORK_REPORT7);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.WORK_REPORT,
                    FileTagEnum.WORK_REPORT8);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.WORK_REPORT,
                    FileTagEnum.WORK_REPORT9);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.WORK_REPORT,
                    FileTagEnum.WORK_REPORT10);
            mList.add(secondLevelEntity);

        } else if (tag == 55) {
            SecondLevelEntity secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.GOVERMENT_REPORT,
                    FileTagEnum.GOVERMENT_REPORT1);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.GOVERMENT_REPORT,
                    FileTagEnum.GOVERMENT_REPORT2);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.GOVERMENT_REPORT,
                    FileTagEnum.GOVERMENT_REPORT3);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.GOVERMENT_REPORT,
                    FileTagEnum.GOVERMENT_REPORT4);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.GOVERMENT_REPORT,
                    FileTagEnum.GOVERMENT_REPORT5);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.GOVERMENT_REPORT,
                    FileTagEnum.GOVERMENT_REPORT6);
            mList.add(secondLevelEntity);
            secondLevelEntity = new SecondLevelEntity(
                    FileTagEnum.GOVERMENT_REPORT,
                    FileTagEnum.GOVERMENT_REPORT7);
            mList.add(secondLevelEntity);
        }
        return mList;
    }

    // 获取三级子页面的数据
    public String getThreeLevelData(int tag) {
        String str = "敬请期待";
        switch (tag) {
            case 56:
                str = str56;
                break;
            case 57:
                str = str57;
                break;
            case 58:
                str = str58;
                break;
            case 59:
                str = str59;
                break;
            case 60:
                str = str60;
                break;
            case 61:
                str = str61;
                break;
            case 62:
                str = str62;
                break;
            case 63:
                str = str63;
                break;
            case 64:
                str = str64;
                break;
            case 65:
                str = str65;
                break;
            case 66:
                str = str66;
                break;
            case 67:
                str = str67;
                break;
            case 68:
                str = str68;
                break;
            case 69:
                str = str69;
                break;
            case 70:
                str = str70;
                break;
            case 71:
                str = str71;
                break;
            case 72:
                str = str72;
                break;
        }
        return str;
    }

}
