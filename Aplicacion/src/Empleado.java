public class Empleado {
    private String nombreEmpleado;
    private int horasTrabajadas;
    private double valorHora;
    private double sueldo;

    public Empleado() {
        this.nombreEmpleado = "no definido";
        this.horasTrabajadas = 0;
        this.valorHora = 0;
    }

    public Empleado(String nombreEmpleado, int horasTrabajadas, double valorHora) {
        this.nombreEmpleado = nombreEmpleado;
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    public void calcularsueldo(){
        this.sueldo = this.horasTrabajadas * this.valorHora;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }
}
