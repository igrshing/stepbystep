<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html class="" lang="en"><head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Foundation | Welcome</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/foundation.css">
<link href="${pageContext.request.contextPath}/resources/css/foundation-icons.css" rel="stylesheet" type="text/css">
 
<meta class="foundation-mq"></head>
<body>
 
	<form action = "/snack/authenticate" method = "post">
		<div class="row">
			<div class="small-3 columns">
				<label for="loginField" class="middle">Login</label>
			</div>
			<div class="small-9 columns">
				<input id="loginField" placeholder="Put your login here" type="text" name="login">
			</div>
			
		</div>
		<div class="row">
			<div class="small-3 columns">
				<label for="middle-label" class="middle">Password</label>
			</div>
			<div class="small-9 columns">
				<input id="passwordField" placeholder="Put your password here" type="password" name="password">
			</div>
		</div>
		
		<input class="button large" type="submit" placeholder="Put your password here">
	</form>

</body></html>