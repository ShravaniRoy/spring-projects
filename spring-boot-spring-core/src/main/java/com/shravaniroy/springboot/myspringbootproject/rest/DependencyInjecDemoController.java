package com.shravaniroy.springboot.myspringbootproject.rest;

import com.shravaniroy.springboot.myspringbootproject.common.Instructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DependencyInjecDemoController {

    //define a private field for the dependency
    private Instructor shravanisinstructor;

    //constructor for dependency injection
    @Autowired
    public DependencyInjecDemoController (Instructor argumentInstructor){ //as of now we only have one bean that implements Instructor hence it is autowired.
        shravanisinstructor = argumentInstructor;
    }

    @GetMapping("/dailyPracticeWork")
    public String getDailyExercise(){
        return shravanisinstructor.getDailyExercise();
    }

}
