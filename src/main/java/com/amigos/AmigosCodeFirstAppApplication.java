package com.amigos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
	@RestController 
		//da li ovo treba
public class AmigosCodeFirstAppApplication {
	//ovo je pocetak aplikacije
	public static void main(String[] args) {
		SpringApplication.run(AmigosCodeFirstAppApplication.class, args);
	}
}
