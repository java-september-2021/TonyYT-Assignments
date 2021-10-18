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
<title>Top Ten Songs</title>
</head>

<body>
<p><a href= "/dashboard">Dashboard</a></p>
<h1>Top Ten Songs:</h1>

<table>
	<tbody>
	<c:forEach items = "${songs}" var ="song">
		<tr>
			<td>${song.getRating()} - </td>
			<td><a href = "/song/${song.getId()}">${song.getName()}</a></td>
			<td> - ${song.getArtist()}<td>
		</tr>
	</c:forEach>
	</tbody>



</table>




</body>
</html>