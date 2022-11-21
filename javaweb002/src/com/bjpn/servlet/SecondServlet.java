package com.bjpn.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/*<servlet>
<servlet-name>secondDemo</servlet-name>
<servlet-class>com.bjpn.servlet.SecondServlet</servlet-class>
</servlet>
<servlet-mapping>
<servlet-name>secondDemo</servlet-name>
<url-pattern>/secondDemo.action</url-pattern>
</servlet-mapping>*/
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/*
@WebServlet  简化servlet在web.xml文件的配置
    name:该servlet的名字  可以省略不写
    urlPatterns==value：当前servlet的映射路径
    loadOnStartup:默认-1  懒汉式   大于0 饿汉式
    initParams ={
            @WebInitParam(name="AAA",value = "aaa"), @WebInitParam(name="love",value = "爱")
        } )
* */
//@WebServlet(name="secondDemo",urlPatterns = {"/secondDemo.action","/aaa.action"})
//@WebServlet(value={"/secondDemo1.action","/bbb.action"})
//如果只用一个请求  name省略 那么value也可以不写 只能是默认的懒汉式方式
//@WebServlet("/ccc.action")
//如果要设置其他参数  value就不能省略
/*@WebServlet(value="/secondDemo.action",loadOnStartup = 1,
        initParams ={
            @WebInitParam(name="AAA",value = "aaa"), @WebInitParam(name="love",value = "爱")
        } )*/
@WebServlet("/secondDemo.action")
public class SecondServlet extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("secondServlet的init方法");
       Enumeration<String> names =  config.getInitParameterNames();
       while(names.hasMoreElements()){
           String name = names.nextElement();
           String value = config.getInitParameter(name);
           System.out.println("name:"+name+"---value:"+value);
       }
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("这是注解班的servlet  second");
    }
}
