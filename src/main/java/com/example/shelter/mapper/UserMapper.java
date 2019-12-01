package com.example.shelter.mapper;

import com.example.shelter.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    List<User> selectAll();

    String getPassword(String name);

    void signUp(String name, String password, String email, String phone);

    void deleteById(int id);
}
