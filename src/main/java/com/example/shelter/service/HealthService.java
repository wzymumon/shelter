package com.example.shelter.service;

import com.example.shelter.mapper.HealthMapper;
import com.example.shelter.model.Health;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class HealthService {
    @Autowired
    private HealthMapper healthMapper;

    public List<Health> selectAll(){
        return healthMapper.selectAll();
    }

    public void deleteById(int id) {
        healthMapper.deleteById(id);
    }

    public void update(int old_id, int id, int a_id, int u_id, String health_info, String date, String remarks) {
        healthMapper.update(old_id,id,a_id,u_id,health_info,date,remarks);
    }
}
