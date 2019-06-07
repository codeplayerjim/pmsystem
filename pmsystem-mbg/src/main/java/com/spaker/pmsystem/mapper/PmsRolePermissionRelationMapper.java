package com.spaker.pmsystem.mapper;

import com.spaker.pmsystem.model.PmsRolePermissionRelation;
import com.spaker.pmsystem.model.PmsRolePermissionRelationExample;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsRolePermissionRelationMapper {
    int countByExample(PmsRolePermissionRelationExample example);

    int deleteByExample(PmsRolePermissionRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PmsRolePermissionRelation record);

    int insertSelective(PmsRolePermissionRelation record);

    List<PmsRolePermissionRelation> selectByExample(PmsRolePermissionRelationExample example);

    PmsRolePermissionRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PmsRolePermissionRelation record, @Param("example") PmsRolePermissionRelationExample example);

    int updateByExample(@Param("record") PmsRolePermissionRelation record, @Param("example") PmsRolePermissionRelationExample example);

    int updateByPrimaryKeySelective(PmsRolePermissionRelation record);

    int updateByPrimaryKey(PmsRolePermissionRelation record);
}