package com.josecoy.primeraPractica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class BiografiaController {

    @GetMapping("/biografia")
    public String mostrarBiografia(Model model) {
        model.addAttribute("Nombre", "José Angel");
        model.addAttribute("Apellido", "Coy Mucía");
        model.addAttribute("Edad", 17);

        List<String> albumes = Arrays.asList("Swimming - Mac Miller", "GNX - Kendrick Lamar",
                "AM - Arctic Monkeys", "Demon Days - Gorillaz", "ALOHA INOHA - INOHA");
        model.addAttribute("Albumes", albumes);

        List<String> libros = Arrays.asList("Ficciones - Luis Jorges Borges",
                "El problema de los tres cuerpos - Cixin Liu",
                "Yo Robot - Isaac Asimov", "Rayuela - Julio Cortazar",
                "Noches Blancas - Fiodor Dostoyevski");
        model.addAttribute("Libros", libros);

        List<String> series = Arrays.asList("The Amazing Digital Circus", "Mob Psycho 100",
                "Bungō Stray Dogs", "Dan Da Dan", "Sōsō no Frieren", "Vagabond");
        model.addAttribute("Series", series);

        return "biografia";
    }
}