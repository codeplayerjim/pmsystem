package com.spaker.pmsystem.service.Impl;

import com.spaker.pmsystem.dto.OssCallBackResult;
import com.spaker.pmsystem.dto.OssPolicyResult;
import com.spaker.pmsystem.service.OssService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

/**
 * oss上传管理service实现类
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

    @Override
    public OssPolicyResult policy() {
        return null;
    }

    @Override
    public OssCallBackResult callback(HttpServletRequest request) {
        return null;
    }
}
