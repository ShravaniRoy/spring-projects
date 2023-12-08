package com.shravaniroy.springboot.myspringbootproject.common;

import org.springframework.stereotype.Component;

@Component
public class MathInstructor implements Instructor{

    public MathInstructor(){
        System.out.println("In constructor " + getClass().getSimpleName());
    }
    @Override
    public String getDailyExercise(){
        return "Practice additions!!";
    }
}
