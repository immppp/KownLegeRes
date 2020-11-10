package cn.imppp.knowlege.factory;

import java.util.ArrayList;
import java.util.List;

import cn.imppp.knowlege.constant.Constant;
import cn.imppp.knowlege.entity.OneLevelEntity;
import cn.imppp.knowlege.entity.SecondLevelEntity;
import cn.imppp.knowlege.repository.check.CheckRepository;
import cn.imppp.knowlege.repository.collect.CollectRepository;
import cn.imppp.knowlege.repository.control.ControlRepository;
import cn.imppp.knowlege.repository.control.ControlRepository2;
import cn.imppp.knowlege.repository.disease.DiseaseRepository;
import cn.imppp.knowlege.repository.duty.DutyRepository;
import cn.imppp.knowlege.repository.food.FoodRepository;
import cn.imppp.knowlege.repository.function.KeepFunctionRepository;
import cn.imppp.knowlege.repository.hideEvent.HideEventRepository;
import cn.imppp.knowlege.repository.killVirus.KillVirusRepository;
import cn.imppp.knowlege.repository.medicine.MedicineRepository;
import cn.imppp.knowlege.repository.natureMonitor.NatureMonitorRepository;
import cn.imppp.knowlege.repository.openVirus.OpenVirusRepository;
import cn.imppp.knowlege.repository.prepare.PrePareRepository;
import cn.imppp.knowlege.repository.reasonStep.ReasonStepRepository;
import cn.imppp.knowlege.repository.report.ReportRepository;
import cn.imppp.knowlege.repository.rule.RuleRepository;
import cn.imppp.knowlege.repository.socal.SocalDealRepository;
import cn.imppp.knowlege.repository.study.StudyRepository;
import cn.imppp.knowlege.repository.time.TimeRepository;
import cn.imppp.knowlege.repository.water.WaterRepository;
import cn.imppp.knowlege.repository.wen.WenRepository;

public class RevertListAndTextContentFactory {
    private final static RevertListAndTextContentFactory instant = new RevertListAndTextContentFactory();

    public static RevertListAndTextContentFactory getInstance() {
        return instant;
    }

    // 获取一级集合
    public List<String> getOneLevelList(int tag) {
        List<String> list = new ArrayList<>();
        switch (tag) {
            case 3:
                list.add("      各业务科所负责做好现场调查与处置的常规准备工作。包括:");
                list.add("调查表格" + Constant.SPLITE_TAG + "笔记本电脑与储存设备");
                list.add("采样用品用具" + Constant.SPLITE_TAG + "检测设备与试剂");
                list.add("相关技术方案及规范" + Constant.SPLITE_TAG + "参考书籍与资料等");
                break;
            case 39:
                list.add("      到达疫区（灾区）后要主动取得当地政府、爱卫部门合作和相关人员的配合。每天出发前，应检查所需消杀器械、用具、消毒剂、杀虫灭鼠剂是否带足、好用。");
                list.add("防护用品：");
                list.add("穿防护服(或隔离服)" + Constant.SPLITE_TAG + "胶鞋");
                list.add("戴口罩" + Constant.SPLITE_TAG + "帽子");
                list.add("防护眼镜" + Constant.SPLITE_TAG + " ");
                list.add("      应尽量选择对媒介生物杀灭作用快的卫生杀虫剂。采用毒饵灭鼠必须对人、畜安全。同时必须正确掌握使用浓度，尽量减少环境污染.");
                break;
            case 316:
                list.add("（一）帐篷:");
                list.add("工作帐篷" + Constant.SPLITE_TAG + "生活帐篷");
                list.add("厕所帐篷" + Constant.SPLITE_TAG + " ");
                list.add("（二）饮用水及净化设备;");
                list.add("（三）食品；");
                list.add("（四）日常生活用品：");
                list.add("水壶" + Constant.SPLITE_TAG + "一次性筷子和饭盒");
                list.add("洗漱用品" + Constant.SPLITE_TAG + "N条短裤和文化衫");
                list.add("防潮垫等" + Constant.SPLITE_TAG + " ");
                list.add("（五）个人卫生用品:");
                list.add("酒精棉球" + Constant.SPLITE_TAG + "湿纸巾");
                list.add("手消毒剂" + Constant.SPLITE_TAG + "护手霜");
                list.add("风油精" + Constant.SPLITE_TAG + "创口贴及防治药品");
                list.add("（六）工具设备：");
                list.add("剪刀" + Constant.SPLITE_TAG + "斧子");
                list.add("铁丝" + Constant.SPLITE_TAG + "尼龙绳");
                list.add("折叠梯等" + Constant.SPLITE_TAG + " ");
                list.add("（七）消杀用品：");
                list.add("三氯异氰尿酸泡腾片" + Constant.SPLITE_TAG + "漂精片");
                list.add("乙醇类快速手消毒液和碘伏制剂" + Constant.SPLITE_TAG + "双长链季铵盐类消毒剂等");
                break;
            case 317:
                list.add("医用工作帽" + Constant.SPLITE_TAG + "医用工作服/隔离衣");
                list.add("医用外科口罩" + Constant.SPLITE_TAG + "医用乳胶手套");
                break;
            case 318:
                list.add("杜邦连体防护服" + Constant.SPLITE_TAG + "医用防护口罩（3M1860）");
                list.add("防护眼罩/面罩" + Constant.SPLITE_TAG + "医用乳胶手套");
                list.add("防护鞋" + Constant.SPLITE_TAG + " ");
                break;
            case 430:
//                list.add("      应急物资管理部门按照事件的种类和防护分级准备。呼吸道传染病防护用品、自然疫源性传染病防护用品、台风洪涝灾害防护用品清单参考如下：");
//                list.add("1、呼吸道传染病防护用品：");
                list.add("污物袋" + Constant.SPLITE_TAG + "白大衣");
                list.add("长筒胶靴" + Constant.SPLITE_TAG + "防护脚套");
                list.add("泡腾消毒片" + Constant.SPLITE_TAG + "乳胶手套");
                list.add("医用防护口罩" + Constant.SPLITE_TAG + "医用外科口罩");
                list.add("防护面罩/眼镜" + Constant.SPLITE_TAG + "薄型塑料鞋套");
                list.add("双链季铵盐消毒液" + Constant.SPLITE_TAG + "长筒加厚手套");
                list.add("一次性无菌帽子" + Constant.SPLITE_TAG + "杜邦特卫强防护服");
                list.add("空气微生物采样箱" + Constant.SPLITE_TAG + "电动超低容量喷雾器");
                break;
            case 431:
                list.add("三角巾" + Constant.SPLITE_TAG + "白大衣");
                list.add("防蚤袜" + Constant.SPLITE_TAG + "污物袋");
                list.add("防护脚套" + Constant.SPLITE_TAG + "乳胶手套");
                list.add("防护眼镜" + Constant.SPLITE_TAG + "长筒胶靴");
                list.add("一次性口罩" + Constant.SPLITE_TAG + "医用防护口罩");
                list.add("纱布口罩（16层）" + Constant.SPLITE_TAG + "一次性无菌帽子");
                list.add("长筒加厚手套" + Constant.SPLITE_TAG + "薄型塑料鞋套");
                list.add("消毒杀虫器材箱" + Constant.SPLITE_TAG + "杜邦特卫强防护服");
                break;
            case 432:
                list.add("雨靴" + Constant.SPLITE_TAG + "雨衣");
                list.add("应急灯" + Constant.SPLITE_TAG + "应急箱");
                list.add("白大衣" + Constant.SPLITE_TAG + "污物袋");
                list.add("乳胶手套" + Constant.SPLITE_TAG + "余氯比色计");
                list.add("长筒加厚手套" + Constant.SPLITE_TAG + "ATP荧光监测仪等");
                break;
        }
        return list;
    }


}
