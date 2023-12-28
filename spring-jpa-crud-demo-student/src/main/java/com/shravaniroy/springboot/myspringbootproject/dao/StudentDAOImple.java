package com.shravaniroy.springboot.myspringbootproject.dao;

import com.shravaniroy.springboot.myspringbootproject.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAOImple implements StudentDAO{

    //define field for entity manager
    private EntityManager entityManager;

    // inject entity manager using constructor
    @Autowired
    public StudentDAOImple(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    // implement save method
    @Override
    @Transactional //since we are performing an update
    public void save(Student student) {
        entityManager.persist(student);
    }
}
