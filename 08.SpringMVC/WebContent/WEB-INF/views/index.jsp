<%@page import="java.util.List"%>
<html>
<body>
	<h1>This is Home Page</h1>

	<%
		String name = (String) request.getAttribute("name");
	List<String> friends = (List<String>) request.getAttribute("friend");
	%>
	<h2>
		Welcome
		<%=name%></h2>

	<%
		for (String s : friends) {
	%>
	<h2><%=s%></h2>
	<%
		}
	%>

</body>
</html>
