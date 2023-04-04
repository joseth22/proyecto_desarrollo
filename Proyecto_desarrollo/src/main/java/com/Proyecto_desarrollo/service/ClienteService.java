/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Proyecto_desarrollo.service;

import com.Proyecto_desarrollo.domain.Cliente;
import java.util.List;

/**
 *
 * @author Andrès
 */
public interface ClienteService {
        

    public List<Cliente> getClientes();

    public Cliente getCliente(Cliente cliente);

    public void save(Cliente cliente);
    
    public void delete(Cliente cliente);
    
    public List<Cliente> getClienteCorreo(String correo);
    
     public List<Cliente> findByApellidos(String apellidos);
}
