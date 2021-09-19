package com.amigos.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class StudentConfig {
	
	@Bean
	CommandLineRunner commandLineRunner(StudentRepository repository) {
		return args ->{
			Student mariam = new Student(
					"Mariam", 
					"mare@gmail.com", 
					LocalDate.of(2000, Month.JULY, 21) 
			);
			
			Student alex = new Student(
					"Alex", 
					"Alex@gmail.com", 
					LocalDate.of(2000, Month.MARCH, 21)
			);
			
			repository.saveAll(List.of(mariam, alex));
		};
	}

}