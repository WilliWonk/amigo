package com.amigos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AmigosCodeFirstAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmigosCodeFirstAppApplication.class, args);
	}
	
	@GetMapping
	public String hello() {
		return "<h1>Hallo Welt</h1>";
	}

}
