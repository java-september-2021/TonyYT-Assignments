<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel = "Stylesheet" href = "css/style.css">
<title>Ninja Gold Game</title>
</head>
<body>

<div class = "main">

<h1>
Your Gold: <c:out value="${goldNum}"></c:out>
</h1>



<div class = "box">
<form method = "POST" action = "/gold">
<h2>Farm</h2>
<h3>(earns 10-20 gold)</h3>
<input type = "hidden" value = "farm" name = "building">
<input type = "submit" value = "Find Gold!" name = "farmGold">
</form>
</div>

<div class = "box">
<form method = "POST" action = "/gold">
<h2>Cave</h2>
<h3>(earns 5-10 gold)</h3>
<input type = "hidden" value = "cave" name = "building">
<input type = "submit" value = "Find Gold!" name = "caveGold">
</form>
</div>

<div class = "box">
<form method = "POST" action = "/gold">
<h2>House</h2>
<h3>(earns 2-5 gold)</h3>
<input type = "hidden" value = "house" name = "building">
<input type = "submit" value = "Find Gold!" name = "houseGold">
</form>
</div>

<div class = "box">
<form method = "POST" action = "/gold">
<h2>Casino!</h2>
<input type = "hidden" name = "building" value = "casino">
<h3>(earns/takes 0-50 gold)</h3>
<input type = "submit" value = "Find Gold!" name = "casinoGold">
</form>
</div>


<h2>Activities</h2>
<div class = "activities">
<c:forEach items = "${activities}" var = "act">
<p>"${act}"</p>
</c:forEach>
</div>

</div>

</body>
</html>