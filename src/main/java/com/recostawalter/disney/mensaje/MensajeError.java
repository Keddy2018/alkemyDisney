/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recostawalter.disney.mensaje;

import java.io.Serializable;
import org.springframework.stereotype.Component;


/**
 *
 * @author recos
 */
@Component
public class MensajeError implements Serializable{
    
    private Integer codigoError;
    private String mensajeError;

    public MensajeError() {
    }

    public MensajeError(Integer codigoError, String mensajeError) {
        this.codigoError = codigoError;
        this.mensajeError = mensajeError;
    }

    public Integer getCodigoError() {
        return codigoError;
    }

    public void setCodigoError(Integer codigoError) {
        this.codigoError = codigoError;
    }

    public String getMensajeError() {
        return mensajeError;
    }

    public void setMensajeError(String mensajeError) {
        this.mensajeError = mensajeError;
    }


    
    
}
