<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Classes</title>
<link type="text/css" rel="stylesheet" href="../resources/css/style.css">
<link type="text/css" rel="stylesheet" href="../resources/css/login.css">

<link rel="stylesheet"
	href="../resources/bootstrap/css/bootstrap.min.css">
<script src="../resources/bootstrap/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Nunito+Sans">
<link rel="stylesheet" href="../resources/fonts/font-awesome.min.css">
<link rel="stylesheet" href="../resources/fonts/ionicons.min.css">
<link rel="stylesheet" href="../resources/fonts/font-awesome.min.css">
<link rel="stylesheet" href="../resources/fonts/ionicons.min.css">
<link rel="stylesheet" href="../resources/fonts/material-icons.min.css">

</head>

<body
	style="background-image: url('../resources/images/bg.jpg');">
	<div class="container-fluid h-100">
		<div class="row   h-100 ">

			<jsp:include page="left-list.jsp" />



			<div class="col-lg-10 float-left">


				<br>
				<center>
					<h3>Manage Users</h3>

				</center>
				<br>
				<div id="container">
					<center>
						<div id="content">

							<table style="width: 45%">

								<tr>

									<th>User Name</th>
									<th>Age</th>
									<th>Action</th>



								</tr>

								<c:forEach var="user" items="${users}">

									<c:if test="${user.type == 0}">



										<!-- construct an "delete" link with user id -->
										<c:url var="deleteLink" value="/admin/deleteUser">
											<c:param name="userId" value="${user.id}" />
										</c:url>
										<tr>

											<td>${user.username}</td>
											<td>${user.age}</td>
											<td><a href="${deleteLink}" class="btn btn-danger">
													Delete</a></td>



										</tr>

									</c:if>
								</c:forEach>



							</table>
						</div>
						<br>

					</center>
				</div>

			</div>
		</div>
	</div>
</body>
</html>