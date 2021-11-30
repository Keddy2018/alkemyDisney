/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recostawalter.disney.repositorio;

import com.recostawalter.disney.entidad.Personaje;
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
public interface PersonajeRepositorio extends JpaRepository<Personaje, Long>{
    
    @Query("SELECT a FROM Personaje a WHERE a.nombre LIKE CONCAT('%',:nombre,'%')")
    public List<Personaje> buscarPersonajePorNombre(@Param("nombre") String nombre);

    @Query("SELECT a FROM Personaje a WHERE a.edad LIKE :edad")
    public List<Personaje> buscarPersonajePorEdad(@Param("edad") Integer edad);

    @Query("SELECT a FROM Personaje a WHERE a.pelicula.id = :id")// RECORDAR REPARAR
    public List<Personaje> buscarPersonajePorIdPelicula(@Param("id") Long id);
}


