package com.shravaniroy.springboot.myspringbootproject.common;

import org.springframework.stereotype.Component;

@Component
public class PianoInstructor implements Instructor{
    @Override
    public String getDailyExercise(){
        return "Spend 30 minutes to practice the keys!!";
    }
}
