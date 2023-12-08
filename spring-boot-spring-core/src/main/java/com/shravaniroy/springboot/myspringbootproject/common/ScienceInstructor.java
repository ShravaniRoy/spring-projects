package com.shravaniroy.springboot.myspringbootproject.common;

import org.springframework.stereotype.Component;

@Component
public class ScienceInstructor implements Instructor{

    public ScienceInstructor(){
        System.out.println("In constructor " + getClass().getSimpleName());
    }
    @Override
    public String getDailyExercise(){
        return "Practice respiratory system in different living beings!!";
    }
}
