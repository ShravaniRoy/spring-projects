package com.shravaniroy.springboot.myspringbootproject.common;

import jdk.jfr.Label;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class MathInstructor implements Instructor{

    public MathInstructor(){
        System.out.println("In constructor " + getClass().getSimpleName());
    }
    @Override
    public String getDailyExercise(){
        return "Practice additions!!";
    }
}
