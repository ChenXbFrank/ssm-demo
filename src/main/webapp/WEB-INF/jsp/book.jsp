<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
    <title>Book List</title>
</head>
<body>
<table style="margin-top:5px;">
    <thead>
    <tr>
        <th class="center">库存</th>
        <th class="center">名称</th>
        <th class="center">备注</th>
    </tr>
    </thead>
    <tbody>
    <!-- 开始循环 -->
    <c:forEach items="${books}" var="book" varStatus="vs">
        <tr>
            <td class='center' style="width: 30px;">${book.stock}</td>
            <td class='center'>${book.name}</td>
            <td class='center'>${book.remark}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>


</body>
</html>

