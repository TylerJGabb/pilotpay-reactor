package com.gabb.study.persistance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//implicitly uses H2 database in memory until datasource is specified in config
@SpringBootApplication
public class PersistanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersistanceApplication.class, args);
	}

}
