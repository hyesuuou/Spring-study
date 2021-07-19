package com.example.week02.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

// Course에 관한 데이터를 가지고 다니는
@Getter
@Setter
@RequiredArgsConstructor
public class CourseRequestDto {

    private final String title;
    private final String tutor;
}
