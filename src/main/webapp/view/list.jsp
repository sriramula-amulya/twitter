<!doctype html>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
     <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
     <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    <title>Document</title>
</head>
<body>
<div class="container">
  <div class="jumbotron text-center">
    <h1>Employees List</h1> 
  </div>
	<table border="1"  class="table">
	    <tr>
	        <th>Employee Id</th>
	        <th> Name</th>
	    </tr>
	    <c:forEach items="${employees}" var="employee">
	        <tr>
	            <td>${employee.getId()}</td>
				<td>${employee.getName()}</td>
	        </tr>
	    </c:forEach>
	
	</table>
</div>
</body>
</html>