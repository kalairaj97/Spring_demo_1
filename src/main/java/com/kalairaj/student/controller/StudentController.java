package com.kalairaj.student.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kalairaj.student.entities.Student;
import com.kalairaj.student.service.StudentDto;
import com.kalairaj.student.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService studentService;
	
	@PostMapping("/student")
	public ResponseEntity<Object> createIncomingSample(@RequestBody StudentDto studentDto) {
		Student student = new Student();
		student.setId(studentDto.getId());
		student.setfirstName(studentDto.getFirstName());
		student.setLastName(studentDto.getLastName());
		student.setEmail(studentDto.getEmail());
		studentService.saveStudent(student);
		return ResponseEntity.ok("Saved Successfully!");
	}
	
	@GetMapping("/student/{id}")
	public ResponseEntity<Object> getStudentById(@PathVariable Long id) {
		return ResponseEntity.ok(studentService.getStudentById(id));
	}
	
	@GetMapping("/students")
	public List<Student> findAll(){
		return studentService.findAll();
		
	}
	@DeleteMapping("/delstudent/{id}")
	public String deleteStudent(@PathVariable("id") Long id){
		studentService.deleteStudents(id);
		return "Delete successfully";
	}
	@RequestMapping("/hello")
	public String hello(){
		return "Hello";
	}
	@PutMapping("/updatestudents/{id}")
	public void updateStudentsData(@RequestBody Student student, @PathVariable String id ) {
			studentService.updateStudent(id, student);
	}
}
