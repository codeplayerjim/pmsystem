package com.spaker.pmsystem.controller;

import com.spaker.pmsystem.dto.PmsSpouseSituationParam;
import com.spaker.pmsystem.model.PmsSpouseSituation;
import com.spaker.pmsystem.service.PmsSpouseSituationService;
import com.sparker.pmsystem.common.api.CommonPage;
import com.sparker.pmsystem.common.api.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by sunshine on 2019/4/18.
 */
@Controller
@Api(tags ="PmSpouseSituationController",description = "配偶信息基本操作")
@RequestMapping("/spouse")
public class PmsSpouseSituationController {
    @Autowired
    private PmsSpouseSituationService pmsSpouseSituationService;

    @ApiOperation("获取全部的配偶情况")
    @RequestMapping(value = "/listAll",method = RequestMethod.GET)
    @ResponseBody
    @PreAuthorize("hasAuthority('pms:SpouseSituation:read')")
    public CommonResult getlist(){return CommonResult.success(pmsSpouseSituationService.listAllSpouse());
    }

    @ApiOperation("创建配偶情况")
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult create(@Validated @RequestBody PmsSpouseSituationParam pmsSpouseSituationParam, BindingResult result){
        int count=pmsSpouseSituationService.createSpouse(pmsSpouseSituationParam);
        if(count>0){
           return CommonResult.success(count);
        }
           return CommonResult.failed();
    }

    @ApiOperation("更新配偶情况")
    @RequestMapping(value = "/update/{id}",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult update(@PathVariable("id")int id, @Validated @RequestBody PmsSpouseSituationParam pmsSpouseSituationParam, BindingResult result){
        int count=pmsSpouseSituationService.updateSpouse(id,pmsSpouseSituationParam);
        if(count>0){
           return CommonResult.success(count);
        }
            return CommonResult.failed();
        
    }

    @ApiOperation("删除配偶情况")
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult delete(@PathVariable("id")int id){
       
        int count=pmsSpouseSituationService.deleteSpouse(id);
        if (count>0){
           return CommonResult.success(count);
        }
           return CommonResult.failed();

        
    }

    @ApiOperation("根据配偶名称分页获取父母列表")
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<PmsSpouseSituation>> getlist(@RequestParam(value = "keyword",required = false)PmsSpouseSituationParam keyword,
                          @RequestParam(value = "pageSize",defaultValue = "1")Integer pageSize,
                          @RequestParam(value = "pageNum",defaultValue = "5")Integer pageNum){
        List<PmsSpouseSituation>pmsSpouseSituationList=pmsSpouseSituationService.listSpouse(keyword,pageNum,pageSize);
        return CommonResult.success(CommonPage.restPage(pmsSpouseSituationList));
    }

    @ApiOperation("根据id获取配偶信息")
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getSpouse(@PathVariable int id){return CommonResult.success(pmsSpouseSituationService.getSpouse(id));}
}
