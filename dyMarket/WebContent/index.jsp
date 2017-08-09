<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>

<% String path = request.getContextPath(); %>
</head>
<body>
<% 
        boolean loginFlag = false;
         String status = (String)session.getAttribute("loginStatus");
         String userName = (String)session.getAttribute("userName");
         if ("loginSuccess".equals(status)) {
        	 loginFlag = true;
         }
%>
    <a href="<%= path%>/jsp/user_login.jsp">登录</a>
    <a href="<%= path%>/jsp/user_register.jsp">注册</a>
    <div><%=loginFlag?("欢迎"+userName+"登录！") : "" %></div>
</body>
</html>