package com.spaker.pmsystem.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by sunshine on 2019/4/16.
 */
@Getter
@Setter
public class PmsParentalSituationParam {
    @ApiModelProperty(value = "姓名" ,required = true)
    @NotEmpty(message = "姓名不能为空")
    private String name;
    @ApiModelProperty(value = "关系" ,required = true)
    @NotEmpty(message = "关系不能为空")
    private String relationship;
    @ApiModelProperty(value = "年龄" ,required = true)
    private String age;
    @ApiModelProperty(value = "工作单位" ,required = true)
    @NotEmpty(message = "工作单位不能为空")
    private String workplace;

    @ApiModelProperty(value = "联系方式" ,required = true)
    private String phone;
}
