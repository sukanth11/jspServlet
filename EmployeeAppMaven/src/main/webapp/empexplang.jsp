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

<!-- ---Expression language--- -->
Welcome ${employee.employeeName}<br>
City ${employee.city}<br>
Salary ${employee.salary}<br>
EmployeeId ${employee.employee}<br>

 ${message }<br>
 ${message1 }<br>
 ${sessionScope.message1 }<br>

</body>
</html>