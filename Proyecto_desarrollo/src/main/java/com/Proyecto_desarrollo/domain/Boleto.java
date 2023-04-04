/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Proyecto_desarrollo.domain;

import lombok.Data;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


/**
 *
 * @author Andrès
 */
@Data
@Entity
@Table (name="boleto")
public class Boleto {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long idBoleto;
    private double precio;
    private String descripcion;

    public Boleto() {
    }

    public Boleto(Long idBoleto, double precio, String descripcion) {
        this.idBoleto = idBoleto;
        this.precio = precio;
        this.descripcion = descripcion;
    } 
    
}
