/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recostawalter.disney.entidad;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;




/**
 *
 * @author recos
 */
@Entity
public class Personaje {
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "id")
    private Long id;
    
    @NotEmpty(message = "El nombre del del personaje es necesario")
    @Column( name = "nombre")
    private String nombre;
    
    @NotEmpty(message = "Se requiere imagen")
    @Column( name = "imagen")
    private String imagen;
    
    @NotNull(message = "Debes colocar la edad")
    @Column( name = "edad")
    private Integer edad;
    
    @Column( name = "peso")
    private Float peso;
    
    @Column( name = "historia")
    private String historia;
    
    
    //@JsonIgnoreProperties(value="personajes")
//    @Column( name = "pelicula")
    @ManyToOne
    private Pelicula pelicula;
    


    
    
    
    
    
    
    
    
    
    public Personaje() {
    }

    public Personaje(Long id, String nombre, String imagen, Integer edad, Float peso, String historia, Pelicula pelicula) {
        this.id = id;
        this.nombre = nombre;
        this.imagen = imagen;
        this.edad = edad;
        this.peso = peso;
        this.historia = historia;
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

    public Pelicula getPeliculas() {
        return pelicula;
    }

    public void setPeliculas(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    
    
    
}
