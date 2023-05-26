package com.example.solargy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.socket.config.annotation.EnableWebSocket;

@SpringBootApplication
@EnableWebSocket
public class SolargyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SolargyApplication.class, args);
	}

}
