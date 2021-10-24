<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

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