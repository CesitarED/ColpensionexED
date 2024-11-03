package co.edu.uniquindio.repositorio.csv;

import co.edu.uniquindio.modelo.Ciudad;

import java.io.IOException;

public class CiudadDao extends  ADao<Ciudad, String> {

    public CiudadDao() throws IOException {

        super("C:\\Users\\MI PC\\Desktop\\ciudades.csv");
    }

}
