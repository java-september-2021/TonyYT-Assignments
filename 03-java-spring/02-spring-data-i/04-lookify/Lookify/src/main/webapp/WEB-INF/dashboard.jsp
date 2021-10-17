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
<title>Dashboard</title>
</head>
<body>
<a href = "/">Home Page</a><br>
<a href = "/song/new"> Add New</a>
<a href ="">Top Songs</a>

<input type = "text" id = "search" name = "search">
<button> Search</button>

<h1>Your Song List</h1>
<table class = "table" border = 1>
	<thead>
		<tr>
			<td>Name</td>
			<td>Artist</td>
			<td>Rating</td>
			<td>Actions</td>
		</tr>
	</thead>

	<tbody>
		<c:forEach items ="${song}" var = "song">
			<tr>
				<td><a href = "/song/${song.getId()}"> ${song.getName()}</a></td>
				<td>${song.getArtist()}</td>
				<td>${song.getRating()}</td>
				<td><a href = "/${song.getId()}">delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>

</body>
</html>