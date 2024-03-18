<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
pageContext.setAttribute("message", "welcome");
request.setAttribute("message", "good day in request");
session.setAttribute("message", "great day in session");
application.setAttribute("message", "nice day in application");
%>

<h2>using Scripting</h2>
<%
String message1=(String)request.getAttribute("message");
String message2=(String)session.getAttribute("message");
String message3=(String)application.getAttribute("message");
%>

<%=message1 %>
<%=message2 %>
<%=message3 %>

<h2>using EL</h2>
${message }
${requestScope.message }
${sessionScope.message }
${applicationScope.message }
</body>
</html>