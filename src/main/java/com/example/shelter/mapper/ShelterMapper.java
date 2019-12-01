package com.example.shelter.mapper;

import com.example.shelter.model.Shelter;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShelterMapper {
    List<Shelter> selectAll();

    void deleteById(int id);

    void update(int old_id, int id, String name, String address, String postcode, int total_room_number, int spare_room_number, String remarks);
}
