package com.bjpn.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

@WebServlet("/uploadDemo.action")
@MultipartConfig//开启Multipart设置  当前servlet就可以识别Multipart这种结构
public class UploadDemoServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       //我们现在使用的servlet3.0以后的封装版文件上传
        String userName = request.getParameter("userName");
        System.out.println("普通参数："+userName);
        Part part = request.getPart("upImg");
        String inputName = part.getName();
        System.out.println("输入框的key："+inputName);
        String oldFileName = part.getSubmittedFileName();
        System.out.println("源文件的名字："+oldFileName);
        //获取源文件名字的目的是为了得到文件后缀
        String fileTypeName = oldFileName.substring(oldFileName.lastIndexOf("."));
        //生成唯一字符串当做名字  UUID   时间戳
        String uuid = UUID.randomUUID().toString().replace("-", "");
        String fileName = uuid+fileTypeName;
        System.out.println("文件的新名字："+fileName);

       /* //借助IO流  复制到指定的位置
        InputStream in = part.getInputStream();
        //创建输出流 写出数据  即为复制
        FileOutputStream out = new FileOutputStream("D:/test.jpg");*/
       //part对象提供的文件复制的封装
        //动态获取web下指定文件的真实路径
        String path = request.getServletContext().getRealPath("/fileupload");
        System.out.println("文件上传的真实路径："+path);
        part.write(path+"/"+fileName);
        System.out.println("上传成功");
        request.setAttribute("fileName", fileName);
        request.getRequestDispatcher("success.jsp").forward(request, response);
    }
}
