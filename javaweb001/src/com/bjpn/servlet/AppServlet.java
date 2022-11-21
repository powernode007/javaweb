package com.bjpn.servlet;



import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;

public class AppServlet extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        //ServletConfig  处理器配置对象
        Enumeration<String> params = config.getInitParameterNames();
        while(params.hasMoreElements()){
            String name = params.nextElement();
            String value = config.getInitParameter(name);
            System.out.println("初始化参数："+name+"---"+value);
        }
        //获取全局作用域对象   全局作用域是服务器启动时创建的  它比servlet出现的要早
        ServletContext app = config.getServletContext();
        System.out.println("这是config对象获取的全局作用域对象："+app);
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //只要有人访问我  我就立马统计当前ip地址是否存在
        String ip = request.getRemoteAddr();
        //有人发起请求  那么我就获取你的ip  查看当前map中是否有这个ip
        ServletContext app2 = request.getServletContext();
        Map<String,Integer> map = (Map<String,Integer>)app2.getAttribute("map");
        if(map.containsKey(ip)){
            map.put(ip, map.get(ip)+1);
        }else{
            map.put(ip, 1);
        }
        request.setAttribute("count", map.size());
        request.setAttribute("ipNum", map.get(ip));
        request.setAttribute("ip", ip);
        request.getRequestDispatcher("main.jsp").forward(request, response);
    }
}
