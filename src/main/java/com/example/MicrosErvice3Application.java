package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
public class MicrosErvice3Application {

	public static void main(String[] args) {
		SpringApplication.run(MicrosErvice3Application.class, args);
	}
}

@RestController
class DummyController {

	@Value("${server.port}")
	private int serverPort;

	@GetMapping("/")
	public String home() {
		return "Microservice on port: " + serverPort;
	}

	@GetMapping("/test")
	public String someLogic() {
		return "Some hard stuff is done here";
	}

}