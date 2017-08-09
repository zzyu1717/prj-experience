<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>欢迎注册丁营商城</title>
</head>
<body>
     <form action="<%=request.getContextPath() %>/login/loginServlet" method="post">
        <table>
            <tr>
                <th>用户名：</th>
                <td><input type="text" name="usernme"/></td>
            </tr>
            <tr>
                <th>密码：</th>
                <td><input type="password" name="userPassword"/></td>
            </tr>
            <tr>
                <th>密码确认：</th>
                <td><input type="password" name="checkUserPassword"/></td>
            </tr>
            <tr>
                <th>邮箱：</th>
                <td><input type="text" name="email"/></td>
            </tr>
            <tr>
                <th>手机：</th>
                <td><input type="text" name="phoneNumber"/></td>
            </tr>
            <tr>
                <%-- 使用status指明做什么操作 --%> 
                <td><input type="hidden" name="status" value="userRegister"/></td>
                <td><input type="submit" value="提交"/></td>
                <td><input type="reset" value="重置"/></td>
            </tr>
        </table>
     </form>
</body>
</html>