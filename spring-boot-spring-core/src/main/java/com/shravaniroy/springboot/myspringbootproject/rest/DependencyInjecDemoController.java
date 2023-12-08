package com.shravaniroy.springboot.myspringbootproject.rest;

import com.shravaniroy.springboot.myspringbootproject.common.Instructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DependencyInjecDemoController {

    //define a private field for the dependency
    private Instructor shravanisInstructor;

    //constructor for dependency injection
    @Autowired
    public DependencyInjecDemoController (Instructor argumentInstructor){
        shravanisInstructor = argumentInstructor;
    }


    @GetMapping("/dailyPracticeWork")
    public String getDailyExercise(){
        return shravanisInstructor.getDailyExercise();
    }

}
