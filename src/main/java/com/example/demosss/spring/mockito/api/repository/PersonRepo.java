package com.example.demosss.spring.mockito.api.repository;

import com.example.demosss.spring.mockito.api.dao.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PersonRepo extends JpaRepository<Person,Integer> {

    @Query("select case when count(s)>0 then true else false end from Person s where s.personId=?1")
    Boolean isPersonExitsById(Integer id);

}
