package com.example.shelter.mapper;

import com.example.shelter.model.Health;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HealthMapper {
    List<Health> selectAll();

    void deleteById(int id);

    void update(int old_id, int id, int a_id, int u_id, String health_info, String date, String remarks);
}
