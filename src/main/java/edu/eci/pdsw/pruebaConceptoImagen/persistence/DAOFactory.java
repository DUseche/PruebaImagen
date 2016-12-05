/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.pruebaConceptoImagen.persistence;

import edu.eci.pdsw.pruebaConceptoImagen.persistence.myBatis.MyBatisDAOFactory;
import java.util.Properties;

/**
 *
 * @author zawsx
 */
public abstract class DAOFactory {

    private static DAOFactory instance = null;

    /**
     * Obtiene una instancia del DAOFactory
     *
     * @param appProperties Las propiedades del instance
     * @return La DAOFactory concerniente a las properties
     */
    public static DAOFactory getInstance(Properties appProperties) {
        if (instance == null) {
            synchronized (DAOFactory.class) {
                if (instance == null) {
                    if (appProperties.get("dao").equals("mybatis")) {
                        instance = new MyBatisDAOFactory(appProperties.getProperty("config"));
                    } else {
                        throw new RuntimeException("Wrong configuration: Unsupported DAO:" + appProperties.get("dao"));
                    }
                }
            }
        }
        return instance;
    }

    /**
     * Inicia una nueva sesion
     */
    public abstract void beginSession();

    /**
     * Hace commit a los cambios hechos
     */
    public abstract void commitTransaction();

    /**
     * Hace rollback de los cambios hechos
     */
    public abstract void rollbackTransaction();

    /**
     * Cierra la sesion actual
     */
    public abstract void endSession(); 
    
    public abstract DaoImagen getDaoImagen();
}
