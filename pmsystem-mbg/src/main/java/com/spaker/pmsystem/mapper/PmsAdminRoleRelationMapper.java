package com.spaker.pmsystem.mapper;

import com.spaker.pmsystem.model.PmsAdminRoleRelation;
import com.spaker.pmsystem.model.PmsAdminRoleRelationExample;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsAdminRoleRelationMapper {
    int countByExample(PmsAdminRoleRelationExample example);

    int deleteByExample(PmsAdminRoleRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PmsAdminRoleRelation record);

    int insertSelective(PmsAdminRoleRelation record);

    List<PmsAdminRoleRelation> selectByExample(PmsAdminRoleRelationExample example);

    PmsAdminRoleRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PmsAdminRoleRelation record, @Param("example") PmsAdminRoleRelationExample example);

    int updateByExample(@Param("record") PmsAdminRoleRelation record, @Param("example") PmsAdminRoleRelationExample example);

    int updateByPrimaryKeySelective(PmsAdminRoleRelation record);

    int updateByPrimaryKey(PmsAdminRoleRelation record);
}