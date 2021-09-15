package com.amigos;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amigos.student.Student;

@SpringBootApplication
@RestController
public class AmigosCodeFirstAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmigosCodeFirstAppApplication.class, args);
	}
	
	@GetMapping
	public List<Student> hello() {
		return List.of(
				new Student(1L, "Mare", "mare@gmail.com", 
						LocalDate.of(2000, 12, 21), 22
						),
				new Student(1L, "Mare", "mare@gmail.com", 
						LocalDate.of(2000, 12, 21), 22
						),
				new Student(1L, "Mare", "mare@gmail.com", 
						LocalDate.of(2000, 12, 21), 22
						),
				new Student(1L, "Mare", "mare@gmail.com", 
						LocalDate.of(2000, 12, 21), 22
						),
				new Student(1L, "Mare", "mare@gmail.com", 
						LocalDate.of(2000, 12, 21), 22
						),
				new Student(1L, "Mare", "mare@gmail.com", 
						LocalDate.of(2000, 12, 21), 22),
				new Student(1L, "Mare", "mare@gmail.com", 
						LocalDate.of(2000, 12, 21), 22
						)
					);
	}
}
