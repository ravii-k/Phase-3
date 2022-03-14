<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search page</title>

</head>

<body>
	<div>
		
		<h1>Please Enter The User Id</h1>
		<form method="post" modelAttribute="user">
			Id: <input type="text" name="id" required="required"><br />
			<br />
			<button type="submit">Search</button>
		</form><br>
		<font color="red">${errorMessage}</font>
	</div>
</body>

</html>