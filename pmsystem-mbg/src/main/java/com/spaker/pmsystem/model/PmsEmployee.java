package com.spaker.pmsystem.model;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

public class PmsEmployee implements Serializable {
    private Integer id;

    private String name;

    private String sex;

    @ApiModelProperty(value="民族")
    private String nation;

    @ApiModelProperty(value="籍贯")
    private String birthpalce;

    @ApiModelProperty(value="工号")
    private String jobNumber;

    private Date dateOfBirth;

    private String identificationNumber;

    @ApiModelProperty(value="婚否")
    private String isMarry;

    @ApiModelProperty(value="政治状态")
    private String politicalStatus;

    @ApiModelProperty(value="户口性质")
    private String houseRegisterType;

    @ApiModelProperty(value="所在食堂")
    private String canteen;

    private String department;

    @ApiModelProperty(value="编制")
    private String authrStren;

    @ApiModelProperty(value="照片（红底）")
    private String photo;

    @ApiModelProperty(value="职务")
    private String position;

    @ApiModelProperty(value="最高学历")
    private String highestEducation;

    @ApiModelProperty(value="毕业院校")
    private String graduatedSchool;

    @ApiModelProperty(value="身份证")
    private String idCard;

    private String email;

    @ApiModelProperty(value="户口所在地")
    private String houseRegisterLocation;

    @ApiModelProperty(value="现居地址")
    private String residence;

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

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getIsMarry() {
        return isMarry;
    }

    public void setIsMarry(String isMarry) {
        this.isMarry = isMarry;
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

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHouseRegisterLocation() {
        return houseRegisterLocation;
    }

    public void setHouseRegisterLocation(String houseRegisterLocation) {
        this.houseRegisterLocation = houseRegisterLocation;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", sex=").append(sex);
        sb.append(", nation=").append(nation);
        sb.append(", birthpalce=").append(birthpalce);
        sb.append(", jobNumber=").append(jobNumber);
        sb.append(", dateOfBirth=").append(dateOfBirth);
        sb.append(", identificationNumber=").append(identificationNumber);
        sb.append(", isMarry=").append(isMarry);
        sb.append(", politicalStatus=").append(politicalStatus);
        sb.append(", houseRegisterType=").append(houseRegisterType);
        sb.append(", canteen=").append(canteen);
        sb.append(", department=").append(department);
        sb.append(", authrStren=").append(authrStren);
        sb.append(", photo=").append(photo);
        sb.append(", position=").append(position);
        sb.append(", highestEducation=").append(highestEducation);
        sb.append(", graduatedSchool=").append(graduatedSchool);
        sb.append(", idCard=").append(idCard);
        sb.append(", email=").append(email);
        sb.append(", houseRegisterLocation=").append(houseRegisterLocation);
        sb.append(", residence=").append(residence);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}