package controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@GetMapping("/app")

public class appController {
	@GetMapping("/name")
	public String myName() {
	    return "Hello SpringBoot.";
	}

    @GetMapping("/profile")
	public String myProfile() {
		return "Hello my name is Kasun.";
	}
}
