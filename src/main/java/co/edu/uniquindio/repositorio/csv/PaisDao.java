package co.edu.uniquindio.repositorio.csv;

import co.edu.uniquindio.modelo.Pais;
import java.io.IOException;

public class PaisDao extends ADao<Pais, Integer> {

    public PaisDao() throws IOException {
        super("C:\\Users\\MI PC\\Downloads\\pais.csv");
    }
}
