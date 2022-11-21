<%--
  Created by IntelliJ IDEA.
  User: NING MEI
  Date: 2022/10/24
  Time: 16:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>上传成功</h1>
    <img src="${pageContext.request.contextPath}/fileupload/${fileName}" width="50" height="50">
<a href="${pageContext.request.contextPath}/uploadDemo.jsp">继续上传</a>
</body>
</html>
