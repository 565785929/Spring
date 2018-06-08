<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>用户信息修改</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/editUser" method="post">

    <table width="30%" border=1>
        <tr><td colspan="2">修改用户信息</td></tr>
        <tr>
            <td>id</td>
            <td><input name="id" readonly value="<c:out value='${user.id}' />" type="text"></td>
        </tr>
        <tr>
            <td>用户名</td>
            <td><input name="name" value="<c:out value='${user.name}' />" type="text" /></td>
        </tr>
        <tr>
            <td>性别</td>
            <td><input name="sex" value="<c:out value='${user.sex}' />" type="text" /></td>
        </tr>
        <tr>
            <td>邮箱</td>
            <td><input name="email" value="<c:out value='${user.email}' />" type="text"/></td>
        </tr>
    </table>
    <input type="submit" value="修改"/>
</form>
</body>
</html>