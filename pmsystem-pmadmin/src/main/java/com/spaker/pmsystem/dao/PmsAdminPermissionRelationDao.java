package com.spaker.pmsystem.dao;

import com.spaker.pmsystem.model.PmsAdminPermissionRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 用户权限自定义dao
 * Sunshine
 * 4/6/2019
 */
public interface PmsAdminPermissionRelationDao {
        int insertList(@Param("list")List<PmsAdminPermissionRelation>list);
}
