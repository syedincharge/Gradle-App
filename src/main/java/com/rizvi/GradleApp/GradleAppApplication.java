package com.rizvi.GradleApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GradleAppApplication {

	public static void main(String[] args) {

		SpringApplication.run(GradleAppApplication.class, args);
	}
	  @GetMapping("/hello")
     public String welcome() {
		return "Hello World";
	 }
}
