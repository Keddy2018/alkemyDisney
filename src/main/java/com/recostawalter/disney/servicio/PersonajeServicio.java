/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recostawalter.disney.servicio;

import com.recostawalter.disney.dto.personaje.GetPersonajeDetallesDto;
import com.recostawalter.disney.dto.personaje.GetPersonajeDto;
import com.recostawalter.disney.dto.personaje.PostPersonajeDto;
import com.recostawalter.disney.entidad.Personaje;
import com.recostawalter.disney.repositorio.PersonajeRepositorio;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author recos
 */
@Service
public class PersonajeServicio {

    @Autowired
    private PersonajeRepositorio personajeRepositorio;

    public void crearNuevoPesonaje(PostPersonajeDto postPersonajeDto) {
        Personaje personaje = new Personaje();
        personaje.setId(postPersonajeDto.getId());
        personaje.setNombre(postPersonajeDto.getNombre());
        personaje.setEdad(postPersonajeDto.getEdad());
        personaje.setImagen(postPersonajeDto.getImagen());
        personaje.setHistoria(postPersonajeDto.getHistoria());
        personaje.setPeso(postPersonajeDto.getPeso());
        personaje.setPeliculas(postPersonajeDto.getPelicula());
        personajeRepositorio.save(personaje);

    }

    public void eliminarPersonaje(Long id) {
        personajeRepositorio.deleteById(id);
    }

    public void modificarPersonaje(PostPersonajeDto postPersonajeDto) {
        Personaje personaje = new Personaje();
        personaje.setId(postPersonajeDto.getId());
        personaje.setNombre(postPersonajeDto.getNombre());
        personaje.setEdad(postPersonajeDto.getEdad());
        personaje.setImagen(postPersonajeDto.getImagen());
        personaje.setHistoria(postPersonajeDto.getHistoria());
        personaje.setPeso(postPersonajeDto.getPeso());
        personaje.setPeliculas(postPersonajeDto.getPelicula());
        personajeRepositorio.save(personaje);

    }

    public List<Personaje> consultarDetallesDePersonajes() {
        return personajeRepositorio.findAll();
    }

    public List<GetPersonajeDetallesDto> consultarPorNombreDePersonaje(String nombre) {
        List<Personaje> personajes = personajeRepositorio.buscarPersonajePorNombre(nombre);
        List<GetPersonajeDetallesDto> nombreDePersonajes = new ArrayList<>();
        for (Personaje personaje : personajes) {
            GetPersonajeDetallesDto filtroDto = new GetPersonajeDetallesDto();
            filtroDto.setNombre(personaje.getNombre());
            filtroDto.setEdad(personaje.getEdad());
            filtroDto.setPelicula(personaje.getPeliculas());

            nombreDePersonajes.add(filtroDto);
        }
        return nombreDePersonajes;
    }

    public List<GetPersonajeDetallesDto> consultarPorEdadDePersonaje(Integer edad) {
        List<Personaje> personajes = personajeRepositorio.buscarPersonajePorEdad(edad);
        List<GetPersonajeDetallesDto> nombreDePersonajes = new ArrayList<>();
        for (Personaje personaje : personajes) {
            GetPersonajeDetallesDto filtroDto = new GetPersonajeDetallesDto();
            filtroDto.setNombre(personaje.getNombre());
            filtroDto.setEdad(personaje.getEdad());
            filtroDto.setPelicula(personaje.getPeliculas());
            nombreDePersonajes.add(filtroDto);
        }
        return nombreDePersonajes;
    }

    public List<GetPersonajeDetallesDto> consultarPersonajePorIdDePelicula(Long idPelicula) {
        List<Personaje> personajes = personajeRepositorio.buscarPersonajePorIdPelicula(idPelicula);
        List<GetPersonajeDetallesDto> nombreDePersonajes = new ArrayList<>();
        for (Personaje personaje : personajes) {
            GetPersonajeDetallesDto filtroDto = new GetPersonajeDetallesDto();
            filtroDto.setNombre(personaje.getNombre());
            filtroDto.setEdad(personaje.getEdad());
            filtroDto.setPelicula(personaje.getPeliculas());
            nombreDePersonajes.add(filtroDto);
        }
        return nombreDePersonajes;
    }

    public List<GetPersonajeDto> consultarTodosLosPersonajes() {
        List<Personaje> personajes = personajeRepositorio.findAll();
        List<GetPersonajeDto> personajesDto = new ArrayList<>();
        for (Personaje personaje : personajes) {
            personajesDto.add(new GetPersonajeDto(personaje.getNombre(), personaje.getImagen()));
        }
        return personajesDto;
    }
    
    
    


}
