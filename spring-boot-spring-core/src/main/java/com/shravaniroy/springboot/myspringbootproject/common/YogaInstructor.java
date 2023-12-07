package com.shravaniroy.springboot.myspringbootproject.common;

import com.shravaniroy.springboot.myspringbootproject.common.Instructor;
import org.springframework.stereotype.Component;

@Component
public class YogaInstructor implements Instructor {

    @Override
    public String getDailyExercise(){
        return "Practice surya namaskar for 108 times!!";
    }
}
