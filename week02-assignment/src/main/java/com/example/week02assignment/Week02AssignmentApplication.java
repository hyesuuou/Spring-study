package com.example.week02assignment;

import com.example.week02assignment.domain.PersonRepository;
import com.example.week02assignment.service.PersonService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Week02AssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(Week02AssignmentApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(PersonRepository personRepository, PersonService personService) {
		return (args) -> {

		};
	}
}
