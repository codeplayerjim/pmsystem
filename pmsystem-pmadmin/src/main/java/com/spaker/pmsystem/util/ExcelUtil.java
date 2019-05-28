package com.spaker.pmsystem.util;

import com.spaker.pmsystem.vo.ExcelVOAttribute;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddressList;

import javax.servlet.http.HttpServletResponse;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 导出时传入list<T>,即可实现导出为一个excel，其中每个对象T为Excel中的一条记录.
 * 导入时读取excel，得到的结果是一个list<T>.T是自己定义的对象.
 * 需要导出的实体对象只需简单配置注解就能实现灵活导出
 * 实体属性配置了注解就能导出到excel中，每个属性对应一列
 * 列名称可以通过注解配置
 * 导出到哪一列可以通过注解配置
 * 鼠标移动到该列时提示信息可以通过注解配置
 *
 * Created by sunshine on 2019/4/25.
 */
public class ExcelUtil<T> {
    Class<T>clazz;
    public ExcelUtil(Class<T>clazz){
        this.clazz=clazz;
    }


    public List<T>importExcel(String sheetName, InputStream inputStream){
        List<T>list=new ArrayList<T>();
        try {
            HSSFWorkbook workbook=new HSSFWorkbook(inputStream);
            HSSFSheet sheet=workbook.getSheet(sheetName);
            if(!sheetName.trim().equals("")){
                sheet=workbook.getSheet(sheetName);//指定sheet名，则取指定sheet内容
            }
            if (sheet==null){
                sheet=workbook.getSheetAt(0);//sheet名不存在则默认指向第一个sheet
            }
            int rows=sheet.getPhysicalNumberOfRows();
            if(rows>0){//有数据时处理
                Field[] allFields=clazz.getDeclaredFields();//得到类的所有field
                Map<Integer,Field>fieldMap=new HashMap<Integer, Field>();
                for (Field field:allFields){
                    //将有注解的field存放到map中
                    if (field.isAnnotationPresent(ExcelVOAttribute.class)){
                        ExcelVOAttribute attr=field.getAnnotation(ExcelVOAttribute.class);
                        int col=getExcelCol(attr.column());
                        field.setAccessible(true);//设置类的私有属性可访问
                        fieldMap.put(col,field);
                    }
                }
                for (int i=1;i<rows;i++){
                    HSSFRow row=sheet.getRow(i);
                    int cellNum=row.getPhysicalNumberOfCells();
                    T entity=null;
                    for (int j=0;j<cellNum;j++){
                        HSSFCell cell=row.getCell(j);
                        if (cell==null){
                            continue;
                        }
                        String c=cell.getStringCellValue();
                        System.out.println(c);
                        if (c.equals("")){
                            continue;
                        }
                        entity=(entity==null?clazz.newInstance():entity);//是否存在实类
                        Field field=fieldMap.get(j);
                        //取得类型，并根据对象类型设置值
                        Class<?>fieldType=field.getType();
                        if(String.class == fieldType){
                            field.set(entity,String.valueOf(c));
                        }else if ((Integer.TYPE==fieldType)||(Integer.class==fieldType)){
                            field.set(entity,Integer.parseInt(c));
                        }else if ((Long.TYPE==fieldType)||(Long.class==fieldType)){
                            field.set(entity,Long.valueOf(c));
                        }else if((Short.TYPE==fieldType)||(Short.class==fieldType)) {
                            field.set(entity, Short.valueOf(c));
                        }else if((Double.TYPE==fieldType)||(Double.class==fieldType)) {
                            field.set(entity, Double.valueOf(c));
                        }else if((Character.TYPE==fieldType)) {
                            if((c!=null)&&(c.length()>0)){
                                field.set(entity, Character.valueOf(c.charAt(0)));
                            }

                        }
                    }
                    if(entity!=null){
                        list.add(entity);
                    }
                }

            }
        } catch (IOException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return list;
    }

    /**
     * 将EXCEL中A,B,C,D,E映射成0，1，2，3，
     * @param col
     * @return
     */
    public static int getExcelCol(String col){
        col=col.toUpperCase();
        int count=-1;
        char[] cs=col.toCharArray();
        for (int i=0;i<cs.length;i++){
            count+=(cs[i]-64)*Math.pow(26,cs.length-1-i);
        }
        return count;
    }

    /**
     * 对list数据员将其里面的数据导入到excel表单
     * @param list
     * @param sheetName 工作表名称
     * @param sheetSize 每个sheet中数据的行数
     * @param output javaI/O
     * @return
     */
    public boolean exportExcel(List<T>list, String sheetName, int sheetSize, OutputStream output){
        Field[] allFields=clazz.getDeclaredFields();//得到所有定义字段
        List<Field>fields=new ArrayList<Field>();
        //得到所有field并存放到一个List中
        for (Field field:allFields){
            if (field.isAnnotationPresent(ExcelVOAttribute.class)){
                fields.add(field);
            }
        }
        HSSFWorkbook workbook=new HSSFWorkbook();//产生工作簿对象
        if(sheetSize>65536||sheetSize<1){
            sheetSize=65536;
        }
        double sheetNo=Math.ceil(list.size()/sheetSize);//取出一共有多少个sheet
        for (int index=0;index<=sheetNo;index++){
            HSSFSheet sheet=workbook.createSheet();//产生工作表对象
            if(sheetNo==0){
                workbook.setSheetName(index,sheetName);
            }else {
                workbook.setSheetName(index,sheetName+index);
            }
            HSSFRow row;
            HSSFCell cell;//产生单元格

            row=sheet.createRow(0);//产生一行
            //写入各个字段的列头名称
            for (int i=0;i<fields.size();i++){
                Field field=fields.get(i);
                ExcelVOAttribute attribute=field.getAnnotation(ExcelVOAttribute.class);
                int col=getExcelCol(attribute.column());//获得列号
                cell=row.createCell(col);//创建列
                cell.setCellType(HSSFCell.CELL_TYPE_STRING);//设置列中写入内容为string类型
                cell.setCellValue(attribute.name());//写入列名

                //如果设置了提示信息则鼠标放上去提示
                if(!attribute.prompt().trim().equals("")){
                    setHSSFPrompt(sheet,"",attribute.prompt(),1,100,col,col);//默认2-101列提示
                }
                //如果设置了combo属性则本列只能选择不能输入
                if (attribute.combo().length>0){
                    setHSSFValidation(sheet,attribute.combo(),1,100,col,col);//这里默认设了2-101列只能选择不能输入
                }
            }

            int startNo=index*sheetSize;
            int endNo=Math.min(startNo+sheetSize,list.size());
            //写入各条记录，每条记录对应exccel表中的一行
            for (int i=startNo;i<endNo;i++){
                row=sheet.createRow(i+1-startNo);
                T vo=(T)list.get(i);//得到对象
                for (int j=0;j<fields.size();j++){
                    Field field=fields.get(j);//获得field
                    field.setAccessible(true);
                    ExcelVOAttribute attr=field.getAnnotation(ExcelVOAttribute.class);
                    //根据ExcelVOAttribute中设置情况决定是否导出
                    try {
                        if(attr.isExport()){
                            cell=row.createCell(getExcelCol(attr.column()));
                            cell.setCellType(HSSFCell.CELL_TYPE_STRING);
                            cell.setCellValue(field.get(vo)==null?"":String.valueOf(field.get(vo)));
                        }
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }catch (IllegalArgumentException e){
                        e.printStackTrace();
                    }
                }
            }
        }
        try {
            output.flush();
            workbook.write(output);
            output.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Output is closed");
            return false;
        }
    }

    /**
     * 对list数据员将其里面的数据导入到excel表单，且导出至浏览器下载
     * @param list
     * @param sheetName 工作表名称
     * @param sheetSize 每个sheet中数据的行数
     * @param output javaI/O
     * @return
             */
    public boolean exportExcelToBrowser(HttpServletResponse response, List<T>list, String sheetName, int sheetSize, OutputStream output){
        Field[] allFields=clazz.getDeclaredFields();//得到所有定义字段
        List<Field>fields=new ArrayList<Field>();
        output=null;
        //得到所有field并存放到一个List中
        for (Field field:allFields){
            if (field.isAnnotationPresent(ExcelVOAttribute.class)){
                fields.add(field);
            }
        }
        HSSFWorkbook workbook=new HSSFWorkbook();//产生工作簿对象
        if(sheetSize>65536||sheetSize<1){
            sheetSize=65536;
        }
        double sheetNo=Math.ceil(list.size()/sheetSize);//取出一共有多少个sheet
        for (int index=0;index<=sheetNo;index++){
            HSSFSheet sheet=workbook.createSheet();//产生工作表对象
            if(sheetNo==0){
                workbook.setSheetName(index,sheetName);
            }else {
                workbook.setSheetName(index,sheetName+index);
            }
            HSSFRow row;
            HSSFCell cell;//产生单元格

            row=sheet.createRow(0);//产生一行
            //写入各个字段的列头名称
            for (int i=0;i<fields.size();i++){
                Field field=fields.get(i);
                ExcelVOAttribute attribute=field.getAnnotation(ExcelVOAttribute.class);
                int col=getExcelCol(attribute.column());//获得列号
                cell=row.createCell(col);//创建列
                cell.setCellType(HSSFCell.CELL_TYPE_STRING);//设置列中写入内容为string类型
                cell.setCellValue(attribute.name());//写入列名

                //如果设置了提示信息则鼠标放上去提示
                if(!attribute.prompt().trim().equals("")){
                    setHSSFPrompt(sheet,"",attribute.prompt(),1,100,col,col);//默认2-101列提示
                }
                //如果设置了combo属性则本列只能选择不能输入
                if (attribute.combo().length>0){
                    setHSSFValidation(sheet,attribute.combo(),1,100,col,col);//这里默认设了2-101列只能选择不能输入
                }
            }

            int startNo=index*sheetSize;
            int endNo=Math.min(startNo+sheetSize,list.size());
            //写入各条记录，每条记录对应exccel表中的一行
            for (int i=startNo;i<endNo;i++){
                row=sheet.createRow(i+1-startNo);
                T vo=(T)list.get(i);//得到对象
                for (int j=0;j<fields.size();j++){
                    Field field=fields.get(j);//获得field
                    field.setAccessible(true);
                    ExcelVOAttribute attr=field.getAnnotation(ExcelVOAttribute.class);
                    //根据ExcelVOAttribute中设置情况决定是否导出
                    try {
                        if(attr.isExport()){
                            cell=row.createCell(getExcelCol(attr.column()));
                            cell.setCellType(HSSFCell.CELL_TYPE_STRING);
                            cell.setCellValue(field.get(vo)==null?"":String.valueOf(field.get(vo)));
                        }
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }catch (IllegalArgumentException e){
                        e.printStackTrace();
                    }
                }
            }
        }
        try {
            output=response.getOutputStream();
            response.reset();
            response.addHeader("Content-Disposition","attachment;filename="+sheetName);
            response.setContentType("application/msexcel");
            workbook.write(output);
            output.flush();
            output.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Output is closed");
            return false;
        }

    }

    /**
     * 设置单元格上提示
     *
     * @param sheet
     *          要设置的sheet
     * @param promptTitle 标题
     * @param promptContent 内容
     * @param firstRow 开始行
     * @param endRow 结束行
     * @param firstCol 开始列
     * @param endCol 结束列
     * @return
     */
    public static HSSFSheet setHSSFPrompt(HSSFSheet sheet,String promptTitle
            ,String promptContent,int firstRow,int endRow,int firstCol,int endCol){
        //构造constraint对象
        DVConstraint constraint=DVConstraint.createCustomFormulaConstraint("DD1");

        //四个参数
        CellRangeAddressList regions=new CellRangeAddressList(firstRow,endRow,firstCol,endCol);

        //数据有效性对象
        HSSFDataValidation dataValidation=new HSSFDataValidation(regions,constraint);
        dataValidation.createPromptBox(promptTitle,promptContent);
        sheet.addValidationData(dataValidation);
        return sheet;
    }

    /**
     * 设置某些列的值只能输入预制数据，显示下拉框
     * @param sheet
     * @param textlist
     * @param firstRow
     * @param endRow
     * @param firstCol
     * @param endCol
     * @return
     */
    public static HSSFSheet setHSSFValidation(HSSFSheet sheet,
                        String[] textlist,int firstRow,int endRow,int firstCol,
                        int endCol ){
                //加载下拉列表内容
            DVConstraint constraint=DVConstraint.createExplicitListConstraint(textlist);
            //设置数据有效性加载在哪个单元格上
        CellRangeAddressList regions=new CellRangeAddressList(firstRow
                                            ,endRow,firstCol,endCol);

        //数据有效性对象
        HSSFDataValidation dataValidationlist=new HSSFDataValidation(regions,constraint);
        sheet.addValidationData(dataValidationlist);
        return sheet;
    }
    //导出文件
    protected void buildExcelFile(String filename,HSSFWorkbook workbook) throws IOException {
        FileOutputStream outputStream=new FileOutputStream(filename);
        workbook.write(outputStream);
        outputStream.flush();
        outputStream.close();

    }
    //浏览器下载
    protected void buildExcelDocument(String filename,HSSFWorkbook workbook,HttpServletResponse response) throws IOException {
        response.setHeader("Content-Dispositon","attachment;filename="+ URLEncoder.encode(filename,"UTF-8"));
        response.setContentType("application/msexcel");
        OutputStream output=response.getOutputStream();
        workbook.write(output);
        output.flush();
        output.close();
    }


}
