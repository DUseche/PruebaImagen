/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.pruebaConceptoImagen.servicios;

import edu.eci.pdsw.pruebaConceptoImagen.entities.Image;

/**
 *
 * @author 2107803
 */
public abstract class ServiciosImagen {
    private static final ServiciosImagen instance = new ServiciosImagenPersistence();
    
    public static ServiciosImagen getInstance() throws RuntimeException{
        return instance;
    }
    
    public abstract Image loadImagenByNombre(String nombre);
    public abstract void saveImage(Image image);
}
