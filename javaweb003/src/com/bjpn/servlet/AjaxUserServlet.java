package com.bjpn.servlet;

import com.alibaba.fastjson.JSON;
import com.bjpn.bean.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ajaxUser.action")
public class AjaxUserServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = new User(1001,"大郎","男");
        String jsonStr = JSON.toJSONString(user);
        System.out.println("这是转换后的json串："+jsonStr);
        //根据类的类型  把json串再转换成java对象
        User user1 = JSON.parseObject(jsonStr, User.class);
        System.out.println("反序列化："+user1);
        response.getWriter().write(jsonStr);
    }
}
