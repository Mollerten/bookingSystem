package dat.bookingsystem.model.entities;

import java.util.Objects;

public class User
{
    private String username;
    private String password;
    private boolean isAdmin;
    private String email;
    private int phoneNumber;
    private int bookingPoints;

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return isAdmin == user.isAdmin && bookingPoints == user.bookingPoints && Objects.equals(username, user.username) && Objects.equals(password, user.password) && Objects.equals(email, user.email) && Objects.equals(phoneNumber, user.phoneNumber);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(username, password, isAdmin, email, phoneNumber, bookingPoints);
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public int getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhonerNumber(int phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public int getBookingPoints()
    {
        return bookingPoints;
    }

    public void setBookingPoints(int bookingPoints)
    {
        this.bookingPoints = bookingPoints;
    }


    public User(String username, String password, boolean isAdmin, String email, int phoneNumber, int bookingPoints)
    {
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.bookingPoints = bookingPoints;
    }


    @Override
    public String toString()
    {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", isAdmin=" + isAdmin +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", bookingPoints=" + bookingPoints +
                '}';
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public boolean getIsAdmin()
    {
        return isAdmin;
    }

    public void setIsAdmin(boolean isAdmin)
    {
        this.isAdmin = isAdmin;
    }

}
