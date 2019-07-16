package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinDemoApplication.class, args);
	}

	@RequestMapping(value="/demo", method = RequestMethod.GET)
	public String demoResponse() {
		return "demo to test";
	}
}
