package Empleados;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpleadosService {
    private ArrayList<InformacionEmpleados> listaEmpleado;
    Scanner sc = new Scanner(System.in);
    public EmpleadosService() {
        listaEmpleado = new ArrayList<>();
    }
    public void menuService(){
        char opcion;
        do {
            System.out.println("menu de la empresa");
            System.out.println("1. agregar empleado");
            System.out.println("2. modificar empleado");
            System.out.println("3. eliminar empleado");
            System.out.println("4. listar empleados");
            System.out.println("5. listado de datos de acceso al sistema");
            System.out.println("6. Salir");
            opcion = sc.next().charAt(0);

            switch (opcion){
                case '1'->agregarEmpleado();
                case '2'->modificarEmpleado();
                case '3'->eliminarEmpleado();
                case '4'->listarEmpleados();
                case '5'->datosAcceso();
                default -> {
                    opcion = '6';
                    System.out.println("hasta mañana");
                }
            }
        }while (opcion!='6');
    }

    private void datosAcceso() {
        for (InformacionEmpleados empleados: listaEmpleado) {
            System.out.println("las contraseñas de acceso son: " + empleados.getContraseña() + " para el codigo " + empleados.getCodigo());

        }
    }

    private void listarEmpleados() {
        System.out.println("Los empleados son");
        for (InformacionEmpleados empleados : listaEmpleado) {
            System.out.println(empleados.getNombre() + " codigo: " + empleados.getCodigo() + " cargo " + empleados.getCargo());
        }
    }

    private void eliminarEmpleado() {
        System.out.println("vas a eliminar un empleado");
        int codigo = buscarEmpleado();
        if (codigo != -1) {
            listaEmpleado.remove(codigo);
            System.out.println("empleado eliminado");
        }else System.out.println("no existe el empleado");
    }

    private void modificarEmpleado() {
        System.out.println("vas a modificar un empleado");
        int codigo = buscarEmpleado();
        if (codigo!=-1){
            InformacionEmpleados empleadoModificado = listaEmpleado.get(codigo);
            System.out.println("ingrese el nombre");
            String nombre = sc.next();
            empleadoModificado.setNombre(nombre);
            System.out.println("ingrese la edad");
            String edad = sc.next();
            empleadoModificado.setEdad(edad);
            System.out.println("ingrese la ciudad");
            String ciudad = sc.next();
            empleadoModificado.setCiudad(ciudad);
            System.out.println("empleado es hombre o mujer");
            String sexo = sc.next();
            empleadoModificado.setSexo(sexo);
            System.out.println("ingrese el correo");
            String correo = sc.next();
            empleadoModificado.setCorreo(correo);
            System.out.println("ingrese el salario");
            String salario = sc.next();
            empleadoModificado.setSalario(salario);
            System.out.println("Ingrese el cargo");
            String cargo = sc.next();
            empleadoModificado.setCargo(cargo);
            System.out.println("ingrese la contraseña");
            String contraseña = sc.next();
            empleadoModificado.setContraseña(contraseña);
            System.out.println("ingrese el estado civil");
            String estadoCivil = sc.next();
            empleadoModificado.setEstadoCivil(estadoCivil);
        }
        else System.out.println("El empleado no existe");
    }
    private int buscarEmpleado() {
        System.out.println("ingrese el codigo del empleado");
        String codigo = sc.next();
        InformacionEmpleados empleadoEncontrado = null;
        for (InformacionEmpleados empleados : listaEmpleado) {
            if (codigo.equals(empleados.getCodigo())) {
                empleadoEncontrado = empleados;
                break;
            }

        }
        return listaEmpleado.indexOf(empleadoEncontrado);
    }

    private void agregarEmpleado() {
        System.out.println("empleado nuevo");
        System.out.println("Ingrese el codigo del empleado");
        String codigo = sc.next();
        System.out.println("ingrese el nombre");
        String nombre = sc.next();
        System.out.println("ingrese la edad");
        String edad = sc.next();
        System.out.println("ingrese la ciudad");
        String ciudad = sc.next();
        System.out.println("empleado es hombre o mujer");
        String sexo = sc.next();
        System.out.println("ingrese el correo");
        String correo = sc.next();
        System.out.println("ingrese el salario");
        String salario = sc.next();
        System.out.println("Ingrese el cargo");
        String cargo = sc.next();
        System.out.println("ingrese la contraseña");
        String contraseña = sc.next();
        System.out.println("ingrese el estado civil");
        String estadoCivil = sc.next();
        InformacionEmpleados informacionEmpleados = new InformacionEmpleados(codigo,nombre,edad,ciudad,sexo,correo,salario,cargo,contraseña,estadoCivil);
        listaEmpleado.add(informacionEmpleados);
    }
}
