package dat.bookingsystem.model.persistence;

import dat.bookingsystem.model.entities.User;
import dat.bookingsystem.model.exceptions.DatabaseException;

public class Facade
{
    public static User login(String username, String password, ConnectionPool connectionPool) throws DatabaseException
    {
        UserMapper userMapper = new UserMapper(connectionPool);
        return userMapper.login(username, password);
    }

    public static User createUser(String username, String password, String role, ConnectionPool connectionPool) throws DatabaseException
    {
        UserMapper userMapper = new UserMapper(connectionPool);
        return userMapper.createUser(username, password, role);
    }
}
