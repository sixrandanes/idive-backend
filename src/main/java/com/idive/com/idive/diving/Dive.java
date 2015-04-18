package com.idive.com.idive.diving;

import com.idive.com.idive.Location.Location;

/**
 * Created by Sylvain on 17/04/2015.
 */
public class Dive {

    private long id;
    private int maxDepth;
    private int averageDepth;
    private int time;
    private Location location;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getMaxDepth() {
        return maxDepth;
    }

    public void setMaxDepth(int maxDepth) {
        this.maxDepth = maxDepth;
    }

    public int getAverageDepth() {
        return averageDepth;
    }

    public void setAverageDepth(int averageDepth) {
        this.averageDepth = averageDepth;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
