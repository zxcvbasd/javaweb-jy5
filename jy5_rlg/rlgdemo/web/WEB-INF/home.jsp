<%--
  Created by IntelliJ IDEA.
  User: 赵晨亮
  Date: 2019/8/6
  Time: 11:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.itdr.pojo.Users" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>主页</title>
</head>
<body>
<div>
    欢迎${user.uname}
</div>
<ul>
    <li>
        <span class="sp">AJKX</span>
    </li>
    <li>
        <a href="/manage/user/list.do">用户列表</a>
    </li>
    <li>
        <a href="/manage/product/list.do">商品列表</a>
    </li>
    <li>
        <a href="/manage/order/list.do">订单列表</a>
    </li>
    <li>
        <a href="/manage/category/list.do">分类列表</a>
    </li>
    <li>
        <a href="/manage/supervise/list.do">管理列表</a>
    </li>
</ul>
<div id="dd">

</div>
</body>
<script src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
<script>
    $(".sp").click(
        function () {
            $.post(
                "/manage/user/list.do",
                function (data) {
                    $("#dd").html(data);
                    // alert(dt.data[0].pname);
                }
            );
        }
    );
</script>
</html>
