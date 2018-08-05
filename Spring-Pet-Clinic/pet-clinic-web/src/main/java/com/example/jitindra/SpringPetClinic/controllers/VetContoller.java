package com.example.jitindra.SpringPetClinic.controllers;

import com.example.jitindra.SpringPetClinic.service.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vets")
public class VetContoller {

    private final VetService vetService;

    public VetContoller(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"","/","/index","/index.html"})
    public String listVets(Model model){
        model.addAttribute("vets",vetService.findAll());
        return "vets/index";
    }
}
