package Servicio;

import TelefononiaYCliente.Cliente;
import TelefononiaYCliente.Telefonia;

import java.util.ArrayList;
import java.util.Scanner;

public class Servicio {
    ArrayList<Telefonia> telefonia;
    ArrayList<Cliente> cliente;
    Scanner sc;

    public Servicio() {
        telefonia = new ArrayList<Telefonia>();
        cliente = new ArrayList<Cliente>();
        sc = new Scanner(System.in);
    }

    public void menu() {
        char opcion;
        do {
            System.out.println("1. crear plan de telefonia");
            System.out.println("2. datos del cliente");
            System.out.println("3. eliminar plan");
            System.out.println("4. lista de clientes");
            System.out.println("5. para salir");
            System.out.println("ingrese una opcion");
            opcion = sc.next().charAt(0);
            switch (opcion) {
                case '1' -> crearPlan();
                case '2' -> datosCliente();
                case '3' -> eliminarPlan();
                case '4' -> listaClientes();
                default -> {
                    opcion = '5';
                    System.out.println("saliendo del menu");
                }
            }
        } while (opcion != '5');
    }

    private void listaClientes() {
        System.out.println("---- lo clientes con planes seleccionados ----");
        for (Cliente cliente1 : cliente) {
            System.out.println("el cliente: " + cliente1.getNombre() + " " + cliente1.getApellido() + " selecciono el plan: " + cliente1.getNombrePlan());
        }
    }

    private void planes() {
        for (int i = 0; i < telefonia.size(); i++) {
            Telefonia telefonia1 = telefonia.get(i);
            System.out.println((i + 1) + " tenemos el plan " + telefonia1.getNombrePlan() + " que te ofrece " + telefonia1.getCantidadMinutos() + " de minutos " + " y una cantidad de gigas de: " + telefonia1.getGigas() + " con un precio de: " + telefonia1.getPrecioPlan() + " en la modalidad " + telefonia1.getTipoPlan());
        }

    }

    private void eliminarPlan() {
        System.out.println("------Vas a eliminar un plan---------");
        sc.nextLine();
        System.out.println("ingrese el nombre del plan");
        String buscarPlan = sc.nextLine();

        boolean planAsignadoACliente = false;
        for (Cliente c : cliente) {
            if (c.getNombrePlan().equals(buscarPlan)) {
                planAsignadoACliente = true;
                break;
            }
        }
        if (planAsignadoACliente) {
            System.out.println("No se puede borrar el plan porque lo tiene un cliente.");
        } else {
            Telefonia planAEliminar = null;
            for (Telefonia t : telefonia) {
                if (t.getNombrePlan().equals(buscarPlan)) {
                    planAEliminar = t;
                    break;
                }
            }
            if (planAEliminar != null) {
                telefonia.remove(planAEliminar);  // Eliminar el plan si fue encontrado
                System.out.println("Plan: " + buscarPlan + " eliminado.");
            } else {
                System.out.println("Plan no encontrado.");
            }
        }
    }


    private void datosCliente() {
        System.out.println("------Datos cliente------");
        sc.nextLine();
        System.out.println("ingrese el nombre del cliente");
        String nombre = sc.nextLine();
        System.out.println("ingrese el apellido del cliente");
        String apellido = sc.nextLine();
        int indiceplan;
        Telefonia planSeleccionado = null;
        do {
            System.out.println("Ingrese el número del plan que desea adquirir:");
            planes();
            indiceplan = Integer.parseInt(sc.nextLine()) - 1;
            if (indiceplan >= 0 && indiceplan < telefonia.size()) {
                planSeleccionado = telefonia.get(indiceplan);
            } else {
                System.out.println("Número de plan inválido. Intente de nuevo.");
            }
        } while (planSeleccionado == null);
        String documento;
        do {
            System.out.println("ingrese el numero de documento");
            documento = sc.nextLine();
        }while (documentoExiste(documento));
        System.out.println("numero de celular del cliente");
        int celular = sc.nextInt();
        sc.nextLine();
        System.out.println("ingrese la direccion");
        String direccion = sc.nextLine();
        Cliente cliente1 = new Cliente(nombre, apellido, planSeleccionado.getNombrePlan(), documento, celular, direccion);
        cliente.add(cliente1);
    }
    private boolean documentoExiste(String documento) {
        boolean existe = cliente.contains(documento);
        if (existe) {
            System.out.println("El documento " + documento + " ya existe, ingrese otro" );
        }
        return existe;
    }


    private void crearPlan() {
        System.out.println("--------crear plan de telefonia--------");
        sc.nextLine();
        String nombre;
        do {
            System.out.println("Ingrese el nombre del plan");
            nombre = sc.nextLine();
        }while (nombreExiste(nombre));
        System.out.println("Ingrese una descripcion del plan");
        String descripcion = sc.nextLine();
        System.out.println("plan pospago o prepago");
        String tipoPlan = sc.nextLine();
        System.out.println("cant minutos del plan");
        String minutos = sc.nextLine();
        System.out.println("ingrese cantidad de gigas del plan");
        String gigas = sc.nextLine();
        System.out.println("precio del plan");
        double precio = sc.nextDouble();
        Telefonia telefonia1 = new Telefonia(nombre, descripcion, tipoPlan, minutos, gigas, precio);
        telefonia.add(telefonia1);
    }
    private boolean nombreExiste(String nombre) {
        boolean existe = telefonia.contains(nombre);
        if (existe) {
            System.out.println("El nombre " + nombre + " ya existe, ingrese otro" );
        }
        return existe;
    }
}
