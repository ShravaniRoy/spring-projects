package com.shravaniroy.springboot.myspringbootproject.dao;

import com.shravaniroy.springboot.myspringbootproject.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

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

    @Override
   //no  @Transactional annotation here since we are doing a query
    public Student readById(Integer id) {

        return entityManager.find(Student.class, id); //we are passing entity class, primary key. if not found it returns null
    }

    @Override
    public List<Student> listAll() {
        //create a query
        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student order by lastName asc", Student.class); //descending is the default order

        //return query result
        return theQuery.getResultList();
    }

    @Override
    public List<Student> findByLastname(String theLastname) {
        // create query
        TypedQuery<Student> findByLNameQuery = entityManager.createQuery(
                "FROM Student where lastName=:theData", Student.class); //theData is like a placeholder that will fill in later.

        // set querry parameters
        findByLNameQuery.setParameter("theData", theLastname);

        //return results
        return findByLNameQuery.getResultList();
    }


}
