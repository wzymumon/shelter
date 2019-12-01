package com.example.shelter.mapper;

import com.example.shelter.model.Admin;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Honey
 */
@Repository
public interface AdminMapper {
    public List<Admin> selectAll();
    public String getPassword(String name);
}
