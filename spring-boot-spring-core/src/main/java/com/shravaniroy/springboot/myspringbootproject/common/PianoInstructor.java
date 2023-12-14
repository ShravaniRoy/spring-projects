package com.shravaniroy.springboot.myspringbootproject.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class PianoInstructor implements Instructor{
    public PianoInstructor(){
        System.out.println("In constructor " + getClass().getSimpleName());
    }

    //defining init method
    @PostConstruct
    public void pianoInitMethod(){
        System.out.println("In init method of " + getClass().getSimpleName());
    }

    //defining the destroy method
    @PreDestroy
    public void pianoDestroyMethod(){
        System.out.println("In destroy method of " + getClass().getSimpleName());
    }

    @Override
    public String getDailyExercise(){
        return "Spend 30 minutes to practice the keys!!";
    }
}
