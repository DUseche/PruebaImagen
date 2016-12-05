/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.pruebaConceptoImagen.persistence;
/**
 *
 * @author 2107803
 */
import java.sql.Blob;
import edu.eci.pdsw.pruebaConceptoImagen.entities.Image;
public interface DaoImagen {

    public Image loadImage(String id); 
    
    public void saveImage(String name, byte[] image);
    
}
