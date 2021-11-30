/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recostawalter.disney.dto.personaje;

import com.recostawalter.disney.entidad.Pelicula;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author recos
 */
public class GetPersonajeDetallesDto implements Serializable {
    
    private String nombre;
    private Integer edad;
    private Pelicula pelicula;

    public GetPersonajeDetallesDto() {
        super();
    }

    public GetPersonajeDetallesDto(String nombre, Integer edad, Pelicula pelicula) {
        super();
        this.nombre = nombre;

    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }
    
    
    
    
}
