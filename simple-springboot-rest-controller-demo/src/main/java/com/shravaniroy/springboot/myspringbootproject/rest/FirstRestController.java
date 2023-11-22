package com.shravaniroy.springboot.myspringbootproject.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRestController {
    //expose a route '/' to display a welcome note
    @GetMapping
    public String displayNote() {
        return "Hello guys!!";
    }
}
