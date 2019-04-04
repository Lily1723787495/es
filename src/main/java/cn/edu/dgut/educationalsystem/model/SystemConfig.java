package cn.edu.dgut.educationalsystem.model;

import java.util.Date;

public class SystemConfig {
    private Integer configId;

    private Date startMakeUpTime;

    private Date endMakeUpTime;

    private Date startRetakeTime;

    private Date endRetakeTime;

    private Date startSlowTime;

    private Date endSlowTime;

    private String title;

    private Boolean enable;

    private Date createTime;

    public Integer getConfigId() {
        return configId;
    }

    public void setConfigId(Integer configId) {
        this.configId = configId;
    }

    public Date getStartMakeUpTime() {
        return startMakeUpTime;
    }

    public void setStartMakeUpTime(Date startMakeUpTime) {
        this.startMakeUpTime = startMakeUpTime;
    }

    public Date getEndMakeUpTime() {
        return endMakeUpTime;
    }

    public void setEndMakeUpTime(Date endMakeUpTime) {
        this.endMakeUpTime = endMakeUpTime;
    }

    public Date getStartRetakeTime() {
        return startRetakeTime;
    }

    public void setStartRetakeTime(Date startRetakeTime) {
        this.startRetakeTime = startRetakeTime;
    }

    public Date getEndRetakeTime() {
        return endRetakeTime;
    }

    public void setEndRetakeTime(Date endRetakeTime) {
        this.endRetakeTime = endRetakeTime;
    }

    public Date getStartSlowTime() {
        return startSlowTime;
    }

    public void setStartSlowTime(Date startSlowTime) {
        this.startSlowTime = startSlowTime;
    }

    public Date getEndSlowTime() {
        return endSlowTime;
    }

    public void setEndSlowTime(Date endSlowTime) {
        this.endSlowTime = endSlowTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}