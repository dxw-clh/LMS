<%--
  Created by IntelliJ IDEA.
  User: z
  Date: 2021/8/25
  Time: 10:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/login.css"/>
</head>
<body>
<div id="login">
    <h1>Login</h1>
    <h3><span style="color: red">${msg}</span></h3>
    <form method="post" action="${pageContext.request.contextPath}/login">
        <input type="text" required="required" placeholder="用户名" name="username"></input>
        <input type="password" required="required" placeholder="密码" name="password"></input>
        <button class="but" type="submit">登录</button>
    </form>
</div>
</body>
</html>
