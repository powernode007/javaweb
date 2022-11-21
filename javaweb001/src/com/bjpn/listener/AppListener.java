package com.bjpn.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.HashMap;
import java.util.Map;

public class AppListener implements ServletContextListener {
    //事件源
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("我是监听器  我看到全局作用域出生了");
        ServletContext app = sce.getServletContext();
        System.out.println("我是监听器，此时出生的全局作用域是："+app);
        Map<String,Integer> map = new HashMap<>();
        app.setAttribute("map",map);

    }
    //事件源
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("我是监听器  我看到全局作用域死亡了  ----");
        ServletContext app = sce.getServletContext();
        System.out.println("我是监听器，此时死亡的全局作用域是："+app);
    }
}
