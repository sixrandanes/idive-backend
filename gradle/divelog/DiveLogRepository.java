package com.idive.divelog;

import com.idive.dive.Dive;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by Sylvain on 13/12/2015.
 */
@RepositoryRestResource(path = "dives")
public interface DiveLogRepository extends GraphRepository<Dive> {

}
