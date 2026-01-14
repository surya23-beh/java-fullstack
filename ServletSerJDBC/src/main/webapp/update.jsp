<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action = "updateUserServlet" method = "post">
<input type = "hidden" name = "id" value = "1">
<label>Name</label>
<input type = "text" name = "name" placeholder = "enter the name" required><br>
<input type = "email" name = "email" placeholder = "enter the email" required><br><br>
<input type = "submit" value = "Update">
</form>





</body>
</html>