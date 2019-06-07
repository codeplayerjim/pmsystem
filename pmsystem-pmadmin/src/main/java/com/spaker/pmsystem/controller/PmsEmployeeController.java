package com.spaker.pmsystem.controller;

import com.spaker.pmsystem.dto.PmsEmployeeParam;
import com.spaker.pmsystem.service.PmsEmployeeService;
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
 * 在职员工信息基本操作controller
 * Created by sunshine on 2019/3/25.
 */
@Controller
@Api(tags ="PmsEmployeeController",description = "员工信息基本操作")
@RequestMapping("/employee")
public class PmsEmployeeController {
    @Autowired
    private PmsEmployeeService pmsEmployeeService;

    @ApiOperation("获取全部的在职员工")
    @RequestMapping(value = "/listAll",method = RequestMethod.GET)
    @ResponseBody
    @PreAuthorize("hasAuthority('pms:employee:read')")
    public CommonResult getlist(){return CommonResult.success(pmsEmployeeService.listAllEmployee());
    }

    @ApiOperation("创建在职员工")
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    @ResponseBody
    @PreAuthorize("hasAuthority('pms:employee:create')")
    public CommonResult create(@Validated @RequestBody PmsEmployeeParam pmsEmployeeParam, BindingResult result){
        int count=pmsEmployeeService.createEmployee(pmsEmployeeParam);
        if(count>0){
            return CommonResult.success(count);
        }
            return CommonResult.failed();

    }

    @ApiOperation("更新在职员工")
    @RequestMapping(value = "/update/{id}",method = RequestMethod.POST)
    @ResponseBody
    @PreAuthorize("hasAuthority('pms:employee:update')")
    public CommonResult update(@PathVariable("id")int id,@Validated @RequestBody PmsEmployeeParam pmsEmployeeParam,BindingResult result){
            int count=pmsEmployeeService.updateEmployee(id,pmsEmployeeParam);
            if(count>0){
                CommonResult.success(count);
            }
            return   CommonResult.failed();

    }

    @ApiOperation("删除在职员工")
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
    @ResponseBody
    @PreAuthorize("hasAuthority('pms:employee:delete')")
    public CommonResult delete(@PathVariable("id")int id){
        int count=pmsEmployeeService.deleteEmployee(id);
        if (count>0){
            return CommonResult.success(count);
        }
            return CommonResult.failed();
    }

    @ApiOperation("根据员工名称分页获取员工列表")
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    @ResponseBody
    @PreAuthorize("hasAuthority('pms:employee:read')")
    public CommonResult<CommonPage<PmsEmployee>> getlist(@RequestParam(value = "name",required = false)String name,
                                                         @RequestParam(value = "pageSize",defaultValue = "1")Integer pageSize,
                                                         @RequestParam(value = "pageNum",defaultValue = "5")Integer pageNum){
        List<PmsEmployee>pmsEmployeeList=pmsEmployeeService.listEmployee(name,pageNum,pageSize);
        return CommonResult.success(CommonPage.restPage(pmsEmployeeList));
    }

    @ApiOperation("根据id获取员工信息")
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getEmployee(@PathVariable int id){return CommonResult.success(pmsEmployeeService.getEmployee(id));}








//    @ApiOperation("导出信息至excel")
//    @RequestMapping(value = "/export",method = RequestMethod.GET)
//    @ResponseBody
//    public void export(HttpServletResponse response)throws IOException{
//        List<PmsEmployee>employeeList=pmsEmployeeService.listAllEmployee();
//        List<PmsEmployeeParam>employeeParamList=ArrayList<PmsEmployeeParam>()
//        HSSFWorkbook workbook=HSSFWorkbook();
//        HSSFSheet sheet=workbook.createSheet("员工信息表格");
//        HSSFRow row=null;
//        row=sheet.createRow(0);//创建第一个单元格
//        row.setHeight((short)(26.25*50));
//        row.createCell(0).setCellValue("员工信息列表");//第一行单元格设值
//        /**
//         * 为标题设置空间
//         */
//        CellRangeAddress rangeAddress=CellRangeAddress(0,0,0,22);
//        sheet.addMergedRegion(rangeAddress);
//        /**
//         * 动态获取数据库列sql语句
//         */
//        row=sheet.createRow(1);
//        row.setHeight((short)(22.50*20));
//        row.createCell(0).setCellValue("员工ID");
//        row.createCell(1).setCellValue("员工姓名");
//        row.createCell(2).setCellValue("员工性别");
//        row.createCell(3).setCellValue("员工国籍");
//
//        for (int i=0;i<employeeList.size();i++){
//            PmsEmployeeParam pmsEmployeeParam=PmsEmployeeParam();
//            row=sheet.createRow(i+2);
//            PmsEmployee pmsEmployee=employeeList.get(i);
//            BeanUtils.copyProperties(pmsEmployee,pmsEmployeeParam);
//            employeeParamList.add(pmsEmployeeParam);
//            row.createCell(0).setCellValue(pmsEmployee.getId());
//            row.createCell(1).setCellValue(pmsEmployee.getName());
//            row.createCell(2).setCellValue(pmsEmployee.getSex());
//            row.createCell(3).setCellValue(pmsEmployee.getNation());
//        }
//        sheet.setDefaultRowHeight((short) (16.5*20));
//        //列宽自适应
//        for (int i=0;i<=5;i++){
//            sheet.autoSizeColumn(i);
//        }
//
//        response.setContentType("application/vnd.ms-excel;charset=utf-8");
//        OutputStream outputStream=response.getOutputStream();
//        response.setHeader("Content-disposition","attachment;filename=Employee.xls");//默认excel名称
//        workbook.write(outputStream);
//        outputStream.flush();
//        outputStream.close();
//
//    }



}
