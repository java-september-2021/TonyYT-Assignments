<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<h1>Welcome! ${thisUser.getFristName()} </h1>

<h2>Product</h2>
<p>
	<c:forEach items = "${products}" var = "product">
		<a href = "/product/${product.getId()}">${product.getName()}</a> -------<a href = "/product/${product.getId()}/delete">Delete</a> <br>
	</c:forEach>
</p>

<br><br><br>

<h2>Category</h2>
<p>
	<c:forEach items = "${categories}" var = "category">
		<a href ="/category/${category.getId()}">${category.getName()}</a> -------<a href = "/category/${category.getId()}/delete">Delete</a> <br>
	</c:forEach>
</p>



<a href="newproduct">Add A New Product</a> ||
<a href = "newcategory">Add A New Category</a>

<br><br>
<a href = "/logout">Log Out</a>
</body>
</html>