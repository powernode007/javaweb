<%--
  Created by IntelliJ IDEA.
  User: NING MEI
  Date: 2022/10/24
  Time: 10:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath =request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+"/"+request.getContextPath()+"/";
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%--http://localhost:8080/javaweb001/main/user/user.jsp--%>
    <h1>这是main/user/user.jsp</h1>
    <h1>当前根路径：<%=basePath%></h1>
    <a href="<%=basePath%>index.jsp">访问index.jsp</a>
    <h1>el获取的根：${pageContext.request.contextPath}</h1>
    <a href="${pageContext.request.contextPath}/main/main.jsp">访问main.jsp</a>
    <a href="${pageContext.request.contextPath}/aaa/bbb/firstDemo.action">访问First处理器</a>
</body>
</html>
