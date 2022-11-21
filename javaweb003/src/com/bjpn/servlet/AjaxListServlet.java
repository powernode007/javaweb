package com.bjpn.servlet;

import com.alibaba.fastjson.JSON;
import com.bjpn.bean.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/ajaxList.action")
public class AjaxListServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        User user = new User(1001,"大郎","男");
        User user1 = new User(1002,"西门","男");
        User user2 = new User(1003,"金莲","女");
        List<User> userList = new ArrayList<>();
        userList.add(user);
        userList.add(user1);
        userList.add(user2);
        String jsonStr = JSON.toJSONString(userList);
        System.out.println("json串："+jsonStr);
       List<User> users =  JSON.parseArray(jsonStr, User.class);
        System.out.println("转换回来的集合："+users);
        response.getWriter().write(jsonStr);
    }
}
