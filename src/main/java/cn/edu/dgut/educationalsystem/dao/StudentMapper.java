package cn.edu.dgut.educationalsystem.dao;

import cn.edu.dgut.educationalsystem.model.Student;
import org.apache.ibatis.annotations.Select;

public interface StudentMapper {
    int deleteByPrimaryKey(Integer studentid);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer studentid);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    @Select("select * from t_student where username=#{username} and password=#{password}")
    Student selectUserByUsernameAndPassowrd(String username,String password);
}