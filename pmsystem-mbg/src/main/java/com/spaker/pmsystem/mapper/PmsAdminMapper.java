package com.spaker.pmsystem.mapper;

import com.spaker.pmsystem.model.PmsAdmin;
import com.spaker.pmsystem.model.PmsAdminExample;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsAdminMapper {
    int countByExample(PmsAdminExample example);

    int deleteByExample(PmsAdminExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PmsAdmin record);

    int insertSelective(PmsAdmin record);

    List<PmsAdmin> selectByExample(PmsAdminExample example);

    PmsAdmin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PmsAdmin record, @Param("example") PmsAdminExample example);

    int updateByExample(@Param("record") PmsAdmin record, @Param("example") PmsAdminExample example);

    int updateByPrimaryKeySelective(PmsAdmin record);

    int updateByPrimaryKey(PmsAdmin record);
}