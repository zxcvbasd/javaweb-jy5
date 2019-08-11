<%--
  Created by IntelliJ IDEA.
  User: 赵晨亮
  Date: 2019/8/10
  Time: 10:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>分类列表</title>
</head>
<body>

<table>
    <tr>
        <th>分类ID</th>
        <th>分类名称</th>
        <th>分类状态</th>
        <th>父类ID</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${cli.date}" var="cs">
        <tr>
            <td>${cs.categoryid}</td>
            <td>${cs.categoryname}</td>
            <td>${cs.status}</td>
            <td>${cs.parentid}</td>

            <td>
                <a href="">编辑</a>
                <a href="">删除</a>
                <%--<a href="/manage/user/disableuser.do?uid=${cs.id}">禁用</a>--%>
                <%--<a href="/manage/user/remove.do?uid=${cs.id}">启用</a>--%>
            </td>
        </tr>

    </c:forEach>
</table>

</body>
</html>
