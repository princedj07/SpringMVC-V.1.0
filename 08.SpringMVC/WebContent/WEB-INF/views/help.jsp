<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@page isELIgnored="false"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Please Help me!</h1>
	
	<%
		String name = (String) request.getAttribute("name");
		int id = (int) request.getAttribute("id");
	%>
	
	<h2>My Name is <%= name %></h2>
	<h2>My User id is <%= id %></h2>
	<h2>My Profile is ${work}</h2>
	
	<hr>
	
	<c:forEach var="item" items="${marks}">
		<h2>${item}</h2>
	</c:forEach>
		
</body>
</html>