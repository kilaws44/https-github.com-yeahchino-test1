/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fifa.controlador;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author nicol
 */
@Named(value = "rondaManagedBean")
@SessionScoped
public class RondaManagedBean implements Serializable {

    /**
     * Creates a new instance of RondaManagedBean
     */
    public RondaManagedBean() {
    }
    
}
