<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page errorPage="../error.jsp" isErrorPage="false" %>

<t:pagetemplate>
    <jsp:attribute name="header">
        View bookings
    </jsp:attribute>

    <jsp:attribute name="footer">
        View bookings
    </jsp:attribute>

    <jsp:body>

        <c:if test="${sessionScope.user == null}">
            <p>You need to log in to view bookings </p>
        </c:if>


        <c:if test="${sessionScope.user != null && sessionScope.user.isAdmin == true}">
            <form method="post">
                <table class="table table-striped">
                    <thead>
                    <tr>
                        <th>Booking ID</th>
                        <th>User ID</th>
                        <th>Item ID</th>
                        <th>First booking day</th>
                        <th>Number of days booked</th>
                        <th>Return status</th>
                    </tr>
                    </thead>

                    <tbody>
                    <c:forEach var="booking" items="${requestScope.bookingList}">
                        <tr>
                            <td>${booking.bookingId}</td>
                            <td>${booking.userId}</td>
                            <td>${booking.itemId}</td>
                            <td>${booking.bookingDate}</td>
                            <td>${booking.bookingDays}</td>
                            <td> Not returned yet</td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </form>
        </c:if>
    </jsp:body>

</t:pagetemplate>