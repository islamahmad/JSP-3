<%--
  Created by IntelliJ IDEA.
  User: islam
  Date: 2019-07-13
  Time: 13:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="WEB-INF/resources/style.css">
    <title>Create Tariff</title>
</head>
<body>
<%@include file="_logout.jsp" %>
<form id="tariffCreation" name="tariffCreation" method="POST" action="createTariff">Create a new tariff<br><br>
    <label> Tariff Name <span class="requiredField">*</span><br>
        <input type="text" name="tariffName" id="tariffName" required="required" placeholder="tariff name">
    </label><br><br>
    <label> Off Peak Cost <span class="requiredField">*</span><br>
        <input type="text" name="tariffOffPeak" id="tariffOffPeak" required="required" placeholder="accepts fractions">
    </label><br><br>
    <label> Peak Cost <span class="requiredField">*</span><br>
        <input type="text" name="tariffPeak" id="tariffPeak" required="required" placeholder="accepts fractions">
    </label><br><br>
    <label> Tariff Billing Base <span class="requiredField">*</span><br>
        <select name="billableGroup" id="billableGroup">
            <option value="LOCAL_SMS">Local SMS</option>
            <option value="INTERNATIONAL_SMS">International SMS</option>
            <option value="LOCAL_CALLS">Local Calls</option>
            <option value="INTERNATIONAL_CALLS">International Calls</option>
            <option value="LOCAL_INTERNET">Local Internet</option>
            <option value="ROAMING_LOCAL_SM">Roaming SMS</option>
            <option value="ROAMING_INTERNATIONAL_SMS">Roaming International SMS</option>
            <option value="ROAMING_LOCAL_CALLS">Roaming Calls</option>
            <option value="ROAMING_INTERNATIONAL_CALLS">Roaming International Calls</option>
            <option value="ROAMING_INTERNET">Roaming Internet</option>
        </select>
    </label>
    <br><br>
    <input type="submit" value="Create Tariff">
</form>
</body>
</html>