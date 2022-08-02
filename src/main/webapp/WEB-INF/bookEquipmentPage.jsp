<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page errorPage="../error.jsp" isErrorPage="false" %>

<t:pagetemplate>
    <jsp:attribute name="header">
        View equipment
    </jsp:attribute>

    <jsp:attribute name="footer">
        View equipment
    </jsp:attribute>

    <jsp:body>
        <form action="fc/bookEquipment" method="post">
            <input type="hidden" name="command" value="bookEquipment"/>
            <label for="bookingDate">Start date:</label>
            <input type="date" id="bookingDate" name="bookingDate"
               value="2022-12-31">
            <label for="numberDays">Number of days</label>
            <input type="number" id="numberDays" name="numberDays"
                value="1"
                min="1" max="7">
            <input type="hidden" name="itemId" value="${itemId}">
            <input type="submit" value="Book equipment">
        </form>
    </jsp:body>

</t:pagetemplate>