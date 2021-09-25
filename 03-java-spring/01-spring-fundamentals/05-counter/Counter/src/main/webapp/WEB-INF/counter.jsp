<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Current Visit Count</title>
</head>
<body>
<h1>You have visited localhost:8080 <c:out value = "${countShow}"/> times.</h1>
<h1><a href = "/">Test another visit?</a> <a href = "/reset">Reset</a> </h1>

<h1>you have visited localhost_8080/increment2 <c:out value = "${thisCount}"/> times.</h1>

</body>
</html>

