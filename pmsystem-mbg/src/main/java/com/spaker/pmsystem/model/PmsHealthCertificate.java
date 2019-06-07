package com.spaker.pmsystem.model;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

public class PmsHealthCertificate implements Serializable {
    private Integer id;

    @ApiModelProperty(value="办理时间")
    private Date servTime;

    @ApiModelProperty(value="到期时间")
    private Date expirTime;

    @ApiModelProperty(value="机构")
    private String institution;

    @ApiModelProperty(value="是否有原件")
    private String hasScript;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getServTime() {
        return servTime;
    }

    public void setServTime(Date servTime) {
        this.servTime = servTime;
    }

    public Date getExpirTime() {
        return expirTime;
    }

    public void setExpirTime(Date expirTime) {
        this.expirTime = expirTime;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getHasScript() {
        return hasScript;
    }

    public void setHasScript(String hasScript) {
        this.hasScript = hasScript;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", servTime=").append(servTime);
        sb.append(", expirTime=").append(expirTime);
        sb.append(", institution=").append(institution);
        sb.append(", hasScript=").append(hasScript);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}