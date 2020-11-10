package cn.imppp.knowlege.repository.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.List;

/**
 * @ClassName: MySQLiteOpenHelper
 * @Author: gQl
 * @Description: 数据库的openHelper类
 * @Date: 2020/4/26 10:27 PM
 * @Company: 杭州达恒科技
 * @Version: 1.0
 */

public class MySQLiteOpenHelper extends SQLiteOpenHelper {
    private static MySQLiteOpenHelper helper;
    private static String TAG = "MySQLiteOpenHelper";
    //数据库版本号
    public static final int DB_VERSION = 1;

    //构造器,传入四个参数Context对象，数据库名字name，操作数据库的Cursor对象，版本号version。
    private MySQLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    //为了简化构造器的使用，我们自定义一个构造器
    private MySQLiteOpenHelper(Context context, String name) {
        this(context, name, null, DB_VERSION);//传入Context和数据库的名称，调用上面那个构造器
    }
    //将自定义的数据库创建类单例。
    public static  synchronized MySQLiteOpenHelper getInstance(Context context) {
        if(helper==null){
            helper = new MySQLiteOpenHelper(context, "konwdb");//数据库名称为konwdb。
        }
        return  helper;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        int initVersion = 1;    //初始化数据库版本号
        //初始化数据库
        List<String> sqlList = DBConfig.onCreate();
        for (int i = 0; i < sqlList.size(); i++) {
            sqLiteDatabase.execSQL(sqlList.get(i));
        }
        //如果是非1.0版本更新，则执行update方法
        onUpgrade(sqLiteDatabase, initVersion, DB_VERSION);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        //用于升级数据库，只需要在创建本类对象时传入一个比之前创建传入的version大的数即可。
        for (int i = oldVersion; i <= newVersion; i++) {
            switch (i) {
                case 1:
                    Log.i(TAG, "第一个数据库，无更新内容");
                    break;
                case 2: // 2版本更新内容，更改数据库结构或者增删数据
                    Log.i(TAG, "更新第二版数据库,添加查询元素表");
                    break;
                default:
                    break;
            }
        }
    }


}