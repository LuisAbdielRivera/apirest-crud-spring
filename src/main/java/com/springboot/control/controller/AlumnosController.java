package com.springboot.control.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.springboot.control.entity.*;
import org.springframework.web.bind.annotation.*;

import com.springboot.control.service.AlumnoService;

@Controller
@RequestMapping("/apicontrol/alumnos")

public class AlumnosController {
    @Autowired
    private AlumnoService alumnoService;

    @GetMapping
    public String obtenerAlumnos(Model modelo) {
        List<Alumnos> Alumnos = alumnoService.getAllAlumnos();
        modelo.addAttribute("Alumnos", Alumnos);
        return "Alumno";
    }

    @PostMapping
    public Alumnos createAlumnos(@RequestBody Alumnos alumnos){
        return alumnoService.createAlumnos(alumnos);
    }

    @GetMapping("/{id}")
    public Alumnos getAlumnosById(@PathVariable Long id){
        return alumnoService.getAlumnosById(id);
    }

    @PutMapping("/{id}")
    public Alumnos updateAlumnos(@PathVariable Long id, @RequestBody Alumnos alumnos){
        return alumnoService.updateAlumnos(id, alumnos);
    }

    @DeleteMapping("/{id}")
    public void deleteAlumnos(@PathVariable Long id){
        alumnoService.deleteAlumnos(id);
    }
}
