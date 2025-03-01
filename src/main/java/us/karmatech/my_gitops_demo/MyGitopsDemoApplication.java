package us.karmatech.my_gitops_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MyGitopsDemoApplication {

	@GetMapping("/hello")
	public String hello() {
		return "Hello World? How are you?";
	}

	public static void main(String[] args) {
		SpringApplication.run(MyGitopsDemoApplication.class, args);
	}

}
