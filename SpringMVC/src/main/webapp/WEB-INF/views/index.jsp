<%--
  Created by IntelliJ IDEA.
  User: muhammad.nizar01
  Date: 8/10/2017
  Time: 4:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/login" method="post">
    <table>
        <tr>
            <td>
                <input type="text" name="username" class="" id="date" placeholder="insert username" data-large-mode="true" data-large-default="true" data-modal="true" data-init-set="false" data-min-year="1900"/>
            </td>
        </tr>
        <tr>
            <td>
                <input class="" id="phonenumber" type="text" name="phonenumber"  placeholder="insert password">
            </td>
        </tr>
    </table>

    <input type="submit" class="sign-btn"  name="submitStep1" value="Next" />
</form>
</body>
</html>