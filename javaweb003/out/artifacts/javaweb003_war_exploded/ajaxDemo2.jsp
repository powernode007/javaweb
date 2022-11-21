
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%--jQuery对ajax的封装
        $.ajax(
            {"参数":值,"参数":值,"参数":值,...,"参数":值}
            type：请求方式 默认是get
            url:请求路径
            async:是否发起异步请求  默认是true  发起异步请求  false就是同步请求
            cache:是否缓存该页面  默认是true缓存  false就是不缓存页面
            data:是请求携带的参数
            dataType：默认是text  预期服务器的返回值类型  text  html  css js  xml  json  jsonp
            success:成功时的回执
            这些参数没有必要的都可以不写
        )
    --%>
    <script src="${pageContext.request.contextPath}/js/jquery-1.11.1.js"></script>
    <script>
        $(function(){
            $("#but1").click(function(){
                //发起异步请求
                $.ajax(
                    {
                        type:"get",
                        url:"${pageContext.request.contextPath}/ajaxDemo1.action",
                        async:true,
                        cache:false,
                        data:"",
                        dataType:"text",
                        success:function(aaa){
                            alert(aaa)
                        }
                    }
                );
            });
        })
    </script>
</head>
<body>
    <button id="but1">$.ajax发起异步请求</button>
</body>
</html>
