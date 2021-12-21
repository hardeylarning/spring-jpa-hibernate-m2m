package com.rocktech.studentservicejpa.service;

import com.rocktech.studentservicejpa.model.Student;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

// Entity manager is manual
@Repository
@Transactional
public class StudentDao {
    @PersistenceContext
    EntityManager entityManager;

    public void insertStudent(Student student){
        entityManager.persist(student);
    }
}
