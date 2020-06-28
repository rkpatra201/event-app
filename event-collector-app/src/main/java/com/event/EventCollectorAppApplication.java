package com.event;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class EventCollectorAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventCollectorAppApplication.class, args);
	}

}
