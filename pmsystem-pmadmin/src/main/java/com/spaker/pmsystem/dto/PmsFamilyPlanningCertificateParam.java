package com.spaker.pmsystem.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * 家庭成员参数
 * Created by DennisYao on 05,2019/5/17.
 */
@Getter
@Setter
public class PmsFamilyPlanningCertificateParam extends PmsFamilyPlanningCertificate {
    @ApiModelProperty(value="部门联系电话")
    private String numbering;
    @ApiModelProperty(value="户籍地")
    private String householdRegistration;
    @ApiModelProperty(value="避孕措施")
    private String measures;
    @ApiModelProperty(value="现居地")
    private String live;
    @ApiModelProperty(value="部门联系电话")
    private String departmentContact;
    @JsonFormat(pattern = "yyyy-MM--dd HH:mm:ss")
    @ApiModelProperty(value="计生证有效时间")
    private Date mealTime;
}
