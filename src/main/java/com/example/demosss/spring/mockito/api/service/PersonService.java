package com.example.demosss.spring.mockito.api.service;

import com.example.demosss.spring.mockito.api.dao.Person;
import com.example.demosss.spring.mockito.api.repository.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
    @Autowired
    private PersonRepo repo;


    public List<Person> getAllPerson(){
        return this.repo.findAll();
    }
    PersonService(PersonRepo personRepo)
    {
        this.repo=personRepo;
    }

}
