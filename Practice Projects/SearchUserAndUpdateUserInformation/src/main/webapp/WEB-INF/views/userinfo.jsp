
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
#container {
	margin: auto;
	width: 60%;
	padding: 10px;
}

caption {
	font-family: "Times New Roman", Times, serif;
	color: #242323;
	padding: 30px;
	font-size: 26px;
}

#user {
	font-family: Arial, Helvetica, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

#user td, #user th {
	border: 1px solid #403f3f;
	padding: 8px;
}

#user tr:nth-child(even) {
	background-color: #85e0c9;
}

#user tr:hover {
	background-color: #dfdf9f;
}

#user th {
	padding-top: 12px;
	padding-bottom: 12px;
	text-align: left;
	background-color: #9fcfdf;
	color: white;
}
</style>

<title>User Detail</title>
</head>

<body>

	<div id="container">
		<table id="user">
			<caption>Please check the user information below</caption>
			<thead>
				<tr>
					<th>User Id</th>
					<th>User Name</th>
					<th>User City</th>
					<th>Setting</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>${user.id}</td>
					<td>${user.name}</td>
					<td>${user.city}</td>
					<td><a type="button" href="/update-user?id=${user.id}">Update</a></td>
				</tr>
			</tbody>
		</table>
		
		<a type="button" href="/search">Back to search</a>
	</div>

</body>

</html>