<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Classes</title>
<link type="text/css" rel="stylesheet" href="../resources/css/style.css">

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



			<div style="margin-top: 7px;" class="col-lg-10 float-left">


				<form action="searchProducts" method="POST">
					<div class=" input-group md-form form-sm form-2 pl-0 ">

						<input name="keySearch" class="form-control my-0 py-1 red-border" type="text"
							placeholder="Search Product" aria-label="Search">



						<button style="border-width: 0" type="submit">
							<span class="input-group-text red lighten-3" id="basic-text1"><i
								class="fa fa-search text-grey" aria-hidden="true"></i></span>
						</button>

					</div>
				</form>


				<div id="cards_container" class="container">
					<div class="row">

						<!-- loop over and print our customers -->
						<c:forEach var="product" items="${products}">

							<c:url var="orderLink" value="/homepage/orderProcess">
								<c:param name="productId" value="${product.id}" />
							</c:url>

							<div class="card col-xs-3"
								style="width: 14rem; margin: 21px 38px;">
								<img class="card-img-top" src=${product.image_link}>
								<div style="margin-left: auto; margin-right: auto;"
									class="card-body">
									<h5 class="card-title">${product.name}</h5>
									<p class="card-text">
										${product.company}<br>${product.size} inches<br>${product.price}$
									</p>

									<c:choose>
										<c:when test="${userProducts.contains(product.id)}">
											<a href="${orderLink}" class="btn btn-danger"><i
												class="fa fa-shopping-cart fa-lg"></i> Remove from Cart</a>
										</c:when>

										<c:otherwise>


											<a href="${orderLink}" class="btn btn-primary"><i
												class="fa fa-shopping-cart fa-lg"></i> Add to My Cart</a>
										</c:otherwise>
									</c:choose>
								</div>
							</div>

						</c:forEach>
					</div>
				</div>


			</div>
		</div>
	</div>
</body>
</html>