package dat.bookingsystem.control;

import dat.bookingsystem.model.config.ApplicationStart;
import dat.bookingsystem.model.entities.User;
import dat.bookingsystem.model.exceptions.DatabaseException;
import dat.bookingsystem.model.persistence.Facade;
import dat.bookingsystem.model.persistence.ConnectionPool;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Login extends Command
{
    private ConnectionPool connectionPool;

    public Login()
    {
        this.connectionPool = ApplicationStart.getConnectionPool();
    }

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws DatabaseException
    {
        HttpSession session = request.getSession();
        session.setAttribute("user", null); // adding empty user object to session scope
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        User user = Facade.login(username, password, connectionPool);
        session = request.getSession();
        session.setAttribute("user", user); // adding user object to session scope
        return "index";
    }
}