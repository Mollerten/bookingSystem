package dat.bookingsystem.model.persistence;

import dat.bookingsystem.model.entities.Booking;
import dat.bookingsystem.model.entities.Equipment;
import dat.bookingsystem.model.entities.User;
import dat.bookingsystem.model.exceptions.DatabaseException;

import java.util.List;

public class Facade
{
    public static User login(String username, String password, ConnectionPool connectionPool) throws DatabaseException
    {
        UserMapper userMapper = new UserMapper(connectionPool);
        return userMapper.login(username, password);
    }

    public static User createUser(String username, String password, Boolean isAdmin, String email, int phoneNumber, int bookingPoints, ConnectionPool connectionPool) throws DatabaseException
    {
        UserMapper userMapper = new UserMapper(connectionPool);
        return userMapper.createUser(username, password, isAdmin, email, phoneNumber, bookingPoints);
    }

    public static List<User> viewUsers(ConnectionPool connectionPool) throws DatabaseException
    {
        UserMapper userMapper = new UserMapper(connectionPool);
        return userMapper.viewUsers();
    }

    public static List<Equipment> viewEquipment(ConnectionPool connectionPool) throws DatabaseException
    {
        UserMapper userMapper = new UserMapper(connectionPool);
        return userMapper.viewEquipment();
    }

    public static int getUserId(String username, ConnectionPool connectionPool) throws DatabaseException
    {
        UserMapper userMapper = new UserMapper(connectionPool);
        return userMapper.getUserId(username);
    }

    public static void bookEquipment(int userId, String itemId, String bookingDate, int numberDays, boolean isRented, ConnectionPool connectionPool) throws DatabaseException
    {
        UserMapper userMapper = new UserMapper(connectionPool);
        userMapper.bookEquipment(userId, itemId, bookingDate, numberDays, isRented);
    }

    public static List<Booking> viewBookings(ConnectionPool connectionPool) throws DatabaseException
    {
        UserMapper userMapper = new UserMapper(connectionPool);
        return userMapper.viewBooking();
    }
}
