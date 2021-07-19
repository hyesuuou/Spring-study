package com.example.week02assignment.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class PersonRequestDto {

    private final String name;
    private final int age;
    private final String job;
}
