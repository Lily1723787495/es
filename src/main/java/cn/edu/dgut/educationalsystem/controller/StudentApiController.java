package cn.edu.dgut.educationalsystem.controller;

import cn.edu.dgut.educationalsystem.model.Application;
import cn.edu.dgut.educationalsystem.model.Student;
import cn.edu.dgut.educationalsystem.service.StudentService;
import cn.edu.dgut.educationalsystem.utils.ResultUtils;
import cn.edu.dgut.educationalsystem.vo.Result;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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


    @GetMapping("/courses")
    @ApiOperation(value = "当前用户的课程列表",notes="")
    public Result courseList(Integer page,Integer pagesize,Integer year,Integer item){

        return ResultUtils.success();
    }

    @GetMapping("/scores")
    @ApiOperation(value = "当前用户的成绩列表")
    public Result scoresList(Integer page,Integer pagesize,Integer year,Integer item){
        return ResultUtils.success();
    }

    @GetMapping("/application/")
    @ApiOperation(value = "当前用户的申请列表")
    public Result applications(Integer page,Integer pagesize,Integer year,Integer item){
      return ResultUtils.success();
    }

    @GetMapping("/application/{appId}/withdraw/")
    @ApiOperation(value = "撤回申请")
    public Result withdrawApplication(@PathVariable("appId") Integer applicationID){
      return ResultUtils.success();
    }

    @PostMapping("/application/")
    @ApiOperation(value="提交申请表")
    public Result postApplication(Application application){
      return ResultUtils.success();
    }

}
