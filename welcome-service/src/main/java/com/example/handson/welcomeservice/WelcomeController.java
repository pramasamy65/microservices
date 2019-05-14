package com.example.handson.welcomeservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/welcome")
@RefreshScope
public class WelcomeController {

	@Value("${spring.cloud.config.server.shared.attribute}")
	String message;

	@GetMapping("/configServer/welcomeMessage")
	public String welcomeMessageFromConfigServer() {
		return "Message from Config Server : " + message;
	}

}
