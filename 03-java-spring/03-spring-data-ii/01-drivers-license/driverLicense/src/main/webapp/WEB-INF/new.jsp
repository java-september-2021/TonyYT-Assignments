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
<title>Create A New Person</title>
</head>
<body>

<h1>Create a new Person</h1>
<hr>
<form:form action = "/new" method = "POST" modelAttribute = "person">
<p>
<form:label path = "firstName">First Name </form:label>
<form:errors path = "firstName"/> 
<form:input path = "firstName"/>
</p>

<p>
<form:label path = "lastName">Last Name </form:label>
<form:errors path = "lastName"/> 
<form:input path = "lastName"/>
</p>

<button>Add new person</button>
</form:form>

</body>
</html>