<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello</title>
</head>
<body>
	<form method="post" action="TestServlet">
		<table>
			<tr>
				<td>User Name</td>
				<td><input type="text" name="uname"></td>
			<tr>
			<tr>
				<td>Password</td>
				<td><input type="Password" name="Password"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" name="login"></td>
			</tr>
		</table>
	</form>
</body>
</html>