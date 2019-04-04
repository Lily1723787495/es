package cn.edu.dgut.educationalsystem.model;

public class CourseTeacherRecord {
    private Integer recordId;

    private Integer courseId;

    private Integer teacherId;

    private String planUrl;

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getPlanUrl() {
        return planUrl;
    }

    public void setPlanUrl(String planUrl) {
        this.planUrl = planUrl == null ? null : planUrl.trim();
    }
}