<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
ResultSet rst = (ResultSet)request.getAttribute("user");
rst.next();
%>

<form action = "UpdateUser" method = "post">
<input type = "hidden" name = "id" value ="<%=rst.getInt(1) %>">
Name : <input type = "text"  name = "name" value = "<%=rst.getString(2) %>"><br>
Email : <input type = "email" name = "email" value = "<%=rst.getString(3) %>"><br>
<input type = "submit" value = "Update">
</form>
</body>
</html>