/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Proyecto_desarrollo.dao;

import com.Proyecto_desarrollo.domain.Evento;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Andrès
 */
public interface EventoDao extends CrudRepository<Evento, Long> {
    
}
