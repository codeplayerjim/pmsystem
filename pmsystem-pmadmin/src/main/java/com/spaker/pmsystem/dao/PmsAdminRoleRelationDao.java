package com.spaker.pmsystem.dao;

import com.spaker.pmsystem.model.PmsAdminRoleRelation;
import com.spaker.pmsystem.model.PmsPermission;
import com.spaker.pmsystem.model.PmsRole;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 后台用户与角色管理自定义Dao
 * Created by sunshine on 2019/4/1.
 */
public interface PmsAdminRoleRelationDao {
    /**
     * 批量插入用户角色关系
     */
    int insertList(@Param("list") List<PmsAdminRoleRelation> adminRoleRelationList);

    /**
     * 获取用于所有角色
     */
    List<PmsRole> getRoleList(@Param("adminId") int adminId);

    /**
     * 获取用户所有角色权限
     */
    List<PmsPermission> getRolePermissionList(@Param("adminId") int adminId);

    /**
     * 获取用户所有权限(包括+-权限)
     */
    List<PmsPermission> getPermissionList(@Param("adminId") int adminId);
}
