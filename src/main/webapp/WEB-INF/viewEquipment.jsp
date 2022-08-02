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
              <th></th>
            </tr>
          </thead>

          <tbody>
            <c:forEach var="equipment" items="${requestScope.equipmentList}">
              <tr>
                <td>${equipment.itemId}</td>
                <td>${equipment.name}</td>
                <td>${equipment.description}</td>
                <td>${equipment.location}</td>
                <td>Available</td>

                <td><button class="btn btn-primary submit px-3" style="background-color: #000C66"
                            input type="hidden" name="itemId" value="${equipment.itemId}"
                            formaction="${pageContext.request.contextPath}/fc/bookEquipmentPage?command=bookEquipmentPage">Book equipment</button></td>
              </tr>
            </c:forEach>
          </tbody>
        </table>
      </form>
    </c:if>
  </jsp:body>

</t:pagetemplate>