package com.alaskarnitas.springbootdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alaskarnitas.springbootdi.models.domain.Factura;

@Controller
@RequestMapping("/factura")
public class FacturaController {

    @Autowired
    private Factura factura;

    @GetMapping("/ver")
    public String ver(Model model) {

        model.addAttribute("titulo", "Ejemplo factura con inyeccion de dependencias");
        model.addAttribute("factura", factura);

        return "factura/ver";
    }

}