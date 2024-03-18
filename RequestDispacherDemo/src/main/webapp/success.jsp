<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="errorHandler.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>user details</h2>
<%

	String employeeName=(String)request.getAttribute("empolyeeName");
	String city=(String)request.getAttribute("city");
	double salary=(Double)request.getAttribute("salary");
	String course=(String)request.getAttribute("course");
	long mobile=(Long)request.getAttribute("mobile");
	String[] hobbies=(String[])request.getAttribute("hobby");
	
	out.println("empolyeeName:"+employeeName+"<br>");
	out.println("city:"+city+"<br>");
	out.println("salary:"+salary+"<br>");
	out.println("course:"+course+"<br>");
	out.println("mobile:"+mobile+"<br>");
	out.println("hobbies ");
	for(String hobby:hobbies){
		out.println("hobbies:"+hobby.toUpperCase()+"<br>");
	}
	
%>
</body>
</html>