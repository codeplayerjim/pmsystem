package com.spaker.pmsystem.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;


import java.util.Date;

/**
 * 在职员工传递参数
 * Created by sunshine on 2019/3/24.
 */
@Getter
@Setter
public class PmsEmployeeParam {
    @ApiModelProperty(value = "姓名" ,required = true)
    @NotEmpty(message = "姓名不能为空")
    private String name;
    @ApiModelProperty(value = "性别",required = true)
    @NotEmpty(message = "性别不能为空")
    private String sex;

    @ApiModelProperty(value = "国籍",required = true)
    @NotEmpty(message = "国籍不能为空")
    private String nation;

    @ApiModelProperty(value = "出生地",required = true)
    @NotEmpty(message = "出生地不能为空")
    private String birthpalce;

    @ApiModelProperty(value = "婚否",required = true)
    @NotEmpty(message = "婚否不能为空")
    private String isMarry;

    @ApiModelProperty(value = "所在食堂",required = true)
    @NotEmpty(message = "所在食堂不能为空")
    private String canteen;

    @ApiModelProperty(value = "部门")
    @NotEmpty(message = "部门不能为空")
    private String department;


    @ApiModelProperty(value = "所在食堂",required = true)
    @NotEmpty(message = "所在食堂不能为空")
    private String authrStren;

    @ApiModelProperty(value = "图片")
    @NotEmpty(message = "图片为红底")
    private String photo;

    @ApiModelProperty(value = "职务")
    private String position;

    @ApiModelProperty(value = "最高学历")
    private String highestEducation;

    @ApiModelProperty(value = "毕业学校")
    private String graduatedSchool;

    @ApiModelProperty(value = "电子邮箱")
    private String email;

    @ApiModelProperty(value = "政治状态")
    private String politicalStatus;

    @ApiModelProperty(value = "户口状态")
    private String houseRegisterType;

    @ApiModelProperty(value = "身份证")
     private String idCard;;

    @ApiModelProperty(value = "工号")
    private String jobNumber;

    @ApiModelProperty(value = "出生日期")
    private Date dateOfBirth;

    @ApiModelProperty(value = "现居地")
    private String residence;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getBirthpalce() {
        return birthpalce;
    }

    public void setBirthpalce(String birthpalce) {
        this.birthpalce = birthpalce;
    }

    public String getIsMarry() {
        return isMarry;
    }

    public void setIsMarry(String isMarry) {
        this.isMarry = isMarry;
    }

    public String getCanteen() {
        return canteen;
    }

    public void setCanteen(String canteen) {
        this.canteen = canteen;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAuthrStren() {
        return authrStren;
    }

    public void setAuthrStren(String authrStren) {
        this.authrStren = authrStren;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getHighestEducation() {
        return highestEducation;
    }

    public void setHighestEducation(String highestEducation) {
        this.highestEducation = highestEducation;
    }

    public String getGraduatedSchool() {
        return graduatedSchool;
    }

    public void setGraduatedSchool(String graduatedSchool) {
        this.graduatedSchool = graduatedSchool;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPoliticalStatus() {
        return politicalStatus;
    }

    public void setPoliticalStatus(String politicalStatus) {
        this.politicalStatus = politicalStatus;
    }

    public String getHouseRegisterType() {
        return houseRegisterType;
    }

    public void setHouseRegisterType(String houseRegisterType) {
        this.houseRegisterType = houseRegisterType;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }
}
