package com.spaker.pmsystem.service;

import com.spaker.pmsystem.dto.PmsPermissionNode;

import java.util.List;

/**
 * Created by sunshine on 2019/3/29.
 */
public interface PmsPermissionService {
    /**
     * 添加权限
     */
    int create(PmsPermission permission);

    /**
     * 修改权限
     */
    int update(int id, PmsPermission permission);

    /**
     * 批量删除权限
     */
    int delete(List<Integer> ids);

    /**
     * 以层级结构返回所有权限
     */
    List<PmsPermissionNode> treeList();

    /**
     * 获取所有权限
     */
    List<PmsPermission> list();
}
