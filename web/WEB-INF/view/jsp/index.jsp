<%--
  Created by IntelliJ IDEA.
  User: jun
  Date: 2018. 10. 17.
  Time: PM 4:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/boards/register" method="post">
        <input type="text" name="title" placeholder="title">
        <input type="text" name="content" placeholder="content">
        <input type="text" name="writer" placeholder="writer">
        <input type="submit" value="submit">
    </form>

<script>
    console.log('${result}');
</script>
</body>
</html>
