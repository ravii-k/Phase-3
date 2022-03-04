<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
	
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script src='https://kit.fontawesome.com/a076d05399.js'></script>

<style type="text/css">
.error {
	color: red;
}
</style>
</head>
<body>

	<div class="container">

		<h2 align="center">Employee Registration</h2>
	</div>
	<div class="container">
		<form action="register" method="post">
		<c:if test="${error != null}">
			<span class='error'><c:out value="${error}"></c:out></span>
		</c:if>
			<div class="row">
				<div class="col-lg-6 col-lg-offset-3">
					<div class="form-group">
						<label for="name">Employee Name:</label>
						 <input type="text"
							class="form-control" id="customerName" placeholder="Enter Name"
							name="name">
					</div>

					<div class="form-group">
						<label for="address">Salary:</label> <input type="text"
							class="form-control" id="address" placeholder="Enter address."
							name="salary">
					</div>
					<div class="form-group">
						<label for="dept">Department:</label>
						 <select
							name="dept">
							<option value="">Select One--</option>
							<c:forEach items="${departments}" var="dept">

								<option value="${dept }"><c:out value="${dept }"></c:out></option>

							</c:forEach>
						</select>
					</div>
					
					
					<div align="center">
						<input type="submit" class="btn btn-primary" value="Register">Register</button>
					</div>
				</div>
			</div>
		</form>