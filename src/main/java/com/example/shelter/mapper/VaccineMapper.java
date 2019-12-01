package com.example.shelter.mapper;

import com.example.shelter.model.Vaccine;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VaccineMapper {
    List<Vaccine> selectAll();

    void deleteById(int id);

    void update(int old_id, int id, int a_id, int u_id, String vaccine, String date, String remarks);
}
