package com.example.shelter.service;

import com.example.shelter.mapper.UserMapper;
import com.example.shelter.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> selectAll(){
        return userMapper.selectAll();
    }

    public String getPassword(String name) {
        return userMapper.getPassword(name);
    }

    public void signUp(String name, String password, String email, String phone) {
        userMapper.signUp(name,password,email,phone);
    }

    public void deleteById(int id) {
        userMapper.deleteById(id);
    }
}
