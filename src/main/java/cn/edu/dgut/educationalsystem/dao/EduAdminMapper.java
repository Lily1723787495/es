package cn.edu.dgut.educationalsystem.dao;

import cn.edu.dgut.educationalsystem.model.EduAdmin;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface EduAdminMapper {
    int deleteByPrimaryKey(Integer adminId);

    int insert(EduAdmin record);

    int insertSelective(EduAdmin record);

    EduAdmin selectByPrimaryKey(Integer adminId);

    int updateByPrimaryKeySelective(EduAdmin record);

    int updateByPrimaryKey(EduAdmin record);

    @Select("select admin_id,username,password,real_name from t_edu_admin where username=#{username} and password=#{passowrd}")
    EduAdmin findAdminByUsernameAndPassword(String username,String password);
}