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
<h1>Submitted Info</h1>
<h2>Name: <c:out value = "name"/></h2>
<h2> Dojo Location: <c:out value = "DoJoLocation" /></h2>
<h2>Favorite Language:<c:out value = "language" /></h2>
<h2>Comment: <c:out value = "comment"/></h2>

<input type ="submit" value = "goback">
</div>

</body>
</html>