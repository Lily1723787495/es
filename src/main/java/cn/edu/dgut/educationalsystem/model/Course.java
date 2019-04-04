package cn.edu.dgut.educationalsystem.model;

public class Course {
    private Integer courseId;

    private String courseName;

    private Integer courseCredit;

    private Integer courseType;

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }

    public Integer getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(Integer courseCredit) {
        this.courseCredit = courseCredit;
    }

    public Integer getCourseType() {
        return courseType;
    }

    public void setCourseType(Integer courseType) {
        this.courseType = courseType;
    }
}