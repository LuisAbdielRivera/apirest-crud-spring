package com.springboot.control.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.springboot.control.entity.Administrativos;
import org.springframework.stereotype.Service;

import com.springboot.control.repository.AdministrativosRepository;

@Service

public class AdministrativosService {
    @Autowired
    AdministrativosRepository administrativosRepository;

    public Administrativos createAdministrativos(Administrativos administrativos){
        return administrativosRepository.save(administrativos);
    }

    public List<Administrativos> getAllAdministrativos(){
        return administrativosRepository.findAll();
    }

    public Administrativos getAdministrativosById(Long id){
        return administrativosRepository.findById(id).orElse(null);
    }

    public Administrativos updateAdministrativos(Long id, Administrativos administrativos){
        administrativos.setId(id);
        return administrativosRepository.save(administrativos);
    }

    public void deleteAdministrativos(Long id){
        administrativosRepository.deleteById(id);
    }

}
