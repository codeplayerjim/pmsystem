package com.spaker.pmsystem.model;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

public class PmsFamilyPlanningCertificate implements Serializable {
    private Integer id;

    private String numbering;

    private String householdRegistration;

    private String measures;

    private String live;

    @ApiModelProperty(value="部门联系电话")
    private String departmentContact;

    private Date mealTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumbering() {
        return numbering;
    }

    public void setNumbering(String numbering) {
        this.numbering = numbering;
    }

    public String getHouseholdRegistration() {
        return householdRegistration;
    }

    public void setHouseholdRegistration(String householdRegistration) {
        this.householdRegistration = householdRegistration;
    }

    public String getMeasures() {
        return measures;
    }

    public void setMeasures(String measures) {
        this.measures = measures;
    }

    public String getLive() {
        return live;
    }

    public void setLive(String live) {
        this.live = live;
    }

    public String getDepartmentContact() {
        return departmentContact;
    }

    public void setDepartmentContact(String departmentContact) {
        this.departmentContact = departmentContact;
    }

    public Date getMealTime() {
        return mealTime;
    }

    public void setMealTime(Date mealTime) {
        this.mealTime = mealTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", numbering=").append(numbering);
        sb.append(", householdRegistration=").append(householdRegistration);
        sb.append(", measures=").append(measures);
        sb.append(", live=").append(live);
        sb.append(", departmentContact=").append(departmentContact);
        sb.append(", mealTime=").append(mealTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}