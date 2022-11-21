package com.bjpn.listener;

import javax.servlet.*;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
@WebListener
public class AllListener implements ServletContextListener, ServletContextAttributeListener, HttpSessionListener, HttpSessionAttributeListener, ServletRequestListener, ServletRequestAttributeListener {
    @Override
    public void attributeAdded(ServletContextAttributeEvent scae) {

    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent scae) {

    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent scae) {

    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("我监听到额全局作用域出生了");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }

    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {

    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {

    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {

    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {

    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {

    }

    @Override
    public void attributeAdded(HttpSessionBindingEvent se) {

    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent se) {

    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent se) {

    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("我是监听器  我看到session被创建了");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {

    }
}
