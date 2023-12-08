package com.shravaniroy.springboot.myspringbootproject.common;

import org.springframework.stereotype.Component;

@Component
public class MathInstructor implements Instructor{
    @Override
    public String getDailyExercise(){
        return "Practice additions!!";
    }
}
