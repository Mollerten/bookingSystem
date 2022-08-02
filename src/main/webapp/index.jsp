<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page errorPage="error.jsp" isErrorPage="false" %>

<t:pagetemplate>
    <jsp:attribute name="header">
         Welcome to the frontpage
    </jsp:attribute>

    <jsp:attribute name="footer">
        Welcome to the frontpage
    </jsp:attribute>

    <jsp:body>

        <p>Startcode for 2nd semester </p>

        <c:if test="${sessionScope.user != null && sessionScope.user.isAdmin == false}">
            <p>You are logged in as "${sessionScope.user.username}".</p>

         <%--   <form action="${pageContext.request.contextPath}/fc/viewEquipment" method="post">
                <input type="hidden" name="command" value="viewEquipment"/>
                <input type="submit" style="background-color: #000C66" class="btn btn-primary submit px-3"  value="View all equipment"/>
            </form>--%>

            <a href="${pageContext.request.contextPath}/fc/viewEquipment?command=viewEquipment">Se udstyr</a>
        </c:if>

        <c:if test="${sessionScope.user != null && sessionScope.user.isAdmin == true}">

            <a href="${pageContext.request.contextPath}/fc/createUser?command=createUserPage">Create new user</a>
            <br><br>
            <a href="${pageContext.request.contextPath}/fc/viewUsers?command=viewUsers">View all users</a>
            <br><br>
            <a href="${pageContext.request.contextPath}/fc/viewEquipment?command=viewEquipment">View equipment</a>
            <br><br>
            <a href="${pageContext.request.contextPath}/fc/viewBookings?command=viewBookings">View bookings</a>



        </c:if>



        <c:if test="${sessionScope.user == null}">
            <p>You are not logged in yet. You can do it here: <a
                    href="login.jsp">Login</a></p>

            <br><br>

            If you don't have an active account, contact an admin.
        </c:if>

    </jsp:body>

</t:pagetemplate>