package cn.imppp.knowlege.repository.dao;

import android.text.TextUtils;
import android.util.Log;

import java.util.List;

import cn.imppp.knowlege.entity.HistoryRecordEntity;
import cn.imppp.knowlege.entity.RecordCenturyEntity;
import cn.imppp.knowlege.repository.db.DBConfig;
import cn.imppp.knowlege.repository.db.DBOperate;

/**
 * @ClassName: RecordCenturyDao
 * @Author: qaq
 * @Description: 收藏中心
 * @Date: 2020/10/9 1:48 PM
 * @Company: 杭州达恒科技
 * @Version: 1.0
 */

public class RecordCenturyDao {

    private final DBOperate<RecordCenturyEntity> dbOperate;

    public RecordCenturyDao() {
        dbOperate = new DBOperate<>();
    }

    public boolean insertData(RecordCenturyEntity deviceSnEntity) {
        boolean flag = false;

        try {
            long result = dbOperate.insert(DBConfig.RECORD_CENTURY, deviceSnEntity);
            if (result > 0) {
                flag = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    // 查询所有历史数据
    public List<RecordCenturyEntity> queryDataList() {
        try {
            String sql = "select * from " + DBConfig.RECORD_CENTURY;
            return dbOperate.queryDatas(sql, null, RecordCenturyEntity.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    // 删除数据
    public boolean deleteData(RecordCenturyEntity deviceSnEntity) {
        boolean flag = false;
        try {
            String sql = "delete from " + DBConfig.RECORD_CENTURY + " where RECORD_TAG=? ";
            Object[] values = new Object[]{deviceSnEntity.getRecordTag()};
            dbOperate.deleteData(sql, values);
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("删除失败", "fail");
        }
        return flag;
    }

    // 查询某数据是否存在
    public boolean exesit(int deviceSnEntity) {
        boolean flag = false;
        try {
            String sql = "select * from " + DBConfig.RECORD_CENTURY + " where RECORD_TAG=?";
            String[] values = new String[]{String.valueOf(deviceSnEntity)};
            List<RecordCenturyEntity> list = dbOperate.queryDatas(sql, values, RecordCenturyEntity.class);
            if (list != null && list.size() > 0 && !TextUtils.isEmpty(list.get(0).getRecordTitle())) {
                flag = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }
}
