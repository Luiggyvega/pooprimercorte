package TelefononiaYCliente;

public class Cliente {
    private String nombre;
    private String apellido;
    private String nombrePlan;
    private String docuementoIdentidad;
    private int numeroCelular;
    private String direccion;

    public Cliente(String nombre, String apellido, String nombrePlan, String docuementoIdentidad, int numeroCelular, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nombrePlan = nombrePlan;
        this.docuementoIdentidad = docuementoIdentidad;
        this.numeroCelular = numeroCelular;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombrePlan() {
        return nombrePlan;
    }

    public String getDocuementoIdentidad() {
        return docuementoIdentidad;
    }
}
