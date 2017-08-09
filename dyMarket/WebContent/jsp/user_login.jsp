<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>欢迎登陆丁营商城</title>
</head>
 
<body>

    <%
         boolean nameFlag = false;
         String status = (String)session.getAttribute("loginStatus");
         if ("wrongName".equals(status)) {
        	 nameFlag = true;
         }
         boolean passwordFlag = false;
         String pstatus = (String)session.getAttribute("loginStatus");
         if ("wrongPassword".equals(pstatus)) {
        	 passwordFlag = true;
         }
    %>
    <form action="<%=request.getContextPath() %>/login/loginServlet" method="post">
        <table>
            <tr>
                <th>用户名：</th>
                
                <td><input type="text" name="userName" value="请输入用户名"> <span class="init"><%=nameFlag ?"用户名输入错误！":"" %></span></td>
            </tr>
            <tr>
                <th>密码：</th>
                <td><input type="password" name="loginPassword" value="请输入用户名" ><span class="init"><%=passwordFlag ?"密码输入错误！":"" %></span></td>
            </tr>
            <tr>
               
                <td><input type="hidden" name="status" value="userLogin"></td>
                <td><input type="submit"  value="登陆"></td>
                <td><a href="#">忘记密码</a></td>
            </tr>
        </table>
    </form>
</body>
</html>