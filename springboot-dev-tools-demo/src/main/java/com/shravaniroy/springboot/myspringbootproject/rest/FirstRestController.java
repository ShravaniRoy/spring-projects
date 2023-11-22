package com.shravaniroy.springboot.myspringbootproject.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRestController {
    //expose a route '/' to display a welcome note
    @GetMapping("/")
    public String displayNote() {
        return "Hello guys!!";
    }

    //expose a new endpoint '/workout'
    @GetMapping("/workout")
    public String getWorkoutMessage() {
        return "Keep going!";
    }

    //expose a new endpoint '/fortune'
    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "When you work hard, luck follows!";
    }
}
