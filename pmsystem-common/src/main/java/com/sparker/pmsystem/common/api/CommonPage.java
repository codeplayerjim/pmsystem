package com.sparker.pmsystem.common.api;


import com.github.pagehelper.PageInfo;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * 分页数据封装类
 * Created by sunshine on 2019/5/10.
 */
public class CommonPage<T> {
    private Integer pageNum;
    private Integer pageSize;
    private Integer totalPage;
    private  Long total;
    private List<T>list;

    /**
     * 将pageHelper分页后的list转为分页信息
     * @param list
     *
     */
    public static <T>CommonPage<T>restPage(List<T> list){
       CommonPage<T>result=new CommonPage<T>();
       PageInfo<T> pageInfo=new PageInfo<T>(list);
       result.setTotalPage(pageInfo.getPages());
       result.setPageNum(pageInfo.getPageNum());
       result.setPageSize(pageInfo.getPageSize());
       result.setTotal(pageInfo.getTotal());
       result.setList(pageInfo.getList());
       return result;
    }

    /**
     * 将springdata分页后的list转为分页信息
     *
     */
    public static <T>CommonPage<T>restPage(Page<T> pageInfo){
        CommonPage<T>result=new CommonPage<T>();
        result.setTotal(pageInfo.getTotalElements());
        result.setTotalPage(pageInfo.getTotalPages());
        result.setPageSize(pageInfo.getSize());
        result.setPageNum(pageInfo.getNumber());
        result.setList(pageInfo.getContent());
        return result;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
