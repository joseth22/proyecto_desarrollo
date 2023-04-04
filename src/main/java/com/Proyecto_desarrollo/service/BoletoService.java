/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Proyecto_desarrollo.service;

import com.Proyecto_desarrollo.domain.Boleto;
import java.util.List;

/**
 *
 * @author Andrès
 */
public interface BoletoService {
    
    public List<Boleto> getBoletos(boolean activos);

    public Boleto getBoleto(Boleto boleto);

    public void save(Boleto boleto);
    
    public void delete(Boleto boleto);
}
