package com.example.seedstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(scanBasePackages = {"com.example.seedstarter"})
public class SeedstarterApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeedstarterApplication.class, args);
	}

}
