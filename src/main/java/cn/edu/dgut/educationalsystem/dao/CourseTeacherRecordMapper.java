package cn.edu.dgut.educationalsystem.dao;

import cn.edu.dgut.educationalsystem.model.CourseTeacherRecord;

public interface CourseTeacherRecordMapper {
    int deleteByPrimaryKey(Integer recordId);

    int insert(CourseTeacherRecord record);

    int insertSelective(CourseTeacherRecord record);

    CourseTeacherRecord selectByPrimaryKey(Integer recordId);

    int updateByPrimaryKeySelective(CourseTeacherRecord record);

    int updateByPrimaryKey(CourseTeacherRecord record);
}