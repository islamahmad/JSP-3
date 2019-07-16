<%@ page import="com.islamahmad.data.TariffPlans" %>
<%--
  Created by IntelliJ IDEA.
  User: islam
  Date: 2019-07-13
  Time: 14:01
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Create Package</title>
</head>
<body>
<%@include file="_logout.jsp" %>
<c:set var="tps" value="${TariffPlans.getTariffPlans().values()}"></c:set>
<form id="createPackage" name="createPackage" method="POST" action="createPackage"> Create New Pacakage
    <label>Package Name <span class="requiredField">*</span><br>
        <input type="text" name="packageName" id="packageName" required placeholder="Package Name"/></label><br><br>
    <label>Choose Tariff Plan <span class="requiredField">*</span><br>
        <select id="tariffPlan" name="tariffPlan" required>
            <c:forEach items="${tps}" var="tp">
                <option selected value="${tp.name}">${tp.name}</option>
            </c:forEach>
        </select></label><br><br>
    <label>Active From <span class="requiredField">*</span><br>
        <input type="date" id="activeFrom" name="activeFrom" placeholder="active from this date"></label><br><br>
    <label>Active Until <span class="requiredField">*</span><br>
        <input type="date" id="activeUntil" name="activeUntil" placeholder="active till this date"></label><br><br>
    <label>Flat discount to the rates<br>
        <input type="text" id="discount" name="discount" placeholder="discount all tariffs in plan"></label><br><br>
    <input type="submit" name="submitPakcage" id="submitPackage" value="Create Package">
</form>

</body>
</html>
