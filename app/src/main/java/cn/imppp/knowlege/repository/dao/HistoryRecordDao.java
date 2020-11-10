package cn.imppp.knowlege.repository.dao;
import android.util.Log;

import java.util.List;
import cn.imppp.knowlege.entity.HistoryRecordEntity;
import cn.imppp.knowlege.repository.db.DBConfig;
import cn.imppp.knowlege.repository.db.DBOperate;

/**
 * @ClassName: HistoryRecordDao
 * @Author: qaq
 * @Description: 历史数据
 * @Date: 2020/10/9 1:48 PM
 * @Company: 杭州达恒科技
 * @Version: 1.0
 */

public class HistoryRecordDao {

    private final DBOperate<HistoryRecordEntity> dbOperate;

    public HistoryRecordDao() {
        dbOperate = new DBOperate<>();
    }

    public boolean insertData(HistoryRecordEntity deviceSnEntity) {
        boolean flag = false;

        try {
            long result = dbOperate.insert(DBConfig.HISTORY_RECORD, deviceSnEntity);
            if (result > 0) {
                flag = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    // 查询所有历史数据
    public List<HistoryRecordEntity> queryDataList() {
        try {
            String sql = "select * from " + DBConfig.HISTORY_RECORD;
            return dbOperate.queryDatas(sql, null, HistoryRecordEntity.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    // 删除数据
    public boolean deleteData(HistoryRecordEntity deviceSnEntity) {
        boolean flag = false;
        try {
            String sql = "delete from " + DBConfig.HISTORY_RECORD + " where SEQ_NUM=? ";
            Object[] values = new Object[]{deviceSnEntity.getSeqNum()};
            dbOperate.deleteData(sql, values);
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }
}
