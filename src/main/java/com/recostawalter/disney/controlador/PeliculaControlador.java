/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recostawalter.disney.controlador;

import com.recostawalter.disney.dto.pelicula.GetPeliculaDto;
import com.recostawalter.disney.dto.pelicula.GetPeliculaDetallesDto;
import com.recostawalter.disney.dto.pelicula.PostPeliculaDto;
import com.recostawalter.disney.entidad.Pelicula;
import com.recostawalter.disney.servicio.PeliculaServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author recos
 */
@RestController
@RequestMapping("/movies")
public class PeliculaControlador {

    @Autowired
    PeliculaServicio peliculaServicio;

    @GetMapping(value = "")
    public ResponseEntity<List<GetPeliculaDto>> listadoDePeliculas() {

        return new ResponseEntity<>(peliculaServicio.consultarTodasLasPeliculas(), HttpStatus.OK);
    }

    @GetMapping(value = "/detalles")
    public ResponseEntity<List<Pelicula>> listarDetallesDePeliculas() {
        return new ResponseEntity<>(peliculaServicio.consultarDetallesDePeliculas(), HttpStatus.OK);
    }

    @GetMapping(value = "", params = "name")
    public ResponseEntity<List<GetPeliculaDetallesDto>> listarPeliculaPorNombre(@RequestParam(value = "name") String nombre) {
        return new ResponseEntity<>(peliculaServicio.consultarPorTituloDePelicula(nombre), HttpStatus.OK);
    }

    @GetMapping(value = "", params = "genre")
    public ResponseEntity<List<GetPeliculaDetallesDto>> listarPeliculaIdGenero(@RequestParam(value = "genre") Long idGenero) {
        return new ResponseEntity<>(peliculaServicio.consultarPorIdGenero(idGenero), HttpStatus.OK);
    }
//
    @GetMapping(value = "", params = "order")
    public ResponseEntity<List<GetPeliculaDetallesDto>> listarPeliculaPorOrdenDeFecha(@RequestParam(value = "order") String order) {
       
        return new ResponseEntity<>(peliculaServicio.consultarPeliculaOrdenada(order.toUpperCase()), HttpStatus.OK);
    }

    @PostMapping(value = "/crear")
    public void crearPelicula(@RequestBody PostPeliculaDto postPeliculaDto) {
        peliculaServicio.crearNuevaPelicula(postPeliculaDto);
    }

    @PutMapping(value = "/modificar")
    public void modificarPelicula(@RequestBody PostPeliculaDto postPeliculaDto) {
        peliculaServicio.modificarPelicula(postPeliculaDto);
    }

    @DeleteMapping(value = "/eliminar/{id}")
    public void eliminarPelicula(@PathVariable Long id) {
        peliculaServicio.eliminarPelicula(id);
    }

}
