package cn.edu.dgut.educationalsystem.dao;

import cn.edu.dgut.educationalsystem.model.Application;

public interface ApplicationMapper {
    int deleteByPrimaryKey(Integer appId);

    int insert(Application record);

    int insertSelective(Application record);

    Application selectByPrimaryKey(Integer appId);

    int updateByPrimaryKeySelective(Application record);

    int updateByPrimaryKey(Application record);
}