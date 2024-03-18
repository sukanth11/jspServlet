<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>movies are:</h1>
<%

out.println("SessionId "+session.getId()+"<br>");
out.println("maxInactive "+session.getMaxInactiveInterval()+"<br>");
String username=(String)session.getAttribute("username");
out.println("welcome "+username+"<br>");
List<String> movies=(List<String>)session.getAttribute("movies");
for(String movie:movies)
	out.println(movie+"<br>");
%>
</body>
</html>