<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <style>.carousel-inner > .item > img { width:100%; height:100%; } 
  nav.navbar.navbar-inverse {
  <style>.carousel-inner > .item > img { width:100%; height:100%; } 
  nav.navbar.navbar-inverse {
    min-height: 55px;
}
 </style>
 
</head>
<body>

<nav class="navbar navbar-inverse ">
  <div class="container-fluid">
      <div class="navbar-header">
      <a class="navbar-brand" href="/spring-mvc-boot/">Fresh Veggie's</a>
    </div>
    <ul class="nav navbar-nav">
      <li ><a href="/spring-mvc-boot/">Home</a></li>
      <li><a href="AboutUs">About Us</a></li>
      <li class="active"><a href="Contact">Contact Us</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="user/register"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="user/login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
      <li><a href="admin/login"><span class="glyphicon glyphicon-log-in-admin"></span>Admin Login</a></li>
	 </ul>
  </div>
</nav>


          <div class="Contact"> 

         <div class = "row-3">
          <div class = "col-4">

          <form>
          
          <div class="contact-info">
            <h1>To reach our customer service team please email or call us at:</h1>
            <p1>"usersservices@freshveggie.com"</p1><br/>
            <p1> Contact no : 02132445588  </p1> 
            <p> or </p>
          </div>
          
          <div class="contact-info1">
             <label for="uname">Username:</label>
             <input type="text" class="form-control" id="uname" placeholder="Enter username" name="uname" required/>
             <br/>
                 <label for="email-id">Email ID:</label>
                 <input type="text" class="form-control" id="email" placeholder="Enter Email Id" name="email" required/>
             <br/>
                 <label for="exampleFormControlTextarea1">Message</label>
                 <textarea class="form-control" id="exampleFormControlTextarea1" rows="5"></textarea>
             <br/>
                 <button type="submit" class="btn btn-primary">Submit</button>
                 </div>
          
          </form>


</body>
</html>