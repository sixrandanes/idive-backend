package com.idive.dive;

import java.io.Serializable;
import java.util.Objects;

import com.idive.divelog.DiveLog;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;

import com.idive.location.Location;

/**
 * Created by Sylvain on 17/04/2015.
 */
@NodeEntity
public class Dive implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7743979365714676329L;

	@GraphId
	private Long id;
	private int maxDepth;
	private int averageDepth;
	private int duration;
	private Location location;
	private DiveLog diveLog;
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public DiveLog getDiveLog() {
		return diveLog;
	}

    public void setDiveLog(DiveLog diveLog) {
        this.diveLog = diveLog;
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
				&& Objects.equals(averageDepth, castOther.averageDepth) && Objects.equals(duration, castOther.duration)
				&& Objects.equals(location, castOther.location);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		return Objects.hash(id, maxDepth, averageDepth, duration, location);
	}

	@Override
	public String toString() {
		return "Dive [id=" + id + ", maxDepth=" + maxDepth + ", averageDepth=" + averageDepth + ", duration=" + duration
				+ ", location=" + location + "]";
	}
}
