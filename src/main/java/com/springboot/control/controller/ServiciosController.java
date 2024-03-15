package com.springboot.control.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.springboot.control.entity.*;
import org.springframework.web.bind.annotation.*;

import com.springboot.control.service.ServiciosService;

@Controller
@RequestMapping("/apicontrol/servicios")
public class ServiciosController {
    @Autowired
    private ServiciosService serviciosService;

    @GetMapping
    public String obtenerServicios(Model modelo) {
        List<Servicios> Servicios = serviciosService.getAllServicios();
        modelo.addAttribute("Servicios", Servicios);
        return "Servicios";
    }

    @PostMapping
    public Servicios createServicios(@RequestBody Servicios servicios){
        return serviciosService.createServicios(servicios);
    }

    @GetMapping("/{id}")
    public Servicios getServiciosById(@PathVariable Long id){
        return serviciosService.getServiciosById(id);
    }

    @PutMapping("/{id}")
    public Servicios updateServicios(@PathVariable Long id, @RequestBody Servicios servicios){
        return serviciosService.updateServicios(id, servicios);
    }

    @DeleteMapping("/{id}")
    public void deleteServicios(@PathVariable Long id){
        serviciosService.deleteServicios(id);
    }
}
