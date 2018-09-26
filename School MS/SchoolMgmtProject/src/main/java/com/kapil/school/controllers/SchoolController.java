package com.kapil.school.controllers;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.kapil.school.dto.StudentDTO;

@Controller
public class SchoolController implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -1230544637785976624L;

	@Value("${spring.application.name}")
	String appName;

	@Value("${spring.student.api}")
	String studentAPI;

	@Value("${spring.application.schoolName}")
	String schoolName;

	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("message", appName);
		model.addAttribute("schoolName", schoolName);

		RestTemplate restTemplate = new RestTemplate();
		StudentDTO[] students = restTemplate.getForObject(studentAPI + "/all", StudentDTO[].class);
		List<StudentDTO> studentList = Arrays.stream(students).collect(Collectors.toList());
		model.addAttribute("students", studentList);	
		return "index";
	}
}
