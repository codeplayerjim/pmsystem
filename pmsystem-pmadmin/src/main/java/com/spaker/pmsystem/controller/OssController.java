package com.spaker.pmsystem.controller;

import com.spaker.pmsystem.dto.OssCallBackResult;
import com.spaker.pmsystem.dto.OssPolicyResult;
import com.spaker.pmsystem.service.Impl.OssServiceImpl;
import com.sparker.pmsystem.common.api.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Oss相关操作接口
 * Create By DennisYao
 * 6/14/2019
 */
@Controller
@Api(tags = "OssController",description = "Oss管理")
@RequestMapping("/aliyun/oss")
public class OssController {
    @Autowired
    private OssServiceImpl ossService;

    @ApiOperation(value = "oss上传签名生成")
    @RequestMapping(value = "/policy",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<OssPolicyResult>policy(){
        OssPolicyResult result=ossService.policy();
        return CommonResult.success(result);
    }

    @ApiOperation(value = "oss上传成功回调")
    @RequestMapping(value = "callback",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<OssCallBackResult>callback(HttpServletRequest request){
        OssCallBackResult result=ossService.callback(request);
        return CommonResult.success(result);

    }
}
