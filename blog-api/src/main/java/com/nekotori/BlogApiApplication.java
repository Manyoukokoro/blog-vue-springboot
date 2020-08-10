package com.nekotori;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BlogApiApplication {

	public static void main(String[] args) {
		new SpringApplication(BlogApiApplication.class).run(args);
//		SpringApplication app = new SpringApplication(BlogApiApplication.class);
//		app.run(args);
	}
}
