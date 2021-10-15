<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css"/>
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Languages</title>
</head>
<body>
<h1>Languages</h1>
<table class = "table" border = 1>
<thead>
<tr>
<td>Name</td>
<td>Creator</td>
<td>Version</td>
<td>Action</td>
</tr>
</thead>

<tbody>
<c:forEach items = "${allLanguages}" var = "lang">
<tr>
<td>${lang.name}</td>
<td>${lang.creator}</td>
<td>${lang.currentVersion}</td>
<td><a href = "/languages/{lang.id}/edit">Edit</a> <a href = "/delete/languages/{lang.id}">Delete</a></td>
</tr>
</c:forEach>
</tbody>
</table>



<h2>Create New Language</h2>
<form:form action = "/" method = "POST" modelAttribute = "language">
<p>
<form:label path = "name">Name </form:label>
<form:errors path = "name"/>
<form:input path = "name"/>
</p>
<p>
<form:label path = "creator">Creator </form:label>
<form:errors path = "creator"/>
<form:input path = "creator"/>
</p>
<p>
<form:label path = "currentVersion">Current Version </form:label>
<form:errors path = "currentVersion"/>
<form:input path = "currentVersion"/>
</p>
<button>Submit New Language</button>
</form:form>
</body>
</html>