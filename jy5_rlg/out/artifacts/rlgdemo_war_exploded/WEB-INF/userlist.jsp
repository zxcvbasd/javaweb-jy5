<%--
  Created by IntelliJ IDEA.
  User: 赵晨亮
  Date: 2019/8/6
  Time: 20:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>用户列表</title>
</head>
<body>
<%--${uli}--%>
<table>
    <tr>
        <th>ID</th>
        <th>用户名</th>
        <th>密码</th>
        <th>电话</th>
        <th>权限</th>
        <th>状态</th>
        <th>超级管理员</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${uli.date}" var="us">
        <tr>
            <td>${us.id}</td>
            <td>${us.uname}</td>
            <td>${us.psd}</td>
            <td>${us.tel}</td>
            <td>${us.type}</td>
            <td>${us.stats}</td>
            <td>${us.supers}</td>
            <td>
                <a href="">编辑</a>
                <a href="">删除</a>
                <a href="/manage/user/disableuser.do?uid=${us.id}">禁用</a>
                <a href="/manage/user/remove.do?uid=${us.id}">启用</a>
            </td>
        </tr>

    </c:forEach>
</table>

</body>
</html>
