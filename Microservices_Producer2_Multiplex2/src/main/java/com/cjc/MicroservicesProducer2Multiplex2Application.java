package com.cjc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroservicesProducer2Multiplex2Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesProducer2Multiplex2Application.class, args);
	}

}
