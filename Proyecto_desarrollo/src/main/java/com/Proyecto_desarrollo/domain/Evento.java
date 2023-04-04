/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Proyecto_desarrollo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 *
 * @author Andrès
 */
@Data
@Entity
@Table (name="evento")
public class Evento {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long idEventi;
    private double precio;
    private String descripcion;
    private int existencias;
    private boolean activo;

    public Evento() {
    }

    public Evento(Long idEventi, double precio, String descripcion, int existencias, boolean activo) {
        this.idEventi = idEventi;
        this.precio = precio;
        this.descripcion = descripcion;
        this.existencias = existencias;
        this.activo = activo;
    }
}
