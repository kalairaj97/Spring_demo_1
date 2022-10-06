package com.kalairaj.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.stereotype.Service;
import com.kalairaj.student.entities.Student;
import com.kalairaj.student.repostories.StudentRepostories;
@Service
public class StudentServicelmpl implements StudentService {
	@Autowired
	StudentRepostories studentRepository;

	@Override
	public void saveStudent(Student student) {
		studentRepository.save(student);
	}

	@Override
	public StudentDto getStudentById(Long id) {
		// TODO Auto-generated method stub
		Student student=studentRepository.findById(id).get();
		StudentDto studentDto=new StudentDto();
		studentDto.setId(student.getId());
		studentDto.setFirstName(student.getFirstName());
		studentDto.setLastName(student.getLastName());
		studentDto.setEmail(student.getEmail());
		
		return studentDto;
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public void deleteStudents(Long id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
	}
	@Override
	public void updateStudent(String id, Student student) {
		studentRepository.save(student);
	}

}
