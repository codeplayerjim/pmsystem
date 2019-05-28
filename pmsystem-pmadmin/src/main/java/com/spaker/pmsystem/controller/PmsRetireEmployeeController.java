package com.spaker.pmsystem.controller;

import com.spaker.pmsystem.dto.PmsRetireEmployeeParam;
import com.spaker.pmsystem.model.PmsRetireEmployee;
import com.spaker.pmsystem.service.PmsRetireEmployeeService;
import com.sparker.pmsystem.common.api.CommonPage;
import com.sparker.pmsystem.common.api.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 退休员工管理controller
 * Created by sunshine on 2019/4/9.
 */

@Controller
@Api(description = "退休员工信息管理",tags = "PmsRetireEmployeeController")
@RequestMapping("/RetireEmployee")
public class PmsRetireEmployeeController {
    @Autowired
    PmsRetireEmployeeService pmsRetireEmployeeService;

    @ApiOperation("获取全部的退休员工")
    @RequestMapping(value = "/listAll",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getlist(){return CommonResult.success(pmsRetireEmployeeService.listAllEmployee());
    }

    @ApiOperation("创建退休员工")
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult create(@Validated @RequestBody PmsRetireEmployeeParam pmsRetireEmployeeParam, BindingResult result){
        int count=pmsRetireEmployeeService.createEmployee(pmsRetireEmployeeParam);
        if(count==1){
            return CommonResult.success(count);
        }
            return CommonResult.failed();
    }

    @ApiOperation("更新退休员工")
    @RequestMapping(value = "/update/{id}",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult update(@PathVariable int id, @Validated @RequestBody PmsRetireEmployeeParam pmsRetireEmployeeParam,BindingResult result){
        int count=pmsRetireEmployeeService.updateEmployee(id,pmsRetireEmployeeParam);
        if(count>1){
            return CommonResult.success(count);
        }
            return CommonResult.failed();
        
    }

    @ApiOperation("删除退休员工")
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult delete(@PathVariable("id")int id){
        CommonResult commonResult;
        int count=pmsRetireEmployeeService.deleteEmployee(id);
        if (count>1){
            return CommonResult.success(count);
        }
            return CommonResult.failed();

        
    }

    @ApiOperation("根据员工名称分页获取员工列表")
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<PmsRetireEmployee>> getlist(@RequestParam(value = "keyword",required = false)PmsRetireEmployeeParam keyword,
                          @RequestParam(value = "pageSize",defaultValue = "1")Integer pageSize,
                          @RequestParam(value = "pageNum",defaultValue = "5")Integer pageNum){
        List<PmsRetireEmployee>pmsRetireEmployeeList=pmsRetireEmployeeService.listEmployee(keyword,pageNum,pageSize);
        return CommonResult.success(CommonPage.restPage(pmsRetireEmployeeList));
    }

    @ApiOperation("根据id获取员工信息")
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getEmployee(@PathVariable int id){return CommonResult.success(pmsRetireEmployeeService.getEmployee(id));}
}
