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
		<caption>User List</caption>
		<tr>
			<th>Name</th>
			<th>Email</th>
			<th>Password</th>
			<th>Mobile NO</th>
			<th>City</th>
			<th>Street</th>
			<th>Landmark</th>
		</tr>
		<c:forEach var="u" items="${requestScope.user_list}">
			<tr>
				<td>${u.name}</td>
				<td>${u.email}</td>
				<td>${u.password}</td>
				<td>${u.mobile_no}</td>
				<td>${u.city}</td>
				<td>${u.street}</td>
				<td>${u.landmark}</td>
				<%-- <td><a href="<spring:url value='/user/update?uid=${u.id}'/>">Update</a></td> --%>
				<td><a href="<spring:url value='/user/delete?uid=${u.id}'/>">Delete</a></td>
			</tr>
		</c:forEach>

	</table>
	
</body>
</html>