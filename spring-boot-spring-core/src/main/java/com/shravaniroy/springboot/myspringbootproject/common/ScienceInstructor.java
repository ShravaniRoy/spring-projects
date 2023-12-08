package com.shravaniroy.springboot.myspringbootproject.common;

import org.springframework.stereotype.Component;

@Component
public class ScienceInstructor implements Instructor{
    @Override
    public String getDailyExercise(){
        return "Practice respiratory system in different living beings!!";
    }
}
