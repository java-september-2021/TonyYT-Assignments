<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojo Survey Index</title>
</head>
<body>
<div class = "main">
<form method = "POST" action = "/result">
<label for = "name">Your Name</label>
<input type = "text" id = "name" name= "name">
<label for = "">DoJo Location </label>
<select class ="select" name = "locationSelect">
	<option value = "San Francisco">San Francisco</option>
	<option value = "Seattle">Seattle</option>
	<option value = "Washington, D.C.">Washington, D.C.</option>
	<option value = "Los Angel">Los Angel</option>
</select>
<select class = "select" name= "language">
	<option value = "java"> Java</option>
	<option value = "python">Python</option>
	<option value = "C++">C++</option>
	<option value = "JS">JavaScript</option>
</select>

<label for ="comment">comment</label>
<input type = "text" id = "comment" name = "comment">

<input type ="submit" value = "submit">
</form>
</div>

</body>
</html>