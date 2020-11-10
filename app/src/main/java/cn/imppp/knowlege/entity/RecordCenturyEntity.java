package cn.imppp.knowlege.entity;

import java.util.Date;

public class RecordCenturyEntity {
    private Long seqNum;
    private Integer recordTag;
    private String recordTitle;
    private String createTime;
    private Date updateTime;
    private int delFlag=0;

    public Long getSeqNum() {
        return seqNum;
    }

    public void setSeqNum(Long seqNum) {
        this.seqNum = seqNum;
    }

    public Integer getRecordTag() {
        return recordTag;
    }

    public void setRecordTag(Integer recordTag) {
        this.recordTag = recordTag;
    }

    public String getRecordTitle() {
        return recordTitle;
    }

    public void setRecordTitle(String recordTitle) {
        this.recordTitle = recordTitle;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public int getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(int delFlag) {
        this.delFlag = delFlag;
    }
}
