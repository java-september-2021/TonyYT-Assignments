<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Details</title>
</head>
<body>
<a href = "/languages">Home Page</a>

<h2>Name: <c:out value = "${thisLang.name}"/></h2>
<h2>Creator: <c:out value = "${thisLang.creator}"/></h2>
<h2>Version: <c:out value = "${thisLang.currentVersion}"/></h2>

<p><a href = "/languages/${thisLang.getId()}/edit">Edit</a> <a href = "/delete/languages/${thisLang.getId()}">Delete</a>
</p>
</body>
</html>