package dat.bookingsystem.control;

import dat.bookingsystem.model.exceptions.DatabaseException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CreateUserPage extends Command
{
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws DatabaseException
    {
        return "createUser";
    }
}
