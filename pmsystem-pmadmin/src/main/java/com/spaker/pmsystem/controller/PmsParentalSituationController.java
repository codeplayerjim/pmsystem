package com.spaker.pmsystem.controller;

import com.spaker.pmsystem.dto.PmsParentalSituationParam;
import com.spaker.pmsystem.model.PmsParentalSituation;
import com.spaker.pmsystem.service.PmsParentalSituationService;
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
 * 父母关系控制层
 * Created by sunshine on 2019/4/18.
 */
@Controller
@Api(tags ="PmsParentalSituationController",description = "父母信息基本操作")
@RequestMapping("/parent")
public class PmsParentalSituationController {
    @Autowired
    private PmsParentalSituationService pmsParentalSituationService;

    @ApiOperation("获取全部的父母情况")
    @RequestMapping(value = "/listAll",method = RequestMethod.GET)
    @ResponseBody
    @PreAuthorize("hasAuthority('pms:ParentalSituation:read')")
    public CommonResult getlist(){return CommonResult.success(pmsParentalSituationService.listAllParental());
    }

    @ApiOperation("创建父母情况")
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult create(@Validated @RequestBody PmsParentalSituationParam pmsParentalSituationParam, BindingResult result){
        
        int count=pmsParentalSituationService.createParental(pmsParentalSituationParam);
        if(count>0){
           return CommonResult.success(count);
        }
           return CommonResult.failed();

    }

    @ApiOperation("更新父母情况")
    @RequestMapping(value = "/update/{id}",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult update(@PathVariable("id")int id, @Validated @RequestBody PmsParentalSituationParam pmsParentalSituationParam, BindingResult result){
        int count=pmsParentalSituationService.updateParental(id,pmsParentalSituationParam);
        if(count>0){
           return CommonResult.success(count);
        }
           return CommonResult.failed();

    }

    @ApiOperation("删除父母情况")
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult delete(@PathVariable("id")int id){
        int count=pmsParentalSituationService.deleteParental(id);
        if (count>0){
           return CommonResult.success(count);
        }
           return CommonResult.failed();


    }

    @ApiOperation("根据父母名称分页获取父母列表")
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<PmsParentalSituation>> getlist(@RequestParam(value = "keyword",required = false)PmsParentalSituationParam keyword,
                                                                  @RequestParam(value = "pageSize",defaultValue = "1")Integer pageSize,
                                                                  @RequestParam(value = "pageNum",defaultValue = "5")Integer pageNum){
        List<PmsParentalSituation>pmsParentalSituationList=pmsParentalSituationService.listParental(keyword,pageNum,pageSize);
        return CommonResult.success(CommonPage.restPage(pmsParentalSituationList));
    }

    @ApiOperation("根据id获取父母信息")
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getParental(@PathVariable int id){return CommonResult.success(pmsParentalSituationService.getParental(id));}
}
