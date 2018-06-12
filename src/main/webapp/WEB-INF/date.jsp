<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "d" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/style.css">
<script type="text/javascript" src="js/date.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Date Page</title>
</head>
<body>
	<h1 class="date">Date is <d:out value = "${date}"/><a href="/">Back</a></h1>
</body>
</html>