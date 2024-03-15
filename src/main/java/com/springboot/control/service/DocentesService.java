package com.springboot.control.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.springboot.control.entity.Maestros;
import org.springframework.stereotype.Service;

import com.springboot.control.repository.DocentesRepository;

@Service

public class DocentesService {
    @Autowired
    DocentesRepository docentesRepository;

    public Maestros createDocentes(Maestros maestros){
        return docentesRepository.save(maestros);
    }

    public List<Maestros> getAllDocentes(){
        return docentesRepository.findAll();
    }

    public Maestros getDocentesById(Long id){
        return docentesRepository.findById(id).orElse(null);
    }

    public Maestros updateDocentes(Long id, Maestros maestros){
        maestros.setId(id);
        return docentesRepository.save(maestros);
    }

    public void deleteDocentes(Long id){
        docentesRepository.deleteById(id);
    }
}
