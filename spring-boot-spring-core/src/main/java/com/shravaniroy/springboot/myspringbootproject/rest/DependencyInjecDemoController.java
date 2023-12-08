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
    private Instructor someonesInstructor;

    //constructor for dependency injection
    @Autowired
    public DependencyInjecDemoController (
            @Qualifier("pianoInstructor") Instructor argumentInstructor,
            @Qualifier("pianoInstructor") Instructor theAnotherInstructor
    ){
        System.out.println("In constructor " + getClass().getSimpleName());
        shravanisInstructor = argumentInstructor;
        someonesInstructor = theAnotherInstructor;
    }


    @GetMapping("/dailyPracticeWork")
    public String getDailyExercise(){

        return shravanisInstructor.getDailyExercise();
    }

    @GetMapping("/check")
    public String checking(){

        return "Comparing two beans: shravanisInstructor == someonesInstructor " + (shravanisInstructor == someonesInstructor);
    }

}
