<%--
  Created by IntelliJ IDEA.
  User: fangzhen
  Date: 2018/6/1
  Time: 14:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta http-equiv="content-type" content="text/html; charset=utf-8" />
    <title>用户列表</title>
</head>
<body>
<table width="800" align="center" border="1" cellpadding="0" cellspacing="0">
    <tr>
        <td height="50">
            <font size="10">xxx平台</font>
        </td>
    </tr>

    <tr>
        <td height="30">
            <input type="button" value="注册" style="width: 80px; cursor: hand;" onclick="btnAdd('/toRegister')">&nbsp;&nbsp;
            <input type="button" value="修改" style="width: 80px; cursor: hand;" onclick="btnEdit('/toEditUser')">&nbsp;&nbsp;
            <input type="button" value="删除" style="width: 80px; cursor: hand;" onclick="btnDelete('/deleteUser')">
        </td>
    </tr>

    <tr>
        <td>
            <form name="frm">
                <table width="100%" border="1" cellspacing="0" cellpadding="0">
                    <tr>
                        <td height="25">选择</td>
                        <td>姓名</td>
                        <td>性别</td>
                        <td>邮箱</td>
                    </tr>
                    <!--使用 jstl 标签渲染数据-->
                    <c:forEach var="user" items="${user_list}">
                        <tr>
                            <td><input name="id" value="<c:out value='${user.id}' />" type="radio" height="25"></td>
                            <td><c:out value='${user.name}' /></td>
                            <td><c:out value='${user.sex}' /></td>
                            <td><c:out value='${user.email}' /></td>
                        </tr>
                    </c:forEach>

                </table>
            </form>
        </td>
    </tr>
</table>

<script language="JavaScript">
    function btnAdd(url) {
        window.location.replace(url);
    }
    function btnEdit(url) {
        document.frm.action=url;
        document.frm.submit();
    }
    function btnDelete(url) {
        document.frm.action=url;
        document.frm.submit();
    }
</script>
</body>
</html>

