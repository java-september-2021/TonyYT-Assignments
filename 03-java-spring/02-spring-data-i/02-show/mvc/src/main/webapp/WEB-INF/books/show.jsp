<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book Show Page</title>
</head>
<body>

	<h1><c:out value="${book.getTitle()}"/></h1>
	<p>Description: <c:out value="${book.getDescription()}"/></p>
	<p>Language: <c:out value="${book.language}"/></p>
	<p>Number of pages: <c:out value="${book.getNumberOfPages()}"/></p>
	<a href="/books/${book.getId()}/edit">Edit Book</a>
	<form action="/books/${book.getId()}" method="post">
    	<input type="hidden" name="_method" value="delete">
    	<input type="submit" value="Delete">
	</form>

</body>
</html>

