package cn.imppp.knowlege.repository.db;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: DBConfig
 * @Author: gaoQl
 * @Description: 数据库表结构
 * @Date: 2019/12/27 9:34 AM
 * @Company: 杭州达恒科技
 * @Version: 1.0
 */

public class DBConfig {

    public static final String HISTORY_RECORD = "history_record";//历史查询
    public static final String RECORD_CENTURY = "record_century";//收藏中心

    /**
     * 返回创建表结构的sql集合
     *
     * @return
     */
    public static List<String> onCreate() {
        List<String> sqlList = new ArrayList<String>();
        sqlList.add(createHistoryRecord());     // 历史查询
        sqlList.add(createRecordCentury());     // 收藏中心
        return sqlList;
    }

    private static String createHistoryRecord() {
        StringBuilder sql = new StringBuilder();
        sql.append("create table if not exists " + HISTORY_RECORD + "(");
        sql.append("SEQ_NUM INTEGER PRIMARY KEY NOT NULL,");//主键
        sql.append("QUERY_CONTENT VARCHAR(100),");    //查询内容
        sql.append("CREATE_TIME TIMESTAMP default (datetime('now', 'localtime')),");//创建时间
        sql.append("UPDATE_TIME DATETIME,");//修改时间
        sql.append("DEL_FLAG INTEGER NOT NULL default 0)");//删除标记
        return sql.toString();
    }

    private static String createRecordCentury() {
        StringBuilder sql = new StringBuilder();
        sql.append("create table if not exists " + RECORD_CENTURY + "(");
        sql.append("SEQ_NUM INTEGER PRIMARY KEY NOT NULL,");//主键
        sql.append("RECORD_TAG INTEGER NOT NULL,");     //记录的标记
        sql.append("RECORD_TITLE VARCHAR(100),");       // 收藏的标题
        sql.append("CREATE_TIME TIMESTAMP default (datetime('now', 'localtime')),");//创建时间
        sql.append("UPDATE_TIME DATETIME,");//修改时间
        sql.append("DEL_FLAG INTEGER NOT NULL default 0)");//删除标记
        return sql.toString();
    }

}
