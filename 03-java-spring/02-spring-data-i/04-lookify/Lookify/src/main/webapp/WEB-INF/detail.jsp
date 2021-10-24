<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<title>Song Detail</title>
</head>
<body>

<p><a href= "/dashboard">Dashboard</a></p>

<h1>Name:    <c:out value = "${thisSong.getName()}"/></h1>
<h1>Artist:    <c:out value = "${thisSong.getArtist()}"/></h1>
<h1>Rating(1-10):    <c:out value = "${thisSong.getRating()}"/></h1>

<p><a href = "/${thisSong.getId()}">delete</a></p>

</body>
</html>