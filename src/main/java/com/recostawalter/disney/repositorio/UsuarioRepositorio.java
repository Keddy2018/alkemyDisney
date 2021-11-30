/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recostawalter.disney.repositorio;

import com.recostawalter.disney.entidad.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import org.springframework.stereotype.Repository;

/**
 *
 * @author recos
 */
@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Long>{
    
    @Query("SELECT a FROM Usuario a WHERE a.mail = :mail")
    public Usuario buscarUsuarioPorMail(@Param("mail") String mail);
}
