package com.example.SpringPrac.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int age;

    @Column(nullable = false)
    private String job;

    // 생성자
    public User(String name, int age, String job){
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public User(UserRequestDto requestDto){
        this.name = requestDto.getName();
        this.age = requestDto.getAge();
        this.job = requestDto.getJob();
    }

    // update
    public void update(UserRequestDto requestDto){
        this.name = requestDto.getName();
        this.age = requestDto.getAge();
        this.job = requestDto.getJob();
    }

}
