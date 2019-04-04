package cn.edu.dgut.educationalsystem.dao;

import cn.edu.dgut.educationalsystem.model.SystemConfig;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
public interface SystemConfigMapper {
    int deleteByPrimaryKey(Integer configId);

    int insert(SystemConfig record);

    int insertSelective(SystemConfig record);

    SystemConfig selectByPrimaryKey(Integer configId);

    int updateByPrimaryKeySelective(SystemConfig record);

    int updateByPrimaryKey(SystemConfig record);

    /**
     * 查询当前系统配置
     * @return
     */
    @Select("select * from t_system_config where enable=1")
    SystemConfig findActivSystemConfig();

    @Update("update t_system_config set enable=0 where enable=1")
    int clearSystemConfigEnable();
}