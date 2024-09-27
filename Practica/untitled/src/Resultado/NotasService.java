package Resultado;

import estudiantes.Estudiantes;

import java.util.ArrayList;
import java.util.Scanner;

import estudiantes.NotasEstudiante;

public class NotasService {

    private static ArrayList<Estudiantes> listaEstudiantes;
    private NotasEstudiante notasEstudiante;
    private double promedio;

    public NotasService() {
        listaEstudiantes = new ArrayList<>();
    }

    public void Registro() {
        Scanner sc = new Scanner(System.in);
        char opcion;
        do {
            System.out.println("Ingrese 1 para crear estudiante");
            System.out.println("ingrese 2 para mostar estudiantes y definitivas");
            System.out.println("ingrese 3 para mostrar promedio de notas del grupo");
            System.out.println("ingrese 4 para ver que estudiantes estan debajo del promedio del grupo");
            System.out.println("ingrese 5 para ver los promedios mas altos");
            System.out.println("Ingrese s para salir");
            System.out.println("Ingrese su opción");
            opcion = sc.next().charAt(0);

            switch (opcion) {
                case '1' -> crearEstudiante();
                case '2' -> mostrarEstudiante();
                case '3' -> mostrarPromedio();
                case '4' -> menosPromedio();
                case '5' -> promedioMasAlto();

                default -> {
                    opcion = 's';
                    System.out.println("Hasta mañana");
                }
            }
        } while (opcion != 's');
    }

    private void promedioMasAlto(){
        for (Estudiantes est : listaEstudiantes){
            if (est.getNotasDefinitivas()>this.promedio+0.5){
                System.out.println("los mejores promedios son de: " + est.getNombre());

            }
        }
    }

    private void mostrarPromedio() {
        double sumaDefinitivas = 0;
        int cantidadEstudiantes = listaEstudiantes.size();

        for (Estudiantes est : listaEstudiantes) {
            sumaDefinitivas += est.getNotasDefinitivas();
        }
        this.promedio = sumaDefinitivas / cantidadEstudiantes;
        System.out.println("La cantidad de estudiantes es: " + cantidadEstudiantes);
        System.out.println("El promedio es: " + this.promedio);
    }
    private void menosPromedio() {
        for (Estudiantes est : listaEstudiantes) {
            if (est.getNotasDefinitivas()<promedio) {
                System.out.println("Definitivas por debajo del promedio " + est.getNombre());
            }
        }

    }
    private void mostrarEstudiante() {

        for (Estudiantes est : listaEstudiantes) {
            System.out.println("estudiante: " + est.getNombre() + " definitiva: " + est.getNotasDefinitivas());
        }

    }

    private void crearEstudiante() {
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
        double nota1 = sc.nextDouble();

        System.out.println("ingrese la nota del examen dos");
        double nota2 = sc.nextDouble();

        System.out.println("ingrese la nota de la tercera nota");
        double nota3 = sc.nextDouble();

        System.out.println("ingrese la nota del examen final");
        double nota4 = sc.nextDouble();

        NotasEstudiante notas = new NotasEstudiante(nota1, nota2, nota3, nota4);
        Estudiantes estudiante = new Estudiantes(nombre, codigo, edad, carrera, notas);
        listaEstudiantes.add(estudiante);

    }
}

