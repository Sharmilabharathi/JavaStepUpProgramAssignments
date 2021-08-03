<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Sharmila
  Date: 31-07-2021
  Time: 12:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Display Page</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>
<h1 style="text-align: center">Employee Page</h1>
<div id="loginDetails"  modelAttribute="employeeData">
    <h5 style="text-align: right">Hi ${employeeData.empName}, Welcome to B Organization Limited</h5>
</div>

<div id="tabs">
    <div class="tab-content" id="navBars">
    <ul class="nav nav-tabs" role="tablist">
        <li  role="presentation"><a href="#employeeHome" class="nav-link" role="tab"  data-toggle="tab" aria-controls="employeeHome">Home</a></li>
        <li  role="presentation"><a href="#info" class="nav-link" aria-controls="info" role="tab" data-toggle="tab">Personal Information</a></li>
        <li  role="presentation"><a href="#list" class="nav-link" aria-controls="list" role="tab" data-toggle="tab">Employee List</a></li>
    </ul>
    </div>
    <br><br>
    <div class="tab-content" id="tabContent">
    <div role="tabpanel" class="tab-pane" id="employeeHome" >
        Organizational Goals:<br><br>
        1. An organization with clear roles and responsibilities is critical:
        We have started reorganizing ourselves effective April 1st this year to make ourselves
        more agile and effective. It is imperative that both organization and Business Unit (BU)
        goals are aligned and communicated clearly at an individual level.<br><br>
        2.  Investment in practices and new age technologies: We have identified
        and started building resilient and new age practices in every BU. Given the evolving needs of the market,
        we have identified and are investing in six BIG BETS which we believe will help us to ‘Scale and Soar.’<br><br>
        These include:<br>
        i. Electric Autonomous Connected Vehicles<br>
        ii. 5G<br>
        iii. Med Tech (Digital Health)<br>
        iv. Digital Manufacturing<br>
        v. Digital Products and Services<br>
        vi. Sustainability<br>
        Inclusion also means coming together to define a way forward.
        We want to go deeper to define who we are as an organization,
        what we stand for, what we aspire to, and how we would like to define our collective future.
    </div>
    <div role="tabpanel" class="tab-pane" id="info" modelAttribute="employeeData">
            <table class="table">
                <thead>
                <tr>
                    <th>EmployeeId</th>
                    <th>EmployeeName</th>
                    <th>EmployeeAge</th>
                    <th>EmployeeAddress</th>
                    <th>Update Details</th>
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
        <table class="table">
            <thead>
            <tr>
                <th>EmployeeId</th>
                <th>EmployeeName</th>
                <th>EmployeeAge</th>
                <th>EmployeeAddress</th>
                <th>Delete Employee</th>
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
