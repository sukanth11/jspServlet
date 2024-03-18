<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.voya.employee.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Employee Details</h2>
<% 
Employee employee=(Employee)request.getAttribute("employee"); %>
<%="employeeName "+employee.getEmployeeName()%><br>
<%="employeeId "+employee.getEmployee()%><br>
<%="employee city "+employee.getCity()%><br>
<%="employee salary "+employee.getSalary()%><br>



</body>
</html>