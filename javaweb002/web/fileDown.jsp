<%--
  Created by IntelliJ IDEA.
  User: NING MEI
  Date: 2022/10/25
  Time: 9:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <li><img src="${pageContext.request.contextPath}/fileupload/1.jpg" width="100"height="100">
        <a href="${pageContext.request.contextPath}/downLoad.action?fileName=1.jpg">下载</a></li>
    <li><img src="${pageContext.request.contextPath}/fileupload/1666660514930.jpg" width="100"height="100">
        <a href="${pageContext.request.contextPath}/downLoad.action?fileName=1666660514930.jpg">下载</a></li>
    <li><img src="${pageContext.request.contextPath}/fileupload/1666660514940.jpg" width="100"height="100">
        <a href="${pageContext.request.contextPath}/downLoad.action?fileName=1666660514940.jpg">下载</a></li>
</body>
</html>
