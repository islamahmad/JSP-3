<%--
  Created by IntelliJ IDEA.
  User: islam
  Date: 2019-07-13
  Time: 14:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<form id="userCreation" name="userCreation" method="POST" action="createUser">Create a new tariff<br><br>
    <label> Userame <span class="requiredField">*</span><br>
        <input type="text" name="userame" id="userame" required="required" placeholder="username">
    </label><br><br>
    <label> Password <span class="requiredField">*</span><br>
        <input type="password" name="password" id="password" required="required" placeholder="password">
    </label><br><br>
    <label> Password Confirmation <span class="requiredField">*</span><br>
        <input type="password" name="passwordConf" id="passwordConf" required="required" placeholder="password confirmation">
    </label><br><br>
    <label> User Access <span class="requiredField">*</span><br>
        <select name="privileges" id="privileges" multiple>
            <option value="CREATE_USER">Create User</option>
            <option value="CREATE_PACKAGE">Create Package</option>
            <option value="CREATE_TARIFF">Create Tariff</option>
            <option value="CREATE_TARIFF_PLAN">Create Tariff Plan</option>
            <option value="VIEW">View Only</option>
        </select>
    </label>
    <br><br>
    <input type="submit" value="Create User">
</form>