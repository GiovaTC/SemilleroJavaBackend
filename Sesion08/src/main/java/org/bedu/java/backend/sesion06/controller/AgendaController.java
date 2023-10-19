package org.bedu.java.backend.sesion06.controller;

import org.bedu.java.backend.sesion06.model.Persona;
import org.bedu.java.backend.sesion06.service.AgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/agenda")
public class AgendaController {

    private final AgendaService agendaService;

    @Autowired
    public AgendaController(AgendaService agendaService) {
        this.agendaService = agendaService;
    }

    @GetMapping
    public String showAgenda(Model model) {
        List<Persona> personas = agendaService.getPersonas();
        model.addAttribute("personas", personas);
        model.addAttribute("nuevaPersona", new Persona());
        return "agenda";
    }

    @PostMapping("/guardar")
    public String guardarPersona(@ModelAttribute("nuevaPersona") @Valid Persona persona,
                                 BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            List<Persona> personas = agendaService.getPersonas();
            model.addAttribute("personas", personas);
            return "agenda";
        }

        agendaService.guardaPersona(persona);
        return "redirect:/agenda";
    }
}

