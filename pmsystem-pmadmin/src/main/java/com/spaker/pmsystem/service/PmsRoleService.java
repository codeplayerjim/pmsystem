package com.spaker.pmsystem.service;

import com.spaker.pmsystem.model.PmsPermission;
import com.spaker.pmsystem.model.PmsRole;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by sunshine on 2019/3/29.
 */
public interface PmsRoleService {
    /**
     * 添加角色
     */
    int create(PmsRole role);

    /**
     * 修改角色信息
     */
    int update(int id, PmsRole role);

    /**
     * 批量删除角色
     */
    int delete(List<Integer> ids);

    /**
     * 获取指定角色权限
     */
    List<PmsPermission> getPermissionList(int roleId);

    /**
     * 修改指定角色的权限
     */
    @Transactional
    int updatePermission(int roleId, List<Integer> permissionIds);

    /**
     * 获取角色列表
     */
    List<PmsRole> list();
}
