package com.spring.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import com.spring.web.entity.Manager;
import com.spring.web.service.ManagerRepository;

@SpringBootApplication
public class SpringWebApplication extends SpringBootServletInitializer {
	
	
	@Autowired
	private ManagerRepository repo;
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringWebApplication.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(SpringWebApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner initDB() {
		return (args) -> {
			repo.save(new Manager("priya", 50000L));
			repo.save(new Manager("Pooja", 90010L));
			repo.save(new Manager("Ram", 60010L));
		};
	}

}