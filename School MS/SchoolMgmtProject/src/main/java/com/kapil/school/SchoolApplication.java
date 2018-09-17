package com.kapil.school;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kapil.school.repository.StudentRepository;

@SpringBootApplication
public class SchoolApplication {

	@Autowired
	StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SchoolApplication.class);
		app.run(args);
	}

}
