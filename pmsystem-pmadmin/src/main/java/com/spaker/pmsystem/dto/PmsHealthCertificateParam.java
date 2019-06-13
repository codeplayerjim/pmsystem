package com.spaker.pmsystem.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.spaker.pmsystem.vaildator.FlagValidator;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * 健康证参数
 * Created by sunshine on 2019/5/13.
 */
@Getter
@Setter
public class PmsHealthCertificateParam {
    @ApiModelProperty(value = "办理时间" ,required = true)
    @JsonFormat(pattern = "yyyy-MM--dd HH:mm:ss")
    private Date servTime;
    @ApiModelProperty(value = "到期时间" ,required = true)
    @JsonFormat(pattern = "yyyy-MM--dd HH:mm:ss")
    private Date expirTime;
    @ApiModelProperty(value = "机构" ,required = true)
    private String institution;
    @ApiModelProperty(value = "是否有原件" ,required = true)
    @FlagValidator({"是","否"})
    private String hasScript;

    public Date getServTime() {
        return servTime;
    }

    public void setServTime(Date servTime) {
        this.servTime = servTime;
    }

    public Date getExpirTime() {
        return expirTime;
    }

    public void setExpirTime(Date expirTime) {
        this.expirTime = expirTime;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getHasScript() {
        return hasScript;
    }

    public void setHasScript(String hasScript) {
        this.hasScript = hasScript;
    }
}
