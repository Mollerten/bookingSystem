package dat.bookingsystem.control;

import dat.bookingsystem.model.config.ApplicationStart;
import dat.bookingsystem.model.entities.User;
import dat.bookingsystem.model.exceptions.DatabaseException;
import dat.bookingsystem.model.persistence.ConnectionPool;
import dat.bookingsystem.model.persistence.Facade;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CreateUser extends Command
{
    private ConnectionPool connectionPool;

    public CreateUser()
    {
        this.connectionPool = ApplicationStart.getConnectionPool();
    }

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws DatabaseException
    {
    //    HttpSession session = request.getSession();
    //    session.setAttribute("user", null); // adding empty user object to session scope
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        Boolean isAdmin = Boolean.valueOf(request.getParameter("isAdmin"));
        String email = request.getParameter("email");
        int phoneNumber = Integer.parseInt(request.getParameter("phoneNumber"));
        int bookingPoints = Integer.parseInt(request.getParameter("bookingPoints"));

        Facade.createUser(username, password, isAdmin, email, phoneNumber, bookingPoints, connectionPool);
    //    session = request.getSession();
    //    session.setAttribute("user", user); // adding user object to session scope
        return "index";
    }

}
