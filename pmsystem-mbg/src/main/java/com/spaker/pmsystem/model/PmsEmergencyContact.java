package com.spaker.pmsystem.model;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class PmsEmergencyContact implements Serializable {
    private Integer id;

    @ApiModelProperty(value="紧急联系人姓名")
    private String emergname;

    @ApiModelProperty(value="紧急联系人电话号码")
    private String emergphone;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmergname() {
        return emergname;
    }

    public void setEmergname(String emergname) {
        this.emergname = emergname;
    }

    public String getEmergphone() {
        return emergphone;
    }

    public void setEmergphone(String emergphone) {
        this.emergphone = emergphone;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", emergname=").append(emergname);
        sb.append(", emergphone=").append(emergphone);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}