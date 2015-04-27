<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Formularz</title>
</head>
<body>
<p style="font-size:20px">Menu nadawania oraz odbierania Premium</p>
<br />
<form action="addPremiumServlet">
Username: <input type="text" name="username"><br />
<input type="submit" name="submit" value="dodaj/odbierz premium">
<br /><br />
<a href="adminMenu.jsp">Wróć do Menu</a>
</form>

</body>
</html>
