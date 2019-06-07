package com.spaker.pmsystem.model;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class PmsParentalSituation implements Serializable {
    private Integer id;

    @ApiModelProperty(value="姓名")
    private String name;

    @ApiModelProperty(value="关系")
    private String relationship;

    @ApiModelProperty(value="年龄")
    private String age;

    @ApiModelProperty(value="工作单位")
    private String workplace;

    @ApiModelProperty(value="联系方式")
    private String contact;

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

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
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
        sb.append(", workplace=").append(workplace);
        sb.append(", contact=").append(contact);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}