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

    <c:if test="${sessionScope.user == null}">
      <p>You need to log in to view equipment </p>
    </c:if>


    <c:if test="${sessionScope.user != null}">
      <form method="post">
        <table class="table table-striped">
          <thead>
            <tr>
              <th>ID</th>
              <th>Name</th>
              <th>Description</th>
              <th>Location</th>
              <th>Available</th>
            </tr>
          </thead>

          <tbody>
            <c:forEach var="equipment" items="${requestScope.EquipmentList}">
              <tr>
                <td>${equipment.itemId}</td>
                <td>${equipment.name}</td>
                <td>${equipment.description}</td>
                <td>${equipment.location}</td>
                <td>${equipment.isAvailable}</td>
                <td><button class="btn btn-primary submit px-3" style="background-color: #000C66"
                            name="bookEquipment"
                            value="${equipment.itemId}"
                            value="${}"
                            formaction="${pageContext.request.contextPath}/fc/bookEquipment">Book equipment</button></td>
              </tr>
            </c:forEach>
          </tbody>
        </table>
      </form>
    </c:if>
  </jsp:body>

</t:pagetemplate>