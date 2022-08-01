package dat.bookingsystem.control;

import dat.bookingsystem.model.config.ApplicationStart;
import dat.bookingsystem.model.entities.User;
import dat.bookingsystem.model.exceptions.DatabaseException;
import dat.bookingsystem.model.persistence.ConnectionPool;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Date;

public class BookEquipment extends Command
{
    private ConnectionPool connectionPool;


    public BookEquipment()
    {
        this.connectionPool = ApplicationStart.getConnectionPool();
    }
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws DatabaseException
    {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");

      //  Date bookingDate = request.getParameter("bookingDate");
        int numberDays = Integer.parseInt(request.getParameter("numberDays"));
        String itemId = request.getParameter("itemId");


        return itemId;
    }
}
