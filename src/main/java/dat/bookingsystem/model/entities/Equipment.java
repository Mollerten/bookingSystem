package dat.bookingsystem.model.entities;

import java.util.Objects;

public class Equipment
{
    private String itemId;
    private String name;
    private String location;
    private Boolean isAvailable;
    private String description;

    public Equipment(String itemId, String name, String location, Boolean isAvailable, String description)
    {
        this.itemId = itemId;
        this.name = name;
        this.location = location;
        this.isAvailable = isAvailable;
        this.description = description;
    }

    public String getItemId()
    {
        return itemId;
    }

    public void setItemId(String itemId)
    {
        this.itemId = itemId;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getLocation()
    {
        return location;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }

    public Boolean getAvailable()
    {
        return isAvailable;
    }

    public void setAvailable(Boolean available)
    {
        isAvailable = available;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Equipment equipment = (Equipment) o;
        return Objects.equals(itemId, equipment.itemId) && Objects.equals(name, equipment.name) && Objects.equals(location, equipment.location) && Objects.equals(isAvailable, equipment.isAvailable) && Objects.equals(description, equipment.description);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(itemId, name, location, isAvailable, description);
    }

    @Override
    public String toString()
    {
        return "Equipment{" +
                "itemId='" + itemId + '\'' +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", isAvailable=" + isAvailable +
                ", description='" + description + '\'' +
                '}';
    }
}

