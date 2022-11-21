
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/js/jquery-1.11.1.js"></script>
    <script>
        $(function(){
            $("#loginSubmitBut").click(function(){
                var  userCode = $("#loginCode").val();
                var userPwd =$("#loginPwd").val();
                var data = {"userCode":userCode,"userPwd":userPwd}
                $.post("${pageContext.request.contextPath}/ajaxLogin.action",data,function(message){
                    alert(message)
                },"text")
            });
        })
    </script>
</head>
<body>
    <center>
        账号：<input type="text" id="loginCode"><br/>
        密码：<input type="password" id="loginPwd"><br/>
        <button id="loginSubmitBut">登录</button>
    </center>
</body>
</html>
