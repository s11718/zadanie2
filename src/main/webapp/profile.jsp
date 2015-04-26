<%@ page import="domain.User" %>
<%@ page import="service.Registration" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Profile</title>
</head>
<body>
<p style="font-size:20px">Profil użytkownika<p><br>
<%  
	String username = (String) session.getAttribute("username");
	out.println("<p><b>Typ konta: </b>" + Registration.getUser(username).getType() +
			 "<br><b>Username: </b>" + Registration.getUser(username).getUsername() +
			 "<br><b>Email: </b>" + Registration.getUser(username).getEmail() +
			 "<br>"
			);
%>

<p><a href="index.jsp">Przejdź do menu</a></p>
</body>
</html>