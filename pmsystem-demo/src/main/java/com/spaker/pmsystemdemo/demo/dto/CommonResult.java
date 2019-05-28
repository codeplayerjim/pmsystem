package com.spaker.pmsystemdemo.demo.dto;

import com.github.pagehelper.PageInfo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommonResult {
    public static final int SUCCESS=0;
    public static final int FAILED=1;
    public static final int VALIDATE_FAILED=2;
    private int code;
    private String message;
    private Object data;

    /**
     * 成功返回
     * @param data 获取的数据
     * @return
     */
    public CommonResult success(Object data){
        this.code=SUCCESS;
        this.message="返回成功";
        this.data=data;
        return this;
    }

    public CommonResult pageSuccess(List data){
        PageInfo pageInfo=new PageInfo(data);
        long totalpage=pageInfo.getTotal()/pageInfo.getPageSize();
        Map<String,Object>result=new HashMap<>();
        result.put("pageSize",pageInfo.getPageSize());//显示记录数
        result.put("totalPage",totalpage);//总页
        result.put("pageNum",pageInfo.getPageNum());
        result.put("list",pageInfo.getList());
        this.code = SUCCESS;
        this.message = "操作成功";
        this.data = result;
        return this;
    }

    /**
     * 失败返回
     * @return
     */
    public CommonResult failed(){
        this.code = FAILED;
        this.message = "操作失败";
        return this;
    }

    /**
     * 验证失败返回
     * @param message
     * @return
     */
    public CommonResult vaildataFailed(String message){
        this.code=VALIDATE_FAILED;
        this.message=message;
        return this;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
