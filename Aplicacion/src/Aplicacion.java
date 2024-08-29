//"sonar"= analizador de codigo aplicacion
// expresiones landa investiga
import java.sql.SQLOutput;
import java.util.Scanner;
public class Aplicacion {
    static Scanner sc = new Scanner(System.in);
    static Empleado empleado;

    public static void main(String[] args) {
        menu();
//        System.out.println("ingrese el nombre del empleado: ");
//        String nombre = sc.next();
//        System.out.println("ingrese las horas trabajadas: ");
//        int horas = sc.nextInt();
//        System.out.println("ingrese el valor de la hora: ");
//        double valor = sc.nextDouble();
//        Empleado empleado = new Empleado(nombre,horas,valor);
//        empleado.calcularsueldo();
//        System.out.println();

    }
    public static void menu(){
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

            switch (opcion){
                case '1' -> crearEmpleado();
                case '2' -> modificarEmpleado();
                case '3' -> buscarEmpleado();
                case '4' -> listarEmpleado();
                default -> {opcion = 's';
                    System.out.println("hasta mañana");}
            }

        }while (opcion != 's' );

    }
    public static void crearEmpleado(){
        System.out.println("crear empleado");

    }
    public static void modificarEmpleado(){
        System.out.println("modificar empleado");

    }
    public static void buscarEmpleado(){
        System.out.println("buscar empleado");

    }
    public static void listarEmpleado(){
        System.out.println("listar empleado");

    }
}