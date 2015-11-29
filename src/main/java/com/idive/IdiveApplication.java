package com.idive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

/**
 * Created by Sylvain on 11/04/2015.
 */
@SpringBootApplication
@EntityScan(basePackageClasses = { IdiveApplication.class, Jsr310JpaConverters.class })
public class IdiveApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(IdiveApplication.class, args);
	}
}
