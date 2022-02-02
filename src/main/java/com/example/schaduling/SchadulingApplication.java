package com.example.schaduling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SchadulingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchadulingApplication.class, args);
	}

}
