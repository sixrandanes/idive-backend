package com.idive.location;

import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "locations")
public interface LocationRepository extends GraphRepository<Location> {

}