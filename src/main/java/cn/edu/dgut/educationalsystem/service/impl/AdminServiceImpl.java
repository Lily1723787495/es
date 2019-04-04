package cn.edu.dgut.educationalsystem.service.impl;

import cn.edu.dgut.educationalsystem.dao.EduAdminMapper;
import cn.edu.dgut.educationalsystem.model.EduAdmin;
import cn.edu.dgut.educationalsystem.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private EduAdminMapper eduAdminMapper;

    @Override
    public EduAdmin login(String username, String password) {
        return eduAdminMapper.findAdminByUsernameAndPassword(username,password);
    }
}
