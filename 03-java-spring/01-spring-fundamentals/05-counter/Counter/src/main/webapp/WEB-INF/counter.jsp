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
<h1>You have visited <a href = "">http://your_server</a><c:out value = "${countShow}"/> times.</h1>
<h1><a href = "">Test another visit?</a> </h1>

</body>
</html>

