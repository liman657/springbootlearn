<%@ page import="com.learn.chapter10.domain.User" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>session测试</title>
</head>
<body>

    <%
        User user = (User) session.getAttribute("user");
        Long id = (Long) session.getAttribute("id_new");
        out.print("<br>user_name="+user.getUsername()+"</br>");
        out.print("<br>id_name="+id+"</br>");
    %>

</body>
</html>