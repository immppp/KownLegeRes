package cn.imppp.knowlege.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * @Description:
 * @author：YangChen
 * @date: 2017/12/30 19:41
 * @email：cyang0611@163.com
 */

public class DateUtils {

    public static final String DATE_FORMATE_NORMAL = "yyyy-MM-dd HH:mm:ss";
    public static final String DATE_FORMATE_DAY = "yyyy-MM-dd";
    public static final String DATE_FORMATE_DAY2 = "yyyy/MM/dd";
    public static final String DATE_FORMATE_HOUR = "HH:mm";
    public static final String TIME_DEFAULT_FORMAT = "HH:mm:ss";
    public static final String DATE_FORMATE_MIN = "yyyy-MM-dd HH:mm";
    private static SimpleDateFormat sdf;

    public static String getCurrentDataDefault() {
        sdf = new SimpleDateFormat(DATE_FORMATE_NORMAL, Locale.getDefault());
        return sdf.format(new Date(System.currentTimeMillis()));
    }

    public static String getCurrentDataDate() {
        sdf = new SimpleDateFormat(DATE_FORMATE_DAY2, Locale.getDefault());
        return sdf.format(new Date(System.currentTimeMillis()));
    }

    public static String getCurrentDataDate2() {
        sdf = new SimpleDateFormat(TIME_DEFAULT_FORMAT, Locale.getDefault());
        return sdf.format(new Date(System.currentTimeMillis()));
    }

    public static String getCurrentDataChinese() {
        sdf = new SimpleDateFormat("MM月dd日", Locale.getDefault());
        return sdf.format(new Date(System.currentTimeMillis()));
    }

    public static String getCurrentHour() {
        Date date = new Date(System.currentTimeMillis());
        sdf = new SimpleDateFormat(DATE_FORMATE_HOUR, Locale.getDefault());
        return sdf.format(date);
    }

    /**
     * 获取手机当前时区
     ***/
    public static String getCurrentTimeZone() {
        TimeZone tz = TimeZone.getDefault();
        String strTz = tz.getDisplayName(false, TimeZone.SHORT);
        return strTz;
    }

    public static String longToDate(String s, String formate) {
        return longToDate(Long.parseLong(s), formate);
    }

    public static String longToDate(long l, String formate) {
        try {
            Date date = new Date(l);
            if (formate == null)
                formate = DATE_FORMATE_NORMAL;
            sdf = new SimpleDateFormat(formate, Locale.getDefault());
            return sdf.format(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }


    /**
     * @param str
     * @param formate
     * @return
     * @throws Exception
     */
    public static Date stringToDate(String str, String formate) {
        try {
            if (str != null && !"".equals(str)) {
                DateFormat format = new SimpleDateFormat(formate);
                return format.parse(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static long getSystemTime() {
        Date date = new Date();
        return (date.getTime()) / 1000;
    }


    /**
     * @param date
     * @param dateformat
     * @return
     */
    public static String dateToString(Date date, String dateformat) {
        DateFormat format = new SimpleDateFormat(dateformat);
        return format.format(date);
    }

    /**
     * 根据日期获取周几
     *
     * @param date 时间
     * @return 返回周几
     */
    public static String getWeekOfDate(Date date) {
        String[] weekDays = {"周日", "周一", "周二", "周三", "周四", "周五", "周六"};
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
        if (w < 0)
            w = 0;
        return weekDays[w];
    }

    public static String dateDiff(String endTime) {
        String strTime = "";
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:sss");
        long nd = 1000 * 24 * 60 * 60;// 一天的毫秒数
        long nh = 1000 * 60 * 60;// 一小时的毫秒数
        long nm = 1000 * 60;// 一分钟的毫秒数
        long ns = 1000;// 一秒钟的毫秒数
        long diff;
        long day = 0;
        Date curDate = new Date(System.currentTimeMillis());//获取当前时间
        String str = sd.format(curDate);
        try {
            // 获得两个时间的毫秒时间差异
            diff = sd.parse(endTime).getTime()
                    - sd.parse(str).getTime();
            day = diff / nd;// 计算差多少天
            long hour = diff % nd / nh;// 计算差多少小时
            long min = diff % nd % nh / nm;// 计算差多少分钟
            long sec = diff % nd % nh % nm / ns;// 计算差多少秒
            // 输出结果
            if (day >= 1) {
                strTime = day + "天" + hour + "时";
            } else {
                if (hour >= 1) {
                    strTime = day + "天" + hour + "时" + min + "分";

                } else {
                    if (sec >= 1) {
                        strTime = day + "天" + hour + "时" + min + "分" + sec + "秒";
                    } else {
                        strTime = "显示即将到期";
                    }
                }
            }

            return strTime;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;

    }

}
