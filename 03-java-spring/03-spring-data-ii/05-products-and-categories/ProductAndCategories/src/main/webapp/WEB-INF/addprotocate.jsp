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
<title>Add This Product to this Category</title>
</head>
<body>


<h1>${thisCategory.getName()}</h1>

<h2>Categories</h2>
<p>
	<c:forEach items ="${thisCategoryProducts}" var = "product">
		<p>- ${product.getName()} -----<a href = "/product/${product.getId()}/delete">Delete</a></p>
	</c:forEach>
</p>

<h2>Add Category</h2>
<p>
	<form:form action = "/category/${thisCategory.getId()}/product" method = "POST" modelAttribute = "product">
	<form:label path="name">Add Product</form:label>
	<form:errors path="name" />
	<form:select path ="name">
		<c:forEach items = "${products}" var = "pro">
		<option value = "${pro.getId()}">${pro.getId()}  --${pro.getName()}</option>
		</c:forEach>
	</form:select>
	
	<button>Submit</button>
	
	</form:form>
</p>

<br><br>
<a href = "/">Home Page</a>


</body>
</html>