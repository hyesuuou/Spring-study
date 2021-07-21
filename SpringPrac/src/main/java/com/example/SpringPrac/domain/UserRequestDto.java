package com.example.SpringPrac.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class UserRequestDto {

    private final String name;
    private final int age;
    private final String job;
}
