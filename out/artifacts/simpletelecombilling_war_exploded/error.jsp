<%--
  Created by IntelliJ IDEA.
  User: islam
  Date: 2019-07-13
  Time: 07:36
  To change this template use File | Settings | File Templates.
--%>
<%@page isErrorPage="true" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Error</title>
<%--    handle different custom errors here if you have time --%>
    <% new com.islamahmad.handleError(response); %>

</head>
<body>
<h1>An Error Occurred</h1>
<p style="color: red"> <%= exception.getMessage()%> </p>
<hr>
<p style="color: green"> <%= exception.getStackTrace()%> </p>
<hr>
<p style="color: blue"> <%= exception.getCause()%> </p>
</body>
</html>
