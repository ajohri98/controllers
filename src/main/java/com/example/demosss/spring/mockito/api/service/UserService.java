package com.example.demosss.spring.mockito.api.service;


import com.example.demosss.spring.mockito.api.SpringException;
import com.example.demosss.spring.mockito.api.dao.User;
import com.example.demosss.spring.mockito.api.mapper.UserMapper;
import com.example.demosss.spring.mockito.api.model.UserModel;
import com.example.demosss.spring.mockito.api.repository.UserRepository;
import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.XSlf4j;
import org.hibernate.validator.internal.util.logging.Log;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public void save(UserModel userModel){

        User user=userMapper.modeltouser(userModel);
        userRepository.save(user);
        return;
    }

    public List<UserModel> get()
    {
        return userRepository.
                findAll()
                .stream()
                .map(userMapper::usertoModel)
                .collect(Collectors.toList());
    }

    public UserModel update(Integer id)
    {
        User user=userRepository.findById(id).orElseThrow(()->new SpringException("User not found"));
        user.setName("Himani");
        userRepository.save(user);
        return userMapper.usertoModel(user);
    }

    public void delete(Integer id)
    {
        User user=userRepository.findById(id).orElseThrow(()->new SpringException("User not found"));
        userRepository.delete(user);
        return;
    }



}
