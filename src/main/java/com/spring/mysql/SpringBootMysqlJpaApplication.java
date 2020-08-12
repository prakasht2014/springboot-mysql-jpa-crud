package com.spring.mysql;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootMysqlJpaApplication {
	private final static Logger logger = LoggerFactory.getLogger(SpringBootMysqlJpaApplication.class);
	public static void main(String[] args) {
		logger.info("Before running SpringApplication");
		SpringApplication.run(SpringBootMysqlJpaApplication.class, args);
		logger.info("After running SpringApplication");
	}

}
