<%--
  Created by IntelliJ IDEA.
  User: 赵晨亮
  Date: 2019/8/6
  Time: 11:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="css/base.css">
    <link rel="stylesheet" href="css/login.css">
</head>
<body>
<div id="wk">
    <div id="continue">
        <form action="/manage/user/login.do" method="post" id="con-form">
            <input type="text" name="username" placeholder="输入账户" class="cf-cf">
            <input type="password" name="password" placeholder="输入密码" class="cf-cf">
            <input type="submit" value="登录" id="cf-s">
        </form>
    </div>
</div>
</body>
</html>
