<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><!-- This is import to make use of core features of JSTL -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Todo App</title>
</head>
<body>
	<div>Hey, ${name} Your Todos are</div>
	<table>
		<thead>
			<tr>
				<th>id</th>
				<th>description</th>
				<th>Target Date</th>
				<th>Is Done ?</th>
			</tr>
		</thead>
		<tbody>
		<!-- This loops over List -->
			<c:forEach items="${todos}" var="todo">
				<tr>
				<td>${todo.id}</td>
				<td>${todo.description}</td>
				<td>${todo.targetDate}</td>
				<td>${todo.done}</td>
				</tr>
				

			</c:forEach>
		</tbody>
	</table>
</body>
</html>