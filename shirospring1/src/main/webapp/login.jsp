<%--
  Created by IntelliJ IDEA.
  User: OldHe
  Date: 2019/9/23
  Time: 17:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <form action="${PageContext.request.contextPath}/user/login.action" method="post">
        userName:<input type="text" name="userName" value="${user.userName}"/><br>
        Password:<input type="password" name="password" value="${user.password}"/><br>
        <input type="submit"  value="登录"/><font color="red">${errorInfo}</font>
    </form>
</head>
<body>

</body>
</html>
