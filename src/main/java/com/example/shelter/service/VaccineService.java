package com.example.shelter.service;

import com.example.shelter.mapper.VaccineMapper;
import com.example.shelter.model.Vaccine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class VaccineService {
    @Autowired
    private VaccineMapper vaccineMapper;

    public List<Vaccine> selectAll() {
        return vaccineMapper.selectAll();
    }

    public void deleteById(int id) {
        vaccineMapper.deleteById(id);
    }

    public void update(int old_id, int id, int a_id, int u_id, String vaccine, String date, String remarks) {
        vaccineMapper.update(old_id, id, a_id, u_id, vaccine, date, remarks);
    }
}
