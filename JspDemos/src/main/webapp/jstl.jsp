<%@page import="java.util.Arrays"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% request.setAttribute("message", "have a nice day"); %>

<c:out value="${mesage }"></c:out><br>
<c:set var="mess" value="good morning" scope="session"></c:set>
${sessionScope.mess}<br>
<c:out value="good morning,${message}"></c:out><br>

<% List<String> fruits = Arrays.asList("apple","bannana","mango","kivi","pineapple");
session.setAttribute("fruitslist", fruits);
%>

<h2>using EL</h2>
${fruitslist}<br>

<h2>using foreach</h2>

<c:forEach items="${fruitslist}" var="fruits" step="2"> 
${fruits}<br>
</c:forEach>

</body>
</html>