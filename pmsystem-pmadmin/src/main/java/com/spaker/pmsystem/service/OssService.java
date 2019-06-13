package com.spaker.pmsystem.service;

import com.spaker.pmsystem.dto.OssCallBackResult;
import com.spaker.pmsystem.dto.OssPolicyResult;

import javax.servlet.http.HttpServletRequest;

/**
 * oss上传管理service
 * Create By DennisYao
 * 6/13/2019
 */
public interface OssService {
    /**
     * oss上传策略生成
     *
     */
    OssPolicyResult policy();

    /**
     * oss上传成功回调
     * @param request
     *
     */
    OssCallBackResult callback(HttpServletRequest request);
}
