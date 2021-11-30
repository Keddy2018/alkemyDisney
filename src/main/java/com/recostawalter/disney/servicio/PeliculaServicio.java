/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recostawalter.disney.servicio;

import com.recostawalter.disney.dto.pelicula.GetPeliculaDto;
import com.recostawalter.disney.dto.pelicula.GetPeliculaDetallesDto;
import com.recostawalter.disney.dto.pelicula.PostPeliculaDto;
import com.recostawalter.disney.entidad.Pelicula;
import com.recostawalter.disney.repositorio.PeliculaRepositorio;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author recos
 */
@Service
public class PeliculaServicio {

    @Autowired
    private PeliculaRepositorio peliculaRepositorio;

    public void crearNuevaPelicula(PostPeliculaDto postPeliculaDto) {
        Pelicula pelicula = new Pelicula();
        pelicula.setTitulo(postPeliculaDto.getTitulo());
        pelicula.setImagen(postPeliculaDto.getImagen());
        pelicula.setCalificacion(postPeliculaDto.getCalificacion());
        pelicula.setFechaCreacion(postPeliculaDto.getFechaCreacion());
        pelicula.setPersonajes(postPeliculaDto.getPersonaje());
        pelicula.setGenero(postPeliculaDto.getGenero());
        peliculaRepositorio.save(pelicula);
    }

    public void eliminarPelicula(Long id) {
        peliculaRepositorio.deleteById(id);

    }

    public void modificarPelicula(PostPeliculaDto postPeliculaDto) {
        Pelicula pelicula = new Pelicula();
        pelicula.setId(postPeliculaDto.getId());
        pelicula.setTitulo(postPeliculaDto.getTitulo());
        pelicula.setImagen(postPeliculaDto.getImagen());
        pelicula.setCalificacion(postPeliculaDto.getCalificacion());
        pelicula.setFechaCreacion(postPeliculaDto.getFechaCreacion());
        pelicula.setPersonajes(postPeliculaDto.getPersonaje());
        pelicula.setGenero(postPeliculaDto.getGenero());
        peliculaRepositorio.save(pelicula);
    }

    public void consultarUnaPelicula() {

    }

    public List<GetPeliculaDto> consultarTodasLasPeliculas() {
        List<Pelicula> peliculas = peliculaRepositorio.findAll();
        List<GetPeliculaDto> getPeliculaDtoListado = new ArrayList<>();
        for (Pelicula pelicula : peliculas) {
            GetPeliculaDto getPeliculaDto = new GetPeliculaDto();
            getPeliculaDto.setTitulo(pelicula.getTitulo());
            getPeliculaDto.setImagen(pelicula.getImagen());
            getPeliculaDto.setFechaCreacion(pelicula.getFechaCreacion());
            getPeliculaDtoListado.add(getPeliculaDto);
        }
        return getPeliculaDtoListado;
    }

    public List<Pelicula> consultarDetallesDePeliculas() {
        return peliculaRepositorio.findAll();
    }

    public List<GetPeliculaDetallesDto> consultarPorTituloDePelicula(String titulo) {
        List<Pelicula> peliculas = peliculaRepositorio.buscarPeliculaPorNombre(titulo);
        List<GetPeliculaDetallesDto> consultarFiltroNombrePelicula = new ArrayList<>();
        for (Pelicula pelicula : peliculas) {
            GetPeliculaDetallesDto getPeliculaFiltrada = new GetPeliculaDetallesDto();

            getPeliculaFiltrada.setId(pelicula.getId());
            getPeliculaFiltrada.setTitulo(pelicula.getTitulo());
            getPeliculaFiltrada.setCalificacion(pelicula.getCalificacion());
            getPeliculaFiltrada.setImagen(pelicula.getImagen());
            getPeliculaFiltrada.setFechaCreacion(pelicula.getFechaCreacion());
            getPeliculaFiltrada.setGenero(pelicula.getGenero());

            consultarFiltroNombrePelicula.add(getPeliculaFiltrada);
        }
        return consultarFiltroNombrePelicula;
    }

    public List<GetPeliculaDetallesDto> consultarPeliculaOrdenada(String order) {

        List<Pelicula> peliculas;
        if (order.equals("ASC")) {
            peliculas = peliculaRepositorio.buscarPeliculaOrdenadaAsc();
        } else {
            peliculas = peliculaRepositorio.buscarPeliculaOrdenadaDesc();
        }
        List<GetPeliculaDetallesDto> consultarFiltroNombrePelicula = new ArrayList<>();
        for (Pelicula pelicula : peliculas) {
            GetPeliculaDetallesDto getPeliculaFiltrada = new GetPeliculaDetallesDto();

            getPeliculaFiltrada.setId(pelicula.getId());
            getPeliculaFiltrada.setTitulo(pelicula.getTitulo());
            getPeliculaFiltrada.setCalificacion(pelicula.getCalificacion());
            getPeliculaFiltrada.setImagen(pelicula.getImagen());
            getPeliculaFiltrada.setFechaCreacion(pelicula.getFechaCreacion());
            getPeliculaFiltrada.setGenero(pelicula.getGenero());

            consultarFiltroNombrePelicula.add(getPeliculaFiltrada);
        }
        return consultarFiltroNombrePelicula;
    }

    public List<GetPeliculaDetallesDto> consultarPorIdGenero(Long idGenero) {
        List<Pelicula> peliculas = peliculaRepositorio.buscarPeliculaPorGenero(idGenero);
        List<GetPeliculaDetallesDto> consultarFiltroNombrePelicula = new ArrayList<>();
        for (Pelicula pelicula : peliculas) {
            GetPeliculaDetallesDto getPeliculaFiltrada = new GetPeliculaDetallesDto();
            getPeliculaFiltrada.setId(pelicula.getId());
            getPeliculaFiltrada.setTitulo(pelicula.getTitulo());
            getPeliculaFiltrada.setCalificacion(pelicula.getCalificacion());
            getPeliculaFiltrada.setImagen(pelicula.getImagen());
            getPeliculaFiltrada.setFechaCreacion(pelicula.getFechaCreacion());
            getPeliculaFiltrada.setGenero(pelicula.getGenero());

            consultarFiltroNombrePelicula.add(getPeliculaFiltrada);
        }
        return consultarFiltroNombrePelicula;

    }

    public void listarPeliculaPorOrdenDeFecha(String orden) {

    }

}
