package cn.imppp.knowlege.repository.db;


import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.imppp.knowlege.repository.db.util.DBStringUtils;
import cn.imppp.knowlege.repository.db.util.DateUtils;


/**
 * Created by Lee on 2017-04-23.
 */
public class DBOperate<T> {

    private static final String TAG = "DBOperate";

    private DBManager manager;
    private SQLiteDatabase db;

    public DBOperate() {
        //创建数据库
        manager = DBManager.newInstances();
        db = manager.getDataBase();
    }

    /**
     * 查询列表
     *
     * @param tableName     查询的数据库的名字
     * @param entity        查询的数据库所对应的module
     * @param columns       查询的字段名
     * @param selection     where字段
     * @param selectionArgs where字段对应的值
     * @param <T>           泛型
     * @return 返回查询结果
     */
    public <T> ArrayList<T> query(String tableName, Class<T> entity, String[] columns, String selection,
                                  String[] selectionArgs) {
        ArrayList<T> list = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = db.query(tableName, columns, selection, selectionArgs, null, null, null, null);
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                T t = entity.newInstance();
                for (int i = 0; i < cursor.getColumnCount(); i++) {
                    String content = cursor.getString(i);//获得获取的数据记录第i条字段的内容
                    if (content != null) {
                        String columnName = cursor.getColumnName(i);// 获取数据记录第i条字段名的
                        Field field = entity.getDeclaredField(columnName);//获取该字段名的Field对象。
                        field.setAccessible(true);//取消对age属性的修饰符的检查访问，以便为属性赋值
                        field.set(t, content);
                        field.setAccessible(false);//恢复对age属性的修饰符的检查访问
                    }
                }
                list.add(t);
                cursor.moveToNext();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
        return list;
    }

    /**
     * 根据ID查询一个对象
     *
     * @param tableName     表名
     * @param entity        返回对应的实体
     * @param columns       查询的列名
     * @param selection     where对应的字段
     * @param selectionArgs where对应的字段值
     * @return <T>
     */
    public <T> Class<T> queryById(String tableName, Class<T> entity, String[] columns, String selection,
                                  String[] selectionArgs) {
        Cursor cursor = null;
        try {
            cursor = db.query(tableName, columns, selection, selectionArgs, null, null, null, null);
            cursor.moveToFirst();
            if (cursor != null) {
                if (entity == null) {
                    entity.newInstance();
                }
                for (int i = 0; i < cursor.getColumnCount(); i++) {
                    String content = cursor.getString(i);//获得获取的数据记录第i条字段的内容
                    if (content != null) {
                        String columnName = cursor.getColumnName(i);// 获取数据记录第i条字段名的
                        Field field = entity.getDeclaredField(columnName);//获取该字段名的Field对象。
                        field.setAccessible(true);//取消对age属性的修饰符的检查访问，以便为属性赋值
                        field.set(entity, content);
                        field.setAccessible(false);//恢复对age属性的修饰符的检查访问
                    }
                }
                cursor.moveToNext();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
        return entity;
    }

    /**
     * 向数据库插入数据
     *
     * @param tableName 删除数据库的表名
     * @param t         代表泛型需要写入的对象
     */
    public long insert(String tableName, Object t) {
        long id = -1;
        Field[] fields = t.getClass().getDeclaredFields();//获取对象定义的属性
        ContentValues values = new ContentValues();
        try {
            Object obj = null;
            for (Field field : fields) {
                if ((field.getName().toLowerCase()).equals("serialVersionUID".toLowerCase())) {
                    continue;
                }
                field.setAccessible(true); //取消对age属性的修饰符的检查访问，以便为属性赋值
                Class<?> caller = field.getType();//获取属性定义的类型
                obj = field.get(t);
                if (obj == null) {
                    continue;
                }
                String columnName = DBStringUtils.convert2ColumnName(field.getName());

                //下面将根据不同的类型做不同的处理
                if (Integer.class == caller || int.class == caller) {
                    values.put(columnName, Integer.valueOf(String.valueOf(obj)));
                } else if (Double.class == caller || double.class == caller) {
                    values.put(columnName, Double.valueOf(String.valueOf(obj)));
                } else if (Long.class == caller || long.class == caller) {
                    values.put(columnName, Long.valueOf(String.valueOf(obj)));
                }

                if (String.class == caller) {
                    values.put(columnName, String.valueOf(obj));
                }
                field.setAccessible(false);//恢复对age属性的修饰符的检查访问
            }
            id = db.insert(tableName, null, values);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return id;
    }

    /**
     * 删除数据
     *
     * @param tableName   删除数据库的表名
     * @param whereClause where字段
     * @param whereArgs   where字段对应的值
     */
    public void delete(String tableName, String whereClause, String[] whereArgs) {
        db.delete(tableName, whereClause, whereArgs);
    }

    /**
     * @param tableName   更改数据的数据表
     * @param t           代表泛型需要修改的对象
     * @param whereClause where字段
     * @param whereArgs   where字段对应的值
     */
    public void update(String tableName, T t, String whereClause, String[] whereArgs) {
        try {
            Field[] fields = t.getClass().getDeclaredFields();//获取对象定义的属性
            ContentValues values = new ContentValues();
            for (Field field : fields) {
                field.setAccessible(true); //取消对age属性的修饰符的检查访问，以便为属性赋值
                Class<?> caller = field.getType();//获取属性定义的类型
                //下面将根据不同的类型做不同的处理
                if (String.class == caller) {
                    values.put(field.getName(), String.valueOf(field.get(t)));
                }
                field.setAccessible(false);//恢复对age属性的修饰符的检查访问
            }
            db.update(tableName, values, whereClause, whereArgs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @param @param tableName
     * @param @param values
     * @param @param whereClause
     * @param @param whereArgs 设定文件
     * @return void 返回类型
     * @Title: update
     * @Description: 更新
     */
    public void update(String tableName, ContentValues values, String whereClause, String[] whereArgs) {
        db.update(tableName, values, whereClause, whereArgs);
    }

    //-------start added by wangtaon on 20170502 增删改查另一种实现方式-----------------

    /**
     * 添加对象
     *
     * @param sql
     * @param value
     */
    public void addData(String sql, Object[] value) {
        //SQLiteDatabase db = databaseHelper.getWritableDatabase();// 创建或者打开一个可写数据库
        // 插入数据
       /* db.execSQL("INSERT INTO person(name, age) VALUES(?,?)", new Object[]
                {
                        person.getName(), person.getAge()
                });*/
        db.execSQL(sql, value);
        Log.i("adta", sql);
    }

    /**
     * 直接执行sql
     * @param sql
     */
    public void execSql(String sql) {
        //SQLiteDatabase db = databaseHelper.getWritableDatabase();// 创建或者打开一个可写数据库
        // 插入数据
       /* db.execSQL("INSERT INTO person(name, age) VALUES(?,?)", new Object[]
                {
                        person.getName(), person.getAge()
                });*/
        db.execSQL(sql);
        Log.i("execSql", sql);
    }

    /**
     * 添加对象集合
     *
     * @param sql
     * @param values
     */
    public void addDatas(String sql, Object[][] values) {
        //SQLiteDatabase db = databaseHelper.getWritableDatabase();// 创建或者打开一个可写数据库
        db.beginTransaction(); // 开始事务
        try {
            for (Object[] value : values) {
                /*db.execSQL("INSERT INTO person(name, age) VALUES(?, ?)", new Object[]
                        {
                                person.getName(), person.getAge()
                        });*/
                if (value == null || value.length == 0
                        || value[0] == null || "".equals(String.valueOf(value[0]).trim())) {
                    break;
                }
                db.execSQL(sql, value);
                Log.i("addDatas", sql);
            }
            db.setTransactionSuccessful(); // 设置事务成功完成
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            db.endTransaction(); // 结束事务
        }
    }

    public void addDatas(String sql, List<Object[]> values) {
        //SQLiteDatabase db = databaseHelper.getWritableDatabase();// 创建或者打开一个可写数据库
        db.beginTransaction(); // 开始事务
        try {
            for (Object[] value : values) {
                /*db.execSQL("INSERT INTO person(name, age) VALUES(?, ?)", new Object[]
                        {
                                person.getName(), person.getAge()
                        });*/
/*                if(value == null || value.length == 0
                        || value[0] == null || "".equals(String.valueOf(value[0]).trim())){
                    break;
                }*/
                db.execSQL(sql, value);
                Log.i("addDatas", sql);
            }
            db.setTransactionSuccessful(); // 设置事务成功完成
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            db.endTransaction(); // 结束事务
        }
    }

    /**
     * 更新数据
     *
     * @param sql
     * @param value
     */
    public void updateData(String sql, Object[] value) {
        //SQLiteDatabase db = databaseHelper.getWritableDatabase();
        /*db.execSQL("update person set name=?,age=? where personid=?", new Object[]
                {
                        person.getName(), person.getAge(), person.getId()
                });*/
        db.execSQL(sql, value);
    }

    //start added by gaoQl on 2019/06/17
    /**
     * 更新数据
     *
     * @param sql
     */
    public void updateData(String sql) {
        db.execSQL(sql);
    }
    //end added by gaoQl on 2019/06/17

    /**
     * 删除记录
     *
     * @param sql
     * @param value
     */
    public void deleteData(String sql, Object[] value) {
        /*db.execSQL("delete from person where personid=?", new Object[]
                {
                        id
                });*/
        db.execSQL(sql, value);
    }

    /**
     * 删除全部记录
     *
     * @param sql
     */
    public void deleteAllData(String sql) {
        db.execSQL(sql);
    }

    /**
     * 查询单条数据
     *
     * @param sql
     * @param value
     * @param clazz
     * @return
     */
    public T queryData(String sql, String[] value, final Class<T> clazz) {
        T entity = null;
        Cursor cursor = null;

        try {
            /*Cursor cursor = db.rawQuery("select * from person where personid=?", new String[]
                    {
                            String.valueOf(id)
                    });*/
            cursor = db.rawQuery(sql, value);
            if (cursor != null && cursor.getCount() > 0) {
                cursor.moveToFirst();
                Field[] fileds = clazz.getDeclaredFields();
                if (entity == null) {
                    entity = clazz.newInstance();
                }
                for (int i = 0; i < cursor.getColumnCount(); i++) {

                    String columnName = cursor.getColumnName(i);// 获取数据记录第i条字段名
                    String fieldName = DBStringUtils.conver2Field(columnName);// 获取数据记录第i条字段名的
                    boolean flag = false;
                    /**
                     * 判断属性名是否为实体的属性
                     */
                    for (Field tempField : fileds) {
                        if (fieldName.equals(tempField.getName())) {
                            flag = true;
                            break;
                        }
                    }
                    if (flag) {
                        Field field = clazz.getDeclaredField(fieldName);//获取该字段名的Field对象
                        field.setAccessible(true);//取消对age属性的修饰符的检查访问，以便为属性赋值
                        if (field.getType() == String.class) {
                            String content = cursor.getString(cursor.getColumnIndex(columnName));
                            field.set(entity, content);
                        } else if (field.getType() == Integer.class) {
                            int content = cursor.getInt(cursor.getColumnIndex(columnName));
                            field.set(entity, content);
                        } else if (field.getType() == Long.class) {
                            long content = cursor.getLong(cursor.getColumnIndex(columnName));
                            field.set(entity, content);
                        } else if (field.getType() == Date.class) {
                            String tempDate = cursor.getString(cursor.getColumnIndex(columnName));
                            if (tempDate != null && tempDate.length() > 0) {
                                int len = tempDate.trim().length();
                                if (len == 10) {
                                    field.set(entity, DateUtils.stringToDate(tempDate, DateUtils.DATE_DEFAULT_FORMAT));
                                } else if (len == 19) {
                                    field.set(entity, DateUtils.stringToDate(tempDate, DateUtils.DATETIME_DEFAULT_FORMAT));
                                }
                            }

                            // String myDate = cursor.getString(cursor.getColumnIndex("datetime(timestamp,'" + columnName + "')"));
                            //Log.e("-queryDatas-myDate-", myDate);
                            //field.set(t, myDate);
                        }
                        field.setAccessible(false);//恢复对age属性的修饰符的检查访问
                    }
                }
                cursor.moveToNext();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
        return entity;
    }

    /**
     * 查询记录集合
     *
     * @param sql
     * @param value
     * @param clazz
     * @return
     */
    public List<T> queryDatas(String sql, String[] value, final Class<T> clazz) {
        List<T> list = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = db.rawQuery(sql, value);
            if (cursor != null && cursor.getCount() > 0) {
                cursor.moveToFirst();
                Field[] fileds = clazz.getDeclaredFields();
                while (!cursor.isAfterLast()) {
                    T t = clazz.newInstance();
                    for (int i = 0; i < cursor.getColumnCount(); i++) {
                        String columnName = cursor.getColumnName(i);// 获取数据记录第i条字段名
                        String fieldName = DBStringUtils.conver2Field(columnName);// 获取数据记录第i条字段名的
                        boolean flag = false;
                        /**
                         * 判断属性名是否为实体的属性
                         */
                        for (Field tempField : fileds) {
                            if (fieldName.equals(tempField.getName())) {
                                flag = true;
                                break;
                            }
                        }
                        if (flag) {
                            Field field = clazz.getDeclaredField(fieldName);//获取该字段名的Field对象
                            field.setAccessible(true);//取消对age属性的修饰符的检查访问，以便为属性赋值
                            if (field.getType() == String.class) {
                                String content = cursor.getString(cursor.getColumnIndex(columnName));
                                field.set(t, content);
                            } else if (field.getType() == Integer.class) {
                                int content = cursor.getInt(cursor.getColumnIndex(columnName));
                                field.set(t, content);
                            } else if (field.getType() == Long.class) {
                                long content = cursor.getLong(cursor.getColumnIndex(columnName));
                                field.set(t, content);
                            } else if (field.getType() == Date.class) {
                                String tempDate = cursor.getString(cursor.getColumnIndex(columnName));
                                if (tempDate != null && tempDate.length() > 0) {
                                    int len = tempDate.trim().length();
                                    if (len == 10) {
                                        field.set(t, DateUtils.stringToDate(tempDate, DateUtils.DATE_DEFAULT_FORMAT));
                                    } else if (len == 19) {
                                        field.set(t, DateUtils.stringToDate(tempDate, DateUtils.DATETIME_DEFAULT_FORMAT));
                                    }
                                }
                                // String myDate = cursor.getString(cursor.getColumnIndex("datetime(timestamp,'" + columnName + "')"));
                                //Log.e("-queryDatas-myDate-", myDate);
                                //field.set(t, myDate);
                            }
                            field.setAccessible(false);//恢复对age属性的修饰符的检查访问
                        }
                    }
                    list.add(t);
                    cursor.moveToNext();
                }
            }
        } catch (Exception e) {
            Log.e("---queryDatas--ee--", e.getMessage());
            e.printStackTrace();
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
        return list;
    }

    /**
     * 查询记录集合,集合对象为单个字段字符串
     *
     * @param sql
     * @param value
     * @return
     */
    public List<String> queryDatasForStr(String sql, String[] value) {
        List<String> list = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = db.rawQuery(sql, value);
            if (cursor != null && cursor.getCount() > 0) {
                cursor.moveToFirst();
                while (!cursor.isAfterLast()) {
                    String content = cursor.getString(0);
                    list.add(content);
                    cursor.moveToNext();
                }
            }
        } catch (Exception e) {
            Log.e("---queryDatasForStr--", e.getMessage());
            e.printStackTrace();
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
        return list;
    }

    /**
     * 获取记录总数
     *
     * @param tableName
     * @param value
     * @return
     */
    public long countData(String tableName, String whrSql, String[] value) {
        //SQLiteDatabase db = databaseHelper.getReadableDatabase();
        // 没有占位符参数的话，直接用null
        //Cursor cursor = db.rawQuery("select * from person", null);
        String sql = "select * from " + tableName + " " + whrSql;
        Cursor cursor = db.rawQuery(sql, value);
        int count = cursor.getCount();
        cursor.close();
        return count;
    }

    /**
     * 查询总数
     * @param sql
     * @param value
     * @return
     */
    public long queryDataCount(String sql, String[] value) {
        long size = 0;
        Cursor cursor = null;
        try {
            cursor = db.rawQuery(sql, value);
            if (cursor != null && cursor.getCount() > 0) {
                cursor.moveToFirst();
                while (!cursor.isAfterLast()) {
                    size = Long.parseLong(cursor.getString(cursor.getColumnIndex("num")));
                    cursor.moveToNext();
                }
            }
        } catch (Exception e) {
            Log.e("---queryDatas--ee--", e.getMessage());
            e.printStackTrace();
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
        return size;
    }

    /**
     * 分页查询
     *
     * @param tableName
     * @param offset
     * @param count
     * @param clazz
     * @return
     */
    public List<T> getScrollData(String tableName, int offset, int count, final Class<T> clazz) {
        List<T> list = new ArrayList();
        Cursor cursor = null;
        try {
            String sql = "select * from " + tableName + " limit ?,?";
            cursor = db.rawQuery(sql, new String[]{
                    String.valueOf(offset), String.valueOf(count)
            });
            if (cursor != null && cursor.getCount() > 0) {
                cursor.moveToFirst();
                Field[] fileds = clazz.getDeclaredFields();
                while (!cursor.isAfterLast()) {
                    T t = clazz.newInstance();
                    for (int i = 0; i < cursor.getColumnCount(); i++) {
                        String columnName = cursor.getColumnName(i);// 获取数据记录第i条字段名的
                        String fieldName = DBStringUtils.conver2Field(columnName);// 获取数据记录第i条字段名的
                        boolean flag = false;
                        /**
                         * 判断属性名是否为实体的属性
                         */
                        for (Field tempField : fileds) {
                            if (fieldName.equals(tempField.getName())) {
                                flag = true;
                                break;
                            }
                        }
                        if (flag) {
                            Field field = clazz.getDeclaredField(fieldName);//获取该字段名的Field对象
                            field.setAccessible(true);//取消对age属性的修饰符的检查访问，以便为属性赋值
                            if (field.getType() == String.class) {
                                String content = cursor.getString(cursor.getColumnIndex(columnName));
                                field.set(t, content);
                            } else if (field.getType() == Integer.class) {
                                int content = cursor.getInt(cursor.getColumnIndex(columnName));
                                field.set(t, content);
                            } else if (field.getType() == Long.class) {
                                long content = cursor.getLong(cursor.getColumnIndex(columnName));
                                field.set(t, content);
                            } else if (field.getType() == Date.class) {
                                // String myDate = cursor.getString(cursor.getColumnIndex("datetime(timestamp,'" + columnName + "')"));
                                //Log.e("-queryDatas-myDate-", myDate);
                                //field.set(t, myDate);
                            }
                            field.setAccessible(false);//恢复对age属性的修饰符的检查访问
                        }
                    }
                    list.add(t);
                    cursor.moveToNext();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
        cursor.close();

        return list;
    }


    /**
     * 查询记录集合
     *
     * @param sql
     * @param value
     * @param clazz
     * @return
     */
    public List<T> queryImsiDatas(String sql, String[] value, final Class<T> clazz) {
        List<T> list = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = db.rawQuery(sql, value);
            if (cursor != null && cursor.getCount() > 0) {
                cursor.moveToFirst();
                Field[] fileds = clazz.getDeclaredFields();
                while (!cursor.isAfterLast()) {
                    T t = clazz.newInstance();
                    for (int i = 0; i < cursor.getColumnCount(); i++) {
                        String columnName = cursor.getColumnName(i);// 获取数据记录第i条字段名
                        String fieldName = DBStringUtils.conver2Field(columnName);// 获取数据记录第i条字段名的
                        boolean flag = false;
                        /**
                         * 判断属性名是否为实体的属性
                         */
                        for (Field tempField : fileds) {
                            if (fieldName.equals(tempField.getName())) {
                                flag = true;
                                break;
                            }
                        }
                        if (flag) {
                            Field field = clazz.getDeclaredField(fieldName);//获取该字段名的Field对象
                            field.setAccessible(true);//取消对age属性的修饰符的检查访问，以便为属性赋值
                            if (field.getType() == String.class) {
                                String content = cursor.getString(cursor.getColumnIndex(columnName));
                                field.set(t, content);
                            } else if (field.getType() == Integer.class) {
                                int content = cursor.getInt(cursor.getColumnIndex(columnName));
                                field.set(t, content);
                            } else if (field.getType() == Long.class) {
                                long content = cursor.getLong(cursor.getColumnIndex(columnName));
                                field.set(t, content);
                            } else if (field.getType() == Date.class) {
                                String tempDate = cursor.getString(cursor.getColumnIndex(columnName));
                                if (tempDate != null && tempDate.length() > 0) {
                                    int len = tempDate.trim().length();
                                    if (len == 10) {
                                        field.set(t, DateUtils.stringToDate(tempDate, DateUtils.DATE_DEFAULT_FORMAT));
                                    } else if (len == 19) {
                                        field.set(t, DateUtils.stringToDate(tempDate, DateUtils.DATETIME_DEFAULT_FORMAT));
                                    }
                                }
                                // String myDate = cursor.getString(cursor.getColumnIndex("datetime(timestamp,'" + columnName + "')"));
                                //Log.e("-queryDatas-myDate-", myDate);
                                //field.set(t, myDate);
                            }
                            field.setAccessible(false);//恢复对age属性的修饰符的检查访问
                        }
                    }
                    list.add(t);
                    cursor.moveToNext();
                }
            }
        } catch (Exception e) {
            Log.e("---queryDatas--ee--", e.getMessage());
            e.printStackTrace();
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
        return list;
    }

    /**
     * 返回单条记录
     * @param sql
     * @param value
     * @return
     */
    public Map<String, String> queryData(String sql, String[] value) {
        //SQLiteDatabase db = databaseHelper.getReadableDatabase();
        Map<String, String> retMap = new HashMap<String, String>();
        // 没有占位符参数的话，直接用null
        //Cursor cursor = db.rawQuery("select * from person", null);
        Cursor cursor = db.rawQuery(sql, value);
        if (cursor != null && cursor.getCount() > 0) {
            cursor.moveToFirst();
            for (int i = 0; i < cursor.getColumnCount(); i++) {
                String columnName = cursor.getColumnName(i);// 获取数据记录第i条字段名
                String content = cursor.getString(cursor.getColumnIndex(columnName));
                retMap.put(columnName, content);
            }
        }
        cursor.close();
        return retMap;
    }

    /**
     * 根据条件查询栏位，返回List<Map<String, String>>
     * @param sql
     * @param value
     * @return
     */
    public List<Map<String, String>> queryDatas(String sql, String[] value) {
        List<Map<String, String>> list = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = db.rawQuery(sql, value);
            if (cursor != null && cursor.getCount() > 0) {
                cursor.moveToFirst();
                while (!cursor.isAfterLast()) {
                    Map<String, String> map = new HashMap<>();
                    for (int i = 0; i < cursor.getColumnCount(); i++) {
                        String columnName = cursor.getColumnName(i);// 获取数据记录第i条字段名
                        String content = cursor.getString(cursor.getColumnIndex(columnName));
                        map.put(columnName.toLowerCase(), content);
                    }
                    list.add(map);
                    cursor.moveToNext();
                }
            }
        } catch (Exception e) {
            Log.e("---queryDatas----", e.getMessage());
            e.printStackTrace();
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
        return list;
    }

    //-------end added by wangtaon on 20170502 增删改查另一种实现方式-----------------

}
