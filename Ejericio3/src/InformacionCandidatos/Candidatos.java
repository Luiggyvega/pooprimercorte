package InformacionCandidatos;

public class Candidatos {
    private String nombre;
    private int cantidadVotos;

    public Candidatos(String nombre, int cantidadVotos) {
        this.nombre = nombre;
        this.cantidadVotos = cantidadVotos;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadVotos() {
        return cantidadVotos;
    }

    public void setCantidadVotos(int cantidadVotos) {
        this.cantidadVotos = cantidadVotos;
    }

}
