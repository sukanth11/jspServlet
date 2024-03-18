<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.moviapp.controllers.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
out.println("SessionId "+session.getId()+"<br>");
out.println("maxInactive "+session.getMaxInactiveInterval()+"<br>");
String username=(String)session.getAttribute("username");
session.setMaxInactiveInterval(1);
out.println("welcome "+username+"<br>");
%>
<form action="movieServlet">
select language
<select name="language">
<option value="kannada">kannada</option>
<option value="english">english</option>
<option value="hindi">hindi</option>
<option value="telugu">telugu</option>
<input type="submit" value="submit">
</select>
</form>
</body>
</html>