<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2> User List </h2>
<table border = "1">
<tr>
<th> ID</th>
<th> Name</th>
<th> Email</th>
</tr>
<%
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/simpledb",
	"root",
	"QWERTY88");

Statement st = con.createStatement();
ResultSet rs = st.executeQuery("Select * from simpletable3");
while(rs.next()){
	%>
	<tr>
	<td> <%= rs.getInt("id") %></td>
	<td> <%= rs.getString("name") %></td>
	<td> <%= rs.getString("email") %></td>
	</tr>
	<%
	}
	con.close();
	rs.close();
	st.close();
%>

</table>
</body>
</html>