package com.example.demosss.spring.mockito.api.mapper;

import com.example.demosss.spring.mockito.api.dao.User;
import com.example.demosss.spring.mockito.api.model.UserModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User modeltouser(UserModel userModel);

    UserModel usertoModel(User user);

}
