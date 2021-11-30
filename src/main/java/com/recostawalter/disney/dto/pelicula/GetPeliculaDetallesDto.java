/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recostawalter.disney.dto.pelicula;

import com.recostawalter.disney.entidad.Genero;
import java.io.Serializable;

/**
 *
 * @author recos
 */
public class GetPeliculaDetallesDto implements Serializable{
 
    private Long id;
    private String titulo;
    private Integer calificacion;
    private String fechaCreacion;
    private String imagen;
    private Genero genero;
    

    public GetPeliculaDetallesDto() {
        super();
    }

    public GetPeliculaDetallesDto(Long id, String titulo, Integer calificacion, String fechaCreacion, String imagen, Genero genero) {
        super();
        this.titulo = titulo;
        this.calificacion = calificacion;
        this.fechaCreacion = fechaCreacion;
        this.imagen = imagen;
        this.genero = genero;
        this.id = id;

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

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }


    
    
 
    
    
}
