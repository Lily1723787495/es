package cn.edu.dgut.educationalsystem.service;

import cn.edu.dgut.educationalsystem.model.EduAdmin;

public interface AdminService {

    EduAdmin login(String username,String password);

}
