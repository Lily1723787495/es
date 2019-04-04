package cn.edu.dgut.educationalsystem.service.impl;

import cn.edu.dgut.educationalsystem.dao.SystemConfigMapper;
import cn.edu.dgut.educationalsystem.model.SystemConfig;
import cn.edu.dgut.educationalsystem.service.SystemConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SystemConfigServiceImpl implements SystemConfigService {

    @Autowired
    private SystemConfigMapper systemConfigMapper;

    @Override
    public SystemConfig findActiv() {
        return systemConfigMapper.findActivSystemConfig();
    }

    @Override
    public SystemConfig saveSystemConfigAndClearActiv(SystemConfig systemConfig) {
        if(systemConfig.getEnable()){
            systemConfigMapper.clearSystemConfigEnable();
        }
        systemConfigMapper.insert(systemConfig);
        return null;
    }

    @Override
    public SystemConfig enableSystemConfig(Integer configId) {
        SystemConfig systemConfig = systemConfigMapper.selectByPrimaryKey(configId);
        if(systemConfig == null){
            return null;
        }
        systemConfigMapper.clearSystemConfigEnable();
        systemConfig.setEnable(true);
        systemConfigMapper.updateByPrimaryKey(systemConfig);
        return systemConfig;
    }
}
