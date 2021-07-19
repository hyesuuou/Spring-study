package com.example.week02assignment.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int age;

    @Column(nullable = false)
    private String job;

    public Person(PersonRequestDto requestDto){
        this.name = requestDto.getName();
        this.age = requestDto.getAge();
        this.job = requestDto.getJob();

    }

    public void update(PersonRequestDto requestDto){
        this.name = requestDto.getName();
        this.age = requestDto.getAge();
        this.job = requestDto.getJob();
    }

}
