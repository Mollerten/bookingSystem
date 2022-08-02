<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page errorPage="../error.jsp" isErrorPage="false" %>

<t:pagetemplate>
    <jsp:attribute name="header">
         Create new user
    </jsp:attribute>

    <jsp:attribute name="footer">
        Create new user
    </jsp:attribute>

    <jsp:body>
        <form action="fc/createUser" method="post">
            <input type="hidden" name="command" value="createUser"/>

            <label for="username">Username:</label>
            <input type="text" id="username" name="username"
                   value="StudenterStine1999">
            <br>
            <label for="password">Password:</label>
            <input type="password" id="password" name="password"
                   value="******">
            <br>
            <label for="email">email:</label>
            <input type="text" id="email" name="email"
                   value="user@cphbusiness.com">
            <br>
            <label for="phoneNumber">Phone number:</label>
            <input type="text" id="phoneNumber" name="phoneNumber"
                   value="88888888">
            <br>
            <label for="bookingPoints">Booking points:</label>
            <input type="number" id="bookingPoints" name="bookingPoints"
                    value="100">
            <br>
            <label for="isAdmin">Make user admin:</label>
            <input type="checkbox" id="isAdmin" name="isAdmin"
                   value="true">
            <br>
            <input type="submit" value="Create user">
        </form>
    </jsp:body>

</t:pagetemplate>