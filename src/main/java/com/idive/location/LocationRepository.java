package com.idive.location;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "locations")
public interface LocationRepository extends CrudRepository<Location, Long> {

}