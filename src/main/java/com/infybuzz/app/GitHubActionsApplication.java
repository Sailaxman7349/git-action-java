package com.infybuzz.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitHubActionsApplication {

	@GetMapping("/welcome")
	public String welcome() {
		return "Hi babai....";
	}
	public static void main(String[] args) {
		SpringApplication.run(GitHubActionsApplication.class, args);
	}

}
