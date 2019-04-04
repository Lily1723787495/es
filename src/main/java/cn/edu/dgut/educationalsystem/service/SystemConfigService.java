package cn.edu.dgut.educationalsystem.service;


import cn.edu.dgut.educationalsystem.model.SystemConfig;

public interface SystemConfigService {


    SystemConfig findActiv();

    /**
     * 保存系统配置，并保证表中只有一个活动的系统配置
     * @return
     */
    SystemConfig saveSystemConfigAndClearActiv(SystemConfig systemConfig);

    SystemConfig enableSystemConfig(Integer configId);
}
