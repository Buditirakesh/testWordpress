<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My Home Page</title>
</head>
<body>
<h2>Hello User</h2>

<a href="helloCtrl">Hello Servelt</a><br/>

<font color="red">${requestScope.ERROR }</font>

<form action="loginCtrl" method="post">
	User Id : <input type="text" name="userName"/><br/>
	Password : <input type="password" name="password"/><br/>
	<input type="submit" value="Login"/>
</form>

<!-- 
1. How to create JSP page
2. How to create a servlet
	a. goto project =-> right click -> click on servlet
3. how to create database connection with your java/ project
4. Create DAO layer and connect with servlet
5. how to retrive value from request / client in servlet(Controller)
6. How the same value can be find in JSP
7. how to get data from database by pasing value and shown in jsp for client
8. Session handling
 -->
</body>
</html>