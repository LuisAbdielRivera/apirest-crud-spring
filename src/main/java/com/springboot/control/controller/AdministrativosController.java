package com.springboot.control.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.springboot.control.entity.*;
import org.springframework.web.bind.annotation.*;

import com.springboot.control.service.AdministrativosService;

@Controller
@RequestMapping("/apicontrol/administrativos")
public class AdministrativosController {
    @Autowired
    private AdministrativosService administrativosService;

    @GetMapping
    public String obtenerAdministrativos(Model modelo) {
        List<Administrativos> Administrativos = administrativosService.getAllAdministrativos();
        modelo.addAttribute("Administrativos", Administrativos);
        return "Administrativos";
    }

    @PostMapping
    public Administrativos createAdministrativos(@RequestBody Administrativos administrativos){
        return administrativosService.createAdministrativos(administrativos);
    }

    @GetMapping("/{id}")
    public Administrativos getAdministrativosById(@PathVariable Long id){
        return administrativosService.getAdministrativosById(id);
    }

    @PutMapping("/{id}")
    public Administrativos updateAdministrativos(@PathVariable Long id, @RequestBody Administrativos administrativos){
        return administrativosService.updateAdministrativos(id, administrativos);
    }

    @DeleteMapping("/{id}")
    public void deleteAdministrativos(@PathVariable Long id){
        administrativosService.deleteAdministrativos(id);
    }
}
