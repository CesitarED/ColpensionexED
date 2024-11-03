package co.edu.uniquindio.modelo;

public class Ciudad {
    private Integer idDepa;
    private Integer idPais;
    private Integer idCiudad;
    private String nombre;

    public Ciudad() {
        this.idDepa = null;
        this.idPais = null;
        this.idCiudad = null;
        this.nombre = null;
    }

    public Ciudad(Integer idDepa, Integer idPais, Integer idCiudad,String nombre) {
        this.idDepa = idDepa;
        this.idPais = idPais;
        this.idCiudad = idCiudad;
        this.nombre = nombre;

    }

    public Integer getIdDepa() { return idDepa; }

    public void setIdDepa(Integer idDepa) { this.idDepa = idDepa; }

    public Integer getIdPais() { return idPais; }

    public void setIdPais(Integer idPais) { this.idPais = idPais; }

    public Integer getIdCiudad() { return idCiudad; }

    public void setIdCiudad(Integer idCiudad) {this.idCiudad = idCiudad;}

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }


    @Override
    public String toString() {
        return "Ciudad{"+
                "idDepa=" + idDepa +
                ", idPais=" + idPais +
                ", idCiudad=" + idCiudad +
                ", nombre='" + nombre + '\'' +
                '}';


    }

}
