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
<title>User Details</title>
</head>
<body>
<h1>${person.getFirstName()}  ${person.getLastName()}</h1>

<hr>
<p>
License Number:  ${person.getLicense().returnLicenseNumbers }
</p>

<p>Expiration Date:  ${person.getLicense().getExpiration_date()}
</p>


<p>State: ${person.getLicense().getState()}</p>
</body>
</html>