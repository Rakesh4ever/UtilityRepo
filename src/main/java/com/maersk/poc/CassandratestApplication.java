package com.maersk.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;


@SpringBootApplication
@EnableCassandraRepositories
public class CassandratestApplication { 
	public static void main(String[] args) {
		SpringApplication.run(CassandratestApplication.class, args);
	}

}
