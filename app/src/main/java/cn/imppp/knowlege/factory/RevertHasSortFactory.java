package cn.imppp.knowlege.factory;

/**
 * @ClassName: RevertHasSortFactory
 * @Author: qaq
 * @Description: 数据是否携带顺序
 * @Date: 2020/10/9 8:51 AM
 * @Company: 杭州达恒科技
 * @Version: 1.0
 */

public class RevertHasSortFactory {

    private static final RevertHasSortFactory hasSort = new RevertHasSortFactory();

    public static RevertHasSortFactory getInstance() {
        return hasSort;
    }

    public boolean hasSort(int tag) {
        boolean flag = false;
        switch (tag) {
            case 8:
            case 19:
            case 21:
            case 54:
            case 55:
                flag = true;
                break;
        }

        return flag;
    }

    public int getLevel(int tag) {
        int level = -1;
        switch (tag) {
            case 1:
            case 8:
            case 19:
            case 34:
            case 53:
            case 74:
            case 111:
            case 146:
            case 184:
            case 211:
            case 221:
            case 227:
            case 241:
            case 258:
            case 266:
            case 295:
            case 312:
            case 10086:
            case 326:
            case 333:
            case 331:
            case 366:
            case 405:
                level = 1;
                break;
            case 2:
            case 21:
            case 22:
            case 23:
            case 35:
            case 36:
            case 37:
            case 38:
            case 54:
            case 55:
            case 75:
            case 147:
            case 148:
            case 149:
            case 150:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 185:
            case 186:
            case 187:
            case 229:
            case 230:
            case 259:
            case 260:
            case 267:
            case 268:
            case 269:
            case 270:
            case 271:
            case 314:
            case 315:
            case 323:
            case 324:
            case 338:
            case 339:
            case 350:
            case 351:
            case 352:
            case 112:
            case 125:
            case 129:
            case 367:
            case 368:
            case 373:
            case 374:
            case 406:
            case 407:
            case 410:
            case 7:
                level = 2;
                break;
            default:
                level = 3;
                break;
        }

            return level;
    }

}
