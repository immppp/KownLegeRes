package cn.imppp.knowlege.repository.db.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 日期、时间工具类
 * <p>Title: DateUtils</p>
 * <p>Description: 用于所有对日期的获取、转换等</p>
 * <p>Company: 杭州达恒科技有限公司</p>
 *
 * @author lihao
 * @version 1.0
 * @date 2016-11-28
 */
public class DateUtils {

    public static final String DATE_DEFAULT_FORMAT = "yyyy-MM-dd";
    public static final String DATETIME_DEFAULT_FORMAT = "yyyy-MM-dd HH:mm:ss";
    public static final String DATETIME_DEFAULT_FORMAT2 = "MM-dd HH:mm";
    public static final String TIME_DEFAULT_FORMAT = "HH:mm:ss";
    public static final String TIME_MIN_FORMAT = "HH:mm";
    public static final String GREENWICH_TIME = "1970-01-01 08:00:00";
    public static final String DATE_FORMAT_YYYYMMDD = "yyyyMMdd";
    public static final String DATE_FORMAT_MMDD = "MMdd";

    public static final String DATE_FORMAT_yyyy_MM  = "yyyy-MM";
    public static final String DATE_FORMAT_yyyyMM  = "yyyyMM";
    public static final String DATE_FORMAT_yyyyMMddHHmm  = "yyyyMMddHHmm";
    public static final String DATE_FORMAT_yyyyMMddHHmmss  = "yyyyMMddHHmmss";

    // 起始时间 00:00:00
    public static final String DATE_FINAL_HHMMSS_00  = "00:00:00";
    // 结束时间 23:59:59
    public static final String DATE_FINAL_HHMMSS_23  = "23:59:59";


    /**
     * long转时间
     *
     * @param timestamp
     * @param dateformat
     * @return
     */
    public static String autoFormatTime(long timestamp, String dateformat) {
        DateFormat format = new SimpleDateFormat(dateformat);
        timestamp = timestamp * 1000;
        return format.format(new Date(timestamp));
    }


    public static Date longToDate(long longTime, String dateformat) {
        try {
            Date nowTime = new Date(longTime);
            SimpleDateFormat format = new SimpleDateFormat(dateformat);
            return stringToDate(format.format(nowTime), dateformat);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
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
     * @param str
     * @param dateformat
     * @return
     * @throws Exception
     */
    public static Date stringToDate(String str, String dateformat) throws Exception {
        if (str != null && !"".equals(str)) {
            DateFormat format = new SimpleDateFormat(dateformat);
            return format.parse(str);
        }
        return null;
    }

    /**
     * @param date
     * @param dateformat
     * @return
     * @throws Exception
     */
    public static Date DateToDate(Date date, String dateformat) throws Exception {
        if (date != null) {
            DateFormat format = new SimpleDateFormat(dateformat);
            String str = format.format(date);
            return format.parse(str);
        }
        return null;
    }

    /**
     * @param longTime
     * @return
     * @throws Exception
     */
    public static Date longToDateTime(Long longTime) throws Exception {
        SimpleDateFormat format = new SimpleDateFormat(DATETIME_DEFAULT_FORMAT);
        Date date = format.parse(GREENWICH_TIME);
        Long currentTime = Long.valueOf(longTime + date.getTime()) * 1000;
        return format.parse(format.format(currentTime));
    }

    /**
     * long类型根据指定格式转为Date
     * @param longTime
     * @return 返回指定格式的Date
     * @throws Exception
     */
    public static Date longToDateTime(long longTime, String dateformat) throws Exception {
        Date nowTime = new Date(longTime);
        SimpleDateFormat format = new SimpleDateFormat(dateformat);
        return stringToDate(format.format(nowTime), dateformat);
    }

    /**
     * @return
     */
    public static long getSystemTime() {
        Date date = new Date();
        return (date.getTime()) / 1000;
    }

    /**
     * 获得几天之前或者几天之后的日期
     *
     * @param diff 差值：正的往后推，负的往前推
     * @return
     */
    public static String getOtherDay(int diff) {
        Calendar mCalendar = Calendar.getInstance();
        mCalendar.add(Calendar.DATE, diff);
        return dateToString(mCalendar.getTime(), DATE_DEFAULT_FORMAT);
    }

    /**
     * date要转换的date类型的时间
     */
    public static long dateToLong(Date date) {
        return date.getTime();
    }

    // strTime要转换的String类型的时间
    // formatType时间格式
    // strTime的时间格式和formatType的时间格式必须相同
    public static long stringToLong(String strTime, String formatType)
            throws ParseException {
        Date date = null; // String类型转成date类型
        try {
            date = stringToDate(strTime, formatType);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (date == null) {
            return 0;
        } else {
            long currentTime = dateToLong(date); // date类型转成long类型
            return currentTime;
        }
    }

    /**
     * 根据时间值（单位：秒）获取天数
     * @param intervalTime
     * @return
     */
    public static long getDaysByIntervalTime(long intervalTime) {
        if (intervalTime < 0) { // 判断是否为负值
            intervalTime = -intervalTime;
        }
        long days = intervalTime / (24 * 60 * 60);
        return days;
    }

    /**
     * 根据时间值（单位：秒）获取小时数
     * @param intervalTime
     * @return
     */
    public static long getHoursByIntervalTime(long intervalTime) {
        if (intervalTime < 0) { // 判断是否为负值
            intervalTime = -intervalTime;
        }
        long lastIntervalTime = intervalTime;
        // 先获取天数
        long days = getDaysByIntervalTime(intervalTime);
        if (days > 0) {
            lastIntervalTime = intervalTime - days * 24 * 60 * 60;
        }
        long hours = lastIntervalTime / (60 * 60);
        return hours;
    }

    /**
     * 根据时间值（单位：秒）获取格式化后的时间
     * @param intervalTime
     * @return 返回格式：N天 H小时 M分钟
     */
    public static String getRemainByIntervalTime(long intervalTime) {
        String timeStr = "";
        if (intervalTime < 0) { // 判断是否为负值
            intervalTime = -intervalTime;
        }
        long lastIntervalTime = intervalTime;
        // 先获取天数
        long days = getDaysByIntervalTime(intervalTime);
        if (days > 0) {
            timeStr += days + "天";
            lastIntervalTime = lastIntervalTime - days * 24 * 60 * 60;
        }
        // 获取小时数
        long hours = getHoursByIntervalTime(lastIntervalTime);
        if (hours > 0) {
            timeStr += " " + hours + "小时";
            lastIntervalTime = lastIntervalTime - hours * 60 * 60;
        }
        // 获取分钟
        long minutes = lastIntervalTime / 60;
        if (minutes > 0) {
            timeStr += " " + minutes + "分钟";
        }
        return timeStr;
    }
}
