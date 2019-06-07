package com.spaker.pmsystem.controller;

import com.spaker.pmsystem.dto.PmsEmergencyContactParam;
import com.spaker.pmsystem.service.PmsEmergencyContactService;
import com.spaker.pmsystem.util.ExcelUtil;
import com.spaker.pmsystem.vo.PmsEmergencyContactVO;
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

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunshine on 2019/4/18.
 */
@Controller
@Api(tags ="PmsEmergencyContactController",description = "紧急联系人信息基本操作")
@RequestMapping("/emergency")
public class PmsEmergencyContactController {
    @Autowired
    private PmsEmergencyContactService pmsEmergencyContactService;

    @ApiOperation("获取全部的紧急联系人")
    @RequestMapping(value = "/listAll",method = RequestMethod.GET)
    @ResponseBody
    @PreAuthorize("hasAuthority('pms:EmergencyContact:read')")
    public CommonResult getlist(){return CommonResult.success(pmsEmergencyContactService.listAllEmergencyContact());
    }

    @ApiOperation("创建紧急联系人")
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    @ResponseBody
    @PreAuthorize("hasAuthority('pms:EmergencyContact:create')")
    public CommonResult create(@Validated @RequestBody PmsEmergencyContactParam pmsEmergencyContactParam, BindingResult result){
        CommonResult commonResult;
        int count=pmsEmergencyContactService.createEmergencyContact(pmsEmergencyContactParam);
        if(count>0){
           return CommonResult.success(count);
        }
           return CommonResult.failed();

    }

    @ApiOperation("更新紧急联系人")
    @RequestMapping(value = "/update/{id}",method = RequestMethod.POST)
    @ResponseBody
    @PreAuthorize("hasAuthority('pms:EmergencyContact:update')")
    public CommonResult update(@PathVariable("id")int id, @Validated @RequestBody PmsEmergencyContactParam pmsEmergencyContactParam, BindingResult result){
        CommonResult commonResult;
        int count=pmsEmergencyContactService.updateEmergencyContact(id,pmsEmergencyContactParam);
        if(count>0){
           return CommonResult.success(count);
        }else
           return CommonResult.failed();

    }

    @ApiOperation("删除紧急联系人")
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
    @ResponseBody
    @PreAuthorize("hasAuthority('pms:EmergencyContact:delete')")
    public CommonResult delete(@PathVariable("id")int id){
         
        int count=pmsEmergencyContactService.deleteEmergencyContact(id);
        if (count>0){
           return CommonResult.success(count);
        }
           return CommonResult.failed();

    }

    @ApiOperation("根据紧急联系人名称分页获取紧急联系人列表")
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    @ResponseBody
    @PreAuthorize("hasAuthority('pms:EmergencyContact:read')")
    public CommonResult<CommonPage<PmsEmergencyContact>> getlist(@RequestParam(value = "name",required = false)String name,
                          @RequestParam(value = "pageSize",defaultValue = "1")Integer pageSize,
                          @RequestParam(value = "pageNum",defaultValue = "5")Integer pageNum){
        List<PmsEmergencyContact>pmsEmergencyContactList=pmsEmergencyContactService.listEmergencyContact(name,pageSize,pageNum);
        return CommonResult.success(CommonPage.restPage(pmsEmergencyContactList));
    }

    @ApiOperation("根据id获取紧急联系人信息")
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getEmergencyContact(@PathVariable int id){return CommonResult.success(pmsEmergencyContactService.getEmergencyContact(id));}

    /**
     * 实体转换为vo
     * @param list
     *
     */
    private static List<PmsEmergencyContactVO> convertEme2VO(List<PmsEmergencyContact>list){
        List<PmsEmergencyContactVO>list1=new ArrayList<PmsEmergencyContactVO>();
        for (int i=0;i<list.size();i++){
            PmsEmergencyContactVO pmsEmergencyContactVO=new PmsEmergencyContactVO();
            PmsEmergencyContact pmsEmergencyContact=list.get(i);
            pmsEmergencyContactVO.setName(pmsEmergencyContact.getName());
            pmsEmergencyContactVO.setId(pmsEmergencyContact.getId());
            pmsEmergencyContactVO.setPhone(pmsEmergencyContact.getPhone());
            list1.add(pmsEmergencyContactVO);

        }
        return list1;
    }

    @ApiOperation("导出数据文件")
    @RequestMapping(value = "/exportfile",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult export() {
        List<PmsEmergencyContact> pmsEmergencyContactList = new ArrayList<PmsEmergencyContact>();
        pmsEmergencyContactList = pmsEmergencyContactService.listAllEmergencyContact();
//        pmsEmergencyContactList.add(pmsEmergencyContactService.getEmergencyContact(1));

        FileOutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream("d:\\success.xls");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ExcelUtil<PmsEmergencyContactVO> util = new ExcelUtil<PmsEmergencyContactVO>(PmsEmergencyContactVO.class);
        return CommonResult.success(util.exportExcel(convertEme2VO(pmsEmergencyContactList), "紧急联系人信息", 65536, outputStream));
    }


    @ApiOperation("导出数据浏览器下载")
    @RequestMapping(value = "/exportdocument",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult export(HttpServletResponse response)  {
        List<PmsEmergencyContact>pmsEmergencyContactList=new ArrayList<PmsEmergencyContact>();
        pmsEmergencyContactList=pmsEmergencyContactService.listAllEmergencyContact();
//        pmsEmergencyContactList.add(pmsEmergencyContactService.getEmergencyContact(1));
        OutputStream outputStream=null;

        try {
            outputStream=new BufferedOutputStream(response.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }

        ExcelUtil<PmsEmergencyContactVO> util=new ExcelUtil<PmsEmergencyContactVO>(PmsEmergencyContactVO.class);
        return CommonResult.success(util.exportExcelToBrowser(response,convertEme2VO(pmsEmergencyContactList),"紧急联系人信息",65536,outputStream));
    }
}
