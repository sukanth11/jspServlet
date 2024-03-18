<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="register">
	Enter name<input type="text" name="empolyeeName"><br>
	Enter city<input type="text" name="city"><br>
	Enter salary<input type="number" name="salary"><br>
	Enter mobile<input type="tel" name="mobile"><br>
	Select Course
        <select name="course" >
            <option value="java">java</option>
            <option value="python">Python</option>
            <option value="spring">spring</option>
            <option value="css">c++</option>
        </select>
    Select hobbies
        <input type="checkbox" name="hobby" value="singing">singing
        <input type="checkbox" name="hobby" value="sports">sports
        <input type="checkbox" name="hobby" value="reading">reading
        <input type="checkbox" name="hobby" value="travaling">traveling
        <br>
	<input type="submit" value="submit">
	
	</form>
</body>
</html>