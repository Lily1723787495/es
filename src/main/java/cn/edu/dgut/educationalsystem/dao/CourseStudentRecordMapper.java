package cn.edu.dgut.educationalsystem.dao;

import cn.edu.dgut.educationalsystem.model.CourseStudentRecord;

public interface CourseStudentRecordMapper {
    int deleteByPrimaryKey(Integer recordId);

    int insert(CourseStudentRecord record);

    int insertSelective(CourseStudentRecord record);

    CourseStudentRecord selectByPrimaryKey(Integer recordId);

    int updateByPrimaryKeySelective(CourseStudentRecord record);

    int updateByPrimaryKey(CourseStudentRecord record);
}