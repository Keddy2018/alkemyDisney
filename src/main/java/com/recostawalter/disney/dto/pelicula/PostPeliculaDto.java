/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recostawalter.disney.dto.pelicula;

import com.recostawalter.disney.entidad.Genero;
import com.recostawalter.disney.entidad.Personaje;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author recos
 */
public class PostPeliculaDto implements Serializable{
    
    private Long id;
    private String titulo;
    private String imagen;
    private Integer calificacion;
    private String fechaCreacion;
    private List<Personaje> personaje;
    private Genero genero;

    public PostPeliculaDto() {
        super();
    }

    public PostPeliculaDto(Long id, String titulo, String imagen, Integer calificacion, String fechaCreacion, List<Personaje> personaje, Genero genero) {
        this.id = id;
        this.titulo = titulo;
        this.imagen = imagen;
        this.calificacion = calificacion;
        this.fechaCreacion = fechaCreacion;
        this.personaje = personaje;
        this.genero = genero;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Integer getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public List<Personaje> getPersonaje() {
        return personaje;
    }

    public void setPersonaje(List<Personaje> personaje) {
        this.personaje = personaje;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    
    
    
 
    
    
}
