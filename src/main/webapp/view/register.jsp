<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
     <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
</head>
<body>
<div class="container"><br/>
  <div class=" text-center">
    <h2>Register Form</h2> 
  </div>  
  <form  action="/users/register" method="post">
    <div class="form-group">
      <label for="email">Username</label>
      
      <input type="text" name="username" class="form-control" placeholder="Enter Username" >
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" placeholder="Enter password" name="password">
    </div>
    <button type="submit" class="btn btn-success btn-block">Submit</button><br/>
  </form>
       <button type="submit" class="btn btn-warning btn-block" onclick="location.href='./login'">Already a User? Login</button>
  
  <br/>
</body>
</html>