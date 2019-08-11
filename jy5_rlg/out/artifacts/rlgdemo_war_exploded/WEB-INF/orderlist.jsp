<%--
  Created by IntelliJ IDEA.
  User: 赵晨亮
  Date: 2019/8/8
  Time: 18:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>订单列表</title>
</head>
<body>
<table>
    <tr>
        <th>订单编号</th>
        <th>支付金额</th>
        <th>支付编号</th>
        <th>支付方式</th>
        <th>邮费</th>
        <th>状态编号</th>
        <th>订单状态</th>
        <th>付款时间</th>
        <th>订购内容</th>
        <th>图片链接</th>
        <th>发货单号</th>
        <th>是否发货</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${oli.date}" var="od">
        <tr>
            <td>${od.orderno}</td>
            <td>${od.payment}</td>
            <td>${od.paymenttype}</td>
            <td>${od.paymenttypedesc}</td>
            <td>${od.postage}</td>
            <td>${od.status}</td>
            <td>${od.statusdesc}</td>
            <td>${od.paymenttime}</td>
            <td>${od.orderitemvolist}</td>
            <td>${od.imagehost}</td>
            <td>${od.shippingid}</td>
            <td>${od.shippingvo}</td>
            <td>
                <a href="">编辑</a>
                <a href="">删除订单</a>
                <a href="">查看订单</a>
            </td>
        </tr>

    </c:forEach>
</table>
</body>
</html>
