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
               value="2022-07-29"
               min="2018-01-01" max="2018-12-31">

            <label for="numberDays">Number of days</label>
            <input type="number" id="numberDays" name="numberDays"
                value="1"
                min="1" max="7">

            <input type="hidden" name="itemId" value="${sessionScope.equipment.itemId}">

        </form>


        <div class="month">
            <ul>
                <li class="prev">&#10094;</li>
                <li class="next">&#10095;</li>
                <li>August<br><span style="font-size:18px">2021</span></li>
            </ul>
        </div>

        <ul class="weekdays">
            <li>Mo</li>
            <li>Tu</li>
            <li>We</li>
            <li>Th</li>
            <li>Fr</li>
            <li>Sa</li>
            <li>Su</li>
        </ul>

        <ul class="days">
            <li>1</li>
            <li>2</li>
            <li>3</li>
            <li>4</li>
            <li>5</li>
            <li>6</li>
            <li>7</li>
            <li>8</li>
            <li>9</li>
            <li>10</li>
            <li>11</li>
            <li>12</li>
            <li>13</li>
            <li>14</li>
            <li>15</li>
            <li>16</li>
            <li>17</li>
            <li>18</li>
            <li>19</li>
            <li>20</li>
            <li>21</li>
            <li>22</li>
            <li>23</li>
            <li>24</li>
            <li>25</li>
            <li>26</li>
            <li>27</li>
            <li>28</li>
            <li>29</li>
            <li>30</li>
            <li>31</li>
        </ul>
    </jsp:body>

</t:pagetemplate>