package com.bjpn.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
@WebFilter("*.action")
public class EncodFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("这是过滤器");
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        StringBuffer url = request.getRequestURL();
        System.out.println("你的请求时："+url);
        filterChain.doFilter(request, servletResponse);
    }
}
