package com.spaker.pmsystem.util;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

/**
 * request工具类
 * Created by sunshine on 2019/3/27.
 */
public class RequestUtil {

    /**
     * 移除request指定参数
     */
    public String removeParam(HttpServletRequest request, String param) {
        String queryString = "";
        Enumeration keys = request.getParameterNames();
        while (keys.hasMoreElements()) {
            String key = (String) keys.nextElement();
            if (key.equals(param)) {
                continue;
            }
            if ("".equals(queryString)) {
                queryString = key + "=" + request.getParameter(key);
            } else {
                queryString += "&" + key + "=" + request.getParameter(key);
            }

        }
        return queryString;

    }

    /**
     * 获取请求basePath
     */
    public static  String getBasePath(HttpServletRequest request){
        StringBuffer basePath=new StringBuffer();
        String scheme=request.getScheme();
        String domain=request.getServerName();
        int port=request.getServerPort();
        basePath.append(scheme);
        basePath.append("://");
        basePath.append(domain);
        if ("http".equalsIgnoreCase(scheme)&&80!=port){
            basePath.append(":").append(String.valueOf(port));
        }else if("https".equalsIgnoreCase(scheme)&&port!=443){
            basePath.append(":").append(String.valueOf(port));
        }
        return basePath.toString();
    }

    /**
     * 请求中参数转Map<String,String>
     */
}
