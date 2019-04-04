package cn.edu.dgut.educationalsystem.controller;

import cn.edu.dgut.educationalsystem.model.Student;
import cn.edu.dgut.educationalsystem.service.StudentService;
import cn.edu.dgut.educationalsystem.utils.ResultUtils;
import cn.edu.dgut.educationalsystem.vo.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/student")
@Api
public class StudentApiController {

    @Autowired
    private StudentService studentService;


    @PostMapping("/")
    @ApiOperation(value = "学生登录接口", notes = "通过用户名和密码登录")
    @ApiResponse(code = 0,message = "成功")
    public Result login(String username, String password){
        Student student = studentService.login(username, password);
        if(student == null){
            return ResultUtils.error(1,"用户名或者密码错误");
        }else{
            student.setPassword("");
            return ResultUtils.success(student);
        }
    }
}
