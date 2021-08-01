<%--
  Created by IntelliJ IDEA.
  User: Sharmila
  Date: 01-08-2021
  Time: 15:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <link rel="stylesheet" href="/resources/css/style.css">
  <script type="text/javascript" src="/resources/js/app.js"></script>

  <title>Employee Registration Page</title>
</head>
<body>
<h1>Employee Details Updation</h1>
<hr>

<div class="form"  align="center" modelattribute="employee">
  <form action="${pageContext.request.contextPath}/success" method="post">
    <table border="0" cellpadding="10">
      <tr>
        <td>Employee ID:</td>
        <td><input id="id" name="empId" value="${employee.empId}" readonly></td>
      </tr>
      <tr>
        <td>Employee name</td>
        <td><input id="name" name="empName" value="${employee.empName}"></td>
      </tr>
      <tr>
        <td>Employee age</td>
        <td><input id="age" name="empAge" value="${employee.empAge}"></td>
      </tr>
      <tr>
        <td>Employee Address</td>
        <td><input id="address" name="empAddress" value="${employee.empAddress}"></td>
      </tr>
      <tr>
        <td><input type="submit" value="Save"></td>
      </tr>
    </table>
  </form>
</div>

</body>
</html>