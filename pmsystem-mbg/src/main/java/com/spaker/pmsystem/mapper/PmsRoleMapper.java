package com.spaker.pmsystem.mapper;

import com.spaker.pmsystem.model.PmsRole;
import com.spaker.pmsystem.model.PmsRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsRoleMapper {
    int countByExample(PmsRoleExample example);

    int deleteByExample(PmsRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PmsRole record);

    int insertSelective(PmsRole record);

    List<PmsRole> selectByExample(PmsRoleExample example);

    PmsRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PmsRole record, @Param("example") PmsRoleExample example);

    int updateByExample(@Param("record") PmsRole record, @Param("example") PmsRoleExample example);

    int updateByPrimaryKeySelective(PmsRole record);

    int updateByPrimaryKey(PmsRole record);
}