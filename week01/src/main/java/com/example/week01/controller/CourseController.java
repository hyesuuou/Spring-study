package com.example.week01.controller;

import com.example.week01.prac.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


// json으로 응답하는 자동응답기 임을 알려줌
@RestController
public class CourseController {

    // /courses 에 Get방식으로 요청을 보내면 주는 응답 (Json으로 변환)
    @GetMapping("/courses")
    public Course getCourses() {
        Course course = new Course();
        course.setTitle("웹개발의 봄 스프링");
        course.setDays(35);
        course.setTutor("남병관");
        return course;
    }
}
