package com.kalairaj.student.repostories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.kalairaj.student.entities.Student;

public interface StudentRepostories extends JpaRepository<Student, Long>{
	
}