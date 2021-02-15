package com.course.jdbc.databasedemo.jpa;

import com.course.jdbc.databasedemo.entity.Person;
import com.course.jdbc.databasedemo.jdbc.PersonDao;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
//Repository
//Transaccion -> this should be in the service repository
public class PersonJpaRepository {

    //connect to the database
    @PersistenceContext
    EntityManager entityManager;

    public Person findById(int id){
        return entityManager.find(Person.class, id);
    }
}
