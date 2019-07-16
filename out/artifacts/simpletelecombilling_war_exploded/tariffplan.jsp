
<%--
  Created by IntelliJ IDEA.
  User: islam
  Date: 2019-07-13
  Time: 14:02
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Create Tariff Plan</title>
</head>
<body>
<%@include file="_logout.jsp" %>
<%@ page import="com.islamahmad.data.Tariffs" %>
<c:set var="tfs" value="${Tariffs.getTariffs().values()}"/>
<form id="createTariffPlan" name="createTariffPlan" method="POST" action="createTariffPlan">
    <label>Tariff Plan Name <span class="requiredField">*</span><br>
        <input type="text" name="tariffPlanName" id="tariffPlanName" required
               placeholder="Tariff Plan Name"/></label><br><br>
    <label>Choose Tariffs <span class="requiredField">*</span><br>
        <select id="tariffs" name="tariffs" required multiple>
            <c:forEach items="${tfs}" var="tf">
                <option value="${tf.name}">${tf.name}</option>
            </c:forEach>
        </select></label><br><br>
    <input type="submit" value="Create Tariff Plan">
</form>

</body>
</html>
