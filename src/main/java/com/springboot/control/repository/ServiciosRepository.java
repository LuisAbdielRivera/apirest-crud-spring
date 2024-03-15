package com.springboot.control.repository;

import com.springboot.control.entity.Servicios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ServiciosRepository extends JpaRepository <Servicios, Long>{

}
