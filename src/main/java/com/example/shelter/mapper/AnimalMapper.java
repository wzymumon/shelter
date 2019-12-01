package com.example.shelter.mapper;

import com.example.shelter.model.Animal;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimalMapper {
    List<Animal> selectAll();

    Object getImgById(int id);

    void deleteById(int id);
}
