<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Sharmila
  Date: 31-07-2021
  Time: 12:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Personal Information</title>
</head>
<body>
<div id="info" align="center" modelAttribute="employeeData">
        <table border="1"  cellpadding="10">
            <thead>
            <tr>
                <td>EmployeeId</td>
                <td>EmployeeName</td>
                <td>EmployeeAge</td>
                <td>EmployeeAddress</td>
                <td>Update Details</td>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td><c:out value="${employeeData.get().empId}"/></td>
                <td><c:out value="${employeeData.get().empName}"/></td>
                <td><c:out value="${employeeData.get().empAge}"/></td>
                <td><c:out value="${employeeData.get().empAddress}"/></td>
                <td><a href="${pageContext.request.contextPath}/edit/${employeeData.get().empId}">Edit</a> </td>
            </tr>
            </tbody>
        </table>
</div>
</body>
</html>
