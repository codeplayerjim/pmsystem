package com.spaker.pmsystem.model;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

public class PmsProfessionalSkillsCertificate implements Serializable {
    private Integer id;

    @ApiModelProperty(value="证书号")
    private String certificateNo;

    @ApiModelProperty(value="专业技能级别")
    private String professionLevel;

    @ApiModelProperty(value="发证机关")
    private String releaseOrganization;

    @ApiModelProperty(value="发证日期")
    private Date releaseData;

    @ApiModelProperty(value="专业技能")
    private String professionSkill;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCertificateNo() {
        return certificateNo;
    }

    public void setCertificateNo(String certificateNo) {
        this.certificateNo = certificateNo;
    }

    public String getProfessionLevel() {
        return professionLevel;
    }

    public void setProfessionLevel(String professionLevel) {
        this.professionLevel = professionLevel;
    }

    public String getReleaseOrganization() {
        return releaseOrganization;
    }

    public void setReleaseOrganization(String releaseOrganization) {
        this.releaseOrganization = releaseOrganization;
    }

    public Date getReleaseData() {
        return releaseData;
    }

    public void setReleaseData(Date releaseData) {
        this.releaseData = releaseData;
    }

    public String getProfessionSkill() {
        return professionSkill;
    }

    public void setProfessionSkill(String professionSkill) {
        this.professionSkill = professionSkill;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", certificateNo=").append(certificateNo);
        sb.append(", professionLevel=").append(professionLevel);
        sb.append(", releaseOrganization=").append(releaseOrganization);
        sb.append(", releaseData=").append(releaseData);
        sb.append(", professionSkill=").append(professionSkill);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}