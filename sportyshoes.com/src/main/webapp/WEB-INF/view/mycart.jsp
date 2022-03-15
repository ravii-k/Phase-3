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
					<h3>My Cart</h3>
					
				</center>
				<br>
				<div id="container">
					<center>
						<div id="content">

							<table>

								<tr>

									<th>Name</th>
									<th>Company</th>
									<th>Size</th>
									<th>Price</th>


								</tr>

								<c:forEach var="userProducts" items="${userProducts}">
									<tr>

										<td>${userProducts.name}</td>
										<td>${userProducts.company}</td>
										<td>${userProducts.size} inches</td>
										<td>${userProducts.price}$</td>



									</tr>


								</c:forEach>

								<tr>
									<td  colspan="4">Total Price = <strong>${total_price}$</strong></td>
								</tr>

							</table>
						</div>
						<br>
						<button style="width: 10%" class="btn btn-success" type="button">Purchase</button>
					</center>
				</div>

			</div>
		</div>
	</div>
</body>
</html>