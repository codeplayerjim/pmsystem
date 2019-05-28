package com.spaker.pmsystem.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;

import java.util.Date;

/**
 * 退休人员参数
 * Created by sunshine on 2019/4/8.
 */
@Getter
@Setter
public class PmsRetireEmployeeParam {

    @ApiModelProperty(value = "性别" ,required = true)
    @NotEmpty(message = "性别不能为空")
    private String sex;

    @ApiModelProperty(value = "姓名" ,required = true)
    @NotEmpty(message = "姓名不能为空")
    private String name;

    @ApiModelProperty(value = "国籍" ,required = true)
    @NotEmpty(message = "国籍不能为空")
    private String national;

    @ApiModelProperty(value = "出生地" ,required = true)
    @NotEmpty(message = "出生地不能为空")
    private String birthplace;

    @ApiModelProperty(value = "生日日期" ,required = true)
    @NotEmpty(message = "生日日期不能为空")
    @JsonFormat(pattern = "yyyy-MM--dd HH:mm")
    private Date birthday;

    @ApiModelProperty(value = "身份证号码" ,required = true)
    @NotEmpty(message = "身份证号码不能为空")
    private String number;

    @ApiModelProperty(value = "现居地址" ,required = true)
    @NotEmpty(message = "现居地址不能为空")
    private String address;

    @ApiModelProperty(value = "紧急联系人号码" ,required = true)
    @NotEmpty(message = "号码不能为空")
    private String phone;

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
}
