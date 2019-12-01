package com.example.shelter.service;

import com.example.shelter.mapper.AnimalMapper;
import com.example.shelter.model.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AnimalService {
    @Autowired
    private AnimalMapper animalMapper;


    public List<Animal> selectAll() {
        return  animalMapper.selectAll();
    }

    public Object getImgById(int id) {
        return animalMapper.getImgById(id);
    }

    public void deleteById(int id) {
        animalMapper.deleteById(id);
    }
}
