<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Message</title>
</head>
<body>
	<%
	String usName = request.getAttribute("new-name").toString();
	out.println("Hi ! " + usName + "We've received your mail !");
	%>


</body>
</html>