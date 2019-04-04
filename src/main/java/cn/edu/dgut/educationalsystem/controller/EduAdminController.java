package cn.edu.dgut.educationalsystem.controller;

import cn.edu.dgut.educationalsystem.model.EduAdmin;
import cn.edu.dgut.educationalsystem.model.SystemConfig;
import cn.edu.dgut.educationalsystem.service.AdminService;
import cn.edu.dgut.educationalsystem.service.SystemConfigService;
import cn.edu.dgut.educationalsystem.utils.ResultUtils;
import cn.edu.dgut.educationalsystem.vo.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin")
@Api
public class EduAdminController {

    @Autowired
    private AdminService adminService;

    @Autowired
    private SystemConfigService systemConfigService;

    @PostMapping("/")
    @ApiOperation(value = "管理员登录接口", notes = "通过用户名和密码登录")
    @ApiResponse(code = 0,message = "成功")
    public Result login(String username, String password){
        EduAdmin admin = adminService.login(username, password);
        if(admin == null){
            return ResultUtils.error(1,"用户名或者密码错误");
        }else{
            return ResultUtils.success(admin);
        }
    }



    @GetMapping("/config/activ")
    @ApiOperation(value="当前系统活动的配置",notes = "配置包含各类申请的开始时间和结束时间")
    @ApiResponse(code = 0,message = "成功")
    public Result getSystemConfig(){
        SystemConfig systemConfig = systemConfigService.findActiv();
        if(systemConfig == null){
            return ResultUtils.error(1,"当前无活动的系统配置");
        }else{
            return ResultUtils.success(systemConfig);
        }
    }

    @GetMapping("/config")
    @ApiOperation("系统配置列表")
    public Result getAllSystemConfig(Integer page,Integer pagesize){
        return ResultUtils.success();
    }

    @PostMapping("/config")
    @ApiOperation(value = "新建系统配置",notes = "表单按照实体类属性命名")
    public Result saveNewSystemConfig(SystemConfig systemConfig){
        systemConfigService.saveSystemConfigAndClearActiv(systemConfig);
        return  ResultUtils.success();
    }

    @GetMapping("/config/{configId}/enable")
    @ApiOperation(value = "激活配置",notes = "")
    public Result enableSystemConfig(@PathVariable("configId") Integer configId){
        SystemConfig systemConfig = systemConfigService.enableSystemConfig(configId);
        if(systemConfig == null){
            return ResultUtils.error(1,"找不到该配置信息");
        }else{
            return ResultUtils.success(systemConfig);
        }
    }

    @GetMapping("/application/")
    @ApiOperation(value = "申请列表")
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
    public Result rejectStudentApplication(@PathVariable("appId")Integer appId,String rejectMsg){
        return ResultUtils.success();
    }

    @GetMapping("/student/{studentType}/export")
    @ApiOperation("导出重修或者补考或者缓考学生文件 稍后完善")
    public Result exportStudent(Integer studentType){
        return ResultUtils.success();
    }

    @GetMapping("/scores/{courseId}/export")
    @ApiOperation(value = "根据课程 导出成绩")
    public Result exportStudentScore(){
        return ResultUtils.success();
    }

}
