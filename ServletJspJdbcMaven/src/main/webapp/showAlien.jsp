<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@page import="com.dsi.web.model.Alien" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">

<%
	//Alien a1 = (Alien) request.getAttribute("alien"); //using request dispatche
	Alien a1 = (Alien) session.getAttribute("alien"); // using redirect
	out.println(a1);
%>

</body>
</html>