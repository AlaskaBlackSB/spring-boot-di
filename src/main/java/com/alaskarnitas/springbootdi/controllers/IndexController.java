package com.alaskarnitas.springbootdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.alaskarnitas.springbootdi.models.service.IServicio;

@Controller
public class IndexController {

    @Autowired // Inyecta un objeto (MiServicio) registrado en el contenedor de Spring
    // @Qualifier("miServicioComplejo")
    private IServicio servicio;

    @GetMapping({ "/", "", "/index" })
    public String index(Model model) {

        model.addAttribute("objeto", servicio.operacion());

        return "index";
    }

}