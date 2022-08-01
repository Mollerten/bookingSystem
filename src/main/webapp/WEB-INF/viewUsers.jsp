<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page errorPage="../error.jsp" isErrorPage="false" %>

<t:pagetemplate>
    <jsp:attribute name="header">
        View users
    </jsp:attribute>

    <jsp:attribute name="footer">
        View users
    </jsp:attribute>

    <jsp:body>

        <c:if test="${sessionScope.user == null}">
            <p>You need to log in to view all users </p>
        </c:if>

        <c:if test="${sessionScope.user.isAdmin == false}">
            <p>You don't have permission to view all users </p>
        </c:if>

        <c:if test="${sessionScope.user.isAdmin == true}">
            <form method="post">
                <table class="table table-striped">
                    <thead>
                    <tr>
                        <th>User</th>
                        <th>Email</th>
                        <th>Phone number</th>
                        <th>Booking points</th>
                    </tr>
                    </thead>

                    <tbody>
                        <c:forEach var="user" items="${requestScope.userList}">
                            <tr>
                                <td>${user.username}</td>
                                <td>${user.email}</td>
                                <td>${user.phoneNumber}</td>
                                <td>${user.bookingPoints}</td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </form>
        </c:if>
    </jsp:body>

</t:pagetemplate>