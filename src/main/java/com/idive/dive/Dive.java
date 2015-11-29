package com.idive.dive;

import java.io.Serializable;
import java.util.Objects;

import com.idive.location.Location;

/**
 * Created by Sylvain on 17/04/2015.
 */
public class Dive implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7743979365714676329L;

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

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(final Object other) {
		if (this == other) {
			return true;
		}
		if (!Dive.class.isInstance(other)) {
			return false;
		}
		Dive castOther = Dive.class.cast(other);
		return Objects.equals(id, castOther.id) && Objects.equals(maxDepth, castOther.maxDepth)
				&& Objects.equals(averageDepth, castOther.averageDepth) && Objects.equals(time, castOther.time)
				&& Objects.equals(location, castOther.location);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		return Objects.hash(id, maxDepth, averageDepth, time, location);
	}

	@Override
	public String toString() {
		return "Dive [id=" + id + ", maxDepth=" + maxDepth + ", averageDepth=" + averageDepth + ", time=" + time
				+ ", location=" + location + "]";
	}
}
