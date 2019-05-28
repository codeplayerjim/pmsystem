package com.spaker.pmsystem.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * 子女关系参数
 * Created by sunshine on 2019/4/16.
 */
@Getter
@Setter
public class PmsChildSituationParam {
    @ApiModelProperty(value = "数量", required = true)
    @NotEmpty(message = "数量不能为空")
    private Integer quantity;

    @ApiModelProperty(value = "性别", required = true)
    private String sex;

    @ApiModelProperty(value = "用户名", required = true)
    @NotEmpty(message = "用户名不能为空")
    private String name;

    @ApiModelProperty(value = "年龄", required = true)
    @NotEmpty(message = "年龄不能为空")
    private String age;

    @ApiModelProperty(value = "工作单位", required = true)
    @NotEmpty(message = "工作单位不能为空")
    private String employer;

    @ApiModelProperty(value = "联系方式", required = true)
    @NotEmpty(message = "联系方式不能为空")
    private String phone;
}
