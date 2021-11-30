/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recostawalter.disney.dto.login;

import java.io.Serializable;

/**
 *
 * @author recos
 */
public class PostLoginDto implements Serializable {
    
    private String mailUser;
    private String clave;

    public PostLoginDto() {
    }

    public PostLoginDto(String mailUser, String clave) {
        this.mailUser = mailUser;
        this.clave = clave;
    }

    public String getMailUser() {
        return mailUser;
    }

    public void setMailUser(String mailUser) {
        this.mailUser = mailUser;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    
}
