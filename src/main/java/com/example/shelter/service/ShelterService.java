package com.example.shelter.service;

import com.example.shelter.mapper.ShelterMapper;
import com.example.shelter.model.Shelter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class HospiceService {
    @Autowired
    private ShelterMapper hospiceMapper;

    public List<Shelter> selectAll() {
        return hospiceMapper.selectAll();
    }

    public void deleteById(int id) {
        hospiceMapper.deleteById(id);
    }

    public void update(int old_id, int id, String name, String address, String postcode, int total_room_number, int spare_room_number, String remarks) {
        hospiceMapper.update(old_id,id,name,address,postcode,total_room_number,spare_room_number,remarks);
    }
}
