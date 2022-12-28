package com.cjc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@EnableAdminServer
@SpringBootApplication
public class AdminServerSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminServerSpringBootApplication.class, args);
	}

}
