<%--
  Created by IntelliJ IDEA.
  User: fangzhen
  Date: 2018/6/1
  Time: 14:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>register</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/registerUser" method="post">
        用户信息：<br />
        id：<input type="text" name="id" /><br />
        姓名：<input type="text" name="name" /><br />
        性别：<input type="text" name="sex" /><br />
        邮箱：<input type="text" name="email" /><br />
        <input type="submit" value="注册"/>
    </form>
</body>
</html>
