/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recostawalter.disney.controlador;


import com.recostawalter.disney.dto.personaje.GetPersonajeDetallesDto;
import com.recostawalter.disney.dto.personaje.GetPersonajeDto;
import com.recostawalter.disney.dto.personaje.PostPersonajeDto;
import com.recostawalter.disney.entidad.Personaje;
import com.recostawalter.disney.servicio.PersonajeServicio;
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
@RequestMapping(value = "/characters")
public class PersonajeControlador {
    
    @Autowired
    PersonajeServicio personajeServicio;
    
    @GetMapping(value = "") // Mostrar Listado de Personajes : nombre e imagen
    public ResponseEntity<List<GetPersonajeDto>> listadoDePersonajes(){
        //return (ResponseEntity)personajeServicio.consultarTodosLosPersonajes();
        return new ResponseEntity<>(personajeServicio.consultarTodosLosPersonajes(), HttpStatus.OK);
    }
    
    @GetMapping(value = "/detalles")
    public ResponseEntity<List<Personaje>> listadoDetallesPersonajes(){
        return new ResponseEntity<>(personajeServicio.consultarDetallesDePersonajes(),HttpStatus.OK);
    }
    
    @GetMapping(value = "", params = "name")
    public ResponseEntity<List<GetPersonajeDetallesDto>> listarPersonajePorNombre(@RequestParam(value = "name") String nombre){
        return new ResponseEntity<>(personajeServicio.consultarPorNombreDePersonaje(nombre),HttpStatus.OK);
    }
    
    @GetMapping(value = "", params = "age")
    public ResponseEntity<List<GetPersonajeDetallesDto>> listarPersonajePorNombre(@RequestParam(value = "age") Integer edad){
        return new ResponseEntity<>(personajeServicio.consultarPorEdadDePersonaje(edad),HttpStatus.OK);
    }
    @GetMapping(value = "", params = "movies")
    public ResponseEntity<List<GetPersonajeDetallesDto>> listarPersonajePorNombre(@RequestParam(value = "movies") Long idPelicula){
        return new ResponseEntity<>(personajeServicio.consultarPersonajePorIdDePelicula(idPelicula),HttpStatus.OK);
    }
    
    
    @PostMapping(value = "/crear")//Grear nuevo personaje
    public void crearPersonaje(@RequestBody PostPersonajeDto postPersonajeDto){
        personajeServicio.crearNuevoPesonaje(postPersonajeDto);
    }
    
    @PutMapping(value = "/modificar")//Modifica Personaje
    public void modificarPersonaje(@RequestBody PostPersonajeDto postPersonajeDto){
        personajeServicio.modificarPersonaje(postPersonajeDto);
    }
    
    @DeleteMapping(value = "/eliminar/{id}")//Elimina Personaje
    public void eliminarPersonaje(@PathVariable Long id){
        personajeServicio.eliminarPersonaje(id);
    }
}
