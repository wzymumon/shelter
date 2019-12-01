package com.example.shelter.controller;

import com.example.shelter.model.Animal;
import com.example.shelter.model.User;
import com.example.shelter.service.AnimalService;
import com.example.shelter.service.HealthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.List;

@Controller
public class AnimalController {
    @Autowired
    private AnimalService animalService = new AnimalService();

    @RequestMapping(value = "/image")
    public void image(int id, HttpServletResponse response) {
        System.out.println(id);
        Object img = animalService.getImgById(3);
        System.out.println(img);
        try {
            OutputStream out = response.getOutputStream();
            out.write((byte[]) img);
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/animal/edit")
    public String edit(Model model) {
        List<Animal> animals = animalService.selectAll();
        model.addAttribute("animals", animals);
        return "editAnimal";
    }

    @RequestMapping(value = "/animal/delete")
    public String delete(int id) {
        animalService.deleteById(id);
        return "redirect:/animal/edit";
    }

    @RequestMapping(value = "/animal/update")
    public String update(HttpServletRequest request) {
        String old_id = request.getParameter("old_id");
        String id = request.getParameter("id");
        String number = request.getParameter("number");
        String name = request.getParameter("name");
        String species = request.getParameter("species");
        String sex = request.getParameter("sex");
        String age = request.getParameter("age");
        String image = request.getParameter("image");
        String h_id = request.getParameter("h_id");
//        animalService.update(old_id, id, number, name, species, sex, age, image, h_id);
        return "redirect:/animal/edit";
    }

}
