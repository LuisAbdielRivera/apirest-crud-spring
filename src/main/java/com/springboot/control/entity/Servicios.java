package com.springboot.control.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tbb_servicios")

public class Servicios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String no_servicio;
    private String nombre;
    private String edif;
    private String encargado;
    private String horario;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNo_servicio() {
        return no_servicio;
    }
    public void setNo_servicio(String no_servicio) {
        this.no_servicio = no_servicio;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEdif() {
        return edif;
    }
    public void setEdif(String edif) {
        this.edif = edif;
    }
    public String getEncargado() {
        return encargado;
    }
    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }
    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
}
