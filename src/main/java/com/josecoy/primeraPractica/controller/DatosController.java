package com.josecoy.primeraPractica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DatosController {

    @GetMapping("/datos")
    public String mostrarDatos(Model model) {
        model.addAttribute("Nombre", "José Angel");
        model.addAttribute("Apellido", "Coy Mucía");
        model.addAttribute("Edad", 17);

        return "datos";
    }
}
