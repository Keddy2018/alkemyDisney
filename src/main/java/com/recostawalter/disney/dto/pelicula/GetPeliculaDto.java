/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recostawalter.disney.dto.pelicula;

//import com.recostawalter.disney.entidad.Personaje;
import java.io.Serializable;
//import java.util.List;

/**
 *
 * @author recos
 */
public class GetPeliculaDto implements Serializable {

    //private Long id;
    private String titulo;
    private String imagen;
    //private Integer calificacion;
    private String fechaCreacion;
    //private List<Personaje> personaje;

    public GetPeliculaDto() {
        super();
    }

    public GetPeliculaDto(String titulo, String imagen, String fechaCreacion) {
        super();
        this.titulo = titulo;
        this.imagen = imagen;
        this.fechaCreacion = fechaCreacion;
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

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }




    
    
    
    
}
