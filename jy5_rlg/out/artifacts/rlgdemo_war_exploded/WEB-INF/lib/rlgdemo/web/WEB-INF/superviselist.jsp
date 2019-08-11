<%--
  Created by IntelliJ IDEA.
  User: 赵晨亮
  Date: 2019/8/10
  Time: 12:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>管理列表</title>
</head>
<body>

<table>
    <tr>
        <th>管理员ID</th>
        <th>管理员名称</th>
        <th>管理员状态</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${sli.date}" var="sr">
        <tr>
            <td>${sr.gid}</td>
            <td>${sr.sname}</td>
            <td>${sr.status}</td>
            <td>
                <a href="">编辑</a>
                <a href="">查看</a>
            </td>
        </tr>

    </c:forEach>
</table>

</body>
</html>
