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
<title>Dojo Page</title>
</head>
<body>
<h1>Location Ninjas</h1>
<table>
	<thead>
		<tr>
			<td>First Name</td>
			<td>Last Name</td>
			<td>Age</td>
		</tr>
	</thead>
	<tbody>
		<c:forEach items = "${dojoDetail.getNinjas()}" var = "ninja">
		<tr>
			<td>${ninja.getFirstName()}</td>
			<td>${ninja.getLastName()}</td>
			<td>${ninja.getAge()}</td>
		</tr>
		</c:forEach>
	</tbody>
</table>

<a href = "/">Dojo Location List</a>

</body>
</html>

