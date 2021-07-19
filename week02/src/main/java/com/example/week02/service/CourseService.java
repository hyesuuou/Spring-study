package com.example.week02.service;

import com.example.week02.domain.Course;
import com.example.week02.domain.CourseRepository;
import com.example.week02.domain.CourseRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service // 스프링에게 이 클래스는 서비스임을 명시함
public class CourseService {

    // final : 서비스에게 꼭 필요한 녀석임을 명시함.
    private final CourseRepository courseRepository;

    // 생성자를 통해 Service 클래스를 만들때 courseRepositoy를 넣어주도록 함
    // 스프링에게 알려줌
//   // public CourseService(CourseRepository courseRepository) {
//        this.courseRepository = courseRepository;
//    }

    // SQL 쿼리가 일어나야 함을 알려줌.
    // id: 업데이트할 것이 무엇인지
    // course: 업데이트할 내용이 무엇인ㅈ
    @Transactional
    public Long update(Long id, CourseRequestDto requestDto){
        Course course1 = courseRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("해당 아이디가 존재하지 않습니다.")
        );
        course1.update(requestDto); // course 클래스 안의 메서드 update 사
        return course1.getId();
    }
}
