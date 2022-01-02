package com.example.demosss.spring.mockito.api.controller;

import com.example.demosss.spring.mockito.api.model.UserModel;
import com.example.demosss.spring.mockito.api.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
@RequestMapping("/api/controller")
@AllArgsConstructor
public class UserController  {


    private final UserService userService;

    @PostMapping
    public ResponseEntity<String> save(@RequestBody UserModel userModel){
        userService.save(userModel);
        return new ResponseEntity<>("user register successfull", HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<ArrayList<UserModel>> get()
    {
            ArrayList<UserModel> list= (ArrayList<UserModel>) userService.get();
            return new ResponseEntity<>(list,HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserModel> update(@PathVariable Integer id)
    {
        UserModel userModel1=userService.update(id);
        return new ResponseEntity<>(userModel1,HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id)
    {
        userService.delete(id);
        return new ResponseEntity<>("user deleted",HttpStatus.OK);
    }








}
