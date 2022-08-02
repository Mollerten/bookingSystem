package dat.bookingsystem.control;

import dat.bookingsystem.model.config.ApplicationStart;
import dat.bookingsystem.model.entities.Booking;
import dat.bookingsystem.model.entities.Equipment;
import dat.bookingsystem.model.exceptions.DatabaseException;
import dat.bookingsystem.model.persistence.ConnectionPool;
import dat.bookingsystem.model.persistence.Facade;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class ViewBookings extends Command
{
    private ConnectionPool connectionPool;


    public ViewBookings()
    {
        this.connectionPool = ApplicationStart.getConnectionPool();
    }

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws DatabaseException
    {
        List<Booking> bookingList = null;

        try
        {
            bookingList = Facade.viewBookings(connectionPool);
        } catch (DatabaseException e) {
            e.printStackTrace();
        }

        request.setAttribute("bookingList",bookingList);

        return "viewBookings";
    }
}
