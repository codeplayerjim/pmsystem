package com.spaker.pmsystem.componemt;

import com.spaker.pmsystem.util.JsonUtil;
import com.sparker.pmsystem.common.api.CommonResult;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 当访问接口没有权限时，自定义的返回结果
 * Created by sunshine on 2019/3/26.
 */
@Component
public class RestfulAccessDeniedHandler implements AccessDeniedHandler {
    @Override
    public void handle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AccessDeniedException e) throws IOException, ServletException {
        httpServletResponse.setContentType("application/json");
        httpServletResponse.setCharacterEncoding("UTF-8");
        //转换成json输出
        httpServletResponse.getWriter().println(JsonUtil.ObjectToJson(CommonResult.forbidden(e.getMessage())));
        httpServletResponse.getWriter().flush();
    }
}
