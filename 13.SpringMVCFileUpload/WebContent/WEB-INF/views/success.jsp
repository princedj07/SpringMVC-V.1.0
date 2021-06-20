<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: gray;">

	<div align="center">
		<h1 style="color: white;">File Uploading Result</h1>
		<h2>${msg}</h2>
		
		<img alt="profile img" src="<c:url value="/resources/images/${ filename }"/>">
	</div>	
</body>
</html>