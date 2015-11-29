package com.idive.dive;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "dives", path = "dives")
public interface DiveRepository extends PagingAndSortingRepository<Dive, Long> {

}