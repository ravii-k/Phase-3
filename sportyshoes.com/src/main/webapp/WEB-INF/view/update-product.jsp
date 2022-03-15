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
					<h3>Add a New Product</h3>
				</center>
				<br>
				<form action="updateProductProcess" method="POST">
					<div class="container">
						
						<input type="hidden"
							 name="productId" value="${product.id}"> 
					
						<label>Product Name : </label> <br /> <input  type="text"
							placeholder="Enter name" name="name" value="${product.name}" required> 
						<br>
						
						<label>Company : </label> <br /> <input  type="text"
							placeholder="Enter company" name="company" value="${product.company}" required> 
						<br>	
						
						<label>Size : </label> <br /> <input  type="text"
							placeholder="Enter size" name="size" value="${product.size}"  required> 
						<br>
						
					
						<label>Price : </label> <br /> <input  type="text"
							placeholder="Enter price" name="price" value="${product.size}"  required> 
						<br>
						
						<label>Image Link : </label> <br /> <input  type="text"
							placeholder="Enter image" name="image"  value="${product.image_link}"  required> 
						<br>
						<br>
						<button type="submit">Update</button>
						<br>


					</div>
				</form>
<br><br>
			</div>
		</div>
	</div>
</body>
</html>