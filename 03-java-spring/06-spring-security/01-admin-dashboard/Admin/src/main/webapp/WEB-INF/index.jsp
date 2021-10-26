<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login/Register</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>

<h1>Login</h1>


<br><br>

<h1>Register</h1>
<form:form action ="/registerUser" method ="POST" modelAttribute ="user">
	<p>
		<form:label path = "email">Email</form:label>
		<form:errors path = "email"/>
		<form:input path = "email"/>
	</p>
	
	<p>
		<form:label path = "firstName">First Name</form:label>
		<form:errors path = "firstName"/>
		<form:input path = "firstName"/>
	</p>

	<p>
		<form:label path = "lastName">LastName</form:label>
		<form:errors path = "lastName"/>
		<form:input path = "lastName"/>
	</p>

	<p>
		<form:label path = "password">Password</form:label>
		<form:errors path = "password"/>
		<form:input path = "password" type = "password"/>
	</p>
	
	<p>
		<form:label path = "confirmPassword">Confirm Password</form:label>
		<form:errors path = "confirmPassword"/>
		<form:input path = "confirmPassword" type = "password"/>
	</p>

	<button>Register!!!</button>
</form:form>

<br><br><br>

<h3>Log in Here</h3>
<br>
	<form action ="/login" method ="POST">
		<label>Email Address</label>
		<input type="email" name = "lemail">
		<br><br>
		<label>Password</label>
		<input type ="password" name = "lpassword">
		<button>Login!!!</button>
	</form>

</body>
</html>