
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/js/jquery-1.11.1.js"></script>
    <script>
        $(function(){
            $("#but1").click(function(){
                $.get("${pageContext.request.contextPath}/ajaxDemo2.action",function(aaa){
                    alert(aaa);
                },"text")
            });
            $("#but2").click(function(){
                $.post("${pageContext.request.contextPath}/ajaxUser.action",function(user){
                    alert(user)
                    alert(user.userId+"--"+user.userName+"--"+user.userSex);
                },"json")
            });
            $("#but3").click(function(){
                $.post("${pageContext.request.contextPath}/ajaxList.action",function(userList){
                    alert(userList)
                    $.each(userList,function (i,user) {
                        alert(user.userId+"--"+user.userName+"--"+user.userSex);
                    })
                },"json")
            });
        })
    </script>
</head>
<body>
    <button id="but1">$.get请求</button>
    <button id="but2">接收json串</button>
    <button id="but3">接收json串集合</button>
</body>
</html>
