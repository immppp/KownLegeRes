package cn.imppp.knowlege.factory;

import java.util.ArrayList;
import java.util.List;

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

public class RevertContentFactory {
    private final static RevertContentFactory instant = new RevertContentFactory();

    public static RevertContentFactory getInstance() {
        return instant;
    }

    // 获取一级集合
    public List<OneLevelEntity> getOneLevelList(int tag) {
        List<OneLevelEntity> list = new ArrayList<>();
        switch (tag) {
            case 1:
                list = PrePareRepository.getInstance().getOneLevelData();
                break;
            case 8:
                list = DiseaseRepository.getInstance().getOneLevelData();
                break;
            case 19:
                list = SocalDealRepository.getInstance().getOneLevelData();
                break;
            case 52:
                list = ControlRepository2.getInstance().getOneLevelData();
                break;
            case 53:
                list = ReportRepository.getInstance().getOneLevelData();
                break;
            case 74:
                list = RuleRepository.getInstance().getOneLevelData();
                break;
            case 111:
                list = TimeRepository.getInstance().getOneLevelData();
                break;
            case 146:
                list = StudyRepository.getInstance().getOneLevelData();
                break;
            case 184:
                list = CheckRepository.getInstance().getOneLevelData();
                break;
            case 211:
                list = CollectRepository.getInstance().getOneLevelData();
                break;
            case 221:
                list = FoodRepository.getInstance().getOneLevelData();
                break;
            case 227:
                list = WaterRepository.getInstance().getOneLevelData();
                break;
            case 241:
                list = KillVirusRepository.getInstance().getOneLevelData();
                break;
            case 258:
                list = NatureMonitorRepository.getInstance().getOneLevelData();
                break;
            case 266:
                list = OpenVirusRepository.getInstance().getOneLevelData();
                break;
            case 295:
                list = KeepFunctionRepository.getInstance().getOneLevelData();
                break;
            case 312:
                list = HideEventRepository.getInstance().getOneLevelData();
                break;
            case 34:
                list = ControlRepository.getInstance().getOneLevelData();
                break;
            case 10086:
                list = WenRepository.getInstance().getOneLevelData();
                break;
            case 326:
                list = MedicineRepository.getInstance().getOneLevelData1();
                break;
            case 331:
                list = MedicineRepository.getInstance().getOneLevelData2();
                break;
            case 333:
                list = MedicineRepository.getInstance().getOneLevelData3();
                break;
            case 405:
                list = ReasonStepRepository.getInstance().getOneLevelData();
                break;
        }
        return list;
    }

    // 获取第二级list
    public List<SecondLevelEntity> getSecondLevelList(int Tag) {
        List<SecondLevelEntity> list = new ArrayList<>();
        if (Tag < 8) {
            list = PrePareRepository.getInstance().getSecondLevelData(Tag);
        } else if (Tag < 34) {
            list = SocalDealRepository.getInstance().getSecondLevelData(Tag);
        } else if (Tag < 53) {
            list = ControlRepository.getInstance().getSecondLevelData(Tag);
        } else if (Tag < 73) {
            list = ReportRepository.getInstance().getSecondLevelData(Tag);
        } else if (Tag < 111) {
            list = RuleRepository.getInstance().getSecondLevelData(Tag);
        } else if (Tag < 146) {
            list = TimeRepository.getInstance().getSecondLevelData(Tag);
        } else if (Tag < 184) {
            list = StudyRepository.getInstance().getSecondLevelData(Tag);
        } else if (Tag < 211) {
            list = CheckRepository.getInstance().getSecondLevelData(Tag);
        } else if (Tag < 241) {
            list = WaterRepository.getInstance().getSecondLevelData(Tag);
        } else if (Tag < 266) {
            list = NatureMonitorRepository.getInstance().getSecondLevelData(Tag);
        } else if (Tag < 295) {
            list = OpenVirusRepository.getInstance().getSecondLevelData(Tag);
        } else if (Tag < 322) {
            list = HideEventRepository.getInstance().getSecondLevelData(Tag);
        } else if (Tag < 334) {
            list = WenRepository.getInstance().getSecondLevelData(Tag);
        } else if (Tag < 366) {
            list = MedicineRepository.getInstance().getSecondLevelData(Tag);
        } else if (Tag < 379) {
            list = ControlRepository2.getInstance().getSecondLevelData(Tag);
        } else if (Tag < 419) {
            list = ReasonStepRepository.getInstance().getSecondLevelData(Tag);
        }
        return list;
    }

    // 获取第三级内容
    public String getThreeLevelList(int tag) {
        if (tag == 12306) {
            return DutyRepository.getInstance().getMessage2();
        }

        String str = "敬请期待";
        if (tag < 8) {
            str = PrePareRepository.getInstance().getThreeLevelData(tag);
        } else if (tag < 19) {
            str = DiseaseRepository.getInstance().getThreeLevelData(tag);
        } else if (tag < 34) {
            str = SocalDealRepository.getInstance().getThreeLevelData(tag);
        } else if (tag < 53) {
            str = ControlRepository.getInstance().getThreeLevelData(tag);
        } else if (tag < 73) {
            str = ReportRepository.getInstance().getThreeLevelData(tag);
        } else if (tag < 111) {
            str = RuleRepository.getInstance().getThreeLevelData(tag);
        } else if (tag < 146) {
            str = TimeRepository.getInstance().getThreeLevelData(tag);
        } else if (tag < 184) {
            str = StudyRepository.getInstance().getThreeLevelData(tag);
        } else if (tag < 211) {
            str = CheckRepository.getInstance().getThreeLevelData(tag);
        } else if (tag < 221) {
            str = CollectRepository.getInstance().getThreeLevelData(tag);
        } else if (tag < 227) {
            str = FoodRepository.getInstance().getThreeLevelData(tag);
        } else if (tag < 241) {
            str = WaterRepository.getInstance().getThreeLevelData(tag);
        } else if (tag < 258) {
            str = KillVirusRepository.getInstance().getThreeLevelData(tag);
        } else if (tag < 266) {
            str = NatureMonitorRepository.getInstance().getThreeLevelData(tag);
        } else if (tag < 295) {
            str = OpenVirusRepository.getInstance().getThreeLevelData(tag);
        } else if (tag < 312) {
            str = KeepFunctionRepository.getInstance().getThreeLevelData(tag);
        } else if (tag < 322) {
            str = HideEventRepository.getInstance().getThreeLevelData(tag);
        } else if (tag < 334) {
            str = WenRepository.getInstance().getThreeLevelData(tag);
        } else if (tag < 366) {
            str = MedicineRepository.getInstance().getThreeLevelData(tag);
        } else if (tag < 379) {
            str = ControlRepository2.getInstance().getThreeLevelData(tag);
        } else if (tag < 388) {
            str = StudyRepository.getInstance().getThreeLevelData(tag);
        } else if (tag < 395) {
            str = NatureMonitorRepository.getInstance().getThreeLevelData(tag);
        } else if (tag < 419) {
            str = ReasonStepRepository.getInstance().getThreeLevelData(tag);
        }
        return str;
    }

}
