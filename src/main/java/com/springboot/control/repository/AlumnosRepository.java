package com.springboot.control.repository;

import com.springboot.control.entity.Alumnos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface AlumnosRepository extends JpaRepository <Alumnos, Long>{
    
}
