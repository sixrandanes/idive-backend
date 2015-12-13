package com.idive.divelog;

import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;

import java.io.Serializable;

/**
 * Created by Sylvain on 13/12/2015.
 */
@NodeEntity
public class DiveLog implements Serializable {

    private static final long serialVersionUID = 2884374551429393908L;

    @GraphId
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
