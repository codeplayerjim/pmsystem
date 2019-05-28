package com.spaker.pmsystem.model;

import java.io.Serializable;

public class PmsParentalSituation implements Serializable {
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
    private String name;

    /**
    *
     *
     * @mbggenerated
    */
    private String relationship;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
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
        sb.append(", name=").append(name);
        sb.append(", relationship=").append(relationship);
        sb.append(", age=").append(age);
        sb.append(", employer=").append(employer);
        sb.append(", phone=").append(phone);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}