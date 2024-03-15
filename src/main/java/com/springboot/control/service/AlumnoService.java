package com.springboot.control.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.springboot.control.entity.*;
import org.springframework.stereotype.Service;

import com.springboot.control.repository.AlumnosRepository;

@Service

public class AlumnoService {
    @Autowired
    AlumnosRepository alumnosRepository;

    public Alumnos createAlumnos(Alumnos alumnos){
        return alumnosRepository.save(alumnos);
    }

    public List<Alumnos> getAllAlumnos(){
        return alumnosRepository.findAll();
    }

    public Alumnos getAlumnosById(Long id){
        return alumnosRepository.findById(id).orElse(null);
    }

    public Alumnos updateAlumnos(Long id, Alumnos alumnos){
        alumnos.setId(id);
        return alumnosRepository.save(alumnos);
    }

    public void deleteAlumnos(Long id){
        alumnosRepository.deleteById(id);
    }

}
