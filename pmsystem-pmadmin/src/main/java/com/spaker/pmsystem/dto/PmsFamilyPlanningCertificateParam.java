package com.spaker.pmsystem.dto;

import com.spaker.pmsystem.model.PmsFamilyPlanningCertificate;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * 家庭成员参数
 * Created by DennisYao on 05,2019/5/17.
 */
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
    @ApiModelProperty(value="计生证有效时间")
    private Date mealTime;
}
