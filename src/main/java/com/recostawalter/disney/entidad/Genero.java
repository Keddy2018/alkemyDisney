/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recostawalter.disney.entidad;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;

/**
 *
 * @author recos
 */
@Entity
public class Genero {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "id")
    private Long id;
    
    
    @NotEmpty(message = "El nombre es un campo necesario")
    @Column( name = "nombre")
    private String nombre;
    
    @Column( name = "imagen")
    private String imagen;
    
    


    public Genero() {
    }

    public Genero(Long id, String nobmre, String imagen) {
        this.id = id;
        this.nombre = nobmre;
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }


    
    
}
