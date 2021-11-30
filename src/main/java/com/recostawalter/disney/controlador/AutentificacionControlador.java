/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recostawalter.disney.controlador;

import com.recostawalter.disney.dto.login.PostLoginDto;
import com.recostawalter.disney.dto.login.PostRegistroDto;
import com.recostawalter.disney.servicio.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author recos
 */
@RestController
@RequestMapping(value = "/auth")
public class AutentificacionControlador {

    @Autowired
    UsuarioServicio usuarioServicio;

    @PostMapping(value = "/login")
    public void login(@RequestBody PostLoginDto postLoginDto) {
        usuarioServicio.logearUsuario(postLoginDto);
    }

    @PostMapping(value = "/logincheck")
    public void logincheck() {

    }

    @PostMapping(value = "/inicio")
    public void inicio() {

    }

    @PostMapping(value = "/register")
    public void login(@RequestBody PostRegistroDto usuarioRegistrado) {
        usuarioServicio.registrarUsuario(usuarioRegistrado);
    }
}
