package com.idive;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Sylvain on 11/04/2015.
 */
@SpringBootApplication
public class Application {

    static final Logger logger = LogManager.getLogger(Application.class);

    public static void main(String[] args) throws Exception {
        logger.info(">>>>>>>>>>>>LAAAA");
        SpringApplication.run(Application.class, args);
    }
}
