package com.example.demosss.spring.mockito.api.repository;

import com.example.demosss.spring.mockito.api.dao.Person;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
class PersonRepoTest {


    @Autowired
    private PersonRepo personRepo;

    @Test
    void isPersonExitsById() {
        Person person=new Person(1234,"Ayush","Delhi");
        personRepo.save(person);

        Boolean actualResult=personRepo.isPersonExitsById(person.getPersonId());
        assertThat(actualResult).isTrue();

    }

    @AfterEach
    void tearDown(){
        System.out.println("tearing down");
        personRepo.deleteAll();

    }

    @BeforeEach
    void setup(){
        System.out.println("setting up");
    }


}