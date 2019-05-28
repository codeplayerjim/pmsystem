package com.spaker.pmsystemdemo.demo.controller;

import com.spaker.pmsystemdemo.demo.dto.CommonResult;
import com.spaker.pmsystemdemo.demo.dto.PmsBrandDto;
import com.spaker.pmsystemdemo.demo.service.DemoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@Api(value = "demo",description = "demo")
public class DemoController {
    @Autowired
    private DemoService demoService;

    private static final Logger LOGGER= LoggerFactory.getLogger(DemoController.class);
    @ApiOperation("获取所有品牌信息")
    @RequestMapping(value = "/brand/listAll",method = RequestMethod.GET)
    @ResponseBody
    public Object getBrandList(){return new CommonResult().success(demoService.listAllBrand());
    }

    public Object createBrand(@Validated @RequestBody PmsBrandDto pmsBrandDto, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return new CommonResult().vaildataFailed(bindingResult.getFieldError().getDefaultMessage());
        }
        CommonResult commonResult;
        int count=demoService.createBrand(pmsBrandDto);
        if(count==1){
            commonResult=new CommonResult().success(pmsBrandDto);
            LOGGER.debug("createBrand success: {}",pmsBrandDto);
        }else {
            commonResult=new CommonResult().failed();
            LOGGER.debug("createBrand failed: {}",pmsBrandDto);
        }
        return commonResult;
    }


    @ApiOperation("更新品牌")
    @ResponseBody
    @RequestMapping(value = "/brand/update/{id}",method = RequestMethod.POST)
    public Object updateBrand(@PathVariable("id")Long id,@Validated @RequestBody PmsBrandDto pmsBrandDto,BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return new CommonResult().vaildataFailed(bindingResult.getFieldError().getDefaultMessage());
        }
        CommonResult commonResult;
        int count=demoService.updateBrand(id,pmsBrandDto);
        if(count==1){
            commonResult=new CommonResult().success(pmsBrandDto);
            LOGGER.debug("createBrand success: {}",pmsBrandDto);
        }else {
            commonResult=new CommonResult().failed();
            LOGGER.debug("createBrand failed: {}",pmsBrandDto);
        }
        return commonResult;
    }

    @ApiOperation("删除品牌")
    @ResponseBody
    @RequestMapping(value = "/brand/delete/{id}",method = RequestMethod.POST)
    public Object deleteBrand(@PathVariable("id")Long id){
        CommonResult commonResult;
        int count=demoService.deleteBrand(id);
        if(count==1){
            commonResult=new CommonResult().success(null);
            LOGGER.debug("createBrand success: id={}",id);
        }else {
            commonResult=new CommonResult().failed();
            LOGGER.debug("createBrand failed: id={}",id);
        }
        return commonResult;
    }

    @ApiOperation(value = "分页获取品牌内容")
    @RequestMapping(value = "/brand/list",method = RequestMethod.GET)
    @ResponseBody
    public Object listBrand(@RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum,@RequestParam(value = "pageSize",defaultValue = "3")Integer pageSize){
                return new CommonResult().success(demoService.listBrand(pageNum,pageSize));
        }

    @ApiOperation(value = "根据编号查询品牌信息")
    @RequestMapping(value = "/brand/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Object brand(@PathVariable("id") Long id) {
        return new CommonResult().success(demoService.getBrand(id));
    }

}
