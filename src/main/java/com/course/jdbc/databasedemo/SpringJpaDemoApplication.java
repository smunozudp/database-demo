package com.course.jdbc.databasedemo;

import com.course.jdbc.databasedemo.entity.Person;
import com.course.jdbc.databasedemo.jdbc.PersonDao;
import com.course.jdbc.databasedemo.jpa.PersonJpaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class SpringJpaDemoApplication implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private PersonJpaRepository personJpaRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringJpaDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        //Check the /resource/data.sql for the data of the table
        Person correctPerson = new Person(2, "Meli", "Chile", new Date());
        Person incorrectPerson = new Person(2, "Jack", "Chile", new Date());

        System.out.println("");
        logger.info("User by Id-> {}", this.personJpaRepository.findById(1));

//        logger.info("All users -> {}", this.dao.findAll());
//        System.out.println("");
//        logger.info("User by Id-> {}", this.dao.findById(1));
//        System.out.println("");
//        logger.info("Delete User by Id-> {}", this.dao.deleteById(3));
//        System.out.println("");
//        logger.info("Update User by Id and name, amount of row affected -> {}", this.dao.updateByIdAndName("Melita", correctPerson));
//        System.out.println("");
//        logger.info("Update User by Id and name, amount of row affected -> {}", this.dao.updateByIdAndName("Melita", correctPerson));

    }

    @Autowired
    public void setDao(PersonJpaRepository personJpaRepository) {
        this.personJpaRepository = personJpaRepository;
    }
}
