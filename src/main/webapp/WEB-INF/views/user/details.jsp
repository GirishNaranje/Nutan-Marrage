<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<title>Online Appointment</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <style>.carousel-inner > .item > img { width:100%; height:100%; } 
  nav.navbar.navbar-inverse {
    min-height: 50px;
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
      <li><a href="Contact">Contact Us</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="user/logout"><span class="glyphicon glyphicon-user"></span>Log Out</a></li>
     
    </ul>
  </div>
</nav>
<h5> Users Details :${sessionScope.message}</h5>
<div class="container" align="left">
		<div class="jumbotron">
			<h1>
				<img src="${pageContext.request.contextPath}/image/honeycrisp-apple_1600.jpg"
					height="200" width="200" />Apple 120.00rs
					<h4>
		<a href="<spring:url value='/product/addtocart'/>">Add to Cart</a>
	                </h4>
			</h1>
			<h1>
				<img src="${pageContext.request.contextPath}/image/mango.jpg"
					height="200" width="200" />Mango 135.00rs
					<h4>
		<a href="<spring:url value='/product/addtocart'/>">Add to Cart</a>
	                </h4>
			</h1>
			<h1>
				<img src="${pageContext.request.contextPath}/image/oranges.jpg"
					height="200" width="200" />Oranges 75.00rs
					<h4>
		<a href="<spring:url value='/product/addtocart'/>">Add to Cart</a>
	                </h4>
			</h1>
			<h1>
				<img src="${pageContext.request.contextPath}/image/custardapple.jpg"
					height="200" width="200" />Custard 220.00rs
					<h4>
		<a href="<spring:url value='/product/addtocart'/>">Add to Cart</a>
	                </h4>
			</h1>
			<h1>
				<img src="${pageContext.request.contextPath}/image/lemon.jpg"
					height="200" width="200" />Lemon 25.00rs
					<h4>
		<a href="<spring:url value='/product/addtocart'/>">Add to Cart</a>
	                </h4>
			</h1>
			<h1>
				<img src="${pageContext.request.contextPath}/image/Pineapple.jpg"
					height="200" width="200" />Pineapple 175.00rs
					<h4>
		<a href="<spring:url value='/product/addtocart'/>">Add to Cart</a>
	                </h4>
			</h1>
			<h1>
				<img src="${pageContext.request.contextPath}/image/Banana.jpg"
					height="200" width="200" />Banana 55.00rs
					<h4>
		<a href="<spring:url value='/product/addtocart'/>">Add to Cart</a>
	                </h4>
			</h1>
			<h1>
				<img src="${pageContext.request.contextPath}/image/dragon.jpg"
					height="200" width="200" />Dragon 275.00rs
					<h4>
		<a href="<spring:url value='/product/addtocart'/>">Add to Cart</a>
	                </h4>
			</h1>
			<h1>
				<img src="${pageContext.request.contextPath}/image/Melon.jpg"
					height="200" width="200" />Melon 80.00rs
					<h4>
		<a href="<spring:url value='/product/addtocart'/>">Add to Cart</a>
	                </h4>
			</h1>
			<h1>
				<img src="${pageContext.request.contextPath}/image/Strawberrie.png"
					height="200" width="200" />Strawberrie 450.00rs
					<h4>
		<a href="<spring:url value='/product/addtocart'/>">Add to Cart</a>
	                </h4>
			</h1>
			<h1>
				<img src="${pageContext.request.contextPath}/image/Watermelon.jpg"
					height="200" width="200" />Watermelon 80.00rs
					<h4>
		<a href="<spring:url value='/product/addtocart'/>">Add to Cart</a>
	                </h4>
			</h1>
		</div>
</body>
</html>