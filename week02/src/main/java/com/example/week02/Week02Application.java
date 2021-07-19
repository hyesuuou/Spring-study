package com.example.week02;

import com.example.week02.domain.Course;
import com.example.week02.domain.CourseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.List;

@EnableJpaAuditing
@SpringBootApplication
public class Week02Application {

	public static void main(String[] args) {
		SpringApplication.run(Week02Application.class, args);
	}
	// Week02Application.java 의 main 함수 아래에 붙여주세요.
	@Bean
	public CommandLineRunner demo(CourseRepository repository) {
		return (args) -> {

			Course course1 = new Course("웹 개발의 봄 Spring", "남병관");
			repository.save(course1);

			// select * from course
			List<Course> courseList = repository.findAll();

			for(int i=0; i<courseList.size(); i++){
				Course c = courseList.get(i);
				System.out.println(c.getTitle());
				System.out.println(c.getTutor());
			}
		};
	}
}
