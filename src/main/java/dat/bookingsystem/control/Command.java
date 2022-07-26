package dat.bookingsystem.control;

import dat.bookingsystem.model.exceptions.DatabaseException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

abstract class Command
{

    private static HashMap<String, Command> commands;

    private static void initCommands() {
        commands = new HashMap<>();
        commands.put("login", new Login());
        commands.put("logout", new Logout());
        commands.put("about", new About());
        commands.put("createUser", new CreateUser());
        commands.put("viewUsers", new ViewUsers());
        commands.put("viewEquipment", new ViewEquipment());
        commands.put("bookEquipment", new BookEquipment());
        commands.put("bookEquipmentPage", new BookEquipmentPage());
        commands.put("createUserPage", new CreateUserPage());
        commands.put("viewBookings", new ViewBookings());
    }

    static Command from( HttpServletRequest request ) {
        String commandName = request.getParameter( "command" );
        if ( commands == null ) {
            initCommands();
        }
        return commands.getOrDefault(commandName, new UnknownCommand() );   // unknowncommand er default.
    }

    abstract String execute( HttpServletRequest request, HttpServletResponse response ) 
            throws DatabaseException;

}
