<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

<title>Dashboard</title>
</head>
<body>
<h2><a href = "/">Home Page</a><br></h2>

<h3><a href="/song/new">Add New</a> | <a href="/topten">Top Ten</a></h3>

<form action="/search" class="float-right" method = "POST">
		<input type="text" name="artist"/>
		<button class="btn btn-primary">Search Artists</button>
</form>


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