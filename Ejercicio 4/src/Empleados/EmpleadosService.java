package Empleados;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpleadosService {
    private ArrayList<InformacionEmpleados> listaEmpleado;
    Scanner sc = new Scanner(System.in);
    public EmpleadosService() {
        listaEmpleado = new ArrayList<>();
    }
    private void menuService(){
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
    }

    private void listarEmpleados() {
    }

    private void eliminarEmpleado() {
    }

    private void modificarEmpleado() {
        System.out.println("vas a modificar un empleado");
        int codigo = buscarEmpleado();
        if (codigo!=-1){
            InformacionEmpleados empleadoModificado = listaEmpleado.get(codigo);
            System.out.println("ingrese el nombre");
            String nombre = sc.nextLine();
            empleadoModificado.setNombre(nombre);
            System.out.println("ingrese la edad");
            String edad = sc.next();
            System.out.println("ingrese la ciudad");
            String ciudad = sc.next();
            System.out.println("empleado es hombre o mujer");
            String sexo = sc.next();
            System.out.println("ingrese el correo");
            String correo = sc.nextLine();
            System.out.println("ingrese el salario");
            String salario = sc.next();
            System.out.println("Ingrese el cargo");
            String cargo = sc.nextLine();
            System.out.println("ingrese la contraseña");
            String contraseña = sc.nextLine();
            System.out.println("ingrese el estado civil");
            String estadoCivil = sc.nextLine();

        }
        else System.out.println("El empleado no existe");
    }
    private int buscarEmpleado() {
        Scanner sc = new Scanner(System.in);
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
        String codigo = sc.nextLine();
        System.out.println("ingrese el nombre");
        String nombre = sc.nextLine();
        System.out.println("ingrese la edad");
        String edad = sc.next();
        System.out.println("ingrese la ciudad");
        String ciudad = sc.next();
        System.out.println("empleado es hombre o mujer");
        String sexo = sc.next();
        System.out.println("ingrese el correo");
        String correo = sc.nextLine();
        System.out.println("ingrese el salario");
        String salario = sc.next();
        System.out.println("Ingrese el cargo");
        String cargo = sc.nextLine();
        System.out.println("ingrese la contraseña");
        String contraseña = sc.nextLine();
        System.out.println("ingrese el estado civil");
        String estadoCivil = sc.nextLine();
        InformacionEmpleados informacionEmpleados = new InformacionEmpleados(codigo,nombre,edad,ciudad,sexo,correo,salario,cargo,contraseña,estadoCivil);
        listaEmpleado.add(informacionEmpleados);
    }
}
