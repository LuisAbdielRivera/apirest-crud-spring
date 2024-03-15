package com.springboot.control.repository;

import com.springboot.control.entity.Administrativos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface AdministrativosRepository extends JpaRepository <Administrativos, Long>{

}
