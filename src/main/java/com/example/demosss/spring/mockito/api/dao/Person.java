package com.example.demosss.spring.mockito.api.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    @Id
    private Integer personId;
    private String personName;
    private String personCity;

}
