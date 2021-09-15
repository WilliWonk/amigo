package com.amigos.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
	
	@GetMapping
	public List<Student> getStudents() {
		
 //da bi funkcionisalo ukucaj: localhost:8080/api/v1/student
		return List.of(
				new Student(1L, "Mare", "mare@gmail.com", 
						LocalDate.of(2000, 12, 21), 22
						),
				new Student(1L, "Mare", "mare@gmail.com", 
						LocalDate.of(2000, 12, 21), 22
						)
					);
	}
}
