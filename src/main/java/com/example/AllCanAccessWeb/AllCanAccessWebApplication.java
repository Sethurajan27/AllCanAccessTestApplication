package com.example.AllCanAccessWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class AllCanAccessWebApplication extends SpringBootServletInitializer{
	public static void main(String[] args) {
		SpringApplication.run(AllCanAccessWebApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(AllCanAccessWebApplication.class);
	}
}
