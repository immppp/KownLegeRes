package cn.imppp.knowlege.repository.db;


import android.database.sqlite.SQLiteDatabase;
import cn.imppp.knowlege.app.App;

/**
 * Created by Lee on 2017-04-23.
 */

public class DBManager {
    private static DBManager manager;
    private MySQLiteOpenHelper mySQLiteOpenHelper;
    private SQLiteDatabase db;

    /**
     * 私有化构造器
     */
    private DBManager() {
        //创建数据库
        mySQLiteOpenHelper = MySQLiteOpenHelper.getInstance(App.getContext());
        if (db == null) {
            db = mySQLiteOpenHelper.getWritableDatabase();
        }
    }

    /**
     * 单例DbManager类
     *
     * @return 返回DbManager对象
     */
    public static DBManager newInstances() {
        if (manager == null) {
            manager = new DBManager();
        }
        return manager;
    }

    /**
     * 获取数据库的对象
     *
     * @return 返回SQLiteDatabase数据库的对象
     */
    public SQLiteDatabase getDataBase() {
        return db;
    }

    /**
     * 关闭数据库
     * 在SQLiteOpenHelper中如果连接不存在则创建连接，如果连接已存在会直接利用原有的连接
     * 所以close函数不必每次执行完操作后关闭，根据实际情况选择关闭
     */
    public void closeDataBase() {
        if(db != null){
            db.close();
        }
    }
}
