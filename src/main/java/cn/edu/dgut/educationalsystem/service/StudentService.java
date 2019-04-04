package cn.edu.dgut.educationalsystem.service;

import cn.edu.dgut.educationalsystem.model.Student;

public interface StudentService {
    Student login(String username,String password);
}
