package co.edu.uniquindio.repositorio.csv;

import co.edu.uniquindio.modelo.Departamento;

import java.io.IOException;

public class DepartamentoDao extends ADao<Departamento, String> {

    public DepartamentoDao() throws IOException {
        super("C:\\Users\\MI PC\\Downloads\\departamento.csv");
    }
}
