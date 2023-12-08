package com.shravaniroy.springboot.myspringbootproject.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PianoInstructor implements Instructor{
    public PianoInstructor(){
        System.out.println("In constructor " + getClass().getSimpleName());
    }
    @Override
    public String getDailyExercise(){
        return "Spend 30 minutes to practice the keys!!";
    }
}
