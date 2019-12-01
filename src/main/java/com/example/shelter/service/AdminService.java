package com.example.shelter.service;

import com.example.shelter.mapper.AdminMapper;
import com.example.shelter.model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AdminService {
    @Autowired
    private AdminMapper adminMapper;

    public String getPassword(String name) {
        return adminMapper.getPassword(name);
    }

    public List<Admin> selectAll()
    {
        return adminMapper.selectAll();
    }

}
