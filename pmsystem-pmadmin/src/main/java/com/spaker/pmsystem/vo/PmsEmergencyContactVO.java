package com.spaker.pmsystem.vo;

/**
 * Created by sunshine on 2019/4/28.
 */
public class PmsEmergencyContactVO {
    @ExcelVOAttribute(name = "ID",column = "A",isExport = true)
    private Integer id;
    @ExcelVOAttribute(name = "紧急联系人姓名",column = "B",isExport = true,prompt = "姓名必填")
    private String name;
    @ExcelVOAttribute(name = "紧急联系人号码",column = "C",prompt = "号码必填")
    private String phone;

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "PmsEmergencyContactVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
