package com.spaker.pmsystem.model;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

public class PmsRetireEmployee implements Serializable {
    private Integer id;

    private String sex;

    private String name;

    @ApiModelProperty(value="民族")
    private String nation;

    @ApiModelProperty(value="籍贯")
    private String nativePlace;

    @ApiModelProperty(value="出生地")
    private String birthplace;

    @ApiModelProperty(value="出生年月")
    private Date birthday;

    @ApiModelProperty(value="银行卡")
    private String bankcard;

    @ApiModelProperty(value="身份证号码")
    private String idcard;

    @ApiModelProperty(value="现居地址")
    private String residence;

    @ApiModelProperty(value="紧急联系电话")
    private String emergphone;

    @ApiModelProperty(value="紧急联系人联系方式")
    private String emergencycontact;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getBankcard() {
        return bankcard;
    }

    public void setBankcard(String bankcard) {
        this.bankcard = bankcard;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }

    public String getEmergphone() {
        return emergphone;
    }

    public void setEmergphone(String emergphone) {
        this.emergphone = emergphone;
    }

    public String getEmergencycontact() {
        return emergencycontact;
    }

    public void setEmergencycontact(String emergencycontact) {
        this.emergencycontact = emergencycontact;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", sex=").append(sex);
        sb.append(", name=").append(name);
        sb.append(", nation=").append(nation);
        sb.append(", nativePlace=").append(nativePlace);
        sb.append(", birthplace=").append(birthplace);
        sb.append(", birthday=").append(birthday);
        sb.append(", bankcard=").append(bankcard);
        sb.append(", idcard=").append(idcard);
        sb.append(", residence=").append(residence);
        sb.append(", emergphone=").append(emergphone);
        sb.append(", emergencycontact=").append(emergencycontact);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}