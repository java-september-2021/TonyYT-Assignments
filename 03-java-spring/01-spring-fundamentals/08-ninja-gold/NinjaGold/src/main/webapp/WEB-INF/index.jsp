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

<h1>
Your Gold: <c:out value="${goldCount}"></c:out>
</h1>



<div class = "main">
<form method = "POST" action = "/gold"></form>
<div class = "box">
<h2>Farm</h2>
<h3>(earns 10-20 gold)</h3>
<input type = "submit" value = "Find Gold!" name = "farmGold">
</div>

<div class = "box">
<h2>Cave</h2>
<h3>(earns 5-10 gold)</h3>
<input type = "submit" value = "Find Gold!" name = "caveGold">
</div>

<div class = "box">
<h2>House</h2>
<h3>(earns 2-5 gold)</h3>
<input type = "submit" value = "Find Gold!" name = "houseGold">
</div>

<div class = "box">
<h2>Casino!</h2>
<h3>(earns/takes 0-50 gold)</h3>
<input type = "submit" value = "Find Gold!" name = "casinoGold">
</div>

</div>

<h2><label for = "activities">Activities:</label></h2>
<input type="text" name = "activities">

</body>
</html>