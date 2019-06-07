package com.spaker.pmsystem.controller;


import com.spaker.pmsystem.dto.PmsChildSituationParam;
import com.spaker.pmsystem.service.PmsChildSituationService;
import com.sparker.pmsystem.common.api.CommonPage;
import com.sparker.pmsystem.common.api.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 子女情况状态控制层
 * Created by sunshine on 2019/4/16.
 */
@Api(tags = "PmsChildSituationController",description = "子女情况控制层")
@Controller
@RequestMapping(value = "/ChildSituation")
public class PmsChildSituationController {
    @Autowired
    private PmsChildSituationService pmsChildSituationService;


    @ApiOperation("获取全部的孩子")
    @RequestMapping(value = "/listAll",method = RequestMethod.GET)
    @ResponseBody
    @PreAuthorize("hasAuthority('pms:childSituation:read')")
    public CommonResult getlist(){
        return CommonResult.success(pmsChildSituationService.listAllChildren());
    }


    @ApiOperation("创建孩子信息")
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult create(@PathVariable @RequestBody PmsChildSituationParam pmsChildSituationParam, BindingResult result){
        int count=pmsChildSituationService.createChildren(pmsChildSituationParam);
        if (count>0){
           return CommonResult.success(count);
        }
          return   CommonResult.failed();
    }


    @ApiOperation("更新孩子信息")
    @RequestMapping(value = "/update/{id}",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult update(@PathVariable("id") int id, @RequestBody PmsChildSituationParam pmsChildSituationParam, BindingResult result){
        int count=pmsChildSituationService.updateChildren(id,pmsChildSituationParam);
        if (count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("删除孩子信息")
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult delete(@PathVariable("id")int id){
        int count=pmsChildSituationService.deleteChildren(id);
        if (count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }


    @ApiOperation("根据孩子名称分页获取孩子信息")
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<PmsChildSituation>> getlist(@RequestParam(value = "pageNum",defaultValue = "5")int pagenum,
                                                               @RequestParam(value = "pageSize",defaultValue = "1")int pagesize,
                                                               @RequestParam(value = "name",required = false)String name){
        List<PmsChildSituation>pmsChildSituationList=pmsChildSituationService.listChildren(name,pagenum,pagesize);
        return CommonResult.success(CommonPage.restPage(pmsChildSituationList));
    }

    @ApiOperation("根据id获取孩子信息")
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getChild(@PathVariable int id){return CommonResult.success(pmsChildSituationService.getChildren(id));}

}
