package com.josecoy.primeraPractica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class UsuarioController {

    @GetMapping("/usuario")
    public String mostrarPerfil(Model model) {

        model.addAttribute("Nombre", "José Coy");
        model.addAttribute("Edad", 17);

        List<String> habilidades = Arrays.asList("Java", "Spring Boot", "HTML", "CSS", "Javascript",
                "SQL");
        model.addAttribute("Habilidades", habilidades);

        return "usuario";
    }
}