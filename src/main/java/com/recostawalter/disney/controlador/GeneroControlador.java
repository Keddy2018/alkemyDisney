/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recostawalter.disney.controlador;

import com.recostawalter.disney.entidad.Genero;
import com.recostawalter.disney.servicio.GeneroServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author recos
 */
@RestController
@RequestMapping("/genero")
public class GeneroControlador {

    @Autowired
    private GeneroServicio generoServicio;

    @PostMapping("/crear")
    public void crearGenero(@RequestBody Genero genero) {
        System.out.println("Algo paso ?");
        generoServicio.crearGenero(genero);
    }

}
