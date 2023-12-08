package com.shravaniroy.springboot.myspringbootproject.common;

import com.shravaniroy.springboot.myspringbootproject.common.Instructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class YogaInstructor implements Instructor {

    public YogaInstructor(){
        System.out.println("In constructor " + getClass().getSimpleName());
    }

    @Override
    public String getDailyExercise(){
        return "Practice surya namaskaras for 108 times!!";
    }
}
