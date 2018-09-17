package com.kapil.school.controllers;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class SchoolController implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -1230544637785976624L;

	@Value("${spring.application.name}")
	String appName;

	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("appName", appName);
		return "home";
	}
}
