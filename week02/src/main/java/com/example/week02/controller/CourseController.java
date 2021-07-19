package com.example.week02.controller;

import com.example.week02.domain.Course;
import com.example.week02.domain.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController // json 응답
public class CourseController {

    private final CourseRepository courseRepository;

    @GetMapping("/api/courses")
    public List<Course> getCourses(){
        return courseRepository.findAll();
    }

    /*
    getCourses 메서드
    - /api/courses 로 Get 요청이 오면 실행되는 메서드
    - courseRepository에 있는 모든 내용을 반환(return)한다.
     */

}
