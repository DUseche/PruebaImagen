/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.pruebaConceptoImagen.servicios;

import edu.eci.pdsw.pruebaConceptoImagen.entities.Image;
import edu.eci.pdsw.pruebaConceptoImagen.persistence.DAOFactory;
import edu.eci.pdsw.pruebaConceptoImagen.persistence.DaoImagen;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 *
 * @author zawsx
 */
public class ServiciosImagenPersistence extends ServiciosImagen {

    private DAOFactory daoF;
    private DaoImagen daoI;
    
    public ServiciosImagenPersistence() {
        try {
            InputStream input = getClass().getClassLoader().getResource("applicationconfig_test.properties").openStream();

            Properties properties = new Properties();
            properties.load(input);
            daoF = DAOFactory.getInstance(properties);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public Image loadImagenByNombre(String nombre) {
        daoF.beginSession();
        daoI = daoF.getDaoImagen();
        Image imagen = daoI.loadImage(nombre);
        daoF.endSession();
        return imagen;
    }

    @Override
    public void saveImage(Image image) {
        daoF.beginSession();
        daoI = daoF.getDaoImagen();
        daoI.saveImage(image.getName(), image.getImg());
        daoF.commitTransaction();
        daoF.endSession();
    }

}
