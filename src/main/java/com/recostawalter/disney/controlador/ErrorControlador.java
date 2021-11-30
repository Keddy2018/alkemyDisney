/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recostawalter.disney.controlador;

import com.recostawalter.disney.mensaje.MensajeError;
import java.util.Enumeration;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author recos
 */
@Controller

public class ErrorControlador implements ErrorController {

    @Autowired
    MensajeError mensajeError;

    @RequestMapping(value = "/error", method = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
    public ResponseEntity<MensajeError> paginaErrorPersonalizado(HttpServletRequest httpRequest) {
//        MensajeError mensajeError = new MensajeError() ;
        int httpErrorCode = getErrorCode(httpRequest);
        mensajeError.setCodigoError(httpErrorCode);
        switch (httpErrorCode) {
            case 400: {

                mensajeError.setMensajeError("El recurso solicitado no existe");
                break;
            }
            case 403: {

                mensajeError.setMensajeError("No tiene permisos para acceder al recurso.");
                break;
            }
            case 401: {

                mensajeError.setMensajeError("No se encuentra autorizado.");
                break;
            }

            case 404: {

                mensajeError.setMensajeError("El recurso solicitado no fue encontrado.");
                break;
            }

            case 500: {

                mensajeError.setMensajeError("Ocurrio un error interno.");
                break;

            }
            case 405: {

                mensajeError.setMensajeError("No tiene permisos para acceder a la url.");
                break;

            }
            default: {
                mensajeError.setMensajeError("No hay un mensaje de error especifico para el codigo");
            }

        }

        return new ResponseEntity<>(mensajeError, HttpStatus.OK);

    }

    private int getErrorCode(HttpServletRequest httpRequest) {

        Map mapa = httpRequest.getParameterMap();
        for (Object key : mapa.keySet()) {
            String[] valores = (String[]) mapa.get(key);
            for (String valor : valores) {
                System.out.println(key.toString() + " : " + valor);
            }
        }

        Enumeration<String> atributos = httpRequest.getAttributeNames();
        while (atributos.hasMoreElements()) {
            String key = atributos.nextElement();
            System.out.println(key + " : " + httpRequest.getAttribute(key));
        }
        return (int) httpRequest.getAttribute("javax.servlet.error.status_code");
    }

    //@Override
    public String getErrorPath() {
        return "/error";
    }
}
