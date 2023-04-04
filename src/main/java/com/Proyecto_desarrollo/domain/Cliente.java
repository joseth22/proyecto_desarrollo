/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Proyecto_desarrollo.domain;

public class Cliente {
    
     private static final long serialVersionUID = 1L;
     
     private Long idCliente;
     String nombre;
     String apellidos;
     String identificacion;
     String correo;
     String telefono;
     int edad;
     String tipo_membresia;

    public Cliente() {
    }

    public Cliente(Long idCliente, String nombre, String apellidos, String identificacion, String correo, String telefono, int edad, String tipo_membresia) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.identificacion = identificacion;
        this.correo = correo;
        this.telefono = telefono;
        this.edad = edad;
        this.tipo_membresia = tipo_membresia;
    }
     
     
     
}
