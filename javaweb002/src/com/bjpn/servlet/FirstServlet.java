package com.bjpn.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//http://localhost:8080/javaweb002/aaa/bbb/XXX.action
public class FirstServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("访问firstServlet");
        //去main.jsp
        //http://localhost:8080/javaweb002/aaa/bbb/main/main.jsp
        //request.getRequestDispatcher(request.getContextPath()+"/main/main.jsp").forward(request, response);
        response.sendRedirect(request.getContextPath()+"/main/main.jsp");
    }
}
