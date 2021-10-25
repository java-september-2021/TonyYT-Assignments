<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<title>New Question</title>
</head>
<body>

<h1>What is your question?</h1>

<form:form action="/addnewquestion" method ="POST" modelAttribute = "question">
	<form:label path="text">Question</form:label>
	<form:errors path= "text"/>
	<form:input path="text"/>
	<br>
			<form:label path="tags">Tag(s)</form:label>
			<form:errors path= "tags"/>
			<form:input  path="tags"/>
		<button>Submit</button>
</form:form>


<a href = "/">Dashboard</a>
</body>
</html>