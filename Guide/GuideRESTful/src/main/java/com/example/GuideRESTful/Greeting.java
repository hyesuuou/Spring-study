package com.example.GuideRESTful;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class Greeting {

    private final long id;
    private final String content;

    public Greeting(long id, String content){
        this.id = id;
        this.content = content;
    }
}
