package com.spaker.pmsystem.model;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

public class PmsFamilyPlanningCertificate implements Serializable {
    private Integer id;

    @ApiModelProperty(value="编号")
    private Integer idnumber;

    @ApiModelProperty(value="户籍地")
    private String householdRegistration;

    @ApiModelProperty(value="避孕措施")
    private String contraceptionMeasures;

    @ApiModelProperty(value="现居地")
    private String residence;

    @ApiModelProperty(value="计生部门联系电话")
    private String departmentContact;

    @ApiModelProperty(value="计生证有效时间")
    private Date vaildTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(Integer idnumber) {
        this.idnumber = idnumber;
    }

    public String getHouseholdRegistration() {
        return householdRegistration;
    }

    public void setHouseholdRegistration(String householdRegistration) {
        this.householdRegistration = householdRegistration;
    }

    public String getContraceptionMeasures() {
        return contraceptionMeasures;
    }

    public void setContraceptionMeasures(String contraceptionMeasures) {
        this.contraceptionMeasures = contraceptionMeasures;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }

    public String getDepartmentContact() {
        return departmentContact;
    }

    public void setDepartmentContact(String departmentContact) {
        this.departmentContact = departmentContact;
    }

    public Date getVaildTime() {
        return vaildTime;
    }

    public void setVaildTime(Date vaildTime) {
        this.vaildTime = vaildTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", idnumber=").append(idnumber);
        sb.append(", householdRegistration=").append(householdRegistration);
        sb.append(", contraceptionMeasures=").append(contraceptionMeasures);
        sb.append(", residence=").append(residence);
        sb.append(", departmentContact=").append(departmentContact);
        sb.append(", vaildTime=").append(vaildTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}