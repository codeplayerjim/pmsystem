package com.spaker.pmsystem.mapper;

import com.spaker.pmsystem.model.PmsAdminPermissionRelation;
import com.spaker.pmsystem.model.PmsAdminPermissionRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsAdminPermissionRelationMapper {
    int countByExample(PmsAdminPermissionRelationExample example);

    int deleteByExample(PmsAdminPermissionRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PmsAdminPermissionRelation record);

    int insertSelective(PmsAdminPermissionRelation record);

    List<PmsAdminPermissionRelation> selectByExample(PmsAdminPermissionRelationExample example);

    PmsAdminPermissionRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PmsAdminPermissionRelation record, @Param("example") PmsAdminPermissionRelationExample example);

    int updateByExample(@Param("record") PmsAdminPermissionRelation record, @Param("example") PmsAdminPermissionRelationExample example);

    int updateByPrimaryKeySelective(PmsAdminPermissionRelation record);

    int updateByPrimaryKey(PmsAdminPermissionRelation record);
}