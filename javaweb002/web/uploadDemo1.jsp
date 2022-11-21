
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <form action="${pageContext.request.contextPath}/uploadDemo1.action" method="post" enctype="multipart/form-data">
        姓名：<input type="text" name="userName" value=""><br/>
        文件：<input type="file" name="upImg" value=""><br/>
        文件：<input type="file" name="upImg1" value=""><br/>
        文件：<input type="file" name="upImg2" value=""><br/>
        <input type="submit" value="提交">
    </form>
</center>
</body>
</html>
