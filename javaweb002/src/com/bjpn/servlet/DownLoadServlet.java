package com.bjpn.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;

@WebServlet("/downLoad.action")
public class DownLoadServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //接收文件名
        String fileName = request.getParameter("fileName");
        //获取文件保存的位置
        String path = request.getServletContext().getRealPath("/fileupload");
        File f = new File(path+"/"+fileName);//文件
        //判断这个文件是否存在
        if(f.exists()){
            //文件下载  就是使用IO流  一遍读 一遍写
            FileInputStream in = new FileInputStream(f);
            //读f  写给浏览器  response
            OutputStream out = response.getOutputStream();//服务器和浏览器之间的字节输出流
            //我们要使用浏览器的下载器  让浏览器去承接我们传递字节
            response.setHeader("content-disposition",
                    "attachment;filename=" +fileName);
            //一遍读 一遍写
            byte[] bytes = new  byte[1024];
            int len = 0;
            while((len=in.read(bytes))!=-1){
                out.write(bytes, 0, len);
            }
            in.close();
            out.close();
        }

    }
}
