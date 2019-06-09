package com.spaker.pmsystem.dao;

import com.spaker.pmsystem.model.PmsPermission;
import com.spaker.pmsystem.model.PmsRolePermissionRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 后台用户角色管理自定义dao
 * Created by sunshine on 2019/3/30.
 */
public interface PmsRolePermissionRelationDao {
    /**
     * 批量插入权限与角色关系
     *
     * */
    int insertList(@Param("list") List<PmsRolePermissionRelation>list);

    /**
     *
     * 根据角色获取权限
     *
     */
    List<PmsPermission>getPermissionList(@Param("roleId")int roleId);

}
