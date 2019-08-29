<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
   
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
      <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    <title>Login Page</title>
</head>
<body>
    <div class="container"><br/>
  <div class=" text-center">
    <h2>Login Form</h2> 
  </div>  
  <form  action="/users/login" method="post">
    <div class="form-group">
      <label for="email">Username</label>
      
      <input type="text" name="username" class="form-control" placeholder="Enter Username" >
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" placeholder="Enter password" name="password">
    </div>
    <button type="submit" class="btn btn-success btn-block">Login</button>
  </form>
  <br/>
  <h4 class="text-danger text-center">${status}</h4>
     <button type="submit" class="btn btn-warning btn-block" onclick="location.href='./register'">Not a User? Register</button>
  
</div>
</body>
</html>