<%@page import="com.itfilms.model.Movie"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>IT films</title>
</head>
<body>

	<h1>Select a film</h1>
	<form action="./Home" method="post">
		<input name="title" type="text"></input> <input type="submit"
			value="Search"></input>
	</form>
	<%-- <%
		if (request.getAttribute("movie") != null) {
			/* Movie movie = (Movie) request.getAttribute("movie"); */
	%> --%>
	<c:if test="${empty movie}">
		<h1>Please choose a movie!</h1>
	</c:if>
	<c:if test="${not empty movie}">


		<img style="float: left" src="<c:out value="${movie.posterUrl}" />">
		<h1>
			<c:out value="${movie.title}" />
		</h1>
		<p>
			<c:out value="${movie.year}" />
		</p>
		<p>
			<c:out value="${movie.genre}" />
		</p>

	</c:if>
	<%-- 	<%
		}
	%> --%>


</body>
</html>