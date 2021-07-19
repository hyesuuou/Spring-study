package com.example.week02assignment.controller;

import com.example.week02assignment.domain.Person;
import com.example.week02assignment.domain.PersonRepository;
import com.example.week02assignment.domain.PersonRequestDto;
import com.example.week02assignment.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class PersonController {

    private final PersonRepository personRepository;
    private final PersonService personService;

    // 친구목록 조회
    @GetMapping("/api/persons")
    public List<Person> getPersons(){
        return personRepository.findAll();
    }

    // 친구 생성
    @PostMapping("/api/persons")
    public Person createPerson(@RequestBody PersonRequestDto requestDto){
        Person person = new Person(requestDto);
        return personRepository.save(person);
    }

    // 친구 정보 변경
    @PutMapping("/api/persons/{id}")
    public Long updatePerson(@PathVariable Long id, @RequestBody PersonRequestDto requestDto){
        return personService.update(id, requestDto);
    }

    @DeleteMapping("/api/persons/{id}")
    public Long deletePerson(@PathVariable Long id){
        personRepository.deleteById(id);
        return id;
    }

}
