<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="errorHandler.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to JSP</h1>
<% 
	String name="sukanth";
	out.println("welcome "+name);
%><br>
<% int x=10,y=20; %>
<% out.println("sum "+(x+y)); %><br>

<% int a=10,b=20; %>
<%="product "+(a*b) %><br>

<% int counter=1; %>
<%=counter++ %>

<%! int counter=0; %>
you are visitor no: <%= ++counter %>
<%! String greet(){
	return "welcome back";
	}%>

<%=greet() %>

<% int z=10/0; %>
</body>
</html>