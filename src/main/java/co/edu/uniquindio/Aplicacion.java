package co.edu.uniquindio;

import co.edu.uniquindio.modelo.Ciudad;
import co.edu.uniquindio.modelo.Departamento;
import co.edu.uniquindio.modelo.Pais;
import co.edu.uniquindio.repositorio.csv.CiudadDao;
import co.edu.uniquindio.repositorio.csv.DepartamentoDao;
import co.edu.uniquindio.repositorio.csv.PaisDao;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.List;

public class Aplicacion {

    public static void main(String[] args) throws IOException {

        PaisDao paisDao = new PaisDao();
        List<Pais> paises = paisDao.obtenerTodos();

        for (Pais pais : paises) {
            System.out.println(pais.toString());
        }

        DepartamentoDao deptoDao = new DepartamentoDao();
        List<Departamento> deptos = deptoDao.obtenerTodos();

        for(Departamento depto : deptos) {
            System.out.println(depto.toString());

        }

        CiudadDao ciudadDao = new CiudadDao();
        List<Ciudad> ciudades = ciudadDao.obtenerTodos();

        for (Ciudad ciudad : ciudades) {
            System.out.println(ciudad.toString());
        }

    }

    public static void ejemploReflection() {
        try {
            Class<Pais> claseEntidad = Pais.class;
            Pais paisEjemplo = claseEntidad.getDeclaredConstructor().newInstance();
            Field field = Pais.class.getDeclaredField("nombre");
            field.setAccessible(true);
            field.set(paisEjemplo, "Juan Pérez");
            System.out.println(paisEjemplo);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
