package com.shravaniroy.springboot.myspringbootproject.config;

import com.shravaniroy.springboot.myspringbootproject.common.Instructor;
import com.shravaniroy.springboot.myspringbootproject.common.YogaInstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SubjectConfig {

    @Bean("yogi") //we can give a custom bean id here
    public Instructor yogaInstructor (){
        return new YogaInstructor();
    }
}
