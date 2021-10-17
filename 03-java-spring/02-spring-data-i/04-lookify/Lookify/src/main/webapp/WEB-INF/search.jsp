<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search</title>
</head>
<body>
<p><a href= "/dashboard">Dashboard</a></p><br><br>

<table>
	<thead>
		<tr>
			<td>Name</td>
			<td>rating</td>
			<td>actions</td>
		</tr>
	</thead>
	
	<tbody>
	<c:forEach items = "" var = "">
		<tr>
			<td></td>
		
		</tr>
		</c:forEach>
	</tbody>



</table>

</body>
</html>