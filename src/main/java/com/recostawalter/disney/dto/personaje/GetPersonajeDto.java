/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recostawalter.disney.dto.personaje;

//import com.recostawalter.disney.entidad.Pelicula;

import java.io.Serializable;

//import java.util.List;

/**
 *
 * @author recos
 */
public class GetPersonajeDto implements Serializable {

    private String nombre;
    private String imagen;
    //private Long id;
    //private Integer edad;
    //private Float peso;
    //private String historia;

    //private List<Pelicula> pelicula;

    public GetPersonajeDto() {
        super();
    }

    
    
    

    public GetPersonajeDto(String nombre, String imagen) {
        super();
        this.nombre = nombre;
        this.imagen = imagen;
    }
    
//    public GetPersonajeDto(Long id, String nombre, String imagen) {
//        super();
//        this.id = id;
//        this.nombre = nombre;
//        this.imagen = imagen;
//    }
    
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

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }

    
    
    
}
