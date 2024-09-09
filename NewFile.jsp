<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Login Form</title>
	</head>
<body>
	<div class="login-container">
        <h2>Login</h2>
        <form action="Home" method="post">
            <label for="id">id:</label>
            <input type="number" id="id" name="id" required>
            
            <label for="firstname">First Name:</label>
            <input type="text" id="firstname" name="firstname" required>
            
			<label for="salary">Salary:</label>
			<input type="number" id="salary" name="salary" required>
			
			<label for="lastname">Last Name:</label>
			<input type="text" id="lastname" name="lastname" required>
			
            
            <input type="submit" value="submit">
            <% 
                
            %>
            
        </form>
    </div>
</body>
</html>
