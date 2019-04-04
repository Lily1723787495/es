package cn.edu.dgut.educationalsystem.controller;

import cn.edu.dgut.educationalsystem.utils.ResultUtils;
import cn.edu.dgut.educationalsystem.vo.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

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

    @GetMapping("/courses")
    @ApiOperation(value="教师开课列表")
    public Result courses(Integer page,Integer pagesize,Integer year,Integer item){
        return ResultUtils.success();
    }

    @GetMapping("/course/{recordId}/studentlist")
    @ApiOperation(value="开课课程的学生列表")
    public Result studentList(@PathVariable("recordId")Integer recordId,Integer page,Integer pagesize){
        return ResultUtils.success();
    }

    @GetMapping("/course/{recordId}/studentxls")
    @ApiOperation(value="开课程的学生文件")
    public Result studentXls(@PathVariable("recordId")Integer recordId){
        return ResultUtils.success();
    }

    @GetMapping("/score/{recordId}/")
    @ApiOperation(value="上传成绩表")
    public Result postStudentScore(@RequestParam("file") MultipartFile fileUpload, @PathVariable("recordId")Integer recordId){
      return ResultUtils.success();
    }

    @PostMapping("/course/{recordId}/plan")
    @ApiOperation(value = "上传命题计划")
    public Result postCoursePlan(@RequestParam("file")MultipartFile fileUpload,Integer recordId){
      return ResultUtils.success();
    }

    @GetMapping("/application/")
    @ApiOperation(value = "申请列表",notes="包括补考，重修，缓考")
    public Result applications(){
      return ResultUtils.success();
    }

    @GetMapping("/application/{appId}/deal")
    @ApiOperation(value = "允许申请")
    public Result dealStudentApplication(@PathVariable("appId")Integer appId){
      return ResultUtils.success();
    }

    @GetMapping("/application/{appId}/reject")
    @ApiOperation(value = "拒绝申请")
    public Result dealStudentApplication(@PathVariable("appId")Integer appId,String rejectMsg){
      return ResultUtils.success();
    }
}
