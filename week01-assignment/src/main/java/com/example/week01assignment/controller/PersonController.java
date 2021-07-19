package com.example.week01assignment.controller;

import com.example.week01assignment.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @GetMapping("/myInfo")
    public Person getMyInfo(){
        Person person = new Person();
        person.setName("김혜수");
        person.setAddress("대한민국");
        person.setAge(24);
        return person;
    }

}
