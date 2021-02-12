package com.course.jdbc.databasedemo.jdbc;

import com.course.jdbc.databasedemo.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    //select * from person;
    public List<Person> findAll(){
       return jdbcTemplate.query("select * from person",
                new BeanPropertyRowMapper<Person>(Person.class));
    }
    //select * from person where id=x;
    public Person findById(int id){
       return jdbcTemplate.queryForObject("select * from person where id =?",
               new BeanPropertyRowMapper<Person>(Person.class), id);
    }
    //delete from person where id=x;
    public int deleteById(int id){
       return jdbcTemplate.update("delete from person where id =?", id);
    }
    //Update name of table person;
    public int updateByIdAndName(String newName, Person person){
       return jdbcTemplate.update("update person set name=? where id = ? and name = ?",
               newName, person.getId(), person.getName());
    }

}
