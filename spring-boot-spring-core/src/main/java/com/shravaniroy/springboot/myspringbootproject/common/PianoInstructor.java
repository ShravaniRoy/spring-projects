package com.shravaniroy.springboot.myspringbootproject.common;

import org.springframework.stereotype.Component;

@Component
public class PianoInstructor implements Instructor{
    public PianoInstructor(){
        System.out.println("In constructor " + getClass().getSimpleName());
    }
    @Override
    public String getDailyExercise(){
        return "Spend 30 minutes to practice the keys!!";
    }
}
