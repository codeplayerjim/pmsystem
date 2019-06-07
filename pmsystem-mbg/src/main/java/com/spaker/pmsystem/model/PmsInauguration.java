package com.spaker.pmsystem.model;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

public class PmsInauguration implements Serializable {
    private Integer id;

    @ApiModelProperty(value="入职时间")
    private Date entryTime;

    @ApiModelProperty(value="离职时间")
    private Date separationTime;

    @ApiModelProperty(value="历史就职时间")
    private String employedTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Date getSeparationTime() {
        return separationTime;
    }

    public void setSeparationTime(Date separationTime) {
        this.separationTime = separationTime;
    }

    public String getEmployedTime() {
        return employedTime;
    }

    public void setEmployedTime(String employedTime) {
        this.employedTime = employedTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", entryTime=").append(entryTime);
        sb.append(", separationTime=").append(separationTime);
        sb.append(", employedTime=").append(employedTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}