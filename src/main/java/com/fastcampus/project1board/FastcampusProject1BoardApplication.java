package com.fastcampus.project1board;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class FastcampusProject1BoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(FastcampusProject1BoardApplication.class, args);
	}

}
