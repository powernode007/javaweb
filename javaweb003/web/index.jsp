
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <script>
      function sendAjaxDemo(){
        //获取异步请求
        var xmlHttpRequest = new XMLHttpRequest();
        //发起异步请求
        xmlHttpRequest.open("get","${pageContext.request.contextPath}/ajaxDemo1.action",true);
        xmlHttpRequest.send();
        //通过方法  判断不同的响应码和状态码
        //响应码为4  状态码为200 才能顺利接收到回执
        //等待服务器处理并回执
        xmlHttpRequest.onreadystatechange = function(){
           alert("响应码："+xmlHttpRequest.readyState)
          if(xmlHttpRequest.readyState==4){
            //服务器处理完毕且响应已完成
            if(xmlHttpRequest.status==200){
              //浏览器已经正常的接收到了回执
              var text = xmlHttpRequest.responseText;
              alert("接收到的回执："+text);
            }
          }
        }

      }
    </script>
  </head>
  <body>
    <button onclick="sendAjaxDemo();">发起异步请求</button>
    <button onclick="sendAjaxDemo1();">发起异步请求1</button>
  </body>
</html>
