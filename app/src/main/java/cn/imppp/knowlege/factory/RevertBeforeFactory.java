package cn.imppp.knowlege.factory;

import cn.imppp.knowlege.constant.FileTagEnum;

/**
 * @ClassName: RevertBeforeFactory
 * @Author: qaq
 * @Description: 获取上一级的tag
 * @Date: 2020/11/13 8:52 AM
 * @Company: 杭州达恒科技
 * @Version: 1.0
 */

public class RevertBeforeFactory {

    private final static RevertBeforeFactory before = new RevertBeforeFactory();

    public static RevertBeforeFactory getInstance() {
        return before;
    }

    // 获取上一级的标签
    public int getBeforeTag(int currentTag) {
        int tag = -10;

        if (currentTag <= 7 && currentTag > 0) {
            // 出发准备部分内容
            if (currentTag == 1) {
                return tag;
            }
            if (currentTag <= 4) {
                return FileTagEnum.PREPARE_TAG.getTag();
            } else {
                return FileTagEnum.THINGS_PREPARE.getTag();
            }
        } else if (currentTag >= 430 && currentTag <= 432) {
            // 出发准备部分内容
            return FileTagEnum.THINGS_PREPARE_FLAG3.getTag();
        } else if (currentTag >= 8 && currentTag <= 18) {
            // 流行病调查
            if (currentTag == 8) {
                return tag;
            } else {
                return FileTagEnum.DISEASE_QUERY.getTag();
            }
        }  else if (currentTag >= 19 && currentTag <= 33) {
            // 群体性不明原因疾病现场调查处置要点
            if (currentTag == 19) {
                return tag;
            } else if (currentTag <= 23) {
                return FileTagEnum.SOCIAL_DEAL.getTag();
            } else if (currentTag <= 28) {
                return FileTagEnum.SOCIAL_ANY.getTag();
            } else if (currentTag <= 30) {
                return FileTagEnum.SOCIAL_CHECK.getTag();
            } else {
                return FileTagEnum.SOCIAL_CONTROL.getTag();
            }
        } else if (currentTag >= 312 && currentTag <= 321) {
            if (currentTag == 312) {
                return tag;
            } else if (currentTag <= 316) {
                return FileTagEnum.HIDDEN_EVENT.getTag();
            } else if (currentTag <= 319) {
                return FileTagEnum.HU_XI.getTag();
            } else {
                return FileTagEnum.CANG_DAO.getTag();
            }
        } else if (currentTag >= 295 && currentTag <= 311) {
            // 疫苗免疫程序
            if (currentTag == 295) {
                return tag;
            } else {
                return FileTagEnum.KEEP_FUNCTION.getTag();
            }
        } else if (currentTag >= 53 && currentTag <= 72) {
            // 调查总结报告的撰写
            if (currentTag == 53) {
                return tag;
            } else if (currentTag <= 55) {
                return FileTagEnum.REPORT_WRITING.getTag();
            } else if (currentTag <= 65) {
                return FileTagEnum.WORK_REPORT.getTag();
            } else {
                return FileTagEnum.GOVERMENT_REPORT.getTag();
            }
        } else if (currentTag == -1) {
            // 应急相关工具包
            return tag;
        } else if (currentTag >= 74 && currentTag <= 110) {
            // 突发公共安全事件相关信息报告范围与标准
            if (currentTag == 74) {
                return -1;
            } else if (currentTag <= 85) {
                return FileTagEnum.EVENT_RULE.getTag();
            } else {
                return FileTagEnum.RECURSION_EVENT.getTag();
            }
        } else if (currentTag >= 111 && currentTag <= 145) {
            // 几种急性传染病的潜伏期、隔离期与接触者观察期
            if (currentTag == 111) {
                return -1;
            } else if (currentTag <= 136) {
                return FileTagEnum.STATE_TIME.getTag();
            } else if (currentTag <= 141) {
                return FileTagEnum.CANCER_DISEASE.getTag();
            } else if (currentTag <= 143) {
                return FileTagEnum.FU_SHANG.getTag();
            } else {
                return FileTagEnum.SHU_YI.getTag();
            }
        } else if (currentTag >= 405 && currentTag <= 418) {
            // 从临床症状入手寻找病因线索的步骤
            if (currentTag == 405) {
                return -1;
            } else if (currentTag <= 407) {
                return FileTagEnum.REASON_STEP.getTag();
            } else if (currentTag >= 412 && currentTag <= 414) {
                return FileTagEnum.QUICK_DISEASE.getTag();
            } else if (currentTag >= 409 && currentTag <= 411) {
                return FileTagEnum.QUICK_NO_DISEASE.getTag();
            } else if (currentTag >= 415 && currentTag <= 416) {
                return FileTagEnum.QUICK_NO_DISEASE2.getTag();
            } else {
                return FileTagEnum.QUICK_NO_DISEASE3.getTag();
            }
        } else if (currentTag >= 146 && currentTag <= 183) {
            // 临床综合征划分的疾病特征
            if (currentTag == 146) {
                return -1;
            } else if (currentTag <= 155) {
                return FileTagEnum.STUDY_DISEASE.getTag();
            } else if (currentTag <= 157) {
                return FileTagEnum.STUDY_DISEASE1.getTag();
            } else if (currentTag <= 160) {
                return FileTagEnum.STUDY_DISEASE2.getTag();
            } else if (currentTag <= 164) {
                return FileTagEnum.STUDY_DISEASE3.getTag();
            } else if (currentTag <= 166) {
                return FileTagEnum.STUDY_DISEASE4.getTag();
            } else if (currentTag <= 170)  {
                return FileTagEnum.STUDY_DISEASE5.getTag();
            } else if (currentTag <= 172) {
                return FileTagEnum.STUDY_DISEASE6.getTag();
            } else if (currentTag <= 175) {
                return FileTagEnum.STUDY_DISEASE7.getTag();
            } else {    // todo 有个黄疸的bug
                return FileTagEnum.STUDY_DISEASE9.getTag();
            }
        } else if (currentTag >= 184 && currentTag <= 210) {
            // 急性不明原因中毒相关体征的甄别
            if (currentTag == 184) {
                return -1;
            } else if (currentTag <= 187) {
                return FileTagEnum.CHECK_DRUGS.getTag();
            } else if (currentTag <= 200) {
                return FileTagEnum.SMELL_WRONG.getTag();
            } else if (currentTag <= 204) {
                return FileTagEnum.DUO_HAN.getTag();
            } else {
                return FileTagEnum.SKIN_COLOR.getTag();
            }
        } else if (currentTag >= 211 && currentTag <= 220) {
            // 不明原因疾病样本采集表
            if (currentTag == 211) {
                return -1;
            } else {
                return FileTagEnum.COLLECT_TABLE.getTag();
            }
        } else if (currentTag >= 221 && currentTag <= 226) {
            // 各类食物中毒特点及处理要点
            if (currentTag == 221) {
                return -1;
            } else {
                return FileTagEnum.FOOD_DRUGS_DEAL.getTag();
            }
        } else if (currentTag >= 266 && currentTag <= 294) {
            // 化学中毒常用解毒剂
            if (currentTag == 266) {
                return tag;
            } else if (currentTag <= 271){
                return FileTagEnum.OPEN_VIRUS.getTag();
            } else if (currentTag <= 276) {
                return FileTagEnum.QING_VIRUS.getTag();
            } else if (currentTag <= 287) {
                return FileTagEnum.JIN_SHU_VITUS.getTag();
            } else if (currentTag <= 290) {
                return FileTagEnum.LIN_VIRUS.getTag();
            } else if (currentTag == 291){
                return FileTagEnum.BEN_VIRUS.getTag();
            } else {
                return FileTagEnum.MOUSE_VIRUS.getTag();
            }
        } else if (currentTag == 0) {
            // 自然灾害后灾区病媒生物监测与评价
            return tag;
        } else if (currentTag >= 259 && currentTag <= 265) {
            // 自然灾害后灾区病媒生物监测和测评
            if (currentTag <= 260) {
                return 0;
            } else if (currentTag <= 263) {
                return FileTagEnum.MIE_MONITOR.getTag();
            } else {
                return FileTagEnum.WORK_USE.getTag();
            }
        } else if (currentTag >= 388 && currentTag <= 394) {
            // 密度检测
            if (currentTag <= 389) {
                return FileTagEnum.MIE_MONITOR1.getTag();
            } else if (currentTag <= 391) {
                return FileTagEnum.MIE_MONITOR2.getTag();
            } else {
                return FileTagEnum.MIE_MONITOR3.getTag();
            }
        } else if (currentTag >= 227 && currentTag <= 240) {
            // 灾区饮用水水源选择、保护及消毒方法
            if (currentTag == 227) {
                return 0;
            } else if (currentTag <= 234) {
                return FileTagEnum.WATER_USE_FUNCTION.getTag();
            } else if (currentTag <= 236) {
                return FileTagEnum.KEEP_WATER.getTag();
            } else {
                return FileTagEnum.DEAL_WATER.getTag();
            }
        } else if (currentTag >= 241 && currentTag <= 257) {
            // 传染病防控现场消毒方法
            if (currentTag == 241) {
                return 0;
            } else {
                return FileTagEnum.KILL_VIRUS.getTag();
            }
        }  else if (currentTag >= 34 && currentTag <= 52) {
            // 病媒生物应急控制要点
            if (currentTag == 34) {
                return tag;
            } else if (currentTag <= 38) {
                return FileTagEnum.CRITICAL_CONTROL.getTag();
            } else if (currentTag <= 41) {
                return FileTagEnum.CRITICAL_BASE_REQUIRE.getTag();
            } else if (currentTag <= 48) {
                return FileTagEnum.CRITICAL_MOUSE_DEAL.getTag();
            } else if (currentTag <= 50) {
                return FileTagEnum.CRITICAL_WEN_DEAL.getTag();
            } else {
                return FileTagEnum.CRITICAL_YING_DEAL.getTag();
            }
        } else if (currentTag == 10086) {
            // 病媒生物应急控制要点
            return FileTagEnum.CRITICAL_WEN_DEAL.getTag();
        } else if (currentTag >= 322 && currentTag <= 333) {
            if (currentTag <= 324) {
                return FileTagEnum.CRITICAL_WEN_DEAL3.getTag();
            } else if (currentTag <= 326) {
                return FileTagEnum.WEN_CONTROL1.getTag();
            } else {
                return FileTagEnum.WEN_CONTROL2.getTag();
            }
        } else if (currentTag >= 334 && currentTag <= 365) {
            if (currentTag <= 339) {
                return FileTagEnum.WEN_CONTROL1_2.getTag();
            } else if (currentTag <= 346) {
                return FileTagEnum.WEN_CONTROL1_2_5.getTag();
            } else if (currentTag <= 349) {
                return FileTagEnum.WEN_CONTROL1_2_6.getTag();
            } else if (currentTag <= 352) {
                return FileTagEnum.WEN_CONTROL2_5.getTag();
            } else if (currentTag <= 355) {
                return FileTagEnum.WEN_CONTROL2_5_1.getTag();
            } else if (currentTag <= 357) {
                return FileTagEnum.WEN_CONTROL2_5_2.getTag();
            } else if (currentTag <= 363) {
                return FileTagEnum.WEN_CONTROL2_5_3.getTag();
            } else {
                return FileTagEnum.WEN_CONTROL2_7.getTag();
            }
        } else if (currentTag >= 373 && currentTag <= 378) {
            if (currentTag <= 374) {
                return FileTagEnum.CRITICAL_YING_DEAL2.getTag();
            } else if (currentTag == 375) {
                return FileTagEnum.SHA_CHILD_CONG.getTag();
            } else {
                return FileTagEnum.CHENG_YING_KONG_ZHI.getTag();
            }
        }



        return tag;

    }


}
