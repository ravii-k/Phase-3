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
					<h3>My Account</h3>
				</center>
				<form action="updateAcount"  method="POST">
					<div class="container">
						<label>Username
							: </label> <br /> <input value="${currentUser.username}" type="text" placeholder="Enter Username"
							name="username" required> <br /> <label>Age : </label> <br />
						<input value="${currentUser.age}" type="text" placeholder="Enter Age" name="age" required>
						<br /> <label>Password : </label> <br /> <input value="${currentUser.password}" type="text"
							placeholder="Enter Password" name="password" required> <br />
						<br>
						<button type="submit">Update</button>
						<br> <br />


					</div>
				</form>

			</div>
		</div>
	</div>
</body>
</html>