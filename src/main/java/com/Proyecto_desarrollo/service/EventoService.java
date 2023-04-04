/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Proyecto_desarrollo.service;

import com.Proyecto_desarrollo.domain.Evento;
import java.util.List;

/**
 *
 * @author Andrès
 */
public interface EventoService {
        
    public List<Evento> getEventos(boolean activos);

    public Evento getEvento(Evento evento);

    public void save(Evento evento);
    
    public void delete(Evento evento);
}
