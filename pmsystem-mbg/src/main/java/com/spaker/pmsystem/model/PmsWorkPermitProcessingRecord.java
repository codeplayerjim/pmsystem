package com.spaker.pmsystem.model;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

public class PmsWorkPermitProcessingRecord implements Serializable {
    private Integer id;

    private Integer healthyId;

    private String familyPlanningCertificateId;

    @ApiModelProperty(value="到期日期")
    private Date expirTime;

    @ApiModelProperty(value="办理日期")
    private Date servTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHealthyId() {
        return healthyId;
    }

    public void setHealthyId(Integer healthyId) {
        this.healthyId = healthyId;
    }

    public String getFamilyPlanningCertificateId() {
        return familyPlanningCertificateId;
    }

    public void setFamilyPlanningCertificateId(String familyPlanningCertificateId) {
        this.familyPlanningCertificateId = familyPlanningCertificateId;
    }

    public Date getExpirTime() {
        return expirTime;
    }

    public void setExpirTime(Date expirTime) {
        this.expirTime = expirTime;
    }

    public Date getServTime() {
        return servTime;
    }

    public void setServTime(Date servTime) {
        this.servTime = servTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", healthyId=").append(healthyId);
        sb.append(", familyPlanningCertificateId=").append(familyPlanningCertificateId);
        sb.append(", expirTime=").append(expirTime);
        sb.append(", servTime=").append(servTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}