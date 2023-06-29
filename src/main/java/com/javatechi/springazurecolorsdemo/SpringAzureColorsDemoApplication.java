package com.javatechi.springazurecolorsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAzureColorsDemoApplication {

	@GetMapping("/message")
	public String message(){
		return "Congrats !!  you have deployed at Azure";

	}

	public static void main(String[] args) {
		SpringApplication.run(SpringAzureColorsDemoApplication.class, args);
	}

}
