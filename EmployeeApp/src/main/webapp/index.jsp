<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="employeeServlet">
	Enter name<input type="text" name="employeeName"><br>
	Enter employeeId<input type="text" name="employeeId"><br>
	Enter salary<input type="number" name="salary"><br>
	Enter city<input type="text" name="city"><br>
	Select Course
        <select name="course" >
            <option value="java">java</option>
            <option value="python">Python</option>
            <option value="spring">spring</option>
            <option value="css">c++</option>
        </select>
        <input type="submit" value="submit">
     </form>
</body>
</html>