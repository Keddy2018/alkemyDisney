/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recostawalter.disney.dto.genero;

import com.recostawalter.disney.entidad.Pelicula;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author recos
 */
public class GetGeneroDto implements Serializable{
    
    private Long id;
    private String nombre;
    private String imagen;
    private List<Pelicula> pelicula;

    public GetGeneroDto() {
        super();
    }

    public GetGeneroDto(Long id, String nombre, String imagen, List<Pelicula> pelicula) {
        this.id = id;
        this.nombre = nombre;
        this.imagen = imagen;
        this.pelicula = pelicula;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public List<Pelicula> getPelicula() {
        return pelicula;
    }

    public void setPelicula(List<Pelicula> pelicula) {
        this.pelicula = pelicula;
    }
    
    
    
    
}
