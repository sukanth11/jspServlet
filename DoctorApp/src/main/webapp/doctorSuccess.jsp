<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.doctorapp.model.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	DoctorApp doctorApp=(DoctorApp) request.getAttribute("doctorApp");
	
	String name=doctorApp.getDoctorName();
	out.println("Doctor name: "+name+"<br>");
	Integer doctorId=doctorApp.getDoctorId();
	out.println("Doctor Id: "+doctorId+"<br>");
	String speciality=doctorApp.getSpeciality();
	out.println("Doctor speciality: "+speciality+"<br>");
	Double fees=doctorApp.getFees();
	out.println("Doctor fees: "+fees+"<br>");
	Integer rating=doctorApp.getRating();
	out.println("Doctor rating: "+rating+"<br>");
	Integer experince=doctorApp.getExperince();
	out.println("Doctor experince: "+experince+"<br>");
	
	
	
%>
</body>
</html>