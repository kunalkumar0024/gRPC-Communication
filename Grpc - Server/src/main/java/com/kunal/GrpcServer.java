package com.kunal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GrpcServer {
	@GetMapping("/")
	String hello() {
		return "Server App is active";
	}
	public static void main(String[] args) {
		SpringApplication.run(GrpcServer.class, args);
	}
}
