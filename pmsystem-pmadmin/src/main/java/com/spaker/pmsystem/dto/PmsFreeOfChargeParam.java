package com.spaker.pmsystem.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Create By Sunshine
 * 6/9/2019
 */
@Getter
@Setter
public class PmsFreeOfChargeParam {
    @ApiModelProperty(value="卡号")
    @NotEmpty(message = "卡号不能为空")
    private String cardnumber;
    @ApiModelProperty(value="卡类型")
    private String cardtype;
    @ApiModelProperty(value="设置新旧卡提醒")
    private String isAlarm;

}
