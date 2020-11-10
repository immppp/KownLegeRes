package cn.imppp.knowlege.factory;

import cn.imppp.knowlege.R;
import cn.imppp.knowlege.app.App;
import cn.imppp.knowlege.constant.FileTagEnum;

public class RevertTitleFactory {

    private static final RevertTitleFactory revertTitleFactory = new RevertTitleFactory();

    public static RevertTitleFactory getInstant() {
        return revertTitleFactory;
    }

    public String getTitleMessage(int tag) {
        String message = App.getContext().getString(R.string.app_name);
        switch (tag) {
            case 0:
                message = "自然灾害后灾区病媒生物监测与评价";
                break;
            case -1:
                message = "应急相关工具包";
                break;
            case 1:
                message = FileTagEnum.PREPARE_TAG.getTitleMessage();
                break;
            case 2:
                message = FileTagEnum.THINGS_PREPARE.getTitleMessage();
                break;
            case 3:
                message = FileTagEnum.PRO_PREPARE.getTitleMessage();
                break;
            case 4:
                message = FileTagEnum.TRAN_PREPARE.getTitleMessage();
                break;
            case 5:
                message = FileTagEnum.THINGS_PREPARE_FLAG1.getTitleMessage();
                break;
            case 6:
                message = FileTagEnum.THINGS_PREPARE_FLAG2.getTitleMessage();
                break;
            case 7:
                message = FileTagEnum.THINGS_PREPARE_FLAG3.getTitleMessage();
                break;
            case 8:
                message = FileTagEnum.DISEASE_QUERY.getTitleMessage();
                break;
            case 9:
                message = FileTagEnum.DISEASE_PREPARE.getTitleMessage();
                break;
            case 10:
                message = FileTagEnum.DISEASE_CONFIRM.getTitleMessage();
                break;
            case 11:
                message = FileTagEnum.DISEASE_EXSIT.getTitleMessage();
                break;
            case 12:
                message = FileTagEnum.DISEASE_BUILD.getTitleMessage();
                break;
            case 13:
                message = FileTagEnum.DISEASE_COUNT.getTitleMessage();
                break;
            case 14:
                message = FileTagEnum.DISEASE_ANY.getTitleMessage();
                break;
            case 15:
                message = FileTagEnum.DISEASE_IDEA.getTitleMessage();
                break;
            case 16:
                message = FileTagEnum.DISEASE_ADVICE.getTitleMessage();
                break;
            case 17:
                message = FileTagEnum.DISEASE_FINISH.getTitleMessage();
                break;
            case 18:
                message = FileTagEnum.DISEASE_REPORT.getTitleMessage();
                break;
            case 19:
                message = FileTagEnum.SOCIAL_DEAL.getTitleMessage();
                break;
            case 20:
                message = FileTagEnum.SOCIAL_CONFIRM.getTitleMessage();
                break;
            case 21:
                message = FileTagEnum.SOCIAL_ANY.getTitleMessage();
                break;
            case 22:
                message = FileTagEnum.SOCIAL_CHECK.getTitleMessage();
                break;
            case 23:
                message = FileTagEnum.SOCIAL_CONTROL.getTitleMessage();
                break;
            case 24:
                message = FileTagEnum.SOCIAL_ANY1.getTitleMessage();
                break;
            case 25:
                message = FileTagEnum.SOCIAL_ANY2.getTitleMessage();
                break;
            case 26:
                message = FileTagEnum.SOCIAL_ANY3.getTitleMessage();
                break;
            case 27:
                message = FileTagEnum.SOCIAL_ANY4.getTitleMessage();
                break;
            case 28:
                message = FileTagEnum.SOCIAL_ANY5.getTitleMessage();
                break;
            case 29:
                message = FileTagEnum.SOCIAL_CHECK1.getTitleMessage();
                break;
            case 30:
                message = FileTagEnum.SOCIAL_CHECK2.getTitleMessage();
                break;
//            case 31:
//                message = FileTagEnum.SOCIAL_CHECK3.getTitleMessage();
//                break;
            case 32:
                message = FileTagEnum.SOCIAL_CONTROL1.getTitleMessage();
                break;
            case 33:
                message = FileTagEnum.SOCIAL_CONTROL2.getTitleMessage();
                break;
            case 34:
                message = FileTagEnum.CRITICAL_CONTROL.getTitleMessage();
                break;
            case 35:
                message = FileTagEnum.CRITICAL_BASE_REQUIRE.getTitleMessage();
                break;
            case 36:
                message = FileTagEnum.CRITICAL_MOUSE_DEAL.getTitleMessage();
                break;
            case 37:
                message = FileTagEnum.CRITICAL_WEN_DEAL.getTitleMessage();
                break;
            case 38:
                message = FileTagEnum.CRITICAL_YING_DEAL.getTitleMessage();
                break;
            case 39:
                message = FileTagEnum.CRITICAL_BASE_REQUIRE1.getTitleMessage();
                break;
            case 40:
                message = FileTagEnum.CRITICAL_BASE_REQUIRE2.getTitleMessage();
                break;
            case 41:
                message = FileTagEnum.CRITICAL_BASE_REQUIRE3.getTitleMessage();
                break;
            case 42:
                message = FileTagEnum.CRITICAL_MOUSE_DEAL1.getTitleMessage();
                break;
            case 43:
                message = FileTagEnum.CRITICAL_MOUSE_DEAL2.getTitleMessage();
                break;
            case 44:
                message = FileTagEnum.CRITICAL_MOUSE_DEAL3.getTitleMessage();
                break;
            case 45:
                message = FileTagEnum.CRITICAL_MOUSE_DEAL4.getTitleMessage();
                break;
            case 46:
                message = FileTagEnum.CRITICAL_MOUSE_DEAL5.getTitleMessage();
                break;
            case 47:
                message = FileTagEnum.CRITICAL_MOUSE_DEAL6.getTitleMessage();
                break;
            case 48:
                message = FileTagEnum.CRITICAL_MOUSE_DEAL7.getTitleMessage();
                break;
            case 49:
                message = FileTagEnum.CRITICAL_WEN_DEAL1.getTitleMessage();
                break;
            case 50:
                message = FileTagEnum.CRITICAL_WEN_DEAL2.getTitleMessage();
                break;
            case 51:
                message = FileTagEnum.CRITICAL_YING_DEAL1.getTitleMessage();
                break;
            case 52:
                message = FileTagEnum.CRITICAL_YING_DEAL2.getTitleMessage();
                break;
            case 53:
                message = FileTagEnum.REPORT_WRITING.getTitleMessage();
                break;
            case 54:
                message = FileTagEnum.WORK_REPORT.getTitleMessage();
                break;
            case 55:
                message = FileTagEnum.GOVERMENT_REPORT.getTitleMessage();
                break;
            case 56:
                message = FileTagEnum.WORK_REPORT1.getTitleMessage();
                break;
            case 57:
                message = FileTagEnum.WORK_REPORT2.getTitleMessage();
                break;
            case 58:
                message = FileTagEnum.WORK_REPORT3.getTitleMessage();
                break;
            case 59:
                message = FileTagEnum.WORK_REPORT4.getTitleMessage();
                break;
            case 60:
                message = FileTagEnum.WORK_REPORT5.getTitleMessage();
                break;
            case 61:
                message = FileTagEnum.WORK_REPORT6.getTitleMessage();
                break;
            case 62:
                message = FileTagEnum.WORK_REPORT7.getTitleMessage();
                break;
            case 63:
                message = FileTagEnum.WORK_REPORT8.getTitleMessage();
                break;
            case 64:
                message = FileTagEnum.WORK_REPORT9.getTitleMessage();
                break;
            case 65:
                message = FileTagEnum.WORK_REPORT10.getTitleMessage();
                break;
            case 66:
                message = FileTagEnum.GOVERMENT_REPORT1.getTitleMessage();
                break;
            case 67:
                message = FileTagEnum.GOVERMENT_REPORT2.getTitleMessage();
                break;
            case 68:
                message = FileTagEnum.GOVERMENT_REPORT3.getTitleMessage();
                break;
            case 69:
                message = FileTagEnum.GOVERMENT_REPORT4.getTitleMessage();
                break;
            case 70:
                message = FileTagEnum.GOVERMENT_REPORT5.getTitleMessage();
                break;
            case 71:
                message = FileTagEnum.GOVERMENT_REPORT6.getTitleMessage();
                break;
            case 72:
                message = FileTagEnum.GOVERMENT_REPORT7.getTitleMessage();
                break;

            case 74:
                message = FileTagEnum.EVENT_RULE.getTitleMessage();
                break;
            case 75:
                message = FileTagEnum.RECURSION_EVENT.getTitleMessage();
                break;
            case 76:
                message = FileTagEnum.FOOD_EVENT.getTitleMessage();
                break;
            case 77:
                message = FileTagEnum.JOB_EVENT.getTitleMessage();
                break;
            case 78:
                message = FileTagEnum.OTHER_EVENT.getTitleMessage();
                break;
            case 79:
                message = FileTagEnum.NATURE_EVENT.getTitleMessage();
                break;
            case 80:
                message = FileTagEnum.X_EVENT.getTitleMessage();
                break;
            case 81:
                message = FileTagEnum.LOSS_EVENT.getTitleMessage();
                break;
            case 82:
                message = FileTagEnum.BAD_EVENT.getTitleMessage();
                break;
            case 83:
                message = FileTagEnum.HOSPITAL_EVENT.getTitleMessage();
                break;
            case 84:
                message = FileTagEnum.NO_REASON_EVENT.getTitleMessage();
                break;
            case 85:
                message = FileTagEnum.THINK_EVENT.getTitleMessage();
                break;
            case 86:
                message = FileTagEnum.RECURSION_EVENT1.getTitleMessage();
                break;
            case 87:
                message = FileTagEnum.RECURSION_EVENT2.getTitleMessage();
                break;
            case 88:
                message = FileTagEnum.RECURSION_EVENT3.getTitleMessage();
                break;
            case 89:
                message = FileTagEnum.RECURSION_EVENT4.getTitleMessage();
                break;
            case 90:
                message = FileTagEnum.RECURSION_EVENT5.getTitleMessage();
                break;
            case 91:
                message = FileTagEnum.RECURSION_EVENT6.getTitleMessage();
                break;
            case 92:
                message = FileTagEnum.RECURSION_EVENT7.getTitleMessage();
                break;
            case 93:
                message = FileTagEnum.RECURSION_EVENT8.getTitleMessage();
                break;
            case 94:
                message = FileTagEnum.RECURSION_EVENT9.getTitleMessage();
                break;
            case 95:
                message = FileTagEnum.RECURSION_EVENT10.getTitleMessage();
                break;
            case 96:
                message = FileTagEnum.RECURSION_EVENT11.getTitleMessage();
                break;
            case 97:
                message = FileTagEnum.RECURSION_EVENT12.getTitleMessage();
                break;
            case 98:
                message = FileTagEnum.RECURSION_EVENT13.getTitleMessage();
                break;
            case 99:
                message = FileTagEnum.RECURSION_EVENT14.getTitleMessage();
                break;
            case 100:
                message = FileTagEnum.RECURSION_EVENT15.getTitleMessage();
                break;
            case 101:
                message = FileTagEnum.RECURSION_EVENT16.getTitleMessage();
                break;
            case 102:
                message = FileTagEnum.RECURSION_EVENT17.getTitleMessage();
                break;
            case 103:
                message = FileTagEnum.RECURSION_EVENT18.getTitleMessage();
                break;
            case 104:
                message = FileTagEnum.RECURSION_EVENT19.getTitleMessage();
                break;
            case 105:
                message = FileTagEnum.RECURSION_EVENT20.getTitleMessage();
                break;
            case 106:
                message = FileTagEnum.RECURSION_EVENT21.getTitleMessage();
                break;
            case 107:
                message = FileTagEnum.RECURSION_EVENT22.getTitleMessage();
                break;
            case 108:
                message = FileTagEnum.RECURSION_EVENT23.getTitleMessage();
                break;
            case 109:
                message = FileTagEnum.RECURSION_EVENT24.getTitleMessage();
                break;
            case 110:
                message = FileTagEnum.RECURSION_EVENT25.getTitleMessage();
                break;
            case 111:
                message = FileTagEnum.STATE_TIME.getTitleMessage();
                break;
            case 112:
                message = FileTagEnum.CANCER_DISEASE.getTitleMessage();
                break;
            case 113:
                message = FileTagEnum.HEAD_DISEASE.getTitleMessage();
                break;
            case 114:
                message = FileTagEnum.GREY_DISEASE.getTitleMessage();
                break;
            case 115:
                message = FileTagEnum.DOG_DISEASE.getTitleMessage();
                break;
            case 116:
                message = FileTagEnum.POP_HEAD_DISEASE.getTitleMessage();
                break;
            case 117:
                message = FileTagEnum.MA_ZHEN.getTitleMessage();
                break;
            case 118:
                message = FileTagEnum.SHUI_DOU.getTitleMessage();
                break;
            case 119:
                message = FileTagEnum.SAI_XIAN.getTitleMessage();
                break;
            case 120:
                message = FileTagEnum.DENG_GE_RE.getTitleMessage();
                break;
            case 121:
                message = FileTagEnum.ZENG_DUO_ZHENG.getTitleMessage();
                break;
            case 122:
                message = FileTagEnum.AIDS.getTitleMessage();
                break;
            case 123:
                message = FileTagEnum.HUANG_RE_BING.getTitleMessage();
                break;
            case 124:
                message = FileTagEnum.SHANG_HAN.getTitleMessage();
                break;
            case 125:
                message = FileTagEnum.FU_SHANG.getTitleMessage();
                break;
            case 126:
                message = FileTagEnum.NUE_JI.getTitleMessage();
                break;
            case 127:
                message = FileTagEnum.HUO_LUAN.getTitleMessage();
                break;
            case 128:
                message = FileTagEnum.GAN_JUN.getTitleMessage();
                break;
            case 129:
                message = FileTagEnum.SHU_YI.getTitleMessage();
                break;
            case 130:
                message = FileTagEnum.TAN_JU.getTitleMessage();
                break;
            case 131:
                message = FileTagEnum.BAI_HOU.getTitleMessage();
                break;
            case 132:
                message = FileTagEnum.BAI_RI_KE.getTitleMessage();
                break;
            case 133:
                message = FileTagEnum.XING_HONG_RE.getTitleMessage();
                break;
            case 134:
                message = FileTagEnum.NAO_JI_SUI.getTitleMessage();
                break;
            case 135:
                message = FileTagEnum.LUO_XUAN_BING.getTitleMessage();
                break;
            case 136:
                message = FileTagEnum.HUI_GUI_RE.getTitleMessage();
                break;
            case 137:
                message = FileTagEnum.CANCER_DISEASE1.getTitleMessage();
                break;
            case 138:
                message = FileTagEnum.CANCER_DISEASE2.getTitleMessage();
                break;
            case 139:
                message = FileTagEnum.CANCER_DISEASE3.getTitleMessage();
                break;
            case 140:
                message = FileTagEnum.CANCER_DISEASE4.getTitleMessage();
                break;
            case 141:
                message = FileTagEnum.CANCER_DISEASE5.getTitleMessage();
                break;
            case 142:
                message = FileTagEnum.FU_SHANG1.getTitleMessage();
                break;
            case 143:
                message = FileTagEnum.FU_SHANG2.getTitleMessage();
                break;
            case 144:
                message = FileTagEnum.SHU_YI1.getTitleMessage();
                break;
            case 145:
                message = FileTagEnum.SHU_YI2.getTitleMessage();
                break;

            case 146:
                message = FileTagEnum.STUDY_DISEASE.getTitleMessage();
                break;
            case 147:
                message = FileTagEnum.STUDY_DISEASE1.getTitleMessage();
                break;
            case 148:
                message = FileTagEnum.STUDY_DISEASE2.getTitleMessage();
                break;
            case 149:
                message = FileTagEnum.STUDY_DISEASE3.getTitleMessage();
                break;
            case 150:
                message = FileTagEnum.STUDY_DISEASE4.getTitleMessage();
                break;
            case 151:
                message = FileTagEnum.STUDY_DISEASE5.getTitleMessage();
                break;
            case 152:
                message = FileTagEnum.STUDY_DISEASE6.getTitleMessage();
                break;
            case 153:
                message = FileTagEnum.STUDY_DISEASE7.getTitleMessage();
                break;
            case 154:
                message = FileTagEnum.STUDY_DISEASE8.getTitleMessage();
                break;
            case 155:
                message = FileTagEnum.STUDY_DISEASE9.getTitleMessage();
                break;
            case 156:
                message = FileTagEnum.STUDY_DISEASE1_1.getTitleMessage();
                break;
            case 157:
                message = FileTagEnum.STUDY_DISEASE1_2.getTitleMessage();
                break;
            case 158:
                message = FileTagEnum.STUDY_DISEASE2_1.getTitleMessage();
                break;
            case 159:
                message = FileTagEnum.STUDY_DISEASE2_2.getTitleMessage();
                break;
            case 160:
                message = FileTagEnum.STUDY_DISEASE2_3.getTitleMessage();
                break;
            case 161:
                message = FileTagEnum.STUDY_DISEASE3_1.getTitleMessage();
                break;
            case 162:
                message = FileTagEnum.STUDY_DISEASE3_2.getTitleMessage();
                break;
            case 163:
                message = FileTagEnum.STUDY_DISEASE3_3.getTitleMessage();
                break;
            case 164:
                message = FileTagEnum.STUDY_DISEASE3_4.getTitleMessage();
                break;
            case 165:
                message = FileTagEnum.STUDY_DISEASE4_1.getTitleMessage();
                break;
            case 166:
                message = FileTagEnum.STUDY_DISEASE4_2.getTitleMessage();
                break;
            case 167:
                message = FileTagEnum.STUDY_DISEASE5_1.getTitleMessage();
                break;
            case 168:
                message = FileTagEnum.STUDY_DISEASE5_2.getTitleMessage();
                break;
            case 169:
                message = FileTagEnum.STUDY_DISEASE5_3.getTitleMessage();
                break;
            case 170:
                message = FileTagEnum.STUDY_DISEASE5_4.getTitleMessage();
                break;
            case 171:
                message = FileTagEnum.STUDY_DISEASE6_1.getTitleMessage();
                break;
            case 172:
                message = FileTagEnum.STUDY_DISEASE6_2.getTitleMessage();
                break;
            case 173:
                message = FileTagEnum.STUDY_DISEASE7_1.getTitleMessage();
                break;
            case 174:
                message = FileTagEnum.STUDY_DISEASE7_2.getTitleMessage();
                break;
            case 175:
                message = FileTagEnum.STUDY_DISEASE7_3.getTitleMessage();
                break;
            case 176:
                message = FileTagEnum.STUDY_DISEASE9_1.getTitleMessage();
                break;
            case 177:
                message = FileTagEnum.STUDY_DISEASE9_2.getTitleMessage();
                break;
            case 178:
                message = FileTagEnum.STUDY_DISEASE9_3.getTitleMessage();
                break;
            case 179:
                message = FileTagEnum.STUDY_DISEASE9_4.getTitleMessage();
                break;
            case 180:
                message = FileTagEnum.STUDY_DISEASE9_5.getTitleMessage();
                break;
            case 181:
                message = FileTagEnum.STUDY_DISEASE9_6.getTitleMessage();
                break;
            case 182:
                message = FileTagEnum.STUDY_DISEASE9_7.getTitleMessage();
                break;
            case 183:
                message = FileTagEnum.STUDY_DISEASE9_8.getTitleMessage();
                break;

            // 急性不明原因中毒相关体征的甄别
            case 184:
                message = FileTagEnum.CHECK_DRUGS.getTitleMessage();
                break;
            case 185:
                message = FileTagEnum.SMELL_WRONG.getTitleMessage();
                break;
            case 186:
                message = FileTagEnum.DUO_HAN.getTitleMessage();
                break;
            case 187:
                message = FileTagEnum.SKIN_COLOR.getTitleMessage();
                break;
            case 188:
                message = FileTagEnum.SMELL_WRONG1.getTitleMessage();
                break;
            case 189:
                message = FileTagEnum.SMELL_WRONG2.getTitleMessage();
                break;
            case 190:
                message = FileTagEnum.SMELL_WRONG3.getTitleMessage();
                break;
            case 191:
                message = FileTagEnum.SMELL_WRONG4.getTitleMessage();
                break;
            case 192:
                message = FileTagEnum.SMELL_WRONG5.getTitleMessage();
                break;
            case 193:
                message = FileTagEnum.SMELL_WRONG6.getTitleMessage();
                break;
            case 194:
                message = FileTagEnum.SMELL_WRONG7.getTitleMessage();
                break;
            case 195:
                message = FileTagEnum.SMELL_WRONG8.getTitleMessage();
                break;
            case 196:
                message = FileTagEnum.SMELL_WRONG9.getTitleMessage();
                break;
            case 197:
                message = FileTagEnum.SMELL_WRONG10.getTitleMessage();
                break;
            case 198:
                message = FileTagEnum.SMELL_WRONG11.getTitleMessage();
                break;
            case 199:
                message = FileTagEnum.SMELL_WRONG12.getTitleMessage();
                break;
            case 200:
                message = FileTagEnum.SMELL_WRONG13.getTitleMessage();
                break;
            case 201:
                message = FileTagEnum.DUO_HAN1.getTitleMessage();
                break;
            case 202:
                message = FileTagEnum.DUO_HAN2.getTitleMessage();
                break;
            case 203:
                message = FileTagEnum.DUO_HAN3.getTitleMessage();
                break;
            case 204:
                message = FileTagEnum.DUO_HAN4.getTitleMessage();
                break;
            case 205:
                message = FileTagEnum.SKIN_COLOR1.getTitleMessage();
                break;
            case 206:
                message = FileTagEnum.SKIN_COLOR2.getTitleMessage();
                break;
            case 207:
                message = FileTagEnum.SKIN_COLOR3.getTitleMessage();
                break;
            case 208:
                message = FileTagEnum.SKIN_COLOR4.getTitleMessage();
                break;
            case 209:
                message = FileTagEnum.SKIN_COLOR5.getTitleMessage();
                break;
            case 210:
                message = FileTagEnum.SKIN_COLOR6.getTitleMessage();
                break;

            // 不明原因疾病样本采集表
            case 211:
                message = FileTagEnum.COLLECT_TABLE.getTitleMessage();
                break;
            case 212:
                message = FileTagEnum.DISEASE_COLLECT1.getTitleMessage();
                break;
            case 213:
                message = FileTagEnum.DISEASE_COLLECT2.getTitleMessage();
                break;
            case 214:
                message = FileTagEnum.DISEASE_COLLECT3.getTitleMessage();
                break;
            case 215:
                message = FileTagEnum.DISEASE_COLLECT4.getTitleMessage();
                break;
            case 216:
                message = FileTagEnum.DISEASE_COLLECT5.getTitleMessage();
                break;
            case 217:
                message = FileTagEnum.DISEASE_COLLECT6.getTitleMessage();
                break;
            case 218:
                message = FileTagEnum.DISEASE_COLLECT7.getTitleMessage();
                break;
            case 219:
                message = FileTagEnum.DISEASE_COLLECT8.getTitleMessage();
                break;
            case 220:
                message = FileTagEnum.DISEASE_COLLECT9.getTitleMessage();
                break;

            //  各类食物中毒特点及处理要点
            case 221:
                message = FileTagEnum.FOOD_DRUGS_DEAL.getTitleMessage();
                break;
            case 222:
                message = FileTagEnum.FOOD_DRUGS_DEAL1.getTitleMessage();
                break;
            case 223:
                message = FileTagEnum.FOOD_DRUGS_DEAL2.getTitleMessage();
                break;
            case 224:
                message = FileTagEnum.FOOD_DRUGS_DEAL3.getTitleMessage();
                break;
            case 225:
                message = FileTagEnum.FOOD_DRUGS_DEAL4.getTitleMessage();
                break;
            case 226:
                message = FileTagEnum.FOOD_DRUGS_DEAL5.getTitleMessage();
                break;

            // 灾区饮用水水源选择、保护及消毒方法
            case 227:
                message = FileTagEnum.WATER_USE_FUNCTION.getTitleMessage();
                break;
            case 228:
                message = FileTagEnum.WATER_CHOOSE.getTitleMessage();
                break;
            case 229:
                message = FileTagEnum.KEEP_WATER.getTitleMessage();
                break;
            case 230:
                message = FileTagEnum.DEAL_WATER.getTitleMessage();
                break;
            case 231:
                message = FileTagEnum.CLEAR_WATER.getTitleMessage();
                break;
            case 232:
                message = FileTagEnum.TRAN_WATER.getTitleMessage();
                break;
            case 233:
                message = FileTagEnum.RECOVER_WATER.getTitleMessage();
                break;
            case 234:
                message = FileTagEnum.CHECK_WATER.getTitleMessage();
                break;
            case 235:
                message = FileTagEnum.KEEP_WATER1.getTitleMessage();
                break;
            case 236:
                message = FileTagEnum.KEEP_WATER2.getTitleMessage();
                break;
            case 237:
                message = FileTagEnum.DEAL_WATER1.getTitleMessage();
                break;
            case 238:
                message = FileTagEnum.DEAL_WATER2.getTitleMessage();
                break;
            case 239:
                message = FileTagEnum.DEAL_WATER3.getTitleMessage();
                break;
            case 240:
                message = FileTagEnum.DEAL_WATER4.getTitleMessage();
                break;

            // 传染病防控现场消毒方法
            case 241:
                message = FileTagEnum.KILL_VIRUS.getTitleMessage();
                break;
            case 242:
                message = FileTagEnum.DI_MIAN.getTitleMessage();
                break;
            case 243:
                message = FileTagEnum.PAI_XIE.getTitleMessage();
                break;
            case 244:
                message = FileTagEnum.RONG_QI.getTitleMessage();
                break;
            case 245:
                message = FileTagEnum.CE_SUO.getTitleMessage();
                break;
            case 246:
                message = FileTagEnum.ROOM_AIR.getTitleMessage();
                break;
            case 247:
                message = FileTagEnum.WU_SHUI.getTitleMessage();
                break;
            case 248:
                message = FileTagEnum.LA_JI.getTitleMessage();
                break;
            case 249:
                message = FileTagEnum.CLOTH.getTitleMessage();
                break;
            case 250:
                message = FileTagEnum.CAN_JU.getTitleMessage();
                break;
            case 251:
                message = FileTagEnum.FOOD.getTitleMessage();
                break;
            case 252:
                message = FileTagEnum.THING.getTitleMessage();
                break;
            case 253:
                message = FileTagEnum.BOOK.getTitleMessage();
                break;
            case 254:
                message = FileTagEnum.BING_REN.getTitleMessage();
                break;
            case 255:
                message = FileTagEnum.ANIMAL_SHI_TI.getTitleMessage();
                break;
            case 256:
                message = FileTagEnum.YUN_SHU_TOOL.getTitleMessage();
                break;
            case 257:
                message = FileTagEnum.HAND_SKIN.getTitleMessage();
                break;

            // 自然灾害后灾区病媒生物监测和测评
            case 258:
                message = FileTagEnum.NATURE_MONITOR.getTitleMessage();
                break;
            case 259:
                message = FileTagEnum.MIE_MONITOR.getTitleMessage();
                break;
            case 260:
                message = FileTagEnum.WORK_USE.getTitleMessage();
                break;
            case 261:
                message = FileTagEnum.MIE_MONITOR1.getTitleMessage();
                break;
            case 262:
                message = FileTagEnum.MIE_MONITOR2.getTitleMessage();
                break;
            case 263:
                message = FileTagEnum.MIE_MONITOR3.getTitleMessage();
                break;
            case 264:
                message = FileTagEnum.WORK_USE1.getTitleMessage();
                break;
            case 265:
                message = FileTagEnum.WORK_USE2.getTitleMessage();
                break;

            // 化学中毒常用解毒剂
            case 266:
                message = FileTagEnum.OPEN_VIRUS.getTitleMessage();
                break;
            case 267:
                message = FileTagEnum.QING_VIRUS.getTitleMessage();
                break;
            case 268:
                message = FileTagEnum.JIN_SHU_VITUS.getTitleMessage();
                break;
            case 269:
                message = FileTagEnum.LIN_VIRUS.getTitleMessage();
                break;
            case 270:
                message = FileTagEnum.BEN_VIRUS.getTitleMessage();
                break;
            case 271:
                message = FileTagEnum.MOUSE_VIRUS.getTitleMessage();
                break;
            case 272:
                message = FileTagEnum.QING_VIRUS1.getTitleMessage();
                break;
            case 273:
                message = FileTagEnum.QING_VIRUS2.getTitleMessage();
                break;
            case 274:
                message = FileTagEnum.QING_VIRUS3.getTitleMessage();
                break;
            case 275:
                message = FileTagEnum.QING_VIRUS4.getTitleMessage();
                break;
            case 276:
                message = FileTagEnum.QING_VIRUS5.getTitleMessage();
                break;
            case 277:
                message = FileTagEnum.JIN_SHU_VITUS1.getTitleMessage();
                break;
            case 278:
                message = FileTagEnum.JIN_SHU_VITUS2.getTitleMessage();
                break;
            case 279:
                message = FileTagEnum.JIN_SHU_VITUS3.getTitleMessage();
                break;
            case 280:
                message = FileTagEnum.JIN_SHU_VITUS4.getTitleMessage();
                break;
            case 281:
                message = FileTagEnum.JIN_SHU_VITUS5.getTitleMessage();
                break;
            case 282:
                message = FileTagEnum.JIN_SHU_VITUS6.getTitleMessage();
                break;
            case 283:
                message = FileTagEnum.JIN_SHU_VITUS7.getTitleMessage();
                break;
            case 284:
                message = FileTagEnum.JIN_SHU_VITUS8.getTitleMessage();
                break;
            case 285:
                message = FileTagEnum.JIN_SHU_VITUS9.getTitleMessage();
                break;
            case 286:
                message = FileTagEnum.JIN_SHU_VITUS10.getTitleMessage();
                break;
            case 287:
                message = FileTagEnum.JIN_SHU_VITUS11.getTitleMessage();
                break;
            case 288:
                message = FileTagEnum.LIN_VIRUS1.getTitleMessage();
                break;
            case 289:
                message = FileTagEnum.LIN_VIRUS2.getTitleMessage();
                break;
            case 290:
                message = FileTagEnum.LIN_VIRUS3.getTitleMessage();
                break;
            case 291:
                message = FileTagEnum.BEN_VIRUS1.getTitleMessage();
                break;
            case 292:
                message = FileTagEnum.MOUSE_VIRUS1.getTitleMessage();
                break;
            case 293:
                message = FileTagEnum.MOUSE_VIRUS2.getTitleMessage();
                break;
            case 294:
                message = FileTagEnum.MOUSE_VIRUS3.getTitleMessage();
                break;
            case 295:
                message = FileTagEnum.KEEP_FUNCTION.getTitleMessage();
                break;
            case 296:
                message = FileTagEnum.KEEP_FUNCTION1.getTitleMessage();
                break;
            case 297:
                message = FileTagEnum.KEEP_FUNCTION2.getTitleMessage();
                break;
            case 298:
                message = FileTagEnum.KEEP_FUNCTION3.getTitleMessage();
                break;
            case 299:
                message = FileTagEnum.KEEP_FUNCTION4.getTitleMessage();
                break;
            case 300:
                message = FileTagEnum.KEEP_FUNCTION5.getTitleMessage();
                break;
            case 301:
                message = FileTagEnum.KEEP_FUNCTION6.getTitleMessage();
                break;
            case 302:
                message = FileTagEnum.KEEP_FUNCTION7.getTitleMessage();
                break;
            case 303:
                message = FileTagEnum.KEEP_FUNCTION8.getTitleMessage();
                break;
            case 304:
                message = FileTagEnum.KEEP_FUNCTION9.getTitleMessage();
                break;
            case 305:
                message = FileTagEnum.KEEP_FUNCTION10.getTitleMessage();
                break;
            case 306:
                message = FileTagEnum.KEEP_FUNCTION11.getTitleMessage();
                break;
            case 307:
                message = FileTagEnum.KEEP_FUNCTION12.getTitleMessage();
                break;
            case 308:
                message = FileTagEnum.KEEP_FUNCTION13.getTitleMessage();
                break;
            case 309:
                message = FileTagEnum.KEEP_FUNCTION14.getTitleMessage();
                break;
            case 310:
                message = FileTagEnum.KEEP_FUNCTION15.getTitleMessage();
                break;
            case 311:
                message = FileTagEnum.KEEP_FUNCTION16.getTitleMessage();
                break;
            case 312:
                message = FileTagEnum.HIDDEN_EVENT.getTitleMessage();
                break;
            case 313:
                message = FileTagEnum.MEI_QI_EVENT.getTitleMessage();
                break;
            case 314:
                message = FileTagEnum.HU_XI.getTitleMessage();
                break;
            case 315:
                message = FileTagEnum.CANG_DAO.getTitleMessage();
                break;
            case 316:
                message = FileTagEnum.XIAN_CHANG.getTitleMessage();
                break;
            case 317:
                message = FileTagEnum.HU_XI1.getTitleMessage();
                break;
            case 318:
                message = FileTagEnum.HU_XI2.getTitleMessage();
                break;
            case 319:
                message = FileTagEnum.HU_XI3.getTitleMessage();
                break;
            case 320:
                message = FileTagEnum.CANG_DAO1.getTitleMessage();
                break;
            case 321:
                message = FileTagEnum.CANG_DAO2.getTitleMessage();
                break;
            case 322:
                message = FileTagEnum.WEN_CONTROL.getTitleMessage();
                break;
            case 323:
                message = FileTagEnum.WEN_CONTROL1.getTitleMessage();
                break;
            case 324:
                message = FileTagEnum.WEN_CONTROL2.getTitleMessage();
                break;
            case 325:
                message = FileTagEnum.WEN_CONTROL1_1.getTitleMessage();
                break;
            case 326:
                message = FileTagEnum.WEN_CONTROL1_2.getTitleMessage();
                break;
            case 327:
                message = FileTagEnum.WEN_CONTROL2_1.getTitleMessage();
                break;
            case 328:
                message = FileTagEnum.WEN_CONTROL2_2.getTitleMessage();
                break;
            case 329:
                message = FileTagEnum.WEN_CONTROL2_3.getTitleMessage();
                break;
            case 330:
                message = FileTagEnum.WEN_CONTROL2_4.getTitleMessage();
                break;
            case 331:
                message = FileTagEnum.WEN_CONTROL2_5.getTitleMessage();
                break;
            case 332:
                message = FileTagEnum.WEN_CONTROL2_6.getTitleMessage();
                break;
            case 333:
                message = FileTagEnum.WEN_CONTROL2_7.getTitleMessage();
                break;
            case 10086:
                message = FileTagEnum.CRITICAL_WEN_DEAL3.getTitleMessage();
                break;
            case 334:
                message = FileTagEnum.WEN_CONTROL1_2_1.getTitleMessage();
                break;
            case 335:
                message = FileTagEnum.WEN_CONTROL1_2_2.getTitleMessage();
                break;
            case 336:
                message = FileTagEnum.WEN_CONTROL1_2_3.getTitleMessage();
                break;
            case 337:
                message = FileTagEnum.WEN_CONTROL1_2_4.getTitleMessage();
                break;
            case 338:
                message = FileTagEnum.WEN_CONTROL1_2_5.getTitleMessage();
                break;
            case 339:
                message = FileTagEnum.WEN_CONTROL1_2_6.getTitleMessage();
                break;
            case 340:
                message = FileTagEnum.WEN_CONTROL1_2_5_1.getTitleMessage();
                break;
            case 341:
                message = FileTagEnum.WEN_CONTROL1_2_5_2.getTitleMessage();
                break;
            case 342:
                message = FileTagEnum.WEN_CONTROL1_2_5_3.getTitleMessage();
                break;
            case 343:
                message = FileTagEnum.WEN_CONTROL1_2_5_4.getTitleMessage();
                break;
            case 344:
                message = FileTagEnum.WEN_CONTROL1_2_5_5.getTitleMessage();
                break;
            case 345:
                message = FileTagEnum.WEN_CONTROL1_2_5_6.getTitleMessage();
                break;
            case 346:
                message = FileTagEnum.WEN_CONTROL1_2_5_7.getTitleMessage();
                break;
            case 347:
                message = FileTagEnum.WEN_CONTROL1_2_6_1.getTitleMessage();
                break;
            case 348:
                message = FileTagEnum.WEN_CONTROL1_2_6_2.getTitleMessage();
                break;
            case 349:
                message = FileTagEnum.WEN_CONTROL1_2_6_3.getTitleMessage();
                break;
            case 350:
                message = FileTagEnum.WEN_CONTROL2_5_1.getTitleMessage();
                break;
            case 351:
                message = FileTagEnum.WEN_CONTROL2_5_2.getTitleMessage();
                break;
            case 352:
                message = FileTagEnum.WEN_CONTROL2_5_3.getTitleMessage();
                break;
            case 353:
                message = FileTagEnum.WEN_CONTROL2_5_1_1.getTitleMessage();
                break;
            case 354:
                message = FileTagEnum.WEN_CONTROL2_5_1_2.getTitleMessage();
                break;
            case 355:
                message = FileTagEnum.WEN_CONTROL2_5_1_3.getTitleMessage();
                break;
            case 356:
                message = FileTagEnum.WEN_CONTROL2_5_2_1.getTitleMessage();
                break;
            case 357:
                message = FileTagEnum.WEN_CONTROL2_5_2_2.getTitleMessage();
                break;
            case 358:
                message = FileTagEnum.WEN_CONTROL2_5_3_1.getTitleMessage();
                break;
            case 359:
                message = FileTagEnum.WEN_CONTROL2_5_3_2.getTitleMessage();
                break;
            case 360:
                message = FileTagEnum.WEN_CONTROL2_5_3_3.getTitleMessage();
                break;
            case 361:
                message = FileTagEnum.WEN_CONTROL2_5_3_4.getTitleMessage();
                break;
            case 362:
                message = FileTagEnum.WEN_CONTROL2_5_3_5.getTitleMessage();
                break;
            case 363:
                message = FileTagEnum.WEN_CONTROL2_5_3_6.getTitleMessage();
                break;
            case 364:
                message = FileTagEnum.WEN_CONTROL2_7_1.getTitleMessage();
                break;
            case 365:
                message = FileTagEnum.WEN_CONTROL2_7_2.getTitleMessage();
                break;
            case 366:
                message = FileTagEnum.REASON_STEP.getTitleMessage();
                break;
            case 367:
                message = FileTagEnum.QUICK_DISEASE.getTitleMessage();
                break;
            case 368:
                message = FileTagEnum.QUICK_NO_DISEASE.getTitleMessage();
                break;
            case 369:
                message = FileTagEnum.QUICK_DISEASE1.getTitleMessage();
                break;
            case 370:
                message = FileTagEnum.QUICK_NO_DISEASE1.getTitleMessage();
                break;
            case 371:
                message = FileTagEnum.QUICK_NO_DISEASE2.getTitleMessage();
                break;
            case 373:
                message = FileTagEnum.SHA_CHILD_CONG.getTitleMessage();
                break;
            case 374:
                message = FileTagEnum.CHENG_YING_KONG_ZHI.getTitleMessage();
                break;
            case 375:
                message = FileTagEnum.SHA_CHILD_CONG1.getTitleMessage();
                break;
            case 376:
                message = FileTagEnum.CHENG_YING_KONG_ZHI1.getTitleMessage();
                break;
            case 377:
                message = FileTagEnum.CHENG_YING_KONG_ZHI2.getTitleMessage();
                break;
            case 378:
                message = FileTagEnum.CHENG_YING_KONG_ZHI3.getTitleMessage();
                break;
            case 379:
            case 380:
            case 381:
            case 382:
            case 383:
            case 384:
            case 385:
            case 386:
            case 387:
                message = FileTagEnum.LINC_CHUANG_ZHENG_ZHUANG1.getTitleMessage();
                break;
            case 388:
                message = FileTagEnum.FUNCTION1.getTitleMessage();
                break;
            case 389:
                message = FileTagEnum.FUNCTION2.getTitleMessage();
                break;
            case 390:
                message = FileTagEnum.FUNCTION3.getTitleMessage();
                break;
            case 391:
                message = FileTagEnum.FUNCTION4.getTitleMessage();
                break;
            case 392:
                message = FileTagEnum.FUNCTION5.getTitleMessage();
                break;
            case 393:
                message = FileTagEnum.FUNCTION6.getTitleMessage();
                break;
            case 394:
                message = FileTagEnum.FUNCTION7.getTitleMessage();
                break;

            case 405:
                message = FileTagEnum.REASON_STEP.getTitleMessage();
                break;
            case 406:
                message = FileTagEnum.QUICK_DISEASE.getTitleMessage();
                break;
            case 407:
                message = FileTagEnum.QUICK_NO_DISEASE.getTitleMessage();
                break;
            case 408:
                message = FileTagEnum.LIN_CHUANG_TE_ZHENG.getTitleMessage();
                break;
            case 409:
                message = FileTagEnum.QUICK_NO_DISEASE1.getTitleMessage();
                break;
            case 410:
                message = FileTagEnum.QUICK_NO_DISEASE2.getTitleMessage();
                break;
            case 411:
                message = FileTagEnum.QUICK_NO_DISEASE3.getTitleMessage();
                break;
            case 412:
                message = FileTagEnum.QUICK_DISEASE1.getTitleMessage();
                break;
            case 413:
                message = FileTagEnum.QUICK_DISEASE2.getTitleMessage();
                break;
            case 414:
                message = FileTagEnum.QUICK_DISEASE3.getTitleMessage();
                break;
            case 415:
                message = FileTagEnum.QUICK_NO_DISEASE21.getTitleMessage();
                break;
            case 416:
                message = FileTagEnum.QUICK_NO_DISEASE22.getTitleMessage();
                break;
            case 417:
                message = FileTagEnum.QUICK_NO_DISEASE31.getTitleMessage();
                break;
            case 418:
                message = FileTagEnum.QUICK_NO_DISEASE32.getTitleMessage();
                break;
            case 12306:
                message = "应急队员职责";
                break;
            case 430:
                message = FileTagEnum.THINGS_PREPARE_FLAG31.getTitleMessage();
                break;
            case 431:
                message = FileTagEnum.THINGS_PREPARE_FLAG32.getTitleMessage();
                break;
            case 432:
                message = FileTagEnum.THINGS_PREPARE_FLAG33.getTitleMessage();
                break;
        }
        return message;
    }

}
