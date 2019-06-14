package com.spaker.pmsystem.service.Impl;

import cn.hutool.json.JSONUtil;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.common.utils.BinaryUtil;
import com.aliyun.oss.model.MatchMode;
import com.aliyun.oss.model.PolicyConditions;
import com.spaker.pmsystem.dto.OssCallBackResult;
import com.spaker.pmsystem.dto.OssCallbackParam;
import com.spaker.pmsystem.dto.OssPolicyResult;
import com.spaker.pmsystem.service.OssService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * oss上传管理service实现类
 * 服务器直传:
 * https://help.aliyun.com/document_detail/91868.html?spm=a2c4g.11186623.2.15.16076e28aeU0Fh#concept-ahk-rfz-2fb
 * Create By DennisYao
 * 6/13/2019
 */
@Service
public class OssServiceImpl implements OssService {

    private static final Logger LOGGER=LoggerFactory.getLogger(OssServiceImpl.class);
    @Value("${aliyun.oss.policy.expire}")
    private int ALIYUN_OSS_EXPIRE;
    @Value("${aliyun.oss.maxSize}")
    private int ALIYUN_OSS_MAX_SIZE;
    @Value("${aliyun.oss.callback}")
    private String ALIYUN_OSS_CALLBACK;
    @Value("${aliyun.oss.bucketName}")
    private String ALIYUN_OSS_BUCKET_NAME;
    @Value("${aliyun.oss.endpoint}")
    private String ALIYUN_OSS_ENDPOINT;
    @Value("${aliyun.oss.dir.prefix}")
    private String ALIYUN_OSS_DIR_PREFIX;

    @Autowired
    private OSSClient ossClient;

    @Override
    public OssPolicyResult policy() {
        OssPolicyResult result=new OssPolicyResult();
        //存储目录
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyyMMdd");
        String dir=ALIYUN_OSS_DIR_PREFIX+simpleDateFormat.format(new Date());
        //签名有效期
        long expireEndTime=System.currentTimeMillis()+ALIYUN_OSS_EXPIRE*1000;
        Date expiration=new Date(expireEndTime);
        //文件大小
        long maxSize=ALIYUN_OSS_MAX_SIZE*1024*1024;
        //回调
        OssCallbackParam callbackParam=new OssCallbackParam();
        callbackParam.setCallbackUrl(ALIYUN_OSS_CALLBACK);
        callbackParam.setCallbackBody("filename=${object}&size=${size}&mimeType=${mimeType}&height=${imageInfo.height}&width=${imageInfo.width}");
        callbackParam.setCallbackBodyType("application/x-www-form-urlencoded");
        //提交节点
        String action="http://"+ALIYUN_OSS_BUCKET_NAME+"."+ALIYUN_OSS_ENDPOINT;
        try {
            PolicyConditions policyConditions=new PolicyConditions();
            policyConditions.addConditionItem(policyConditions.COND_CONTENT_LENGTH_RANGE,0,maxSize);
            policyConditions.addConditionItem(MatchMode.StartWith,PolicyConditions.COND_KEY,dir);
            String postPolicy=ossClient.generatePostPolicy(expiration,policyConditions);
            byte[] binaryData=postPolicy.getBytes("utf-8");
            String policy= BinaryUtil.toBase64String(binaryData);
            String signature=ossClient.calculatePostSignature(postPolicy);
            String callbackData=BinaryUtil.toBase64String(JSONUtil.parse(callbackParam).toString().getBytes("utf-8"));
            //返回结果
            result.setAccessKeyId(ossClient.getCredentialsProvider().getCredentials().getAccessKeyId());
            result.setPolicy(policy);
            result.setSignature(signature);
            result.setDir(dir);
            result.setCallback(callbackData);
            result.setHost(action);
        } catch (Exception e) {
            LOGGER.error("签名生成失败",e);
        }

        return result;
    }

    @Override
    public OssCallBackResult callback(HttpServletRequest request) {
        OssCallBackResult result=new OssCallBackResult();
        String filename=request.getParameter("filename");
        filename="http://".concat(ALIYUN_OSS_BUCKET_NAME).concat(".").concat(ALIYUN_OSS_ENDPOINT).concat("/").concat(filename);
        result.setFilename(filename);
        result.setSize(request.getParameter("size"));
        result.setHeight(request.getParameter("height"));
        result.setMimeType(request.getParameter("mimeType"));
        result.setWidth(request.getParameter("width"));
        return result;
    }
}
