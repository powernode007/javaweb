package com.bjpn.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;
import java.util.Collection;
import java.util.UUID;

@WebServlet("/uploadDemo1.action")
@MultipartConfig
public class UploadDemo1Servlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //servlet3.0提供了接收多文件的方式
        //普通参数
        String  userName = request.getParameter("userName");
        Collection<Part> parts = request.getParts();
        System.out.println(parts.size());
        //遍历part容器时  只需要筛选出文件类型  进行上传
        for(Part part :parts){
            String inputName = part.getName();
            String oldFileName = part.getSubmittedFileName();
            long size = part.getSize();
            //System.out.println("key:"+inputName+"--文件名："+oldFileName+"--长度："+size);
            //文件名为""  同时长度为0 这是一个空的文件上传
            if(!"".equals(oldFileName) && size>0 && oldFileName!=null){
                //开始文件上传
                //获取源文件名字的目的是为了得到文件后缀
                String fileTypeName = oldFileName.substring(oldFileName.lastIndexOf("."));
                //生成唯一字符串当做名字  UUID   时间戳
               /* String uuid = UUID.randomUUID().toString().replace("-", "");*/
                long time = System.currentTimeMillis();
                String fileName = time+fileTypeName;
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

            }
        }
        System.out.println("上传成功");

    }
}
