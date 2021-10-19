<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css"/>
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<title>Total Ninja List</title>
</head>
<body>

<table>
	<thead>
		<tr>
			<td>First Name</td>
			<td>Last Name</td>
			<td>Age</td>
			<td>Dojo Location</td>
			<td>Action</td>
		</tr>
	</thead>
	
	<tbody>
		<c:forEach items = "${ninjas}" var = "ninja">
		<tr>
			<td>${ninja.getFirstName()}</td>
			<td>${ninja.getLastName()}</td>
			<td>${ninja.getAge()}</td>
			<td>${ninja.getDojo().getName()}</td>
			<td><a href="/deleteninja/${ninja.getId()}">Delete</a></td>
		</tr>
		</c:forEach>
	</tbody>
</table>

<a href = "/">Dojo Location List</a> ||
<a href = "/newninja">Add New Ninja</a> 

</body>
</html>