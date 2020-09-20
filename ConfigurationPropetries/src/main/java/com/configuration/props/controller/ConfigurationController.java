package com.configuration.props.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigurationController {

	@Value("#{${my.db: default value}}")
	private Map<String, String> name;

	@GetMapping("/hello")
	public String hello() {
		return "" + name;
	}

}
