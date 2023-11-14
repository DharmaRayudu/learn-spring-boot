package com.example.learnspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.learnspringboot.configuration.PropertyConfiguration;

@RestController
public class PropertiesReadController {
	
	@Autowired
	private PropertyConfiguration configuration;
	
	@RequestMapping(value = "/properties")
	public PropertyConfiguration readProperties() {
		System.out.println(configuration.getKey());
		return configuration;
	}

}
