<%--
  Created by IntelliJ IDEA.
  User: jun
  Date: 2018. 10. 18.
  Time: PM 11:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <th>bno</th>
        <td>${board.bno}</td>
    </tr>
    <tr>
        <th>Writer</th>
        <td>${board.writer}</td>
    </tr>
    <tr>
        <th>Register date</th>
        <td>${board.reg_dt}</td>
    </tr>
    <tr>
        <th>Title</th>
        <td>${board.title}</td>
    </tr>
    <tr>
        <th>content</th>
        <td>${board.content}</td>
    </tr>
</table>
</body>
</html>
