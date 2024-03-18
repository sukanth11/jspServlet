<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="doctorServlet">
	Enter doctorName<input type="text" name="doctorName"><br>
	Enter doctorId<input type="text" name="doctorId"><br>
	Enter specaility
	<select name="speciality" >
            <option value="orthopedician">orthopedician</option>
            <option value="pediatrician">pediatrician</option>
            <option value="dentist">dentist</option>
            <option value="physician">physician</option>
            <option value="gynaecologist">gynaecologist</option>
            <option value="dermatologist">dermatologist</option>
        </select><br>
	Enter fees<input type="text" name="fees"><br>
	Select rating
        <select name="rating" >
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
            <option value="5">5</option>
        </select><br>
	Enter experience<input type="text" name="experince"><br>
	<input type="submit" value="submit">
	
	</form>
</body>
</html>