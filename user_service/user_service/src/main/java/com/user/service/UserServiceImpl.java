package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{

    //fake user list
    List<User> userList = List.of(new User(1110L,"Nirmal","9090909090"),
            new User(1111L,"Dillip","9090909080"),
            new User(1112L,"Mili","9090909070")
            );
    @Override
    public User getuser(Long id) {
        return userList.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
