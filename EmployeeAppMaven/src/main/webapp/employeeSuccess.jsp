<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.voya.employee.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
Employee employee=(Employee)request.getAttribute("employee");

String employeeName=employee.getEmployeeName();
out.println("employeeName: "+employeeName+"<br>");
Integer employeeId=employee.getEmployee();
out.println("employeeId: "+employeeId+"<br>");
Double salary=employee.getSalary();
out.println("salary: "+salary+"<br>");
String city=employee.getCity();
out.println("city: "+city+"<br>");
%>
</body>
</html>