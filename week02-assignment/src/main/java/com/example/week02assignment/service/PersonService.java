package com.example.week02assignment.service;

import com.example.week02assignment.domain.Person;
import com.example.week02assignment.domain.PersonRepository;
import com.example.week02assignment.domain.PersonRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class PersonService {

    private final PersonRepository personRepository;

    @Transactional
    public Long update(Long id, PersonRequestDto requestDto){
        Person person1 = personRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("해당 아이디가 존재하지 않습니다")
        );
        person1.update(requestDto);
        return person1.getId();
    }
}
