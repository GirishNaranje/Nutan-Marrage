<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Insert Product Details</h1>

	<form:form method="post" modelAttribute="product">
		<table>
			<tr>
				<td>Name</td>
				<td><form:input path="name" /></td>
				<td style="color: red"><form:errors path="name" /></td>
			</tr>
			<tr>
				<td>Price</td>
				<td><form:input path="price" /></td>
				<td style="color: red"><form:errors path="price" /></td>
			</tr>
			<tr>
				<td>Exp Date</td>
				<td><form:input path="xDate" /></td>
				<td style="color: red"><form:errors path="xDate" /></td>
			</tr>
			<tr>
				<td>Quntity</td>
				<td><form:input path="quntity" /></td>
				<td style="color: red"><form:errors path="quntity" /></td>
			</tr>
			
				<td><input type="submit" value="Procced" /></td>
			</tr>
		</table>
	</form:form>
		</body>
</html>