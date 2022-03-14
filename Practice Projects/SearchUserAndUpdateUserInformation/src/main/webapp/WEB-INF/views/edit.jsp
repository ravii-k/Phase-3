<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit form</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
</head>

<body>

	<div class="container">
	<h2>Please update user's information</h2>
		<form:form method="post" modelAttribute="user">
			<form:hidden path="id" />

			<fieldset class="form-group">
				<form:label path="name">User Name</form:label>
				<form:input path="name" type="text" class="form-control"
					required="required" />
				<form:errors path="name" cssClass="text-warning" />
			</fieldset>
			
				<fieldset class="form-group">
				<form:label path="city">User City</form:label>
				<form:input path="city" type="text" class="form-control"
					required="required" />
				<form:errors path="city" cssClass="text-warning" />
			</fieldset>

			<button type="submit" class="btn btn-danger">confirm</button>
		</form:form>
	</div>

	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>

</html>