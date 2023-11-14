package com.example.learnspringboot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.learnspringboot.model.Cources;

@RestController
public class CourcesController {
	
	@Value("${app.name}")
	private String appName;
	
	@RequestMapping("/cources")
	public List<Cources> retriveCources(){
		 return Arrays.asList(
				 new Cources(1, "Java", "Sun", appName),
				 new Cources(2, "Spring", "Rod", appName),
				 new Cources(3, "Spring Boot", "Rod John", appName),
				 new Cources(4, "Spring Data JPA", "Dharma", appName),
				 new Cources(5, "JDBC", "Rayudu", appName)
				 );
	}

}
