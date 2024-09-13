package services;

import models.Empleado;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpleadoService {
    private Scanner sc;
    private Empleado empleado;
    private ArrayList<Empleado> listaEmpleado;

    public EmpleadoService() {
        listaEmpleado = new ArrayList<>();
        sc = new Scanner(System.in);
    }

    public void menu() {
        char opcion;
        do {
            System.out.println("***Menu***");
            System.out.println("1 - crear empleado");
            System.out.println("2 - modificar empledo");
            System.out.println("3 - buscar empleado");
            System.out.println("4 - listar empleado");
            System.out.println("s - salir");
            System.out.println("ingrese una opcion del menu");
            opcion = sc.next().charAt(0);

            switch (opcion) {
                case '1' -> crearEmpleado();
                case '2' -> modificarEmpleado();
                case '3' -> buscarEmpleado();
                case '4' -> listarEmpleado();
                default -> {
                    opcion = 's';
                    System.out.println("hasta mañana");
                }
            }

        } while (opcion != 's');

    }

    private void listarEmpleado() {
        System.out.println("LISTA DE EMPLEADOS");
        for (Empleado empleado : listaEmpleado) {
            System.out.println("nombre del empleado: " + empleado.getNombreEmpleado() + " sueldo " + empleado.getSueldo());

        }
    }

    private int buscarEmpleado() {
        System.out.println("BUSCAR EMPLEADO");
        System.out.println("Ingrese el codigo del empleado");
        String codigo = sc.next();
        Empleado empleadoEncontado = null;
        for (Empleado empleado : listaEmpleado) {
            if (empleado.getCodigo().equals(codigo)) {
                System.out.println("El codigo corresponde a: " + empleado.getNombreEmpleado());
                empleadoEncontado = empleado;
            }
        }
        return listaEmpleado.indexOf(empleadoEncontado);
    }

    private double modificarEmpleado() {
        System.out.println("MODIFICAR EMPLEADO");
        int posicion = buscarEmpleado();
        if (posicion != -1) {
            empleado = listaEmpleado.get(posicion);
            System.out.println("Ingrese el nuevo nombre");
            empleado.setNombreEmpleado(sc.next());
            System.out.println("Ingrese las horas");
            int horas = sc.nextInt();
            empleado.setHorasTrabajadas(horas);
            System.out.println("Ingrese valor de la hora");
            double valor = sc.nextDouble();
            empleado.setValorHora(valor);

        }
        return 0;
    }

    private void crearEmpleado() {
        System.out.println("CREAR EMPLEADOS");
        System.out.println("Empleado nuevo");
        System.out.println("ingrese el codigo del empleado");
        String codigo = sc.next();
        if (codigoYaExiste(codigo)) {
            System.out.println("El código del empleado ya existe: ingrese un código único.");
            return;
        }
        System.out.println("ingrese el nombre del empleado");
        String nombreEmpleado = sc.next();
        System.out.println(" ingrese horas Trabajadas");
        int horasTrabajadas = sc.nextInt();
        System.out.println("ingrese el valor de la hora trabajada");
        double valorHora = sc.nextDouble();
        listaEmpleado.add(new Empleado(codigo, nombreEmpleado, horasTrabajadas, valorHora, horasTrabajadas * valorHora));
    }

    private boolean codigoYaExiste(String codigo) {
        for (Empleado empleado : listaEmpleado) {
            if (empleado.getCodigo().equals(codigo)) {
                return true;
            }
        }
        return false;
    }
}






