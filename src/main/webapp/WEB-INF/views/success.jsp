<%--
  Created by IntelliJ IDEA.
  User: Sharmila
  Date: 28-07-2021
  Time: 12:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Success Page</title>
</head>
<body>
<div>
<h2> ${empName} has been  registered/updated successfully</h2>
<a href="${pageContext.request.contextPath}/">home</a>
</div>

</body>
</html>