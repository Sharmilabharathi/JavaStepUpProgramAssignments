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
    <title>Display Page</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>

<div id="tabs">
    <ul class="nav nav-tabs" role="tablist">
        <li role="presentation" ><a href="#info" aria-controls="info" role="tab" data-toggle="tab">Personal Information</a></li>
        <li role="presentation"><a href="#list" aria-controls="list" role="tab" data-toggle="tab">Employee List</a></li>
    </ul>
    <div class="tab-content">
    <div role="tabpanel" class="tab-pane" id="info" modelAttribute="employeeData">
        <table border="1">
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
                <td><c:out value="${employeeData.empId}"/></td>
                <td><c:out value="${employeeData.empName}"/></td>
                <td><c:out value="${employeeData.empAge}"/></td>
                <td><c:out value="${employeeData.empAddress}"/></td>
                <td><a href="${pageContext.request.contextPath}/edit/${employeeData.empId}">Edit</a> </td>
            </tr>
            </tbody>
        </table>
    </div>
    <div role="tabpanel" class="tab-pane" id="list"  modelattribute="employeeList">
        <table border="1">
            <thead>
            <tr>
                <td>EmployeeId</td>
                <td>EmployeeName</td>
                <td>EmployeeAge</td>
                <td>EmployeeAddress</td>
                <td>Delete Employee</td>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${employeeList}" var="employees">
            <tr>
                <td><c:out value="${employees.empId}"/></td>
                <td><c:out value="${employees.empName}"/></td>
                <td><c:out value="${employees.empAge}"/></td>
                <td><c:out value="${employees.empAddress}"/></td>
                <td><a href="${pageContext.request.contextPath}/delete/${employees.empId}">Delete</a> </td>
            </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
    </div>
</div>
</body>
</html>
