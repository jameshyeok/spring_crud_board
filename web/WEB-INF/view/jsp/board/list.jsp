<%--
  Created by IntelliJ IDEA.
  User: jun
  Date: 2018. 10. 18.
  Time: PM 11:22
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
    <thead>
        <th>bno</th>
        <th>title</th>
        <th>content</th>
        <th>writer</th>
        <th>register date</th>
        <th>view count</th>
    </thead>
    <tbody>
        <c:forEach var="board" items="${boardList}">
            <tr>
                <td>${board.bno}</td>
                <td>${board.title}</td>
                <td>${board.content}</td>
                <td>${board.writer}</td>
                <td>${board.reg_dt}</td>
                <td>${board.view_cnt}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>
<script>
    console.log('${result}');
</script>
</body>
</html>
