package com.kalairaj.student.service;
import java.util.List;

import com.kalairaj.student.entities.Student;

public interface StudentService {	
	void saveStudent(Student student);
	StudentDto getStudentById(Long id);
	void deleteStudents(Long id);
	List<Student> findAll();
	void updateStudent(String id, Student student);
}

