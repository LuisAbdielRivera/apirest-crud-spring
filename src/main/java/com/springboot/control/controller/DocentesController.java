package com.springboot.control.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.springboot.control.entity.*;
import org.springframework.web.bind.annotation.*;

import com.springboot.control.service.DocentesService;

@Controller
@RequestMapping("/apicontrol/docentes")
public class DocentesController {
    @Autowired
    private DocentesService docentesService;
    
    @GetMapping
    public String obtenerDocentes(Model modelo) {
        List<Maestros> Docentes = docentesService.getAllDocentes();
        modelo.addAttribute("Docentes", Docentes);
        return "Docente";
    }

    @PostMapping
    public Maestros createDocentes(@RequestBody Maestros maestros){
        return docentesService.createDocentes(maestros);
    }

    @GetMapping("/{id}")
    public Maestros getAlumnosById(@PathVariable Long id){
        return docentesService.getDocentesById(id);
    }

    @PutMapping("/{id}")
    public Maestros updateDocentes(@PathVariable Long id, @RequestBody Maestros maestros){
        return docentesService.updateDocentes(id, maestros);
    }

    @DeleteMapping("/{id}")
    public void deleteDocentes(@PathVariable Long id){
        docentesService.deleteDocentes(id);
    }
}
