package com.spaker.pmsystem.model;

import java.io.Serializable;

public class PmsChildSituation implements Serializable {
    /**
    *
     *
     * @mbggenerated
    */
    private Integer id;

    /**
    *数量
     *
     * @mbggenerated
    */
    private Integer quantity;

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
    private String age;

    /**
    *
     *
     * @mbggenerated
    */
    private String employer;

    /**
    *
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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
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
        sb.append(", quantity=").append(quantity);
        sb.append(", sex=").append(sex);
        sb.append(", name=").append(name);
        sb.append(", age=").append(age);
        sb.append(", employer=").append(employer);
        sb.append(", phone=").append(phone);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}