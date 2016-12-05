/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.pruebaConceptoImagen.persistence.myBatis;

import java.sql.Blob;
import edu.eci.pdsw.pruebaConceptoImagen.entities.Image;
import edu.eci.pdsw.pruebaConceptoImagen.persistence.DaoImagen;
import edu.eci.pdsw.pruebaConceptoImagen.persistence.myBatis.mappers.ImagenMapper;
import org.apache.ibatis.session.SqlSession;

/**
 *
 * @author 2107803
 */
public class MyBatisDaoImagen implements DaoImagen{

    private SqlSession ses;
    private ImagenMapper imap;
    
    public MyBatisDaoImagen(SqlSession sesi){
        ses=sesi;
        imap=ses.getMapper(ImagenMapper.class);
    }
    
    @Override
    public Image loadImage(String nombre) {
        return imap.load(nombre);
    }

    @Override
    public void saveImage(String name, byte[] image) {
        imap.save(name, image);
    }
    
}
