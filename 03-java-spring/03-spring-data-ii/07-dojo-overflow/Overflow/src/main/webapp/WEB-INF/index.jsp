<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<title>Question Dashboard</title>
</head>
<body>

<h1>Questions Dashboard</h1>

<table>
	<thead>
		<tr>
			<td>Question</td>
			<td>Tags</td>
			<td>Action</td>
		</tr>
	</thead>

	<tbody>
		<c:forEach items = "${questions}" var = "question">
			<tr>
				<td> <a href = "/question/${question.getId()}">${question.getName()}</a></td>
				<td>
					<c:forEach items ="${tags}" var = "tag">
						${tag.getName()},
					</c:forEach>
				</td>
				<td>Delete</td>
			</tr>
		</c:forEach>
	</tbody>
</table>




<a href = "/question/new">New Question</a>

</body>
</html>