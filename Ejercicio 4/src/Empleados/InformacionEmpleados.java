package Empleados;

public class InformacionEmpleados {
    private String codigo;
    private String nombre;
    private String edad;
    private String ciudad;
    private String sexo;
    private String correo;
    private String salario;
    private String cargo;
    private String contraseña;
    private String estadoCivil;

    public InformacionEmpleados(String codigo, String nombre, String edad, String ciudad, String sexo, String correo, String salario, String cargo, String contraseña, String estadoCivil) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
        this.sexo = sexo;
        this.correo = correo;
        this.salario = salario;
        this.cargo = cargo;
        this.contraseña = contraseña;
        this.estadoCivil = estadoCivil;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getCargo() {
        return cargo;
    }
}
