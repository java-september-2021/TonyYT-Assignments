<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Select Code</title>
<link rel = "stylesheet" href = "/css.style.css">
</head>
<body>
<div>
<p class="error">${errorMessage}</p>
<form method= "POST" action = "/code">
<h1>what is the code?</h1>
<input type = "text" id = "input" name = "inputCode">
<input type = "submit" value = "submit">
</div>

</body>
</html>