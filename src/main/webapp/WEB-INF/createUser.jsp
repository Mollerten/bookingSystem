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

    <form action="fc/createUser" method="post">
        <input type="hidden" name="command" value="createUser"/>
        <body>

        <div class="wrapper">

            <div class="form_container">
                <form name="form">
                    <div class="heading">
                        <h2>Opret Bruger</h2>
                        <b>Opret venligst en bruger <br> for at sende en forespørgsel</b>
                    </div>
                    <div class="form_wrap">
                        <div class="form_item">
                            <label for="username">Brugernavn</label>
                            <input type="text" id="username" name="username" required/>
                        </div>
                    </div>
                    <div class="form_wrap">
                        <div class="form_item">
                            <label for="email">Email: </label>
                            <input type="email" id="email" name="email" required/>
                        </div>
                    </div>

                    <div class="form_wrap">
                        <div class="form_item">
                            <label for="password">Kodeord: </label>
                            <input type="password" id="password" name="password" required/>
                        </div>
                    </div>

                    <div class="form_wrap ">
                        <div class="form_item">
                            <label for="phoneNumber">Telefonnummer:</label>
                            <input type="number" id="phoneNumber" name="phoneNumber" required>
                        </div>
                    </div>

                    <div class="form_wrap ">
                        <div class="form_item">
                            <label for="bookingPoints">Booking points:</label>
                            <input type="number" id="bookingPoints" name="bookingPoints" required>
                        </div>
                    </div>

                    <div class="btn">
                        <input type="submit" value="Opret bruger">
                    </div>
                </form>
            </div>

        </body>

</t:pagetemplate>