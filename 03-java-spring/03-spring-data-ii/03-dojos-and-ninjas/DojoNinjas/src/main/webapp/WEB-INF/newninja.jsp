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
<title>New Ninja</title>
</head>
<body>
<h1>Add A New Ninja</h1>

<form:form action = "/ninjatoadd" method = "POST" modelAttribute = "ninja">
	<p>
		<form:label path = "dojo">Dojo</form:label>
		<form:errors path = "dojo"/>
		<form:select path = "dojo">
			<c:forEach items = "${dojos}" var ="dojo">
				<option value = "${dojo.getId()}">${dojo.getName()}</option>
			</c:forEach>
		</form:select>
	</p>
	
	<p>
		<form:label path = "firstName">First Name</form:label>
		<form:errors path = "firstName"/>
		<form:input path = "firstName"/>
	</p>
	
	<p>
		<form:label path = "lastName">Last name</form:label>
		<form:errors path = "lastName"/>
		<form:input path = "lastName"/>
	</p>

	<p>
		<form:label path = "age">Age</form:label>
		<form:errors path = "age"/>
		<form:input path = "age"/>
	</p>
	
	<button>Create</button>
</form:form>

<a href = "/">Dojo Location List</a> ||
<a href = "/ninjatotallist">Total Ninja List</a>


</body>
</html>