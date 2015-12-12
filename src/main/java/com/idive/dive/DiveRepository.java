package com.idive.dive;

import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "dives", path = "dives")
public interface DiveRepository extends GraphRepository<Dive> {

}