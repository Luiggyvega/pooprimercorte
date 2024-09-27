package estudiantes;

public class Estudiantes {
    private String nombre;
    private String codigo;
    private String edad;
    private String carrera;
    private NotasEstudiante notasNuevas;
    private static double Parciales = 0.23;
    private static double Examen = 0.31;

    public Estudiantes(String nombre, String codigo, String edad, String carrera, NotasEstudiante notasNuevas) {
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

    public void setNotasNuevas(NotasEstudiante notasNuevas) {
        this.notasNuevas = notasNuevas;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNotasDefinitivas() {

        double primer= notasNuevas.getNota1()*Parciales;
        double segundo = notasNuevas.getNota2()*Parciales;
        double tercero = notasNuevas.getNota3()*Parciales;
        double cuarto = notasNuevas.getNota4()*Examen;
        double definitiva = primer + segundo + tercero + cuarto;
        return definitiva;
    }
}
