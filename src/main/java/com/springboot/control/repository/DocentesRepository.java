package com.springboot.control.repository;

import com.springboot.control.entity.Maestros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface DocentesRepository extends JpaRepository <Maestros, Long> {

}
