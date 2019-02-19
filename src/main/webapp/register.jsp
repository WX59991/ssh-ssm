<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
注册界面<br>
<form action="/test/main/register" method="post">
    姓名: <input name="user.name" type="text"> <br>
    性别: <input name="user.sex" type="radio" value="1">男    <input name="sex" type="radio" value="0">女
    <input type="submit" value="注册">
</form>
</body>
</html>