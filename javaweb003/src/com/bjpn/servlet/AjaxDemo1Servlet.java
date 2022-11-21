package com.bjpn.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ajaxDemo1.action")
public class AjaxDemo1Servlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("我是第一个异步处理器  我接收异步请求");
        //服务器要进行请求处理
        //服务器要把处理后的结果交给异步请求对象
        //要想不进行跳转还要给浏览器传递数据 只能使用流
        PrintWriter out = response.getWriter();
        out.write("你好  ajax");
    }
}
