package dat.bookingsystem.model.entities;

import java.util.Objects;

public class Booking
{
    private int bookingId;
    private int userId;
    private String itemId;
    private String bookingDate;
    private int bookingDays;
    private boolean isRented;

    public Booking(int userId, String itemId, String bookingDate, int bookingDays, boolean isRented)
    {
        this.userId = userId;
        this.itemId = itemId;
        this.bookingDate = bookingDate;
        this.bookingDays = bookingDays;
        this.isRented = isRented;
    }

    public Booking(int bookingId, int userId, String itemId, String bookingDate, int bookingDays, Boolean isRented)
    {
        this.bookingId = bookingId;
        this.userId = userId;
        this.itemId = itemId;
        this.bookingDate = bookingDate;
        this.bookingDays = bookingDays;
        this.isRented = isRented;
    }

    public int getUserId()
    {
        return userId;
    }

    public void setUserId(int userId)
    {
        this.userId = userId;
    }

    public String getItemId()
    {
        return itemId;
    }

    public void setItemId(String itemId)
    {
        this.itemId = itemId;
    }

    public String getBookingDate()
    {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate)
    {
        this.bookingDate = bookingDate;
    }

    public int getBookingDays()
    {
        return bookingDays;
    }

    public void setBookingDays(int bookingDays)
    {
        this.bookingDays = bookingDays;
    }

    public boolean isRented()
    {
        return isRented;
    }

    public void setRented(boolean rented)
    {
        isRented = rented;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return userId == booking.userId && bookingDays == booking.bookingDays && isRented == booking.isRented && Objects.equals(itemId, booking.itemId) && Objects.equals(bookingDate, booking.bookingDate);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(userId, itemId, bookingDate, bookingDays, isRented);
    }

    @Override
    public String toString()
    {
        return "Booking{" +
                "userId=" + userId +
                ", itemId='" + itemId + '\'' +
                ", bookingDate=" + bookingDate +
                ", bookingDays=" + bookingDays +
                ", isRented=" + isRented +
                '}';
    }
}
