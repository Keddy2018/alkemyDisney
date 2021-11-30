/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recostawalter.disney.servicio;

import com.recostawalter.disney.entidad.Genero;
import com.recostawalter.disney.repositorio.GeneroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author recos
 */
@Service
public class GeneroServicio {
    
    @Autowired
    private GeneroRepositorio generoRepo;
    
    public void crearGenero(Genero genero){
        generoRepo.save(genero);
    }
    
    
    public void eliminarGenero(){
        
        
        
        
    }
    
    
    public void modificarGenero(){
        
        
        
        
        
    }
    
    
    public void consultarGenero(){
        
        
        
        
    }
    
    
}
