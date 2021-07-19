package com.example.week02.domain;

import org.springframework.data.jpa.repository.JpaRepository;

// 인터페이스 -> 클래스의 메서드 모음집
public interface CourseRepository extends JpaRepository<Course, Long> {
}