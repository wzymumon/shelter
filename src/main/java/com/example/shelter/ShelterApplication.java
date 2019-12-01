package com.example.shelter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.shelter.mapper")
public class ShelterApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShelterApplication.class, args);
	}

}
