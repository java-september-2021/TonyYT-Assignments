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
<h1>All Dojo Location</h1>


<table>
	<c:forEach items = "${dojos}" var = "dojo">
		<tr>
			<td><a href= "/ninjalist/${dojo.getId()}">${dojo.getName()}</a></td>
			<td><a href = "/deletedojo/${dojo.getId()}">delete</a></td>
		</tr>
	</c:forEach>

</table>

<a href = "/newninja">Add New Ninja</a>  ||
<a href = "/newdojo">Add New Dojo</a>  ||
<a href = "/ninjatotallist">Total Ninja List</a>

</body>
</html>

