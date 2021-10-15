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
<title>Edit the language</title>
</head>
<body>
<h1>Edit the language</h1>


<form:form action = "/languages/${language.getId()}/edit" method = "POST" modelAttribute = "language">

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

<input type = "hidden" name = "_method" value = "put">
<button>Edit Language</button>

<a href = "/languages">Home Page</a>

</form:form>


</body>
</html>