package com.spaker.pmsystem.model;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

public class PmsPurchaseAndPurchaseSituation implements Serializable {
    private Integer id;

    @ApiModelProperty(value="购保时间")
    private Date purchaseTime;

    @ApiModelProperty(value="停保时间")
    private Date timeToSuspend;

    @ApiModelProperty(value="个人电脑号")
    private Integer personalComputerId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getPurchaseTime() {
        return purchaseTime;
    }

    public void setPurchaseTime(Date purchaseTime) {
        this.purchaseTime = purchaseTime;
    }

    public Date getTimeToSuspend() {
        return timeToSuspend;
    }

    public void setTimeToSuspend(Date timeToSuspend) {
        this.timeToSuspend = timeToSuspend;
    }

    public Integer getPersonalComputerId() {
        return personalComputerId;
    }

    public void setPersonalComputerId(Integer personalComputerId) {
        this.personalComputerId = personalComputerId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", purchaseTime=").append(purchaseTime);
        sb.append(", timeToSuspend=").append(timeToSuspend);
        sb.append(", personalComputerId=").append(personalComputerId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}