package Resultado;

import Almacen.Articulo;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionAlmacen {
    private static ArrayList<Articulo> listadoArticulos;


    public GestionAlmacen() {
        listadoArticulos = new ArrayList<>();
    }

    public void menuAlmacen() {
        Scanner sc = new Scanner(System.in);
        char opcion;
        do {
            System.out.println("Que desea hacer en el almacen");
            System.out.println("1: Ingrese los datos del articulo");
            System.out.println("2: Listado");
            System.out.println("3: Baja");
            System.out.println("4: Modificacion");
            System.out.println("5: Entrada");
            System.out.println("6: Salida");
            System.out.println("7: salir del menul del almcaen");
            opcion = sc.next().charAt(0);

            switch (opcion) {
                case '1' -> datosArticulo();
                case '2' -> articulosDisponible();
                case '3' -> saleArticulo();
                case '4' -> modificarArticulo();
                case '5' -> masStockArticulo();
                case '6' -> menosSrockArticulo();

                default -> {
                    opcion = '7';
                    System.out.println("Hasta mañana");
                }
            }
        } while (opcion != 7);
    }

    private void articulosDisponible() {
        for (Articulo articulos : listadoArticulos) {
            System.out.println("los aticulos que hay son: " + articulos.getDescripcion() + " codigo del articulo: " + articulos.getCodigo() + " cantidad de articulos disponibles: " + articulos.getSrock());
        }

    }

    private int buscarArticulo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el codigo del articulo a sacar");
        String codigo = sc.next();
        Articulo articuloEncontrado = null;
           for (Articulo articulo : listadoArticulos){
               if (codigo.equals(articulo.getCodigo())){
                    articuloEncontrado=articulo;
                    break;
               }
           }
           return listadoArticulos.indexOf(articuloEncontrado);

        }
    private void saleArticulo(){
        
    }

    private void modificarArticulo() {
    }

    private void masStockArticulo() {
    }

    private void menosSrockArticulo() {
    }

    private void datosArticulo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el codigo del articulo");
        String codigo = sc.nextLine();
        System.out.println("Ingrese la descripcion del articulo");
        String descripcion = sc.nextLine();
        System.out.println("ingrese el precio de compra del articulo");
        String precioCompra = sc.nextLine();
        System.out.println("ingrese el precio de venta del articulo");
        String precioVenta = sc.nextLine();
        System.out.println("ingrese el stock del articulo");
        int stock = sc.nextInt();
        Articulo articulo = new Articulo(codigo, descripcion, precioCompra, precioVenta, stock);
        listadoArticulos.add(articulo);
    }
}
