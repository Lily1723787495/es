package cn.edu.dgut.educationalsystem.controller;

import cn.edu.dgut.educationalsystem.utils.ResultUtils;
import cn.edu.dgut.educationalsystem.vo.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/teacher/")
@Api
public class TeacherApiController {

    @PostMapping("/")
    @ApiOperation(value = "教师登录接口", notes = "通过用户名和密码登录")
    @ApiResponse(code = 0,message = "成功")
    public Result login(String username,String password){
        return ResultUtils.success();
    }
}
