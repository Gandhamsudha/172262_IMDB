<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <title> Login Form</title>
       
       
    </head>
    <body>	  
        <form  action="LoginServlet"  method="post" class="form container" >
            <h2> Login Form</h2>
            <label><b>Username</b></label><br>
            <input type="text" name="uname" required><br>
            <label><b>Password</b></label><br>
            <input type="type" name="password" required><br>
            <button type="submit">Login</button>
        </form>
    </body>
</html>
