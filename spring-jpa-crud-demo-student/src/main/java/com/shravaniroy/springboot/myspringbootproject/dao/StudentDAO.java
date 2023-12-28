package com.shravaniroy.springboot.myspringbootproject.dao;

import com.shravaniroy.springboot.myspringbootproject.entity.Student;

import java.util.List;

public interface StudentDAO {
    void save(Student theStudent);

    Student readById(Integer id);

    List<Student> listAll();

    List<Student> findByLastname(String theLastname);
}
