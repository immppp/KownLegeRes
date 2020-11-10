package cn.imppp.knowlege.repository.duty;

import java.util.ArrayList;
import java.util.List;

public class DutyRepository {

    public static DutyRepository dutyRepository = new DutyRepository();

    public static DutyRepository getInstance() {
        return dutyRepository;
    }

    public List<String> getMessage() {
        List<String> list = new ArrayList<>();
        list.add("      (1)、积极参加相关业务知识与技能培训、演练，及时更新专业知识与技能，不断提高应对突发公共卫生事件的能力，随时做好应急准备。");
        list.add("      (2)、接到应急处置任务后，携带工作所需的装备、设备和资料，及时出发赶赴现场。");
        list.add("      (3)、开展流行病学调查。对病例及其密切接触者进行全面调查。根据需要分别进行隔离、留验医学观察和健康随访；对传染源、危害源、传播或危害途径以及事件特征进行调查，分析推断流行病学病因，预测事态发展或流行趋势，采取针对性的现场应急控制措施。");
        list.add("      (4)、根据需要及时采集足量、足够的生物与环境标本。尽快开展现场快速检测与实验室应急检测，查明病原学病因。");
        list.add("      (5)、根据事件规模和危害程度，确定和指导落实疫点、疫区处理，提出防控策略与措施，控制疫情或事态的蔓延和扩散。");
        list.add("      (6)、对事件影响范围、危害程度、防控措施效果等进行现场评估；对事件的处置情况进行综合评估。");
        list.add("      (7)、为下级疾病预防控制中心或相关业务人员提供技术指导和业务培训；解决技术上的疑难问题。");
        list.add("      (8)、做好信息报告工作。在现场应急处置期间，及时记录工作情况，并根据情况撰写进程报告，现场调查工作结束后3天内完成“现场调查总结报告”，进程报告和总结报告均及时上报有关领导，同时抄送中心应急管理部门。重大事件随时报告，并且每天至少上报1次书面进程报告。");
        list.add("      (9)、应急小分队员承担节假日应急值班任务。");
        return list;
    }

    public String getMessage2() {

        String str =
                "       (1)、积极参加相关业务知识与技能培训、演练，及时更新专业知识与技能，不断提高应对突发公共卫生事件的能力，随时做好应急准备。\n" +
                "       (2)、接到应急处置任务后，携带工作所需的装备、设备和资料，及时出发赶赴现场。\n" +
                "       (3)、开展流行病学调查。对病例及其密切接触者进行全面调查。根据需要分别进行隔离、留验医学观察和健康随访；对传染源、危害源、传播或危害途径以及事件特征进行调查，分析推断流行病学病因，预测事态发展或流行趋势，采取针对性的现场应急控制措施。\n" +
                "       (4)、根据需要及时采集足量、足够的生物与环境标本。尽快开展现场快速检测与实验室应急检测，查明病原学病因。\n" +
                "       (5)、根据事件规模和危害程度，确定和指导落实疫点、疫区处理，提出防控策略与措施，控制疫情或事态的蔓延和扩散。\n"+
                "       (6)、对事件影响范围、危害程度、防控措施效果等进行现场评估；对事件的处置情况进行综合评估。\n"+
                "       (7)、为下级疾病预防控制中心或相关业务人员提供技术指导和业务培训；解决技术上的疑难问题。\n"+
                "       (8)、做好信息报告工作。在现场应急处置期间，及时记录工作情况，并根据情况撰写进程报告，现场调查工作结束后3天内完成“现场调查总结报告”，进程报告和总结报告均及时上报有关领导，同时抄送中心应急管理部门。重大事件随时报告，并且每天至少上报1次书面进程报告。\n"+
                "       (9)、应急小分队员承担节假日应急值班任务。";
        return str;
    }

}
