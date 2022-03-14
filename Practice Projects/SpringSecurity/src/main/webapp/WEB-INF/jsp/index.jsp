<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:th="http://www.thymeleaf.org"
	xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3"
	xmlns:layout="http://www.ultraq.net.nz/thymeleaf/layout">
<head>
<title>Greeting</title>
</head>
<body>
   <div align="center">
	<h4>Welcomeo Heros!</h4>

	<p>
		Click <a th:href="@{/welcome}">here</a> and see your greeting.
	</p>
	</div>
</body>
</html>