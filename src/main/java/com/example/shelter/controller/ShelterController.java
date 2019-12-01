package com.example.shelter.controller;

import com.example.shelter.model.Shelter;
import com.example.shelter.service.HospiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Controller
@RequestMapping(value = "/hospice")
public class ShelterController {
    @Autowired
    private HospiceService hospiceService;

    @RequestMapping(value = "/edit")
    public String edit(Model model) {
        List<Shelter> hospices = hospiceService.selectAll();
        model.addAttribute("hospices",hospices);
        return "editHospice";
    }

    @RequestMapping(value = "/delete")
    public String delete(int id){
        hospiceService.deleteById(id);
        return "redirect:/hospice/edit";
    }

    @RequestMapping(value = "/update")
    public String update(HttpServletRequest request){
        int old_id= Integer.parseInt(request.getParameter("old_id"));
        int id= Integer.parseInt(request.getParameter("id"));
        String name=request.getParameter("name");
        String address=request.getParameter("address");
        String postcode=request.getParameter("postcode");
        int total_room_number= Integer.parseInt(request.getParameter("postcode"));
        int spare_room_number= Integer.parseInt(request.getParameter("spare_room_number"));
        String remarks=request.getParameter("request");
        hospiceService.update(old_id,id,name,address,postcode,total_room_number,spare_room_number,remarks);
        return "redirect:/hospice/edit";

    }
}
