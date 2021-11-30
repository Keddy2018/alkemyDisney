/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recostawalter.disney.entidad;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 *
 * @author recos
 */
@Entity
public class Pelicula {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotEmpty(message = "El campo titulo no puede estar vacio")
    @Column( name = "titulo")
    private String titulo;
    
    @NotNull(message = "Falta colocar la fecha de creacion de la pelicula")
    @Column( name = "fechaCreacion")
    private String fechaCreacion;
    
    @NotNull(message = "La calificacion ayuda, colocala")
    @Min(value = 1 , message = "La menor calificacion es 1 estrella")
    @Max(value = 5 , message = "La mayor calificacion es 5 estrellas")
    @Column( name = "calificacion")
    private Integer calificacion;
    
    @NotNull(message = "Imagen es necesaria")
    private String imagen;
    
    
    //@JsonIgnoreProperties(value="peliculas")
    @OneToMany(mappedBy = "pelicula")
//    @Column( name = "personajes")
    private List<Personaje> personajes;

    @ManyToOne
    private Genero genero;
    
    public Pelicula() {
    }

    public Pelicula(Long id, String titulo, String fechaCreacion, Integer calificacion, String imagen, List<Personaje> personajes, Genero genero) {
        this.id = id;
        this.titulo = titulo;
        this.fechaCreacion = fechaCreacion;
        this.calificacion = calificacion;
        this.imagen = imagen;
        this.personajes = personajes;
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

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Integer getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public List<Personaje> getPersonajes() {
        return personajes;
    }

    public void setPersonajes(List<Personaje> personajes) {
        this.personajes = personajes;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }



  
    
    
    
}
