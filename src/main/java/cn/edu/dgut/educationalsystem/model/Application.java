package cn.edu.dgut.educationalsystem.model;

import java.util.Date;

public class Application {
    private Integer appId;

    private Integer studentId;

    private Integer courseId;

    private Date createTime;

    private Integer status;

    private Integer appType;

    private Integer dealTeacherId;

    private Integer dealAdminId;

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getAppType() {
        return appType;
    }

    public void setAppType(Integer appType) {
        this.appType = appType;
    }

    public Integer getDealTeacherId() {
        return dealTeacherId;
    }

    public void setDealTeacherId(Integer dealTeacherId) {
        this.dealTeacherId = dealTeacherId;
    }

    public Integer getDealAdminId() {
        return dealAdminId;
    }

    public void setDealAdminId(Integer dealAdminId) {
        this.dealAdminId = dealAdminId;
    }
}