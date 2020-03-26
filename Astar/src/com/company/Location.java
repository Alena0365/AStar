package com.company;

import java.util.Objects;

public class Location
{
    /** X coordinate of this location. **/
    public int xCoord;

    /** Y coordinate of this location. **/
    public int yCoord;


    /** Creates a new location with the specified integer coordinates. **/
    public Location(int x, int y)
    {
        xCoord = x;
        yCoord = y;
    }

    /** Creates a new location with coordinates (0, 0). **/
    public Location()
    {
        this(0, 0);
    }


    @Override
    public int hashCode() {
        return Objects.hash(xCoord,yCoord);
    }

    @Override
    public boolean equals(Object coord) {
        Location lock = (Location) coord;
        if (this.xCoord == lock.xCoord && this.yCoord == lock.yCoord) return true;
        return false;
    }
}
