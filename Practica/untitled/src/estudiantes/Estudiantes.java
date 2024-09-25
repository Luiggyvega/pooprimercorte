package estudiantes;

public class Estudiantes {
    private String nombre;
    private String codigo;
    private String edad;
    private String carrera;
    private notasEstudiante notasNuevas;

    public Estudiantes(String nombre, String codigo, String edad, String carrera, notasEstudiante notasNuevas) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.edad = edad;
        this.carrera = carrera;
        this.notasNuevas = notasNuevas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setNotasNuevas(notasEstudiante notasNuevas) {
        this.notasNuevas = notasNuevas;
    }

    public String getNombre() {
        return nombre;
    }

    public notasEstudiante getNotasNuevas() {
        return notasNuevas;
    }
}
