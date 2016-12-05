/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.pruebaConceptoImagen.persistence.myBatis.mappers;

import java.sql.Blob;
import edu.eci.pdsw.pruebaConceptoImagen.entities.Image;
import org.apache.ibatis.annotations.Param;

/**
 *
 * @author 2107803
 */
public interface ImagenMapper {
    public Image load(@Param("nombre") String nombre);
    public void save(@Param("nombre") String nombre, @Param("image") byte[] image);
}
