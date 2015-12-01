package com.idive.location;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;

/**
 * Created by Sylvain on 18/04/2015.
 */
@NodeEntity
public class Location implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3794446039190603075L;

	@GraphId
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(final Object other) {
		if (this == other) {
			return true;
		}
		if (!Location.class.isInstance(other)) {
			return false;
		}
		Location castOther = Location.class.cast(other);
		return Objects.equals(id, castOther.id);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public String toString() {
		return "Location [id=" + id + "]";
	}

}
