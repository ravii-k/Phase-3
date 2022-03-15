<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
 <link href="resources/css/login.css" rel="stylesheet" type="text/css"
  
</head>
<body style="background-image: url('../resources/images/bg.jpg');">

  <center> <h1> Register </h1> </center>   
    <form action="registerProcess" method="POST">  
        <div class="container">   
        	<input type="hidden" name="command" value="LOGIN" />
            <label>Username : </label>   
            <br/>
            <input type="text" placeholder="Enter Username" name="username" required>  
            <br/>
            <label>Age : </label>   
            <br/>
            <input type="text" placeholder="Enter Age" name="age" required>  
            <br/>
            <label>Password : </label>   
            <br/>
            <input type="password" placeholder="Enter Password" name="password" required>  
            <br/>
            <button type="submit">Register</button>   
            <br/>
          
             
        </div>   
    </form>     


</body>
</html>