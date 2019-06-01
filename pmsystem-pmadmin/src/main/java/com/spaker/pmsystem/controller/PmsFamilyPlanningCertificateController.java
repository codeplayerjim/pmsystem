package com.spaker.pmsystem.controller;

import com.spaker.pmsystem.dto.PmsFamilyPlanningCertificateParam;
import com.spaker.pmsystem.model.PmsFamilyPlanningCertificate;
import com.spaker.pmsystem.service.PmsFamilyPlanningCertificateService;
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
 * Created by DennisYao on 05,2019/5/17.
 */
@Api(tags = "FamilyPlanningCertificateController",description = "计生证基本操作")
@Controller
@RequestMapping("/familyplanningcertificate")
public class PmsFamilyPlanningCertificateController {
        @Autowired
        private PmsFamilyPlanningCertificateService pmsFamilyPlanningCertificateService;

    @ApiOperation("获取全部的在职计生证")
    @RequestMapping(value = "/listAll",method = RequestMethod.GET)
    @ResponseBody
    @PreAuthorize("hasAuthority('pms:FamilyPlanningCertificate:read')")
    public CommonResult getlist(){return CommonResult.success(pmsFamilyPlanningCertificateService.listAllFamilyPlanningCertificate());
    }

    @ApiOperation("创建在职计生证")
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    @ResponseBody
    @PreAuthorize("hasAuthority('pms:FamilyPlanningCertificate:create')")
    public CommonResult create(@Validated @RequestBody PmsFamilyPlanningCertificateParam pmsFamilyPlanningCertificateParam, BindingResult result){
        int count=pmsFamilyPlanningCertificateService.createFamilyPlanningCertificate(pmsFamilyPlanningCertificateParam);
        if(count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();

    }

    @ApiOperation("更新在职计生证")
    @RequestMapping(value = "/update/{id}",method = RequestMethod.POST)
    @ResponseBody
    @PreAuthorize("hasAuthority('pms:FamilyPlanningCertificate:update')")
    public CommonResult update(@PathVariable("id")int id, @Validated @RequestBody PmsFamilyPlanningCertificateParam pmsFamilyPlanningCertificateParam, BindingResult result){
        int count=pmsFamilyPlanningCertificateService.updateFamilyPlanningCertificate(id,pmsFamilyPlanningCertificateParam);
        if(count>0){
            CommonResult.success(count);
        }
        return   CommonResult.failed();

    }

    @ApiOperation("删除在职计生证")
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
    @ResponseBody
    @PreAuthorize("hasAuthority('pms:FamilyPlanningCertificate:delete')")
    public CommonResult delete(@PathVariable("id")int id){
        int count=pmsFamilyPlanningCertificateService.deleteFamilyPlanningCertificate(id);
        if (count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("根据计生证户籍分页获取计生证列表")
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    @ResponseBody
    @PreAuthorize("hasAuthority('pms:FamilyPlanningCertificate:read')")
    public CommonResult<CommonPage<PmsFamilyPlanningCertificate>> getlist(@RequestParam(value = "name",required = false)String name,
                                                                          @RequestParam(value = "pageSize",defaultValue = "1")Integer pageSize,
                                                                          @RequestParam(value = "pageNum",defaultValue = "5")Integer pageNum){
        List<PmsFamilyPlanningCertificate> pmsFamilyPlanningCertificateList=pmsFamilyPlanningCertificateService.listFamilyPlanningCertificate(name,pageNum,pageSize);
        return CommonResult.success(CommonPage.restPage(pmsFamilyPlanningCertificateList));
    }

    @ApiOperation("根据id获取计生证信息")
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getFamilyPlanningCertificate(@PathVariable int id){return CommonResult.success(pmsFamilyPlanningCertificateService.getFamilyPlanningCertificate(id));}

}
