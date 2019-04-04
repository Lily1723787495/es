package cn.edu.dgut.educationalsystem.model;

public class CourseStudentRecord {
    private Integer recordId;

    private Integer studentId;

    private Integer courseTeacherRecordId;

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getCourseTeacherRecordId() {
        return courseTeacherRecordId;
    }

    public void setCourseTeacherRecordId(Integer courseTeacherRecordId) {
        this.courseTeacherRecordId = courseTeacherRecordId;
    }
}