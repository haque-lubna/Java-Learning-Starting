<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%  
	response.setHeader("Cache-Control", "no-cache , no-store , must-revalidate"); //HTTP 1.1
	response.setHeader("pragma", "no-cache"); // HTTP 1.0
	response.setHeader("Expires", "0"); //proxies

	if(session.getAttribute("username") == null){
		response.sendRedirect("login.jsp");
	}

%>
welcome ${username}

<a href="videos.jsp">Videos here</a>

<form action="Logout">
	<input type="submit" value="logout">
</form>

</body>
</html>