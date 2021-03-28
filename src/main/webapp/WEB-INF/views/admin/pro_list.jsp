<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h5>${requestScope.message}</h5>
	<table style="background-color: cyan; margin: auto;">
		<caption>Product List</caption>
		<tr>
			<th>Name</th>
			<th>Price</th>
			<th>Expiry Date</th>
			
		</tr>
		<c:forEach var="p" items="${requestScope.product_list}">
			<tr>
				<td>${p.name}</td>
				<td>${p.price}</td>
				<td>${p.expiry date}</td>
				
				<%-- <td><a href="<spring:url value='/user/update?uid=${u.id}'/>">Update</a></td> --%>
				<td><a href="<spring:url value='/product/delete?pid=${p.id}'/>">Delete</a></td>
			</tr>
		</c:forEach>

	</table>
	
</body>
</html>