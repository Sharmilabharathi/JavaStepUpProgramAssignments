<%--
  Created by IntelliJ IDEA.
  User: Sharmila
  Date: 30-07-2021
  Time: 12:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employee Login Page</title>
</head>
<body>
<div class="form">
    <form <%--action="success" method="post"--%>>
        <table>
            <tr>
                <td>Employee ID:</td>
                <td><input id="id" name="empId"></td>
            </tr>
            <tr>
                <td>Employee Password:</td>
                <td><input type="password" name="empPassword"></td>
            </tr>
            <tr>
                <td><input type="submit" value="Submit"></td>
            </tr>
            <tr>
                <td>New Employee?:<a href="/register">Register</a></td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
