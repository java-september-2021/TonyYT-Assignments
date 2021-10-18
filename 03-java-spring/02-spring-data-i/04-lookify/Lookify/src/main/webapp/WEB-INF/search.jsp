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
<title>Search</title>
</head>
<body>
<p><a href= "/dashboard">Dashboard</a></p><br><br>

<h2>Songs by artist:  <c:out value = "${artist}"/></h2>
<table class = "table" border = 1>
	<thead>
		<tr>
			<td>Name</td>
			<td>rating</td>
			<td>actions</td>
		</tr>
	</thead>
	
	<tbody>
	
	<c:forEach items = "${songs}" var = "song">
		<tr>
			<td>${song.getName()}</td>
			<td>${song.getRating()}</td>
			<td><a href = "/${thisSong.getId()}">delete</a></td>
		</tr>
		</c:forEach>
		
	</tbody>
</table>

</body>
</html>