//"sonar"= analizador de codigo aplicacion
// expresiones landa investiga

import models.Empleado;
import services.EmpleadoService;

import java.util.Scanner;

public class Aplicacion {


    public static void main(String[] args) {
        EmpleadoService empleadoService = new EmpleadoService();
        empleadoService.menu();


//        System.out.println("ingrese el nombre del empleado: ");
//        String nombre = sc.next();
//        System.out.println("ingrese las horas trabajadas: ");
//        int horas = sc.nextInt();
//        System.out.println("ingrese el valor de la hora: ");
//        double valor = sc.nextDouble();
//        models.Empleado empleado = new models.Empleado(nombre,horas,valor);
//        empleado.calcularsueldo();
//        System.out.println();

    }
}