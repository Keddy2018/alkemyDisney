/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recostawalter.disney.entidad;

import com.recostawalter.disney.Enumeradores.PermisosEnumerador;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import org.hibernate.validator.constraints.Length;



/**
 *
 * @author recos
 */
@Entity
public class Usuario  {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    
    //@Length(min = 4, max = 10, message = "El usuario debe tener como minimo 4 caracteres y un maximo de 10 caracteres")
    private String user;
    
    
    //@Length(min = 4, max = 50, message = "La clave debe tener como minimo 4 caracteres y un maximo de 10 caracteres")
    private String clave;
    
    @Email(message = "El mail no es valido")
    private String mail;
    
    
    
    @Enumerated(EnumType.STRING)
    private PermisosEnumerador permiso;

    
    public Usuario() {
    }

    public Usuario(Long id, String user, String clave, String mail, PermisosEnumerador permiso) {
        this.id = id;
        this.user = user;
        this.clave = clave;
        this.mail = mail;
        this.permiso = permiso;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public PermisosEnumerador getPermiso() {
        return permiso;
    }

    public void setPermiso(PermisosEnumerador permiso) {
        this.permiso = permiso;
    }


 
}
