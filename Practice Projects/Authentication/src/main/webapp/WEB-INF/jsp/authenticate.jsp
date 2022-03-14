<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Authentication Page</title>
</head><div align="center">
<h2>Login Page</h2></div>
<body>   <div align="center">
welcome to the authentication page

<form:form action="Auth" method="post" commandName="login">
	<label for="username"> Username:</label>
	<input name="username" id="username" type="text" placeholder="Username" required/>
	<label for="password">Password:</label>
	<input name="password" id="password" type="password" placholder="Password" required/>
	<input type="submit" name="Submit"/>
</form:form></div>
</body>
</html>