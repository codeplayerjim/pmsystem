package com.spaker.pmsystem.model;

import java.io.Serializable;
import java.util.Date;

public class PmsRetireEmployee implements Serializable {
    /**
    *
     *
     * @mbggenerated
    */
    private Integer id;

    /**
    *
     *
     * @mbggenerated
    */
    private String sex;

    /**
    *
     *
     * @mbggenerated
    */
    private String name;

    /**
    *
     *
     * @mbggenerated
    */
    private String national;

    /**
    *
     *
     * @mbggenerated
    */
    private String birthplace;

    /**
    *
     *
     * @mbggenerated
    */
    private Date birthday;

    /**
    *身份证号码

     *
     * @mbggenerated
    */
    private String number;

    /**
    *现居地址
     *
     * @mbggenerated
    */
    private String address;

    /**
    *紧急联系人电话号码
     *
     * @mbggenerated
    */
    private String phone;

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

    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national;
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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
        sb.append(", national=").append(national);
        sb.append(", birthplace=").append(birthplace);
        sb.append(", birthday=").append(birthday);
        sb.append(", number=").append(number);
        sb.append(", address=").append(address);
        sb.append(", phone=").append(phone);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}