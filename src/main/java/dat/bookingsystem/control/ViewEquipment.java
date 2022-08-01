package dat.bookingsystem.control;

import dat.bookingsystem.model.config.ApplicationStart;
import dat.bookingsystem.model.entities.Equipment;
import dat.bookingsystem.model.entities.User;
import dat.bookingsystem.model.exceptions.DatabaseException;
import dat.bookingsystem.model.persistence.ConnectionPool;
import dat.bookingsystem.model.persistence.Facade;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class ViewEquipment extends Command
{
    private ConnectionPool connectionPool;

    public ViewEquipment(){this.connectionPool = ApplicationStart.getConnectionPool();}

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws DatabaseException {

        List<Equipment> equipmentList = null;

        try
        {
            Facade.viewEquipment(connectionPool);
        } catch (DatabaseException e) {
            e.printStackTrace();
        }

        request.setAttribute("equipmentList",equipmentList);

        return "viewEquipment";
    }
}