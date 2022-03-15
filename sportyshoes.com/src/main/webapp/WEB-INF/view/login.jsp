<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
 <link type="text/css" rel="stylesheet" href="resources/css/login.css"> 
  
</head>
<body
style="background-image: url('../resources/images/bg.jpg');">

  <center> <h1> Admin Login </h1> </center>   
    <form action="loginProcess" method="POST">  
        <div class="container">   
        	<input type="hidden" name="command" value="LOGIN" />
            <label>Username : </label>   
            <br/>
            <input type="text" placeholder="Enter Username" name="username" required>  
            <br/>
            <label>Password : </label>   
            <br/>
            <input type="password" placeholder="Enter Password" name="password" required>  
            <br/>
            <button type="submit">Login</button>   
            <br/>
            <a href="${pageContext.request.contextPath}/register">Don't have an account? Register now!</a>   
             
        </div>   
    </form>     


</body>
</html>