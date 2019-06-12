package com.spaker.pmsystem.controller;

import com.spaker.pmsystem.dto.PmsFreeOfChargeParam;
import com.spaker.pmsystem.model.PmsFreeOfCharge;
import com.spaker.pmsystem.service.Impl.PmsFreeOfChargeServiceImpl;
import com.spaker.pmsystem.service.PmsFreeOfChargeService;
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
 * Create By DennisYao
 * 6/11/2019
 */
@Api(tags ="PmsFreeOfChargeController",description = "免费伙食")
@Controller
@RequestMapping("/PmsFreeOfCharge")
public class PmsFreeOfChargeController  {
    @Autowired
    private PmsFreeOfChargeService pmsFreeOfChargeService;

    @ApiOperation("获取全部的在职员工")
    @RequestMapping(value = "/listAll",method = RequestMethod.GET)
    @ResponseBody
    @PreAuthorize("hasAuthority('pms:FreeOfCharge:read')")
    public CommonResult getlist(){return CommonResult.success(pmsFreeOfChargeService.listAllCard());
    }

    @ApiOperation("创建在职员工")
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    @ResponseBody
    @PreAuthorize("hasAuthority('pms:FreeOfCharge:create')")
    public CommonResult create(@Validated @RequestBody PmsFreeOfChargeParam pmsFreeOfChargeParam, BindingResult result){
        int count=pmsFreeOfChargeService.createCard(pmsFreeOfChargeParam);
        if(count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();

    }

    @ApiOperation("更新在职员工")
    @RequestMapping(value = "/update/{id}",method = RequestMethod.POST)
    @ResponseBody
    @PreAuthorize("hasAuthority('pms:FreeOfCharge:update')")
    public CommonResult update(@PathVariable("id")int id, @Validated @RequestBody PmsFreeOfChargeParam pmsFreeOfChargeParam, BindingResult result){
        int count=pmsFreeOfChargeService.updateCard(id,pmsFreeOfChargeParam);
        if(count>0){
            CommonResult.success(count);
        }
        return   CommonResult.failed();

    }

    @ApiOperation("删除在职员工")
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
    @ResponseBody
    @PreAuthorize("hasAuthority('pms:FreeOfCharge:delete')")
    public CommonResult delete(@PathVariable("id")int id){
        int count=pmsFreeOfChargeService.deleteCard(id);
        if (count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("根据员工名称分页获取员工列表")
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    @ResponseBody
    @PreAuthorize("hasAuthority('pms:FreeOfCharge:read')")
    public CommonResult<CommonPage<PmsFreeOfCharge>> getlist(@RequestParam(value = "cardType",required = false)String cardType,
                                                             @RequestParam(value = "pageSize",defaultValue = "1")Integer pageSize,
                                                             @RequestParam(value = "pageNum",defaultValue = "5")Integer pageNum){
        List<PmsFreeOfCharge> pmsFreeOfChargeList=pmsFreeOfChargeService.listCard(cardType,pageNum,pageSize);
        return CommonResult.success(CommonPage.restPage(pmsFreeOfChargeList));
    }

    @ApiOperation("根据id获取员工信息")
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getFreeOfCharge(@PathVariable int id){return CommonResult.success(pmsFreeOfChargeService.getCard(id));}


}
