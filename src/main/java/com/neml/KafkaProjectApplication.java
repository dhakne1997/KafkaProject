package com.neml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan(basePackages = "com.neml")
public class KafkaProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaProjectApplication.class, args);
	}

}
