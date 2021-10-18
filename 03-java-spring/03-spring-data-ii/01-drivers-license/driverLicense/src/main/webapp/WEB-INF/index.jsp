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
<title>Person and Licenses</title>
</head>
<body>
<h1>Persons and Licenses</h1>

<a href= "/persons/new">Create A Person</a> | <a href= "/licenses/create">Create A License</a>

<hr>
<table>
<tr>
<th>id</th>
<th>first name</th>
<th>last name</th>
</tr>

<tbody>
<c:forEach items = "${persons}" var = "person">
<tr>
<td><a href = "/${person.getId()}">${person.getId()}</a></td>
<td>${person.getFirstName()}</td>
<td>${person.getLastName()}</td>
</tr>
</c:forEach>



</tbody>


</table>

</body>
</html>