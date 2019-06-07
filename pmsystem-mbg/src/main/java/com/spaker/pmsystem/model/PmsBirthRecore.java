package com.spaker.pmsystem.model;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

public class PmsBirthRecore implements Serializable {
    private Integer id;

    @ApiModelProperty(value="出生类型")
    private String newborn;

    @ApiModelProperty(value="产检医院")
    private String productInspectionHospital;

    @ApiModelProperty(value="分娩医院")
    private String childbirthHospital;

    @ApiModelProperty(value="计生证号码")
    private Integer birthCertificateNumber;

    @ApiModelProperty(value="生育时间")
    private Date fertilityDate;

    @ApiModelProperty(value="流产时间")
    private Date abortionData;

    @ApiModelProperty(value="计划生育时间")
    private Date birthControlData;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNewborn() {
        return newborn;
    }

    public void setNewborn(String newborn) {
        this.newborn = newborn;
    }

    public String getProductInspectionHospital() {
        return productInspectionHospital;
    }

    public void setProductInspectionHospital(String productInspectionHospital) {
        this.productInspectionHospital = productInspectionHospital;
    }

    public String getChildbirthHospital() {
        return childbirthHospital;
    }

    public void setChildbirthHospital(String childbirthHospital) {
        this.childbirthHospital = childbirthHospital;
    }

    public Integer getBirthCertificateNumber() {
        return birthCertificateNumber;
    }

    public void setBirthCertificateNumber(Integer birthCertificateNumber) {
        this.birthCertificateNumber = birthCertificateNumber;
    }

    public Date getFertilityDate() {
        return fertilityDate;
    }

    public void setFertilityDate(Date fertilityDate) {
        this.fertilityDate = fertilityDate;
    }

    public Date getAbortionData() {
        return abortionData;
    }

    public void setAbortionData(Date abortionData) {
        this.abortionData = abortionData;
    }

    public Date getBirthControlData() {
        return birthControlData;
    }

    public void setBirthControlData(Date birthControlData) {
        this.birthControlData = birthControlData;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", newborn=").append(newborn);
        sb.append(", productInspectionHospital=").append(productInspectionHospital);
        sb.append(", childbirthHospital=").append(childbirthHospital);
        sb.append(", birthCertificateNumber=").append(birthCertificateNumber);
        sb.append(", fertilityDate=").append(fertilityDate);
        sb.append(", abortionData=").append(abortionData);
        sb.append(", birthControlData=").append(birthControlData);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}