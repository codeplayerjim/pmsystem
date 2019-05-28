package com.spaker.pmsystem.controller;

import com.spaker.pmsystem.dto.PmsHealthCertificateParam;
import com.spaker.pmsystem.model.PmsHealthCertificate;
import com.spaker.pmsystem.service.PmsHealthCertificateService;
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
 * Created by sunshine on 2019/5/13.
 */
@Api(tags = "HealthCertificateController",description = "健康证基本操作")
@Controller
@RequestMapping("/healthyCertificate")
public class PmsHealthCertificateController {
    
    @Autowired
    private PmsHealthCertificateService pmsHealthCertificateService;

    @ApiOperation("获取所有的健康证信息")
    @RequestMapping(value = "/listAll",method = RequestMethod.GET)
    @ResponseBody
    @PreAuthorize("hasAuthority('pms:HealthCertificate:read')")
    public CommonResult getlist(){return CommonResult.success(pmsHealthCertificateService.listAllHealthCertificate());
    }

    @ApiOperation("创建健康证")
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    @ResponseBody
    @PreAuthorize("hasAuthority('pms:HealthCertificate:create')")
    public CommonResult create(@Validated @RequestBody PmsHealthCertificateParam pmsHealthCertificateParam, BindingResult result){
        int count=pmsHealthCertificateService.createHealthCertificate(pmsHealthCertificateParam);
        if(count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();

    }

    @ApiOperation("更新健康证")
    @RequestMapping(value = "/update/{id}",method = RequestMethod.POST)
    @ResponseBody
    @PreAuthorize("hasAuthority('pms:HealthCertificate:update')")
    public CommonResult update(@PathVariable("id")int id, @Validated @RequestBody PmsHealthCertificateParam pmsHealthCertificateParam, BindingResult result){
        int count=pmsHealthCertificateService.updateHealthCertificate(id,pmsHealthCertificateParam);
        if(count>0){
            CommonResult.success(count);
        }
        return   CommonResult.failed();

    }

    @ApiOperation("删除健康证")
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
    @ResponseBody
    @PreAuthorize("hasAuthority('pms:HealthCertificate:delete')")
    public CommonResult delete(@PathVariable("id")int id){
        int count=pmsHealthCertificateService.deleteHealthCertificate(id);
        if (count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("根据分页获取健康证列表")
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    @ResponseBody
    @PreAuthorize("hasAuthority('pms:HealthCertificate:read')")
    public CommonResult<CommonPage<PmsHealthCertificate>> getlist(@RequestParam(value = "keyword",required = false)PmsHealthCertificateParam keyword,
                                                                  @RequestParam(value = "pageSize",defaultValue = "1")Integer pageSize,
                                                                  @RequestParam(value = "pageNum",defaultValue = "5")Integer pageNum){
        List<PmsHealthCertificate> pmsHealthCertificateList=pmsHealthCertificateService.listHealthCertificate(keyword,pageNum,pageSize);
        return CommonResult.success(CommonPage.restPage(pmsHealthCertificateList));
    }

    @ApiOperation("根据id获取健康证信息")
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getHealthCertificate(@PathVariable int id){return CommonResult.success(pmsHealthCertificateService.getHealthCertificate(id));}


}
