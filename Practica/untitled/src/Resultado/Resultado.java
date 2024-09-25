package Resultado;

import estudiantes.Estudiantes;

import java.util.ArrayList;
import java.util.Scanner;

import estudiantes.notasEstudiante;

public class Resultado {

    private static ArrayList<Estudiantes> listaEstudiantes = new ArrayList<>();
    private notasEstudiante notasEstudiante;

    public static void registro() {
        Scanner sc = new Scanner(System.in);
        char opcion;
        do {
            System.out.println("Ingrese 1 para crear estudiante");
            System.out.println("ingrese 2 para mostar estudiantes y notas");
            System.out.println("Ingrese s para salir");
            System.out.println("Ingrese su opción");
            opcion = sc.next().charAt(0);

            switch (opcion) {
                case '1' -> crearEstudiante();
                case '2' -> mostrarEstudiante();
                default -> {
                    opcion = 's';
                    System.out.println("Hasta mañana");
                }
            }
        } while (opcion != 's');
    }
    public static void mostrarEstudiante() {

        for (Estudiantes est : listaEstudiantes) {
            est.getNotasNuevas();
            System.out.println("estudiante: " + est.getNombre() + "notas: " + est.getNotasNuevas() );
        }
    }

    public static void crearEstudiante() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese los datos del estudiante");

        System.out.println("Ingrese el nombre del estudiante:");
        String nombre = sc.next();

        System.out.println("Ingrese el código del estudiante:");
        String codigo = sc.next();

        System.out.println("Ingrese la edad del estudiante:");
        String edad = sc.next();

        System.out.println("Ingrese la carrera del estudiante:");
        String carrera = sc.next();

        System.out.println("ingrese la nota del examen uno");
        double nota1=sc.nextDouble();
        System.out.println("ingrese la nota del examen dos");
        double nota2=sc.nextDouble();
        System.out.println("ingrese la nota de la tercera nota");
        double nota3=sc.nextDouble();
        System.out.println("ingrese la nota del examen final");
        double nota4=sc.nextDouble();

        notasEstudiante notas = new notasEstudiante(nota1,nota2,nota3,nota4);
        Estudiantes estudiante = new Estudiantes(nombre, codigo, edad, carrera, notas);
        listaEstudiantes.add(estudiante);

    }
}

