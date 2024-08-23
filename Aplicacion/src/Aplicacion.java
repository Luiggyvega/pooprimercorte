import java.util.Scanner;

public class Aplicacion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Empleado empleado = new Empleado();
        System.out.println("ingrese el nombre del empleado: ");
        String nombre = sc.next();
        empleado.setNombreEmpleado(nombre);
        System.out.println("ingrese las horas trabajadas: ");
        int horas = sc.nextInt();
        empleado.setHorasTrabajadas(horas);
        System.out.println("ingrese el valor de la hora: ");
        double valor = sc.nextDouble();
        empleado.setValorHora(valor);
        empleado.calcularsueldo();
        System.out.println("cheque generado a " +  empleado.getNombreEmpleado() + " por el sueldo de: " + empleado.getSueldo());

    }
}