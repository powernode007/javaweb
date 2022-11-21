package com.bjpn.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ajaxLogin.action")
public class AjaxLoginServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String userCode = request.getParameter("userCode");
        String userPwd = request.getParameter("userPwd");
        if(userCode.equals("888123") && userPwd.equals("123")){
            response.getWriter().write("ok");
        }else{
            response.getWriter().write("账号或密码错误");
        }
    }
}
