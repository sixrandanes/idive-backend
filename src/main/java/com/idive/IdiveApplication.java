package com.idive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.neo4j.config.EnableNeo4jRepositories;

/**
 * Created by Sylvain on 11/04/2015.
 */
@SpringBootApplication
@EnableNeo4jRepositories
public class IdiveApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(IdiveApplication.class, args);
	}
}
