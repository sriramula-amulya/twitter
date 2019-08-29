<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    <title>Success</title>
</head>
<body>
<div class="container">
  <div class="jumbotron">
    <h1>Home Page</h1> 
    <h3>Welcome ${user}</h3>
  </div>
  <form  action="/users/tweet/" method="post">
  <h3>New Tweet</h3>
    <div class="form-group">
	  <input type="text" class="form-control" name="tweet">
	</div>
    <button type="submit" class="btn btn-success btn-block">Tweet</button>
  </form> 
  <br/>
   <table border="1" class="table">
    <tr>
        <th class="text-center">Tweets</th>


    </tr>
    <c:forEach items="${tweets}" var="tweet">
        <tr>
            <td>${tweet.message}</td>

        </tr>
    </c:forEach>
</table>
  </div>
 
</body>
</html>