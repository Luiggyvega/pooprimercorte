package services;

import models.Empleado;

import java.util.Scanner;

public class EmpleadoService {
    private Scanner sc;
    private Empleado empleado;
    private Empleado[] listaEmpleado;

    public EmpleadoService() {
        sc = new Scanner(System.in);
        crearListaEmpleado();
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
        for (int  i = 0; i < listaEmpleado.length; i++) {
            System.out.println("nombre del empleado: " + listaEmpleado[i].getNombreEmpleado() + "| sueldo del empleado: " + listaEmpleado[i].getSueldo());

        }
    }

    private int buscarEmpleado() {
        System.out.println("BUSCAR EMPLEADO");
        System.out.println("Ingrese el codigo del empleado");
        String codigo = sc.next();
        for (int i=0; i < listaEmpleado.length; i++){
            if (listaEmpleado[i].getCodigo().equals(codigo)) {
                System.out.println("El empleado es: " + listaEmpleado[i].getNombreEmpleado());

            }
            else System.out.println("El empleado no existe");
        }


        return 0;
    }

    private double modificarEmpleado() {
        System.out.println("MODIFICAR EMPLEADO");
        int posicion = buscarEmpleado();
        if (posicion != -1) {
            empleado = listaEmpleado[posicion];
            System.out.println("Ingrese el nuevo nombre");
            empleado.setNombreEmpleado(sc.next());
            System.out.println("Ingrese las horas");
            int horas = sc.nextInt();
            empleado.setHorasTrabajadas(horas);
            System.out.println("Ingrese las valor de la hora");
            double valor = sc.nextDouble();
            empleado.setValorHora(valor);
           empleado.getSueldo(calcularSalario(horas,valor))
        }
        return 0;
    }
        private double calcularSalario(int horas, double valor) {
            return horas * valor;
        }

    private void crearEmpleado() {
        System.out.println("CREAR EMPLEADOS");
        for (int i = 0; i < listaEmpleado.length; i++) {
            System.out.println("Empleado nuevo");
            System.out.println("ingrese el codigo del empleado");
            String codigo = sc.next();
            System.out.println("ingrese el nombre del empleado");
            String nombreEmpleado = sc.next();
            System.out.println(" ingrese horas Trabajadas");
            int horasTrabajadas = sc.nextInt();
            System.out.println("ingrese el valor de la hora trabajada");
            double valorHora = sc.nextDouble();
            listaEmpleado[i] = new Empleado(codigo, nombreEmpleado, horasTrabajadas, valorHora, horasTrabajadas*valorHora);
        }
    }

    private void crearListaEmpleado() {
        System.out.println("ingrese la cantidad de empleados de la empresa X");
        listaEmpleado = new Empleado[sc.nextInt()];
    }
}



