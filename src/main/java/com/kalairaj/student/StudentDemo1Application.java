package com.kalairaj.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.kalairaj.student.repostories.StudentRepostories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = StudentRepostories.class)
public class StudentDemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(StudentDemo1Application.class, args);
	}

}
