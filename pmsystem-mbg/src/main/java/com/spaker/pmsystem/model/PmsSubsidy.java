package com.spaker.pmsystem.model;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

public class PmsSubsidy implements Serializable {
    private Integer id;

    @ApiModelProperty(value="领取补助时间")
    private Date subsidyTime;

    @ApiModelProperty(value="补助金额")
    private String amountOfSubsidies;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getSubsidyTime() {
        return subsidyTime;
    }

    public void setSubsidyTime(Date subsidyTime) {
        this.subsidyTime = subsidyTime;
    }

    public String getAmountOfSubsidies() {
        return amountOfSubsidies;
    }

    public void setAmountOfSubsidies(String amountOfSubsidies) {
        this.amountOfSubsidies = amountOfSubsidies;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", subsidyTime=").append(subsidyTime);
        sb.append(", amountOfSubsidies=").append(amountOfSubsidies);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}