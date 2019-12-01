package com.example.shelter.controller;

import com.example.shelter.model.Health;
import com.example.shelter.model.Vaccine;
import com.example.shelter.service.HealthService;
import com.example.shelter.service.VaccineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping(value = "/vaccine")
public class VaccineController {
    @Autowired
    private VaccineService vaccineService;

    @RequestMapping(value = "/edit")
    public String edit(Model model) {
        List<Vaccine> vaccines = vaccineService.selectAll();
        model.addAttribute("vaccines", vaccines);
        return "editVaccine";
    }

    @RequestMapping(value = "/delete")
    public String delete(int id) {
        vaccineService.deleteById(id);
        return "redirect:/vaccine/edit";
    }

    @RequestMapping(value = "update")
    public String update(HttpServletRequest request) {
        int old_id = Integer.parseInt(request.getParameter("old_id"));
        int id = Integer.parseInt(request.getParameter("id"));
        int a_id = Integer.parseInt(request.getParameter("a_id"));
        int u_id = Integer.parseInt(request.getParameter("u_id"));
        String vaccine = request.getParameter("vaccine");
        String date = request.getParameter("date");
        String remarks = request.getParameter("remarks");
        vaccineService.update(old_id, id, a_id, u_id, vaccine, date, remarks);
        return "redirect:/health/edit";
    }
}
