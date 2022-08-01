package dat.bookingsystem.model.persistence;

import dat.bookingsystem.model.entities.Equipment;
import dat.bookingsystem.model.entities.User;
import dat.bookingsystem.model.exceptions.DatabaseException;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

class UserMapper
{
    ConnectionPool connectionPool;

    UserMapper(ConnectionPool connectionPool)
    {
        this.connectionPool = connectionPool;
    }

    User login(String username, String password) throws DatabaseException
    {
        Logger.getLogger("web").log(Level.INFO, "");

        User user = null;

        String sql = "SELECT * FROM user WHERE username = ? AND password = ?";

        try (Connection connection = connectionPool.getConnection())
        {
            try (PreparedStatement ps = connection.prepareStatement(sql))
            {
                ps.setString(1, username);
                ps.setString(2, password);
                ResultSet rs = ps.executeQuery();
                if (rs.next())
                {
                    String email = rs.getString("email");
                    int phoneNumber = rs.getInt("phone_number");
                    int bookingPoints = rs.getInt("booking_points");
                    boolean isAdmin = rs.getBoolean("is_admin");
                    user = new User(username, password, isAdmin, email, phoneNumber, bookingPoints);
                } else {
                    throw new DatabaseException("Wrong username or password");
                }
            }
        } catch (SQLException ex) {
            throw new DatabaseException(ex, "Error logging in. Something went wrong with the database");
        }
        return user;
    }

    User createUser(String username, String password, Boolean isAdmin, String email, int phoneNumber, int bookingPoints) throws DatabaseException
    {
        Logger.getLogger("web").log(Level.INFO, "");
        User user;
        String sql = "insert into user (username, password, is_admin, email, phone_number, booking_points) values (?,?,?,?,?,?)";
        try (Connection connection = connectionPool.getConnection()) {
            try (PreparedStatement ps = connection.prepareStatement(sql)) {
                ps.setString(1, username);
                ps.setString(2, password);
                ps.setBoolean(3, isAdmin);
                ps.setString(4, email);
                ps.setInt(5, phoneNumber);
                ps.setInt(6, bookingPoints);
                int rowsAffected = ps.executeUpdate();
                if (rowsAffected == 1) {
                    user = new User(username, password, isAdmin, email, phoneNumber, bookingPoints);
                } else {
                    throw new DatabaseException("The user with username = " + username + " could not be inserted into the database");
                }
            }
        } catch (SQLException ex) {
            throw new DatabaseException(ex, "Could not insert username into database");
        }
        return user;
    }


    public List<User> viewUsers() throws DatabaseException
    {
        List<User> userList = new ArrayList<>();

        String sql = "SELECT * FROM user";

        try (Connection connection = connectionPool.getConnection()) {
            try (PreparedStatement ps = connection.prepareStatement(sql)) {
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    String username = rs.getString("username");
                    String email = rs.getString("email");
                    int phoneNumber = rs.getInt("phone_number");
                    int bookingPoints = rs.getInt("booking_points");
                    boolean isAdmin = false;
                    String password = null;

                    userList.add(new User(username, password, isAdmin, email, phoneNumber, bookingPoints));

                }
            }
        } catch (SQLException ex) {
            throw new DatabaseException(ex, "Fejl under indlæsning af requests fra databasen");
        }
        return userList;
    }

    public List<Equipment> viewEquipment() throws DatabaseException
    {
        List<Equipment> equipmentList = new ArrayList<>();

        String sql = "SELECT * FROM item";

        try (Connection connection = connectionPool.getConnection()) {
            try (PreparedStatement ps = connection.prepareStatement(sql)) {
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    String itemId = rs.getString("item_id");
                    String name = rs.getString("item_name");
                    String location = rs.getString("location");
                    Boolean isAvailable = rs.getBoolean("available");
                    String description = rs.getString("description");

                    equipmentList.add(new Equipment(itemId, name, location, isAvailable, description));
                }
            }
        } catch (SQLException ex) {
            throw new DatabaseException(ex, "Fejl under indlæsning af requests fra databasen");
        }
        return equipmentList;
    }





}
