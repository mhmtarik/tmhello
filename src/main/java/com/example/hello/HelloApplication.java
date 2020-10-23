package com.example.hello;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
@SpringBootApplication
public class HelloApplication {
	@RequestMapping("/")
        String home() {
        return "Hello from Tarik M!";
        }
	public static void main(String[] args) throws Exception {
		SpringApplication.run(HelloApplication.class, args);
	}

}
