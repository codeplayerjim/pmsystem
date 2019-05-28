package com.spaker.pmsystem.dto;

import com.spaker.pmsystem.vo.ExcelVOAttribute;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by sunshine on 2019/4/16.
 */
@Getter
@Setter
public class PmsEmergencyContactParam {
    @ApiModelProperty(value = "姓名" ,required = true)
    @NotEmpty(message = "姓名不能为空")
    private String name;
    @ApiModelProperty(value = "联系方式" ,required = true)
    @NotEmpty(message = "联系方式不能为空")
    private String phone;
}
