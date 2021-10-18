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
<title>Add Song</title>
</head>
<body>
<a href = "/">Home Page</a><br><br>
<h1>Add A New Song</h1>

<form:form action = "/song/new" method = "POST" modelAttribute = "song">
<p>
<form:label path ="song.setName()">Name</form:label>
<form:errors path = "song.setName()" />
<form:input path = "song.setName()"/>
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