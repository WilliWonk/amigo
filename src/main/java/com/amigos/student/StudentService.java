package com.amigos.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	private final StudentRepository studentRepository;

	@Autowired
	public StudentService(StudentRepository studentRepository){
		this.studentRepository = studentRepository;
	}
	
	public List<Student> getStudents() {
		return studentRepository.findAll();
		
		 //da bi funkcionisalo ukucaj: localhost:8080/api/v1/student
		  /*
	return List.of(
	new Student(1L, "Mare", "mare@gmail.com", LocalDate.of(2000, 12, 21), 22));
		*/
			}
}
