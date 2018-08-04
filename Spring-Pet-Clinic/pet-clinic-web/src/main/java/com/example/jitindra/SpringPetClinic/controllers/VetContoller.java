package com.example.jitindra.SpringPetClinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetContoller {

    @RequestMapping({"/vets","/vets/","/vets/index","/vets/index.html"})
    public String listVets(){
        return "vets/index";
    }
}
