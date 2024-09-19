package models;

import services.DireccionService;

public class Empleado {
    private String codigo;
    private String nombreEmpleado;
    private int horasTrabajadas;
    private double valorHora;
    private double sueldo;
    private DireccionService direccion;

    public Empleado(String codigo, String nombreEmpleado, int horasTrabajadas, double valorHora, double sueldo, DireccionService direccion) {
        this.codigo = codigo;
        this.nombreEmpleado = nombreEmpleado;
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
        this.sueldo = sueldo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public String getCodigo() {return codigo;}

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public DireccionService getDireccion() {
        return direccion;
    }
}

