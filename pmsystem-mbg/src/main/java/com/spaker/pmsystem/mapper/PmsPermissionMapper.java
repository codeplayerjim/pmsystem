package com.spaker.pmsystem.mapper;

import com.spaker.pmsystem.model.PmsPermission;
import com.spaker.pmsystem.model.PmsPermissionExample;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsPermissionMapper {
    int countByExample(PmsPermissionExample example);

    int deleteByExample(PmsPermissionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PmsPermission record);

    int insertSelective(PmsPermission record);

    List<PmsPermission> selectByExample(PmsPermissionExample example);

    PmsPermission selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PmsPermission record, @Param("example") PmsPermissionExample example);

    int updateByExample(@Param("record") PmsPermission record, @Param("example") PmsPermissionExample example);

    int updateByPrimaryKeySelective(PmsPermission record);

    int updateByPrimaryKey(PmsPermission record);
}