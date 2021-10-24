<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

<title>Add Song</title>
</head>
<body>
<a href = "/">Home Page</a><br><br>
<h1>Add A New Song</h1>

<form:form action = "/new" method = "POST" modelAttribute = "song">
<p>
<form:label path ="name">Name</form:label>
<form:errors path = "name" />
<form:input path = "name"/>
</p>


<p>
<form:label path ="artist">Artist</form:label>
<form:errors path = "artist" />
<form:input path = "artist"/>
</p>

<p>
<form:label path ="rating">Rating</form:label>
<form:errors path = "rating" />
<form:input path = "rating"/>
</p>

<button>Add Song</button>

</form:form>


</body>
</html>