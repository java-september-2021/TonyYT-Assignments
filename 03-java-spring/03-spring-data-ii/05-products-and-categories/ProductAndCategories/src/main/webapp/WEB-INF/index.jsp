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
<title>Home Page</title>
</head>
<body>
<h1>Welcome!</h1>

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
</body>
</html>