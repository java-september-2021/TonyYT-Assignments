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
<title>Create a new License</title>
</head>
<body>
<h1>Create a new license</h1>
<hr>
<form:form method = "POST" action = "/newlicense" modelAttribute = "license">
<p>
<form:label path = "person">Select Person</form:label>
<form:errors path = "person"/> 
<form:select path = "person">
<c:forEach items = "${people}" var = "person">
<option value = "${person.getId()}">${person.getFirstName()}  ${person.getLastName()}</option>
</c:forEach>
</form:select>
</p>



<p>
<form:label path = "expiration_date">Expiration Date </form:label>
<form:errors path = "expiration_date"/> 
<form:input type = "date" path = "expiration_date"/>
</p>

<p>
<form:label path = "state">State </form:label>
<form:errors path = "state"/> 
<form:input path = "state"/>
</p>

<button>Add License</button>

</form:form>
</body>
</html>