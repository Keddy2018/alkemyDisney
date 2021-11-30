/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recostawalter.disney.repositorio;

import com.recostawalter.disney.entidad.Pelicula;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author recos
 */
@Repository
public interface PeliculaRepositorio extends JpaRepository<Pelicula, Long> {

    @Query("SELECT a FROM Pelicula a WHERE a.titulo LIKE CONCAT('%',:titulo,'%')")
    public List<Pelicula> buscarPeliculaPorNombre(@Param("titulo") String titulo);

    @Query("SELECT a FROM Pelicula a WHERE a.genero.id = :genero")
    public List<Pelicula> buscarPeliculaPorGenero(@Param("genero") Long idGenero);
//
    @Query("SELECT a FROM Pelicula a ORDER BY a.titulo ASC" )
    public List<Pelicula> buscarPeliculaOrdenadaAsc();

    @Query("SELECT a FROM Pelicula a ORDER BY a.titulo DESC" )
    public List<Pelicula> buscarPeliculaOrdenadaDesc();

    
}
