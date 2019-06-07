package com.spaker.pmsystem.model;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

public class PmsContractSigning implements Serializable {
    private Integer id;

    @ApiModelProperty(value="类别")
    private String category;

    @ApiModelProperty(value="到期")
    private Date exiprTime;

    @ApiModelProperty(value="到期情况")
    private String expirSituation;

    @ApiModelProperty(value="提醒合同即将过期")
    private String isExpire;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getExiprTime() {
        return exiprTime;
    }

    public void setExiprTime(Date exiprTime) {
        this.exiprTime = exiprTime;
    }

    public String getExpirSituation() {
        return expirSituation;
    }

    public void setExpirSituation(String expirSituation) {
        this.expirSituation = expirSituation;
    }

    public String getIsExpire() {
        return isExpire;
    }

    public void setIsExpire(String isExpire) {
        this.isExpire = isExpire;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", category=").append(category);
        sb.append(", exiprTime=").append(exiprTime);
        sb.append(", expirSituation=").append(expirSituation);
        sb.append(", isExpire=").append(isExpire);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}