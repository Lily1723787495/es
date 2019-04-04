package cn.edu.dgut.educationalsystem.service.impl;

import cn.edu.dgut.educationalsystem.dao.StudentMapper;
import cn.edu.dgut.educationalsystem.model.Student;
import cn.edu.dgut.educationalsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student login(String username, String password) {
        return studentMapper.selectUserByUsernameAndPassowrd(username,password);
    }
}
