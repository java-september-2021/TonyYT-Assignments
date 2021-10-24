<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<title>Question Profile</title>
</head>
<body>

<h1>${thisQuestion.getName()}</h1>

<br>
<h2>Tags: </h2>

<div>
<h3>Other Answers</h3>
	<table>
		<thead>Answers</thead>
		
		<tbody>
			<c:forEach items ="answersToThisQuestion" var = "answer">
				<tr><td>
					<c:out value="${answer.getName()}"/>
				</td></tr>
			</c:forEach>
		</tbody>
	</table>
</div>




<div>
	<h3>Add your answer</h3>
	<form:form action ="/addanswer/${thisQuestion.getId()}" method="POST" modelAttribute ="answer">
		<form:label path = "name">Your Answwer:</form:label>
		<form:errors path = "name"/>
		<form:input path ="name"/>
		
		<button>Answer it!!!!</button>
	</form:form>
	
</div>



<br>
<a href = "/">Dashboard</a>
</body>
</html>