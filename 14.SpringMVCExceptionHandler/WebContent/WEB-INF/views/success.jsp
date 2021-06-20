<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: gray;">

	<div align="center">
		<h1>Success Result</h1>
		<h2>Student Name------: ${ student.name }</h2>
		<h2>Student Id--------: ${ student.id }</h2>
		<h2>Student Date------: ${ student.date }</h2>
		<h2>Student Courses---: ${ student.courses }</h2>
		<h2>Student Gender----: ${ student.gender }</h2>	
		<h2>Student Type------: ${ student.type }</h2>
		<h2>Student City------: ${ student.address.city }</h2>
		<h2>Student State-----: ${ student.address.state }</h2>
	</div>	
</body>
</html>