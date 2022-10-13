<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>name</th>
			<th>mobile</th>
			<th>age</th>
			<th>referralCode</th>
		</tr>
		<c:forEach items="${list}" var="ref">
			<tr>
				<td>${ref.name}</td>
				<td>${ref.mobile}</td>
				<td>${ref.age}</td>
				<td>${ref.referralCode}</td>

			</tr>
		</c:forEach>
	</table>
</body>
</html>