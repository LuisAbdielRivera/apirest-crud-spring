package com.springboot.control.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.springboot.control.entity.Servicios;
import org.springframework.stereotype.Service;

import com.springboot.control.repository.ServiciosRepository;

@Service

public class ServiciosService {
    @Autowired
    ServiciosRepository serviciosRepository;

    public Servicios createServicios(Servicios servicios){
        return serviciosRepository.save(servicios);
    }

    public List<Servicios> getAllServicios(){
        return serviciosRepository.findAll();
    }

    public Servicios getServiciosById(Long id){
        return serviciosRepository.findById(id).orElse(null);
    }

    public Servicios updateServicios(Long id, Servicios servicios){
        servicios.setId(id);
        return serviciosRepository.save(servicios);
    }

    public void deleteServicios(Long id){
        serviciosRepository.deleteById(id);
    }
}
