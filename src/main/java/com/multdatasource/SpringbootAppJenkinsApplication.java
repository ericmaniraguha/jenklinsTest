package com.multdatasource;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootAppJenkinsApplication implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(SpringbootAppJenkinsApplication.class);

    public static void main(String[] args) {
        logger.info("Starting the Spring Boot application...");
        SpringApplication.run(SpringbootAppJenkinsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("Running the application with provided arguments.");
        // Add your logic to be executed upon application startup
    }
}
