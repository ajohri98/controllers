package com.example.demosss.spring.mockito.api.service;

import com.example.demosss.spring.mockito.api.repository.PersonRepo;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class PersonServiceTest {

    @Mock
    private PersonRepo personRepo;

    private PersonService personService;

    @BeforeEach
    void setup(){
        this.personService=new PersonService(personRepo);
    }

    @Test
    void getAllPerson(){
        personService.getAllPerson();
        personService.getAllPerson();
        personService.getAllPerson();

        verify(personRepo,times(3)).findAll();
    }


}
