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
public class PostPersonajeDto implements Serializable {
    
    private Long id;
    private String nombre;
    private String imagen;
    private Integer edad;
    private Float peso;
    private String historia;
    
    private Pelicula pelicula;

    public PostPersonajeDto() {
        super();
    }

    public PostPersonajeDto(Long id, String nombre, String imagen, Integer edad, Float peso, String historia, Pelicula pelicula) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.historia = historia;
        this.pelicula = pelicula;
        this.imagen = imagen;
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

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
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

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }
    
    
    
}
