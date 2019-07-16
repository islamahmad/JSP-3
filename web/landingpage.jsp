<%--
  Created by IntelliJ IDEA.
  User: islam
  Date: 2019-07-14
  Time: 14:35
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Welcome To Billing System</title>
</head>
<body>
<%--<%! List<Privilege> privileges = new ArrayList<>();%>--%>
<%--<% String[] privs = request.getParameterValues("privileges");--%>
<%--    for (String p : privs ) { privileges.add(Privilege.equivalent(p)); };--%>
<%--%>--%>
<header>
    <%@include file="_logout.jsp" %>
    <ul>
        <li>
            <a href="package.jsp">Create Package</a>
        </li>
        <li>
            <a href="user.jsp">Create User</a>
        </li>
        <li>
            <a href="tarrif.jsp">Create Tariff</a>
        </li>
        <li>
            <a href="tariffplan.jsp">Create Tariff Plan</a>
        </li>
    </ul>
</header>
</body>
</html>